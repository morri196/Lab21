package co.grandcircus.Lab21.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.Lab21.entity.Items;


@Repository
@Transactional
public class ItemsAdminDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Items> findAll() {
		return em.createQuery("FROM Items", Items.class).getResultList();
	}
	
	public void create(Items items) {
		em.persist(items);
	}
	
	public void update(Items items) {
		em.merge(items);
	}
	
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		Items items = em.getReference(Items.class, id);
		em.remove(items);
	}
	
//	public Set<String> findAllCategories() {
//		// This query returns a list of Strings, so I give it String.class
//		List<String> categoryList = em.createQuery("SELECT DISTINCT category FROM Items", String.class)
//				.getResultList();
//		// Convert the List to a Set.
//		return new TreeSet<>(categoryList);
//	}
//	
}
