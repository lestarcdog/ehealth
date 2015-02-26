package runtime;

public class MessageGenerator {

	public static void main(String[] args) {
		MessageGenerator m = new MessageGenerator();
		MessageGenerator.A b = m.new B();
		b.a();
		
		
	}
	
	public class A{
		protected void a() {
			System.out.println("A");
		}
	}
	
	public class B extends A {
		public void a() {
			System.out.println("B");
		}
	}

}
