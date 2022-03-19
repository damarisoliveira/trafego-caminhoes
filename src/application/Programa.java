package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.DAO.DaoChamados;
import model.DAO.TrafegoDao;
import model.entities.Caminhao;
import model.entities.Trafego;
import model.entities.enums.CaminhaoStatus;
import model.entities.enums.NomeLocal;


public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Trafego> list;
		TrafegoDao trafegoDao = DaoChamados.registroTrafego();
	
		
		System.out.println("Bem vindo a Alfa Atacarejo! \nDigite as informações de tráfego a seguir: ");
		
		
		System.out.println("Estabelecimento: \n 1 - Matriz \n 2 - Deposito 1 \n 3 - Deposito 2 ");
		int estabelecimento = sc.nextInt();
		NomeLocal loc = null;
		
		switch(estabelecimento) {
			case 1:
				loc = NomeLocal.MAT;
				break;
			case 2:
				loc = NomeLocal.DEP1;
				break;
			case 3:
				loc = NomeLocal.DEP2;
				break;
			default:
				System.out.println("Valor inválido!");
		}
		
		
		
		System.out.println("O caminhão está entrando ou saindo (e/s) ? ");
		char movimento = sc.next().charAt(0);
		CaminhaoStatus m = null;
		
		if (movimento == 'e') {
			m = CaminhaoStatus.ENTRADA;
		} 
		else if(movimento == 's'){
			m = CaminhaoStatus.SAIDA;
		}
		else {
			System.out.println("Dado inválido!");
		}
		
		
		System.out.println("Nome do caminhão: ");
		String nomeCaminhao = sc.next();
		
		sc.nextLine();
		System.out.println("Placa: ");
		String placa = sc.nextLine();
		
		
		System.out.println("Odômetro: ");
		int odometro = sc.nextInt();
		
		System.out.println("Motorista: ");
		String nomeMotorista = sc.next();
		
		sc.nextLine();
		
		
		System.out.println("Destino/Origem: \n 1 - Matriz \n 2 - Deposito 1 \n 3 - Deposito 2");
		int origemDestino = sc.nextInt();
		NomeLocal loc2 = null;
		
		if(origemDestino == 1 && estabelecimento != 1) {
			loc2 = NomeLocal.MAT;
		}
		else if(origemDestino == 2 && estabelecimento != 2) {
			loc2 = NomeLocal.DEP1;
		}
		else if(origemDestino == 3 &&  estabelecimento != 3) {
			loc2 = NomeLocal.DEP2;
		}
		else {
			System.out.println("Valor inválido!");
		}
		
		
		
		System.out.println("Lacres 1, 2  e 3: ");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int l3 = sc.nextInt();
		
		
		System.out.println("Usuário: ");
		String usuario = sc.next();
		
		
		sc.nextLine();
		Caminhao caminhao = new Caminhao(null, nomeCaminhao, placa, nomeMotorista, odometro, l1, l2, l3, loc2);
		Trafego trafego = new Trafego(loc, new Date(), caminhao, usuario, m);

		trafegoDao.insert(trafego, caminhao);
		System.out.println("Inserido!");

		
		System.out.println("----------------------");
		System.out.println("De qual setor você gostaria de analisar os dados de tráfego? "
				+ "\n 1 - Matriz \n 2 - Departamento 1 \n 3 - Departamento 2");
		int setor = sc.nextInt();
		NomeLocal loc3 = null;
		
		switch(setor) {
			case 1:
				loc3 = NomeLocal.MAT;
				break;
			case 2:
				loc3 = NomeLocal.DEP1;
				break;
			case 3:
				loc3 = NomeLocal.DEP2;
				break;
			default:
				System.out.println("Valor inválido!");
		}
		
		System.out.println("Empresa: " + loc3);
		
		list = trafegoDao.findAll(trafego);
		
		for(Trafego traf : list) {
			System.out.println(traf);
		}
		
		sc.close();
	}

}
