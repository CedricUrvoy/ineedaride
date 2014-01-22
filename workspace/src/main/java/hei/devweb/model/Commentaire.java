package hei.devweb.model;

public class Commentaire {

	
	/**** Declaration des variables ****/
	
	private Integer id;
	private String text;
	private String name;
	private String email;
	private Integer idArticle;
	
	/**** Contructeur(s) ****/
	
	public Commentaire(Integer id, String text, String name, String email, Integer idArticle) {
		this.id = id;
		this.text = text;
		this.name = name;
		this.email = email;
		this.idArticle = idArticle;
	}

	
	/**** Methode(s) ****/
	
	
	/**** Getters and Setters ****/
	
	public Integer getId() {
		return id;
	}

	public Integer getIdArticle() {
		return idArticle;
	}


	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
