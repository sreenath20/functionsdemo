package ford;

public class Demo {

	
	public static void main() { // entry point of application
		System.out.println("Hello");//
		System.out.println(); // sysout + ctrl + space

		char name = 'A';
		name++;

		System.out.println(name);
		System.out.println(1234 / 1000);

		int dateMonthYear = 10102022;
		int date;
		int month;
		int year = dateMonthYear % 10000;
		dateMonthYear /= 10000;
		month = dateMonthYear % 100;
		dateMonthYear /= 100;
		date = dateMonthYear;
		System.out.println(date + ":" + month + ":" + year);

		System.out.println(date + month + year);

		int number = 10;
		System.out.println((10 != 10) && (20 != (number = 20)));// logical shortcircuit
		System.out.println(number);
		int number2 = 10;
		System.out.println((10 == 10) || (20 != (number2 = 20)));// logical shortcircuit
		System.out.println(number2);

		Boolean result = true;
		result = !result; // toggle
		System.out.println(result);
		Integer time = 25;

		if (time < 12)
			System.out.println("GM");
		else if (time < 16)
			System.out.println("GA");
		else if (time < 20)
			System.out.println("GE");
		else if (time <= 24)
			System.out.println("GN");
		else
			System.out.println("Invalid time");
		Boolean condition1 = true;
		Boolean condition2 = true;

		if (condition1) {

			if (condition2) {
				System.out.println("Inner Block");
			}
		}

//		if() {
//			
//		}
//		else {
//			
//		}
//		
//		

		int menu = 1;
		int subMenu = 2;

		switch (menu) {
		case 1:
			System.out.println("Menu 1");
			switch (subMenu) {
			case 1:
				System.out.println("subMenu 1");
				break;
			case 2:
				System.out.println("subMenu 2");
				break;

			}
			break;
		case 2:
			System.out.println("Menu 2");
			break;
		case 3:
			System.out.println("Menu 3");
			break;
		default:
			System.out.println("Wrong menu option!");
		}

		int i = 0;

		while (i < 5) {
			System.out.println("i:" + i);
			int j = -1;
			while (j < 5) {
				j++;
				if (j == 2) {

					continue;
				}
				System.out.println("J:" + j);
				// j++;

			}
			i++;
		}

		System.out.println("Begin for loop!");
		for (int ii = 0; ii <= 10; ii = ii + 2) {

			if (ii > 8)
				continue;
			for (int jj = 0; jj <= 10; jj = jj + 2) {
				System.out.println("jj:" + jj);
				if (jj < 5)
					break;
			}

			System.out.println(ii);
		}

		System.out.println("am out of for loop!");

		int[] intArray = { 1, 4, 2, 88 };

		Integer integerArray[] = { 44, 22, 77, 88 };

		int size = 10;
		int[] intSizeArray = new int[10];
		Integer[] integerSizeArray = new Integer[size];

		System.out.println(integerArray[2]);
		integerArray[3] = 808;
		System.out.println(integerArray[3]);
		for (int index = 0; index < integerArray.length; index++)
			System.out.println(integerArray[index]);
		char charArray[] = { 'A', 'F', 'T' };
		for (int index = 0; index < charArray.length; index++)
			System.out.println(charArray[index]);
	
		String employeeNames[] = { "Swetha", "Lavanya", "Ashwath" };
		for (int index = 0; index < employeeNames.length; index++)
			System.out.println(employeeNames[index]);
		String employeeNamesbySize[] = new String[50];
		System.out.println("Hello" + 5);
		System.out.println(5+5);
		System.out.println("5"+5);
		String data = "5"+5;

	}

}
