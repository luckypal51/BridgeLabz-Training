package reflection.acessprivate;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Demo d = new Demo();
		Class<?> cl = d.getClass();
		Field n = cl.getDeclaredField("value");
		n.setAccessible(true);
		System.out.println("Before: "+n.get(d));
		n.set(d, 20);
		System.out.println("After : "+n.get(d));
	}
}
