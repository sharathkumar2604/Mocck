package com.xworkz.gymm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.gymm.dto.GymmDto;

public class GymmRepoImpl implements GymmRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("GymmProperties");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(GymmDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;

		
		
	}
		return false;

}

	@Override
	public List<GymmDto> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll",GymmDto.class);
			List<GymmDto> list = query.getResultList();
			em.getTransaction().commit();
			return list;
		
		
	}
		return null;
}
}