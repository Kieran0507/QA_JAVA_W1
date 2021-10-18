package com.qa.runner;

import com.qa.dao.MoviesDAO;
import com.qa.movies.Movies;

public class Runner {

	public static void main(String[] args) {
//		JDBC_setup anObject = new JDBC_setup();
//		
//		System.out.println(anObject.connect());
		
		MoviesDAO dao = new MoviesDAO();
		
		dao.addMovie(new Movies("Curious George","a guy finds a monkey" , 5));
	}

}
