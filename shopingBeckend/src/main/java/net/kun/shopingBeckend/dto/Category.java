package net.kun.shopingBeckend.dto;

public class Category {

	private int id;

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

	/*
	 * Private member
	 * 
	 */
	private String name;
	private String description;
	private boolean active = true;
	private String imgeURL;

}
