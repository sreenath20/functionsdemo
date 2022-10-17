package ford;

public class DemoFunctions { // static polymorphism by doing overloading
	// 1. data type
	// 2. by no of arguments
	// 3. by changing the order of arguments

	public static void display() {
		System.out.println("display");
	}

	public static void display(int i) {
		System.out.println("display int:" + i);
	}

	public static void display(double i) {
		System.out.println("display double:" + i);
	}

	public static void display(float i) {
		System.out.println("display float:" + i);
	}

	public static void display(int i, String s, float f) {
		System.out.println("display int:String" + i + ":" + s);
	}

	public static void display(int i, String s) {
		System.out.println("display int:String" + i + ":" + s);
	}

	public static void display(String s, int i) {
		System.out.println("display String:int" + s + ":" + i);
	}

	public static void main(String[] args) { // driver coz JVM starts here

		// myFun(1234);
		/// myFun();
		display();
		display(5);
		display(5.5);
		display(69f);
		display(5, "hi");
		display("hello", 55);
		int intArray[] = { 54, 78, 32, 445 };
		display(intArray);
		int sum = add(3, 8);
		System.out.println("Sum:"+sum);
		String [] names={"aa","bb","cc"};
		String [] upperCaseNames=toUpper(names);
		display(upperCaseNames);
		allocateMem(10);
	}

	private static void allocateMem(int size) {
		int [] intArray = new int[size];//@5000
		
		
		// need more memory
		int newIntArray []= new int[size+100];
		intArray=new int[size+100];//@7000
		
		
	}

	private static void display(String[] upperCaseNames) {
		for(String s:upperCaseNames) {
			System.out.println(s);
		}
		
	}

	private static String[] toUpper(String[] names) {
		int index=0;
		for(String s:names) {
			names[index++]=s.toUpperCase();
		}
		return names;
	}

	private static int add(int i, int j) {

		return i + j;
	}

	private static void display(int[] intArray) {
		for (int v : intArray) {
			System.out.print(v + " ");
		}

	}

	public static void myFun(int n) {
		// System.out.println("Myfun");

		System.out.println(n);
		n = (n / 10);
		if (n > 0)
			myFun(n);
		System.out.println(n);
	}

	public static void myFun2() {
		System.out.println("Myfun2");

	}

}
