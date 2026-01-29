package anotation.methodImportance;

public class Demo {
    
	@ImprotantMethod(imp = Importence.MEDIUM)
	public void method1() {
		System.out.println("Hi from method 1");
	}
	 
		@ImprotantMethod(imp = Importence.LOW)
		public void method2() {
			System.out.println("Hi from method 2");
		}
		 
		@ImprotantMethod(imp = Importence.HIGH)
		public void method3() {
			System.out.println("Hi from method 3");
		}
		
}
