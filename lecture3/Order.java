package aims.lecture3;

public class Order {
	public static final int MAX_NUMBERS_ORDERED=10;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < 10) {
			itemsOrdered[qtyOrdered]=disc;
			System.out.println("The disc has been added");
			qtyOrdered++;
	
		}else {
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
	public float totalCost() {		
		float total=0;
		for(int i=0;i<qtyOrdered;i++) {
			total+=itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void print() {
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
	
}