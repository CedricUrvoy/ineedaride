package hei.devweb.model;

import java.util.Date;

public class Article {
	
	/**** Declaration des variables ****/
	
	private Integer id;
	private String title;
	private String description;
	private Date date;
	private String image;
	private Integer idCategorie;
	
	/**** Contructeur(s) ****/
	
	public Article(Integer id, String title, String description, String image, Date date, Integer idCategorie) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.image = image;
		this.date = date;
		this.idCategorie = idCategorie;
	}
	
	/**** Methode(s) ****/
	
	
	/**** Getters and Setters ****/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
