package com.pratice;
import java.io.Serializable;


public class SerEvent implements Serializable{
	
	
	private String name;
	private String Venue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVenue() {
		return Venue;
	}

	public void setVenue(String venue) {
		Venue = venue;
	}


}
