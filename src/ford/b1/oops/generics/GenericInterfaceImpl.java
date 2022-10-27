package ford.b1.oops.generics;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{

	@Override
	public void display(T data) {
		System.out.println(data);
		
	}

	@Override
	public T processFunction(T data) {
		// TODO Auto-generated method stub
		return null;
	}

}
