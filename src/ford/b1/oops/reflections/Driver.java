package ford.b1.oops.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {

	public static void main(String[] args) {

		Demo demo = new Demo("Ford");
		Class cls = demo.getClass();
		try {

			Constructor constructor = cls.getConstructor();
			System.out.println("constructor name:" + constructor.getName());

			Method[] methods = cls.getMethods();
			for (Method method : methods) {
				System.out.println("Method:" + method.getName());
			}
			Method displayMethod = cls.getDeclaredMethod("display", null);

			displayMethod.invoke(demo, null);

			Method display2Method = cls.getDeclaredMethod("display2", int.class);

			display2Method.invoke(demo, 100);

			Field field = cls.getDeclaredField("name");
			System.out.println("Name is accessivle:" + field.canAccess(demo));
			if (field.canAccess(demo) == false) {
				field.setAccessible(true);
				// modify the private data.
				field.set(demo, "New Ford 2022");
				// call display()
				displayMethod.invoke(demo, null);
				Method display3Method = cls.getDeclaredMethod("display3");
				if (display3Method.canAccess(demo) == false) {
					display3Method.setAccessible(true);
					display3Method.invoke(demo);
				}

			}

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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
