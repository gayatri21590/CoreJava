package assignment2;

public class InvoiceTest {
	public static void main(String args[])
	{
		Q1_Invoice q=new Q1_Invoice("101", "Laptop", -400.00, -5);
		if(q.getQty()<0)
		{
			q.setQty(0);
		}
		if(q.getPrice()<0)
		{
			q.setPrice(0.0);;
		}
		
		q.invoiceAmt();
		
		System.out.println("part no : "+q.getPno());
		System.out.println("part desc : "+q.getPdescription());
		System.out.println("part qty : "+q.getQty());
		System.out.println("part price : "+q.getPrice());
		
		
	}

}
