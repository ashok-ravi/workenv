package com.dao;
import org.springframework.jdbc.core.JdbcTemplate;
public class ReadEmailAddress {
	private JdbcTemplate jdbcTemplate; 
	
	public ReadEmailAddress(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmail(int id, String name){  
		    String query="insert into EMAIL_DATA values("+id+",'"+name+"')";  
		    return jdbcTemplate.update(query);  
		}  

}
