package com.xworkz.gymm.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Gymm")
@NamedQuery(name="readAll",query="select dt from GymmDto dt")
public class GymmDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	private String price;
	
	public GymmDto() {
		super();
	}

	public GymmDto( String name, String location, String price) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GymmDto [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + "]";
	}
	
	
	

}
