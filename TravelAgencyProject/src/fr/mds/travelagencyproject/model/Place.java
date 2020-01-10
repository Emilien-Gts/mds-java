package fr.mds.travelagencyproject.model;

import java.io.Serializable;

public class Place implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;	
	
	public Place(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Place(String name) {
		super();
		this.name = name;
	}
	
	public Place(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[(Type: Place) - (id:"+this.id+") - (name:"+this.name+")]";
	}

}
