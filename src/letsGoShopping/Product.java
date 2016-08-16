//testing push...where does it go???

package letsGoShopping;

public class Product {

	private String item;
	private String category;
	private String itemAlpha;
	private int storeQuantity;
	private double price;
	private double lineTotal;
	private int userQuantity;

	public Product(String itemAlpha, String item, double price, int storeQuantity) {
		setItemAlpha(itemAlpha);
		setItem(item);
		setPrice(price);
		setStoreQuantity(storeQuantity);
	}

	public double getLineTotal() {

		if (userQuantity <= storeQuantity) {
			lineTotal = (double) price * userQuantity;
		} else {
			System.out.println("Sorry, this was a popular item.  We only have " + storeQuantity + " remaining.");
			lineTotal = 0;
		}
		return lineTotal;
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

	public void setUserQuantity(int userQuantity) {
		this.userQuantity = userQuantity;
	}
}
