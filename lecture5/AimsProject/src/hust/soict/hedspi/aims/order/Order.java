package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_LIMITED_ORDERD=5;
	private static int nbOrders=0;
	public static final int MAX_NUMBERS_ORDERED=4;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	private MyDate dateOrdered;
	
	public Order(DigitalVideoDisc[] itemsOrdered, int qtyOrdered, MyDate dateOrdered) {
		super();
		if(nbOrders<MAX_LIMITED_ORDERD) {
			this.itemsOrdered = itemsOrdered;
			this.qtyOrdered = qtyOrdered;
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
	
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered]=disc;
			System.out.println("The disc has been added");
			qtyOrdered++;
	
		}else {
			System.out.println("The order is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int len=dvdList.length;
		if(qtyOrdered+len <= MAX_NUMBERS_ORDERED) {
			for(int i=0;i<len;i++) {
				itemsOrdered[qtyOrdered+i]=dvdList[i];
			}
			qtyOrdered+=len;
			System.out.println("The dvdlist has been added");
		}else {
			for(int i=0;i<(len+qtyOrdered-MAX_NUMBERS_ORDERED);i++) {
				itemsOrdered[qtyOrdered+i]=dvdList[i];
			}
			qtyOrdered=MAX_NUMBERS_ORDERED;
			System.out.println("The order is almost full");
			
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered+2 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered]=dvd1;
			itemsOrdered[qtyOrdered+1]=dvd2;
			qtyOrdered+=2;
			System.out.println("dvds have been added");
		}else {
			qtyOrdered=MAX_NUMBERS_ORDERED;
			itemsOrdered[qtyOrdered-1]=dvd1;
			
			System.out.println("The order is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i=0;
		for(i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].equals(disc)==true) {
				break;
			}
		}
		if(i==qtyOrdered) {
			System.out.println("The disc is not in the order");
		}else {
			for(;i<qtyOrdered-1;i++) {
				itemsOrdered[i]=itemsOrdered[i+1];
			}
			System.out.println("The disc has been deleted");
			qtyOrdered--;
		}
		
	}
	public float totalCost(){
		float total=0;
		for(int i=0;i<qtyOrdered;i++) {
			total+=itemsOrdered[i].getCost();
		}
		return total;
	}
	//update total cost
	public float totalCost(DigitalVideoDisc luckyItem) {
		float total=0;
		for(int i=0;i<qtyOrdered;i++) {
			if(luckyItem.equals(itemsOrdered[i])==false) {
				total+=itemsOrdered[i].getCost();
			}
		}
		return total;
	}
	
	public void print() {
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered[i].getTitle());
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
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println((i+1)+".DVD: "+itemsOrdered[i].getTitle()+"-"+
					itemsOrdered[i].getCategory()+"-"+
					itemsOrdered[i].getDirector()+"-"+
					itemsOrdered[i].getLength()+"-"+
					itemsOrdered[i].getCost()+"$");
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
		for(int i=0;i<qtyOrdered;i++) {
			if(luckyItem.equals(itemsOrdered[i])==true){
				System.out.println((i+1)+".DVD: "+itemsOrdered[i].getTitle()+"-"+
						itemsOrdered[i].getCategory()+"-"+
						itemsOrdered[i].getDirector()+"-"+
						itemsOrdered[i].getLength()+"-"+
						itemsOrdered[i].getCost()+"$"+": lucky item");
			}else{
				System.out.println((i+1)+".DVD: "+itemsOrdered[i].getTitle()+"-"+
						itemsOrdered[i].getCategory()+"-"+
						itemsOrdered[i].getDirector()+"-"+
						itemsOrdered[i].getLength()+"-"+
						itemsOrdered[i].getCost()+"$");
			}
			
		}
		System.out.println("Total cost:"+this.totalCost(luckyItem));
		System.out.println("*****************************************************");
	}
	
	public DigitalVideoDisc getALuckyItem() {
		int min=0;
		int max=qtyOrdered-1;
		int range=max-min+1;
		int luckyIndex=(int)(Math.random()*range)+min;
	
		return itemsOrdered[luckyIndex];
	}
	
	
	
}