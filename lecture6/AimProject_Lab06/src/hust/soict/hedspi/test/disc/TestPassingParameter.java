package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
		wrapper jw= new wrapper(jungleDVD);
		wrapper cw= new wrapper(cinderellaDVD);
		
		swap(jw,cw);
		
		
		System.out.println("Jungle dvd title:"+jw.dvd.getTitle());
		System.out.println("Cinderella dvd title:"+cw.dvd.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		
		System.out.println("Jungle dvd title:"+jungleDVD.getTitle());

	}
	
	public static void swap(wrapper o1,wrapper o2) {
		DigitalVideoDisc tmp=o1.dvd;
		o1.dvd=o2.dvd;
		o2.dvd=tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd =new DigitalVideoDisc(oldTitle);
	}

}

class wrapper{
	DigitalVideoDisc dvd;
	
	public wrapper(DigitalVideoDisc dvd){
		this.dvd=dvd;
	}
}

