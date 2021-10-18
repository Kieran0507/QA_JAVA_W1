package com.qa.movies;

public class Movies {

	private long movieId;
	private String title;
	private String movieDescription;
	private float averageRating;

	public Movies(long movieId, String title, String description, float averageRating) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.movieDescription = description;
		this.averageRating = averageRating;
	}

	public Movies(String title, String description, float averageRating) {
		super();
		this.title = title;
		this.movieDescription = description;
		this.averageRating = averageRating;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return movieDescription;
	}

	public void setDescription(String description) {
		this.movieDescription = description;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", title=" + title + ", description=" + movieDescription + ", averageRating="
				+ averageRating + "]";
	}

}
