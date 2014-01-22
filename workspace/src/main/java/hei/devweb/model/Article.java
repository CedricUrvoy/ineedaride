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
	private String nameCategorie;
	private String nameAuthor;

	
	/**** Contructeur(s) ****/
	
	public Article(Integer id, String title, String description, String image, Date date, Integer idCategorie, String nameCategorie, String nameAuthor) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.image = image;
		this.date = date;
		this.idCategorie = idCategorie;
		this.nameCategorie = nameCategorie;
		this.nameAuthor = nameAuthor;
	}
	
	/**** Methode(s) ****/
	
	
	/**** Getters and Setters ****/
	
	public Integer getId() {
		return id;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public String getNameCategorie() {
		return nameCategorie;
	}

	public void setNameCategorie(String nameCategorie) {
		this.nameCategorie = nameCategorie;
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
