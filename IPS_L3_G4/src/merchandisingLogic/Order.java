package merchandisingLogic;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Article> order;
	private String code; //Se puede usar como identificador, habrá que ver más adelante como hacerlo.

	
	public Order() {
		order = new ArrayList<Article>();
		initialize();
	}


	private void initialize() {
		order.clear();
	}
	
	public void add(Article catalogArticle, int units){
		Article orderArticle = null;
	
		for (Article a : order){
			if (a.getName().equals(catalogArticle.getName()))
			{
				orderArticle = a;
				orderArticle.setUnits(orderArticle.getUnits() + units);
				break;
			}
		}
		
		if (orderArticle == null){
			Article articleToOrder = new Article(catalogArticle);
			articleToOrder.setUnits(units);
			order.add(articleToOrder);
		}
					
	}
	public void remove(Article catalogArticle, int units) {
		Article orderArticle = null;
		for (Article a: order) {
			if (a.getName().equals(catalogArticle.getName())){
				if (checkUnits(catalogArticle)>units) {
					orderArticle = a;
					orderArticle.setUnits(checkUnits(orderArticle)-units);
				} else {
					order.remove(a);
				}
				break;
			}
			
		}
	}


	private int checkUnits(Article selectedArticle) {
		
		for(Article a: order) {
			if (a.getName().equals(selectedArticle.getName())) {
				return a.getUnits();
			}
		}
		return 0;
	}
}
