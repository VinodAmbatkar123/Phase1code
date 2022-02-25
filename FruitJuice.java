package newtest;

import java.util.Scanner;

public class FruitJuice {
	private int productcode;
	private String Flavour;
	private String pack_type;
	private int packsize;
	private int product_price;
	
		 public  FruitJuice(){ 
			 productcode=0;
			 Flavour="";
			 pack_type="";
			 packsize=0;
			 product_price=0;}
		 
			
		 void input() {
			 Scanner in=new Scanner(System.in);
			 System.out.println( "Enter flavour: ");
			 Flavour=in.nextLine();
			 System.out.println( "Enter pack_type: ");
			 pack_type=in.nextLine();
			 System.out.println( "Enter product code: ");
			 productcode=in.nextInt();
			 System.out.println( "Enter packsze: ");
			 packsize=in.nextInt();
			 System.out.println( "Enter product price: ");
			 product_price=in.nextInt();
			 
			  }
		void discount() {
			product_price-=10;
			
		}
		void display() {
			System.out.println( "Product code: "+productcode);
			System.out.println( " flavour: "+Flavour);
			System.out.println( "packtype: "+pack_type);
			System.out.println( "pack Size: "+packsize);
			System.out.println( "product pricer: "+product_price);
			}
		public static void main(String[] args) {
			FruitJuice obj=new FruitJuice();
			obj.input();
			obj.discount();
			obj.display();
		}
	}



