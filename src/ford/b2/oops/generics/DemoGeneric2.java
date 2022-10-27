package ford.b2.oops.generics;

public class DemoGeneric2<K,V> {

	private K key;
	private V value;

	public DemoGeneric2() {
		super();
	}

	public DemoGeneric2(K key) {
		super();
		this.key = key;
	}

	
	public DemoGeneric2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DemoGeneric2 [key=" + key + ", value=" + value + "]";
	}

	
}
