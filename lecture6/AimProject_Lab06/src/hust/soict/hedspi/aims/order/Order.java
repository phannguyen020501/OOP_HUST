package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_LIMITED_ORDERD=5;
	private static int nbOrders=0;
	public static final int MAX_NUMBERS_ORDERED=4;
	private MyDate dateOrdered;
	private int maxSize=0;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered(){
		return itemsOrdered;
	}
	public Order(ArrayList<Media> itemsOrdered, MyDate dateOrdered) {
		super();
		if(nbOrders<MAX_LIMITED_ORDERD) {
			this.itemsOrdered = itemsOrdered;
			//this.qtyOrdered = qtyOrdered;
			this.dateOrdered = dateOrdered;
			nbOrders++;
		}else {
			return;
		}
		
	}
	public Order() {
		super();
		if(nbOrders<MAX_LIMITED_ORDERD) {
			nbOrders++;
		}else {
			return;
		}
	}
	
	
	public static int getNbOrders() {
		return nbOrders;
	}


	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}


	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public float totalCost(){
		float total=0;
		for(int i=0;i<itemsOrdered.size();i++) {
			total+= itemsOrdered.get(i).getCost();
		}
		return total;
	}
	//update total cost
	public float totalCost(DigitalVideoDisc luckyItem) {
		float total=0;
		for(int i=0;i<itemsOrdered.size();i++) {
			if(luckyItem.equals(itemsOrdered.get(i))==false) {
				total+=itemsOrdered.get(i).getCost();
			}
		}
		return total;
	}
	
	public void print() {
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println(itemsOrdered.get(i).getTitle());
		}
	}
	
	public void fullPrint() {
		System.out.println("**************************Order***********************");
		System.out.print("Date:");
		try {
			this.getDateOrdered().print();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println("Id:"+itemsOrdered.get(i).getId()+".Media: "+itemsOrdered.get(i).getTitle()+"-"+
					itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$");
		}
		System.out.println("Total cost:"+this.totalCost());
		System.out.println("*****************************************************");
	}
	
	//update full print
	public void fullPrint(DigitalVideoDisc luckyItem) {
		System.out.println("**************************Order***********************");
		System.out.print("Date:");
		try {
			this.getDateOrdered().print();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		for(int i=0;i<itemsOrdered.size();i++) {
			if(luckyItem.equals(itemsOrdered.get(i))==true){
				System.out.println("Id:"+itemsOrdered.get(i).getId()+".Media:"+itemsOrdered.get(i).getTitle()+"-"+
						itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$"+": lucky item");
			}else{
				System.out.println("Id:"+itemsOrdered.get(i).getId()+".Meida:"+itemsOrdered.get(i).getTitle()+"-"+
						itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$");
			}
			
		}
		System.out.println("Total cost:"+this.totalCost(luckyItem));
		System.out.println("*****************************************************");
	}
	
	public Media getALuckyItem() {
		int min=0;
		int max=-1;
		int range=max-min+1;
		int luckyIndex=(int)(Math.random()*range)+min;
	
		return itemsOrdered.get(luckyIndex);
	}
	
	public void addMedia (Media media) {
		
		if(itemsOrdered.size() < MAX_LIMITED_ORDERD) {
			maxSize++;
			media.setId(maxSize);
			itemsOrdered.add(media);
		}
		
	}
	
	public void removeMedia(Media media) {
		
		itemsOrdered.remove(media);
	}
	
	
}