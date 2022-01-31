package producttest;

class Product{

	private String itemNo;
	private String name;
	private double price;
	private short qty;

	public String getItemNo() {
		return itemNo;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public short getQuantity() {
		return qty;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(short qty) {
		this.qty = qty;
	}

//	public Product() {
//		itemNo = "";
//		name = "";
//		price = 0;
//		qty = 0;
//
//	}

	public Product(String itemno) {
		itemNo = itemno;
	}
	public Product(String itemno, String name) {
		itemNo = itemno;
		this.name = name;
	}
	public Product(String itemno,String name,double price,short qty)
    {
        itemNo = itemno;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }


}

class Customer {

    private String custId;
    private String name;
    private String address;
    private String phno;

//    public Customer(){
//    	custId = "";
//    	name = "";
//    	address = "";
//    	phno = "";
//    }

    public Customer(String custId, String name)
    {
        this.custId = custId;
        this.name = name;
    }
    public Customer(String custId, String name, String address, String phno)
    {
        this.custId = custId;
        this.name = name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhno(String phno)
    {
        this.phno = phno;
    }
}


public class ProductTest {

	public static void main(String[] args) {

		Product pr = new Product("A-123", "Milk");
		Customer cu = new Customer("12-123", "Sultan");

		pr.setPrice(7.5);
		pr.setQuantity((short) 2);

		System.out.println("Product detials");
		System.out.println("Product Item Number: " + pr.getItemNo());
		System.out.println("Product Name: " + pr.getName());
		System.out.println("Product price: " + pr.getPrice());
		System.out.println("Product Quantity: " + pr.getQuantity());
		System.out.println("");
		cu.setAddress("Saudi Arabia");
		cu.setPhno("055555555555");

		System.out.println("Customer detials");
		System.out.println("Customer ID Number: " + cu.getCustId());
		System.out.println("Customer Name: " + cu.getName());
		System.out.println("Customer Address: " + cu.getAddress());
		System.out.println("Customer Phone Number: " + cu.getPhno());



	}

}
