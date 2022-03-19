package model.DAO;

import db.DB;
import model.DAO.implement.TrafegoDaoJDBC;

public class DaoChamados {

	public static TrafegoDao registroTrafego() {
		return new TrafegoDaoJDBC(DB.getConnection());
	}
	
}
