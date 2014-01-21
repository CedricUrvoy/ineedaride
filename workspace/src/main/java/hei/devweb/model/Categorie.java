package hei.devweb.model;

public class Categorie {
	
/**** Declaration des variables ****/
	
	private Integer id;
	private String libelle;
	private String srcImgCar;
	private String srcImgCat;
	private String srcImgBlog;
	private String text;
	
	/**** Contructeur(s) ****/
	
	public Categorie(Integer id, String libelle, String srcImgCar, String srcImgCat, String srcImgBlog, String text) {
		this.id = id;
		this.libelle = libelle;
		this.srcImgCar = srcImgCar;
		this.srcImgCat = srcImgCat;
		this.srcImgBlog = srcImgBlog;
		this.text = text;
	}
	
	/**** Methode(s) ****/
	
	
	/**** Getters and Setters ****/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getSrcImgCar() {
		return srcImgCar;
	}

	public void setSrcImgCar(String srcImgCar) {
		this.srcImgCar = srcImgCar;
	}

	public String getSrcImgCat() {
		return srcImgCat;
	}

	public void setSrcImgCat(String srcImgCat) {
		this.srcImgCat = srcImgCat;
	}

	public String getSrcImgBlog() {
		return srcImgBlog;
	}

	public void setSrcImgBlog(String srcImgBlog) {
		this.srcImgBlog = srcImgBlog;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
