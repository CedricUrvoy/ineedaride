package hei.devweb.model;

public class Auteur {

/**** Declaration des variables ****/
	
	private Integer id;
	private String firstname;
	private String surname;
	private String infos;

	
	/**** Contructeur(s) ****/
	
	public Auteur(Integer id, String firstname, String surname, String infos) {
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.infos = infos;

	}


	/**** Methode(s) ****/
	
	
	/**** Getters and Setters ****/

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getInfos() {
		return infos;
	}


	public void setInfos(String infos) {
		this.infos = infos;
	}
	
}
