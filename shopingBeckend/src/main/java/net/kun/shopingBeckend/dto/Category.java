package net.kun.shopingBeckend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {


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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getImgeURL() {
		return imgeURL;
	}

	public void setImgeURL(String imgeURL) {
		this.imgeURL = imgeURL;
	}	
	
	
	
	

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imgeURL=" + imgeURL
				+ ", active=" + active + ", getId()=" + getId() + ", getName()=" + getName() + ", getDescription()="
				+ getDescription() + ", isActive()=" + isActive() + ", getImgeURL()=" + getImgeURL() + "]";
	}





	/*
	 * Private member
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;

	private String name;
	
	
	private String description;
	
	@Column(name="image_url") 
	private String imgeURL;
	
	
	@Column(name="is_active")
	private boolean active = true;			

}
