package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		int qtyOrdered=0;
		anOrder.setQtyOrdered(qtyOrdered);
		
		System.out.println(Order.getNbOrders());
		
		//create a dvd object
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		//add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("Geogre Lucas");
		dvd2.setLength(124);
		//add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd2);
		
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		//add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc lucky=anOrder.getALuckyItem();
		
		System.out.println(lucky.getTitle());
		
//		anOrder.fullPrint(lucky);
		System.out.println(lucky.search("king the lion"));
		
	}

}
