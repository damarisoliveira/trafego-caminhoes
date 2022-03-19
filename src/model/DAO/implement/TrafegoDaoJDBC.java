package model.DAO.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.DAO.TrafegoDao;
import model.entities.Caminhao;
import model.entities.Trafego;
import model.entities.enums.CaminhaoStatus;
import model.entities.enums.NomeLocal;


public class TrafegoDaoJDBC implements TrafegoDao {

	private Connection conn;

	public TrafegoDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Trafego trafego, Caminhao caminhao) {
		
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"INSERT INTO Trafego "
					+ "(movimento, nomeCaminhao, placaCaminhao, odometroCaminhao, nomeFiscal, data, destinoOrigem, lacre1, lacre2, lacre3, nomeMotorista, empresa) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
					);
			
			st.setString(1, String.valueOf(trafego.getMovimento()));
			st.setString(2, caminhao.getNome());
			st.setString(3, caminhao.getPlaca());
			st.setInt(4, caminhao.getOdometro());
			st.setString(5, trafego.getNomeFiscal());
			st.setObject(6, LocalDateTime.now());
			st.setString(7, caminhao.getDestinoOrigem().name());
			st.setInt(8, caminhao.getL1());
			st.setInt(9, caminhao.getL2());
			st.setInt(10, caminhao.getL3());
			st.setString(11, caminhao.getNomeMotorista());
			st.setString(12, trafego.getEmpresa().name());
	
			st.executeUpdate();
			
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public List<Trafego> findAll(Trafego obj) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement("SELECT * FROM Trafego WHERE empresa = ? ");

			st.setString(1, obj.getEmpresa().name());
			rs = st.executeQuery();
			
			List<Trafego> list = new ArrayList<>();
			
			while(rs.next()) {
				Trafego trafego = new Trafego();
				Caminhao caminhao = new Caminhao();
				
				trafego.setNomeFiscal(rs.getString("nomeFiscal"));
				trafego.setData(rs.getTimestamp ("data"));
				trafego.setMovimento(CaminhaoStatus.valueOf(rs.getString("movimento")));
				trafego.setEmpresa(NomeLocal.valueOf(rs.getString("empresa")));
				
				caminhao.setNome(rs.getString("nomeCaminhao"));
				caminhao.setPlaca(rs.getString("placaCaminhao"));
				caminhao.setOdometro(rs.getInt("odometroCaminhao"));
				caminhao.setL1(rs.getInt("lacre1"));
				caminhao.setL2(rs.getInt("lacre2"));
				caminhao.setL3(rs.getInt("lacre3"));
				caminhao.setNomeMotorista(rs.getString("nomeMotorista"));
				caminhao.setDestinoOrigem(NomeLocal.valueOf(rs.getString("destinoOrigem")));
				
				trafego.setCaminhao(caminhao);
				
				list.add(trafego);
			}
			return list;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}
	
	
}
