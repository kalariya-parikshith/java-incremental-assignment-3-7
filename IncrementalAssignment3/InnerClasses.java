class First{
	public class FirstInner{
		public FirstInner(String arg){
			System.out.println("First inner class constructor called");
		}
	}
}

class Second{
	static class SecondInner extends First.FirstInner{
		public SecondInner(First f){
			f.super("string arg");
			System.out.println("Second inner class constructor called");
		}
	}
}

class InnerClasses {
	public static void main(String[] args) {
		First f = new First();
		Second.SecondInner si = new Second.SecondInner(f);
	}
}