package aims.lecture3;

import date.lecture3.MyDate;

public class Aims {

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
		
		
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars");
		dvd4.setCategory("Science Fiction");
		dvd4.setCost(24.95f);
		dvd4.setDirector("Geogre Lucas");
		dvd4.setLength(124);
		
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars");
		dvd5.setCategory("Science Fiction");
		dvd5.setCost(24.95f);
		dvd5.setDirector("Geogre Lucas");
		dvd5.setLength(124);
		
		
		anOrder.print();
		
//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		
//		anOrder.removeDigitalVideoDisc(dvd1);
//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		
//		anOrder.removeDigitalVideoDisc(dvd2);
//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		
//		anOrder.removeDigitalVideoDisc(dvd3);
//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
		String date="March 17th 2020";
		//anOrder.setDateOrdered(new MyDate(date));
		anOrder.fullPrint();
		
	}

}
