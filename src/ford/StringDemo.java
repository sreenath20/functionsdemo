package ford;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Hello"; // immutable
		String temp = name;
		name = "ford";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf('R'));
		System.out.println(" ".isEmpty());
		System.out.println(" ".isBlank());
		String dateMonthYear[] = "10-Jan-2022".split("-");
		System.out.println(dateMonthYear[0] + ":" + dateMonthYear[1] + ":" + dateMonthYear[2]);
		System.out.println("     Hello      ".trim());
		int num = 10102022;
		String strNum = String.valueOf(num);
		System.out.println("Ford".charAt(3));
		System.out.println("Ford".codePointAt(3));
		String n;
		//System.out.println(n);
		int a,b;
		a=b=a=0;
		 float myAge = 18.5f;
		    int  votingAge = 18;
		    System.out.println("hi"+ (myAge >= votingAge));
	}
	public void fun(int a) {
		
	}

}
