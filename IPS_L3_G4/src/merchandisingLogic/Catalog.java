package merchandisingLogic;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	
	private List<Article> articles;
	
	public Catalog() {
		articles = new ArrayList<Article>();
		loadArtcilesIntoCatalog();
	}

	private void loadArtcilesIntoCatalog() {
		//Se llamaría a un método que acceda a la bd y extraiga una lista de la base de datos con los distintos articulos que se ofertan y los añada a articles
	}

	public List<Article> getArticles() {
		return articles;
	}	

}
