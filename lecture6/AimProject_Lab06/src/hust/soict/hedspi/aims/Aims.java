package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);

		Order order = null;
		showMenu();
		while(true) {

			int choose = scan.nextInt();
			System.out.println(choose);
			if(choose==1) {
				order=CreateOrder();
				System.out.println("create order successfully");
				
			}
			else if(choose==2) {
				System.out.println("title: ");
				String title=scan1.nextLine();
				System.out.println("category: ");
				String category=scan1.nextLine();
				System.out.println("cost ");
				float cost=scan.nextFloat();
				Media item = new Media(title,category);
				item.setCost(cost);
				Add(order,item);
			}
			else if(choose==3) {
				System.out.println("id to remove:");
				int id=scan.nextInt();
				Delete(order,id);
			}
			else if(choose==4) {
				Display(order);
			}
			else if(choose==0) {
				break;

			}
		}
		scan.close();
		scan1.close();
	}
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("----------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("----------------------------");
		System.out.println("Please choose a number 0-1-2-3-4");
	}
	public static  Order CreateOrder() {
		Order order = new Order();
		return order;
	}
	
	public static void Add(Order order,Media item) {
		order.addMedia(item);
		System.out.println("add media successfully");
	}
	
	public static void Delete(Order order,int id) {
		
		for(Media md: order.getItemsOrdered()) {
			if(md.getId() == id) {
				order.removeMedia(md);
				System.out.println("remove successfully");
			}else {
				System.out.println("cant find media");
			}
		}
	}
	public static void Display(Order order) {
		order.fullPrint();
	}
}
