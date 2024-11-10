import java.util.*;
class Dmart
{
	String address;
	long contact;
	String email;
	String website;
	ArrayList<Product>productlist=new ArrayList<>();
	Cashier cashier;
	Cart cart;
	Customer customer;
	
	Dmart(String address,long contact,String email,String website)
	{
		this.address=address;
		this.contact=contact;
		this.email=email;
		this.website=website;
	}
	public void displayDmart()
	{
		System.out.println("address of Dmart :"+address);
		System.out.println("contact of Dmart :"+contact);
		System.out.println("email of Dmart :"+email);
		System.out.println("website of Dmart :"+website);
	}
	public void addProduct(String cate,String name,double orgPrice,Barcode barcode)
	{
		Product product=new Product(cate,name,orgPrice,barcode);
		productlist.add(product);
	}
	public void addCart(String type)
	{
		cart= new Cart(type);
	}
	public void addCashier(String name,String id,long contact,int counterNum)
	{
		cashier=new Cashier(name,id,contact,counterNum);
	}
	public void addCustomer(String name,long contact)
	{
		if(cashier!=null && productlist.size()!=0)
		{
		  customer=new Customer(name,contact);
		}
		else
		{
			System.out.println(" add cashier and product first ");
		}
	}
}
class Product
{
	String cate;
	String name;
	double orgPrice;
	Barcode barcode;
	
	Product(String cate,String name,double orgPrice,Barcode barcode)
	{
		this.cate=cate;
		this.name=name;
		this.orgPrice=orgPrice;
		this.barcode=barcode;
	}
	public void displayProduct()
	{
		System.out.println("category :"+cate);
		System.out.println("name of product :"+name);
		System.out.println("original price :"+orgPrice);
	}
	public void addBarcode(String productId,double dmartPrice)
	{
		barcode=new Barcode(productId,dmartPrice);
	}
}
class Barcode
{
	String productId;
	double dmartPrice;
	
	Barcode(String productId,double dmartPrice)
	{
		this.productId=productId;
		this.dmartPrice=dmartPrice;
	}
	public void displayBarcode()
	{
		System.out.println("Barcode [productId :"+",Dmart price :"+dmartPrice+"]");
		
	}
}
class Customer
{
	String name;
	long contact;
	String paymentMode;
	String billNo;
	double totalBill;
	ArrayList<Product>customerCart=new ArrayList<>();
	
	Customer(String name,long contact)
	{
		this.name=name;
		this.contact=contact;
		
	}
	public void displayCustomer()
	{
		System.out.println("name :"+name);
		System.out.println("contact :"+contact);
		System.out.println("payment type/mode :");
		System.out.println("bill number :"+billNo);
		System.out.println("total bill :"+totalBill);
	}
}
class Cashier
{
	String name;
	String id;
	long contact;
	int counterNum;
	
	Cashier(String name,String id,long contact,int counterNum)
	{
		this.name=name;
		this.id=id;
		this.contact=contact;
		this.counterNum=counterNum;
	}
	public void displayCashier()
	{
		System.out.println("name :"+name);
		System.out.println("id :"+id);
		System.out.println("contact :"+contact);
		System.out.println("counter number :"+counterNum);
	}
}
class Cart
{
	String type;
	ArrayList<Product> cart=new ArrayList<>();
	
	
	Cart(String type)
	{
		this.type=type;
	}
	public void displayCart()
	{
		System.out.println("cart [Type :"+type+",capacity :"+cart.size());
		for(Product i: cart)
		{
			i.displayProduct();
			i.barcode.displayBarcode();
		}
	}
	
}
class DmartDriver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Dmart dmart=new Dmart("deccan",98756145,"dmart@gmail.com","www.dmart.in");
		dmart.displayDmart();
		for(int i=1;i<=2;i++)
		{
			//dmart.addProduct();
			System.out.println("add product :");
			System.out.print("enter the catagory of you product");
			String category=sc.next();
			System.out.print("name of the product :");
			String nam=sc.next();
			System.out.print("original price :");
			double price=sc.nextDouble();
			System.out.print("product id :");
			String id=sc.next();
			System.out.print("dmart discounted price :");
			double prize=sc.nextDouble();
			
			dmart.addProduct(category,nam,price,(new Barcode(id,prize)));
		}
		for(Product i:dmart.productlist)
		{
			i.displayProduct();
			i.barcode.displayBarcode();
		}
		dmart.addCashier("ramesh kumar","DCASH123",78945654,2);
		dmart.cashier.displayCashier();
		dmart.addCart("basket");
		dmart.cart.displayCart();
		dmart.addCustomer("suresh :",856945692);
		dmart.customer.displayCustomer();
		for(;;)
		{
			System.out.println("enter the product id");
			sc.nextLine();
			String proid=sc.nextLine();
			boolean flag=false;
			for(Product i:dmart.productlist)
			{
				if(proid.equals(i.barcode.productId))
				{
					dmart.customer.customerCart.add(i);
					flag=true;
				}
			}
			if(!flag)
			{
				System.out.println("product not found ");
			}
			System.out.print("Do you want to continue the shopping(Y/N): ");
			char ch=sc.next().toUpperCase().charAt(0);
			if(ch=='Y')
			{
				continue;
			}
			else
			{
				break;
			}
	}
	double bill=0;
	for(Product i:dmart.customer.customerCart)
		{
		  i.displayProduct();
		  i.barcode.displayBarcode();
		  dmart.customer.totalBill += i.barcode.dmartPrice;
		  bill+=i.orgPrice;
		}
		System.out.println("total bill is :"+bill);
		System.out.println("discounted price :"+dmart.customer.totalBill);
	}
		
}