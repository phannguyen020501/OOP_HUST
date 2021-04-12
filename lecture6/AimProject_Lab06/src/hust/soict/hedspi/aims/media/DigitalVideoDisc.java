package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category);
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category) {
		super(title,category);
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super(title,category);
		this.director = director;
	}
	public DigitalVideoDisc(int id) {
		super(id);
	}
	
	
	public boolean search(String title) {
		String cpytitle=new String(title);
		cpytitle=cpytitle.toLowerCase();
		String listTit[]=cpytitle.split(" ");
		int size=listTit.length;
		boolean flag=true;
		for(int i=0;i<size;i++) {
			if(this.title.toLowerCase().indexOf(listTit[i]) == -1) {
				flag=false;
			}
	
		}
		return flag;
		
	}
	
	
}
