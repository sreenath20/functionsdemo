package ford;

public class MethodOverloading {

	//we can change the signature of method by
	// 1. data type
	// 2. number of arguments 
	// 3. order of parameters
	
	static void display() { // function declaration
		System.out.println("Am display function");
	}
	
	static void display(int data) { // function declaration
		System.out.println("Am display int function:" + data);
	}

	static void display(Double data) { // function declaration
		System.out.println("Am display double function:" + data);
	}
	static void display(String data) { // function declaration
		System.out.println("Am display String function:" + data);
	}
	
	static void display(int data, Double data2) { // function declaration
		System.out.println("Am display int , double function:" + data + ":"+ data2);
	}
	
	static void display(Double data, int data2) { // function declaration
		System.out.println("daouble + int=");
		System.out.println(":"+data + data2 );
	}
	
	public static void main(String[] args) {
		display(); //function call
		System.out.println("Am main function");
		display(5);
		display(5.5);// static binding: compiler has decided method to execute.
		display(5,5.77);
		display(5.5,5);
		
		{ // block scope
			int i =100;
			System.out.println(i);
			{ // inner block
				int j=200;
				System.out.println(i);
			}
			//System.out.println(j);
		}
		//System.out.println(i);
		
		//int 
		Integer number =100;
		Integer num = Integer.valueOf("57");
		System.out.println(num);
		System.out.println(number.toString());
		System.out.println(Integer.MAX_VALUE);
		Double doubleData = 2.5;
		System.out.println(doubleData.compareTo(4.5));// = 0, < -1 , >+1
	//	Double.c
		
		int i = 100;
		double j=i; // automatically
		
		i = (int) j; // manually
		String name = "Hello";
		name="Ford";
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(0));
		System.out.println("bde".compareTo("bdg"));
		System.out.println("aed".compareTo("ade"));
		System.out.println(name.indexOf('d'));
		System.out.println(name.indexOf('f'));
		
		System.out.println(name.indexOf("rd"));
		System.out.println("Even    | Odd");
		System.out.print(4);
		System.out.print(" \t"+7);
		
		int array[]= {2,5,9,1};
		String e="";
		String o="";
		for(int index =0;index<array.length;index++) {
			if(array[index]%2==0)
				e+=array[index] +" ";
			else
				o+=array[index] + " ";
			
		}
		System.out.println("Even no:"+e);
		System.out.println("Odd no:"+o);
		
	}

}
