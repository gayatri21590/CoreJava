package assignment2;

public class Q1_Invoice {
	
	
	private String pno;
	private String pdescription;
	private int qty;
	private Double price;
	public Q1_Invoice(String pno, String pdescription, Double price, int qty) {
		super();
		this.pno = pno;
		this.pdescription = pdescription;
		this.price = price;
		this.qty=qty;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void invoiceAmt()
	{
		
		double inAmount=price*qty;
		System.out.println(inAmount);
	}
	


//public static void main(String args[])
//{
//	 Q1_Invoice q=new  Q1_Invoice("101", "Laptop", 50000.00, 2);
//	 q.invoiceAmt();
//	 
//	 
//}
}
