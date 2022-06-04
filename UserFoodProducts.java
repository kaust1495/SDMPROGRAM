package Collection.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import Collection.MyDate;

public class UserFoodProducts {
	public static void main(String[] args) {

		ArrayList<FoodProducts> AL = new ArrayList<FoodProducts>();
//		AL.add(new FoodProducts("Wafers", "Balaji", "Best Before 3 Month", 20, 10, 20, 30, 40, new MyDate(3, 8, 2022)));
//		AL.add(new FoodProducts("Sprite", "Coco Cola", "Best Before 4 Month", 40, 20, 15, 35, 30,
//				new MyDate(12, 10, 2022)));
//		AL.add(new FoodProducts("Coffee", "Nestle", "Best Before 6 Month", 150, 20, 15, 27, 30,
//				new MyDate(25, 11, 2022)));
//		AL.add(new FoodProducts("PavBhaji Masala", "MDH", "Best Before 2 Month", 10, 33, 14, 25, 37,
//				new MyDate(7, 6, 2022)));
//		AL.add(new FoodProducts("Toasts", "Britania", "Best Before 1 Month", 45, 30, 28, 19, 27,
//				new MyDate(9, 7, 2022)));
	
		FoodProducts FP1 = new FoodProducts("Wafers", "Balaji", "Best Before 3 Month", 20, 10, 20, 30, 40,
				new MyDate(3, 8, 2022));
		FoodProducts FP2 = new FoodProducts("Sprite", "Coco Cola", "Best Before 4 Month", 40, 20, 15, 35, 30,
				new MyDate(12, 10, 2022));
		FoodProducts FP3 = new FoodProducts("Coffee", "Nestle", "Best Before 6 Month", 150, 20, 15, 27, 30,
				new MyDate(25, 11, 2022));
		FoodProducts FP4 = new FoodProducts("PavBhaji Masala", "MDH", "Best Before 2 Month", 10, 33, 14, 25, 37,
				new MyDate(7, 6, 2022));
		FoodProducts FP5 = new FoodProducts("Wafers", "Balaji", "Best Before 3 Month", 20, 10, 20, 30, 40,
				new MyDate(3, 8, 2022));
		
		Collection<FoodProducts> ints = Arrays.asList(FP1, FP2, FP3, FP4, FP5);
		AL.addAll(ints);
		
		Scanner SC = new Scanner(System.in);
		char choice = 0;

		do {
			System.out.println("A.Show All Product Name And Cost");
			System.out.println("B.Show all food products sorted by default ordering of expiry date");
			System.out.println("C.Show all sorted by fatper");
			System.out.println("D.Show all sorted by protein");
			System.out.println("E.Show all sorted by cost");
			System.out.println("F.Show product having minimum fatper");
			System.out.println("G.Show product having max proteinper");
			System.out.println("H.Quit");
			System.out.println("Enter Your Choice.....!!!");

			choice = SC.next().charAt(0);

			switch (choice) {
			case 'a': {
				System.out.println("All Products Name And Cost : \n");
				for (FoodProducts FP : AL)
					System.out.println("Name : " + FP.Name + ", Price : " + FP.cost);
				System.out.println();
				break;
			}
			case 'b': {
				Collections.sort(AL, new DOBComparator());
				for (FoodProducts FP : AL)
					System.out.println("ExpiryDate of " + FP.Name + " is " + FP.getExpiryDate());
				System.out.println();
				break;
			}
			case 'c': {
				Collections.sort(AL, new fatper());
				for (FoodProducts FP : AL)
					System.out.println("Fat Percentage of " + FP.Name + " is " + FP.fatper);
				System.out.println();
				break;
			}
			case 'd': {
				Collections.sort(AL, new proteinper());
				for (FoodProducts FP : AL)
					System.out.println("Protein Percentage of " + FP.Name + " is " + FP.proteinper);
				System.out.println();
				break;
			}
			case 'e': {
				Collections.sort(AL, new cost());
				for (FoodProducts FP : AL)
					System.out.println("Cost of " + FP.Name + " is " + FP.cost);
				System.out.println();
				break;
			}
			case 'f': {
				FoodProducts Min = Collections.min(AL, new fatper());
				System.out.println("Min Fat Percentage of " + Min.Name + " is " + Min.fatper);
				System.out.println();
				break;
			}
			case 'g': {
				FoodProducts Max = Collections.max(AL, new proteinper());
				System.out.println("Max Protein Percentage of " + Max.Name + " is " + Max.proteinper);
				System.out.println();
				break;
			}
			default: {
				System.out.println("Invalid Choice.......!!!!");
			}
			}
		} while (choice != 'h');

	}
}

class DOBComparator implements Comparator<FoodProducts> {

	@Override
	public int compare(FoodProducts o1, FoodProducts o2) {
		return o1.ExpiryDate.compareTo(o2.ExpiryDate);
	}
}

class fatper implements Comparator<FoodProducts> {

	@Override
	public int compare(FoodProducts o1, FoodProducts o2) {
		if (o1.fatper > o2.fatper)
			return 1;
		if (o1.fatper < o2.fatper)
			return -1;
		else
			return 0;
	}

}

class proteinper implements Comparator<FoodProducts> {

	@Override
	public int compare(FoodProducts o1, FoodProducts o2) {
		if (o1.proteinper > o2.proteinper)
			return 1;
		if (o1.proteinper < o2.proteinper)
			return -1;
		else
			return 0;
	}

}

class cost implements Comparator<FoodProducts> {

	@Override
	public int compare(FoodProducts o1, FoodProducts o2) {
		if (o1.cost > o2.cost)
			return 1;
		if (o1.cost < o2.cost)
			return -1;
		else
			return 0;
	}

}
