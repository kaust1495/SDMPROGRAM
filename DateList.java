package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import study.MyDate;

public class DateList {

	public static void main(String[] args) {
		ArrayList<MyDate> Al = new ArrayList<MyDate>();
		Al.add(new MyDate(1, 1, 2022));
		Al.add(new MyDate(2, 2, 2021));
		Al.add(new MyDate(3, 3, 2020));
		Al.add(new MyDate(4, 4, 2012));
		Al.add(new MyDate(5, 5, 2018));
		Al.add(new MyDate(6, 6, 2020));

		show(Al);
		Collections.sort(Al);
		System.out.println("\nSorting Date : \n" + Al);
	}

	public static void show(List<MyDate> List) {
		Iterator<MyDate> iter = List.iterator();
		while (iter.hasNext())
			System.out.println(iter.next()); // Every next gives a MyDate object , Its ToString is Printed
	}

}
