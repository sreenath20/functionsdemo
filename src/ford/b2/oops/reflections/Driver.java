package ford.b2.oops.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {

	public static void main(String[] arg) {

		Demo demo = new Demo("Ford");

		Class<? extends Demo> classRef = demo.getClass();
		System.out.println("Name of class:" + classRef.getName());
		try {
			Constructor<? extends Demo> con = classRef.getConstructor();
			System.out.println("Constructor:" + con.getName());

			System.out.println("Constructors avaialble in demo:");
			Constructor<?>[] cons = classRef.getConstructors();
			for (Constructor conRef : cons) {

				System.out.println("Constructor:" + conRef.getName());

			}

			System.out.println("Methods avaialble in demo:");
			Method[] methods = classRef.getMethods();

			for (Method methodRef : methods) {
				System.out.println(methodRef.getName());
			}

			Method fun1Ref = classRef.getDeclaredMethod("fun1", null);

			System.out.println("Execute fun1 of demo object:");
			fun1Ref.invoke(demo, null);

			Method fun2Ref = classRef.getDeclaredMethod("fun2", int.class);
			fun2Ref.invoke(demo, 77);

			// access field of object

			Field field = classRef.getDeclaredField("name");
			System.out.println("name be accessed:" + field.canAccess(demo));
			field.setAccessible(true);

			System.out.println("Modify private name:");
			System.out.println("name be accessed:" + field.canAccess(demo));
			field.set(demo, "new Ford");
			fun1Ref.invoke(demo, null);

			Method fun3Ref = classRef.getDeclaredMethod("fun3", null);
			if (fun3Ref.canAccess(demo)==false) {
				fun3Ref.setAccessible(true);
				fun3Ref.invoke(demo, null);
			}

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
