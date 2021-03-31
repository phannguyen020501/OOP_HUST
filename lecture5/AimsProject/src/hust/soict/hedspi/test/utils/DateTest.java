package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {

	public static void main(String[] args) {
		MyDate date1= new MyDate(1, 2, 2020);
		MyDate date2= new MyDate(2, 3, 2019);
		MyDate date3= new MyDate(3, 3, 2020);
		System.out.println(DateUtils.compare(date1, date3));
		MyDate dates[]= {date1,date2,date3};
		for(int i=0;i<3;i++) {
			dates[i].print();
		}
		DateUtils.sortDates(dates);
		System.out.println();
		for(int i=0;i<3;i++) {
			dates[i].print();
		}
	}

}
