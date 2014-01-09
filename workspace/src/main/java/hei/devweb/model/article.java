package hei.devweb.model;

public class article {
	
	private Integer id;
	private String title;
	private String description;
	
	private Integer idAlbum;
	private Integer idCategorie;
	
	public article(Integer id, String title, String description, Integer idAlbum, Integer idCategorie) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.idAlbum = idAlbum;
		this.idCategorie = idCategorie;
	}

}
