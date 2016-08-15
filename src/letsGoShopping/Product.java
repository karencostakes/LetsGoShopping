//testing push...where does it go???

package letsGoShopping;

import java.util.ArrayList;

public class Product {

	private String item;
	private String category;
	private String itemAlpha;
	private int storeQuantity;
	private double price;

	public Product(String itemAlpha, String item, double price,int storeQuantity) {
		setItemAlpha(itemAlpha);
		setItem(item);
		setPrice(price);
        setStoreQuantity(storeQuantity);
	}
	double lineTotal=0;
	public double lineTotal(int input){
		
		if (input <=storeQuantity)
			 lineTotal =price*input;
		return lineTotal;
	}
	
	public double subTotal(){
		double sum = 0;
		sum = sum+lineTotal;
		return sum;
	}
	
	public String getItemAlpha() {
		return itemAlpha;
	}

	public void setItemAlpha(String itemAlpha) {
		this.itemAlpha = itemAlpha;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStoreQuantity() {
		return storeQuantity;
	}

	public void setStoreQuantity(int storeQuantity) {
		this.storeQuantity = storeQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
