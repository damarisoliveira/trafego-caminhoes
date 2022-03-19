package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.enums.CaminhaoStatus;
import model.entities.enums.NomeLocal;

public class Trafego {

	private NomeLocal empresa;
	private Date data;
	private Caminhao caminhao;
	private String nomeFiscal;
	private CaminhaoStatus movimento;

	public Trafego() {
	}

	public Trafego(NomeLocal empresa, Date data, Caminhao caminhao, String nomeFiscal, CaminhaoStatus movimento) {
		this.empresa = empresa;
		this.data = data;
		this.caminhao = caminhao;
		this.nomeFiscal = nomeFiscal;
		this.movimento = movimento;
	}

	public NomeLocal getEmpresa() {
		return empresa;
	}

	public void setEmpresa(NomeLocal empresa) {
		this.empresa = empresa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Caminhao getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}

	public String getNomeFiscal() {
		return nomeFiscal;
	}

	public void setNomeFiscal(String nomeFiscal) {
		this.nomeFiscal = nomeFiscal;
	}

	public CaminhaoStatus getMovimento() {
		return movimento;
	}

	public void setMovimento(CaminhaoStatus movimento) {
		this.movimento = movimento;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		return "[ Empresa = " + (empresa == null ? "" : empresa) + " | Movimento = "
				+ (movimento == null ? "" : movimento) + " | " + (caminhao == null ? "" : caminhao) + " | Usuario = "
				+ (nomeFiscal == null ? "" : nomeFiscal) + " | Data = " + (data == null ? "" : sdf.format(data)) + " ]";
	}

}
