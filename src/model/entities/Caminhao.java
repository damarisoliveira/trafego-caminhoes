package model.entities;

import model.entities.enums.NomeLocal;

public class Caminhao {
	
	private Integer id;
	private String nome;
	private String placa;
	private String nomeMotorista;
	private Integer odometro;
	private Integer l1;
	private Integer l2;
	private Integer l3;
	private NomeLocal destinoOrigem;
	
	public Caminhao() {}
	
	public Caminhao(Integer id, String nome, String placa, String nomeMotorista, Integer odometro, Integer l1, Integer l2,
			Integer l3, NomeLocal destinoOrigem) {
		this.id = id;
		this.nome = nome;
		this.placa = placa;
		this.nomeMotorista = nomeMotorista;
		this.odometro = odometro;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.destinoOrigem = destinoOrigem;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public Integer getOdometro() {
		return odometro;
	}

	public void setOdometro(Integer odometro) {
		this.odometro = odometro;
	}

	public Integer getL1() {
		return l1;
	}

	public void setL1(Integer l1) {
		this.l1 = l1;
	}

	public Integer getL2() {
		return l2;
	}

	public void setL2(Integer l2) {
		this.l2 = l2;
	}

	public Integer getL3() {
		return l3;
	}

	public void setL3(Integer l3) {
		this.l3 = l3;
	}

	public NomeLocal getDestinoOrigem() {
		return destinoOrigem;
	}

	public void setDestinoOrigem(NomeLocal destinoOrigem) {
		this.destinoOrigem = destinoOrigem;
	}

	@Override
	public String toString() {
		
		return "Caminhao = " + (nome == null ?  "" : nome)
				+ " | Placa = "  + (placa == null ?  "" : placa) 
				+ " | Odômetro = " + (odometro == null ?  "" : odometro) 
				+ " | Motorista = " + (nomeMotorista == null ?  "" : nomeMotorista) 
				+ " | Destino/Origem = " + (destinoOrigem == null ?  "" : destinoOrigem)
				+ " | Lacres = " + (l1 == null && l2 == null && l3 == null ? "" : l1 + "/" + l2 + "/" + l3);
	}
	
	
	
	
}
