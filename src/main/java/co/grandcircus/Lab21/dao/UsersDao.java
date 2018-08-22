package co.grandcircus.Lab21.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.Lab21.entity.Users;



@Repository
public class UsersDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	public List<Users> findAll() {
//		String sql = "SELECT * FROM Users";
//		
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Users.class));
//	}
//	
//	public Users findById(int id) {
//		String sql = "SELECT * FROM Room WHERE id = " + id;
//		return jdbcTemplate.queryForObject(sql,  new BeanPropertyRowMapper<>(Users.class));
//	}
//	
	public void create(Users users) {
		System.out.println("Create: " + users);
		String sql = "INSERT INTO Users (id, firstname, lastname, email, phone, password) Values ( ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, users.getid(), users.getFirstname(), users.getLastname(), users.getEmail(), users.getPhonenumber(), users.getPassword());
	}
	
//	public void delete(int id) {
//		String sql = "DELETE FROM Users WHERE id = ?";
//		jdbcTemplate.update(sql, id);
//	}
}