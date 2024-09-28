package merchandisingLogic;

public class Article {

	private double price;
	private String name;
	private String type;
	private int units;
	
	public Article(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
		units = 0;
	}

	public Article(Article otherArticle) {
		this(otherArticle.name,otherArticle.type,otherArticle.price);
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	public int getUnits() {
		return units;
	}
	protected void setUnits(int units) {
		this.units = units;
	}
	
	
}
