package model.DAO;

import java.util.List;

import model.entities.Caminhao;
import model.entities.Trafego;

public interface TrafegoDao {

	void insert(Trafego trafego, Caminhao caminhao);
	List<Trafego> findAll(Trafego trafego);
}
