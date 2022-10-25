package ford;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class demo2 {
	private Integer num = 10;

	public demo2(Integer num) {
		this.num = num;
	}

	protected Integer getNum() {
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo2 obj = new demo2();

		// System.out.println(obj.getNum());
		before();

		try {
			System.out.print("In Try Block...");
			int result = 9 / 0;
			System.out.println("Result is: " + result);
		} catch (NumberFormatException ex) {
			System.out.print("In Catch Block2...");
		} catch (Exception ex) {
			System.out.print("In Catch Block1...");
		}

		finally {
			System.out.print("In Finally block...");
		}
	}

	public static void before() {
		Set set = new TreeSet();
		set.add("2");
		set.add("3");
		set.add("1");

		System.out.print(set);
	}

}
