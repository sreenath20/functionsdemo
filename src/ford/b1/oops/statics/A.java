package ford.b1.oops.statics;

public class A {
	private static Integer data =100;
	private String name="Ford"; // instance data members [new A()]
	
	private Integer id=0; // generate this automatically!
	
	public Integer getId() {
		return id;
	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public void incrementData() {
		data++;
	}
	public void displayData() {
		System.out.println(data);
	}
	
	//Instance methods [new A()]
	public void function() {
		System.out.println(name);
		System.out.println(data);
		display();
	}
	public static void display() {
		System.out.println("Am static belong to class !:"+data);
		//System.out.println(name);
		//function();
	}
	public static Integer getData() {
		return data;
	}
	public static void setData(Integer data) {
		A.data = data;
	}
	
}
