package letsGoShopping;

public class Receipt {

	private String item;
	private int userQuantity;
	private String paymentInfo;
	private double subTotal;
	private double grandTotal;
	
	public Receipt(int userQuantity, String item, double subTotal, double grandTotal, String paymentInfo) {
		super();
		this.item = item;
		this.userQuantity = userQuantity;
		this.paymentInfo = paymentInfo;
		this.subTotal = subTotal;
		this.grandTotal = grandTotal;
	}
	public void printReceipt(){
		System.out.println("Qty\t" + "Item\t" + "\t"+"Subtotal\t" +"\t"+ "Grand Total\t" +"\t"+ "Paid By");
		System.out.println("===\t" + "====\t" + "\t"+ "========\t" + "\t"+"===========\t" +"\t"+ "=======");
		System.out.println(userQuantity+"\t" + item+"\t" + "$"+subTotal+"\t" +"\t"+ "$"+grandTotal+"\t" + "\t"+ paymentInfo);
	}
	
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getUserQuantity() {
		return userQuantity;
	}

	public void setUserQuantity(int userQuantity) {
		this.userQuantity = userQuantity;
	}

	public String getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	
	}

