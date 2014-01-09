package hei.devweb.model;

public class Article {
	
	/**** Declaration des variables ****/
	
	private Integer id;
	private String title;
	private String description;
	
	private Integer idAlbum;
	private Integer idCategorie;
	
	/**** Contructeur(s) ****/
	
	public article(Integer id, String title, String description, Integer idAlbum, Integer idCategorie) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.idAlbum = idAlbum;
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

	public Integer getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Integer idAlbum) {
		this.idAlbum = idAlbum;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	
}
