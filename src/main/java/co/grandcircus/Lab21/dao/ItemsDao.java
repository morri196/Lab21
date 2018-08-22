package co.grandcircus.Lab21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.Lab21.entity.Items;

@Repository
public class ItemsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Items> findAll() {
		String sql = "SELECT * FROM Items";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
	}
	
	public void create(Items items) {
		System.out.println("Create: " + items);
		String sql = "INSERT INTO Items (name, capacity, available) Values (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, items.getId(), items.getName(), items.getDescription(), items.getQuantity(), items.getPrice());
	}
	
}
