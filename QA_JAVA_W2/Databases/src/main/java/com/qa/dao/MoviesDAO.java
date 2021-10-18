package com.qa.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.jdbc.JDBC_setup;
import com.qa.movies.Movies;

public class MoviesDAO {

	JDBC_setup jdbc = new JDBC_setup();
	
	
	
	Statement statement;
	Connection connection;
	public void addMovie(Movies movie) {
		try {connection = jdbc.connect();
		statement = connection.createStatement();
		String query ="INSERT INTO movies (title, movieDescription, averageRating)\r\n"
				+ "VALUES ('" + movie.getTitle() + "','" + movie.getDescription() + "', " + movie.getAverageRating() + ")";
		statement.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
