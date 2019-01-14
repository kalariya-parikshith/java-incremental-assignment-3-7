interface Cycle {
	void numberOfTyres();
}

class Unicycle implements Cycle {
	public void numberOfTyres() {
		System.out.println("Unicycle has 1 tyre");
	}
}

class Bicycle implements Cycle {
	public void numberOfTyres() {
		System.out.println("Bicycle has 2 tyres");
	}
}

class Tricycle implements Cycle {
	public void numberOfTyres() {
		System.out.println("Tricycle has 3 tyres");
	}
}

class CycleFactory {
	public static Cycle createCycle(String type) {
		if("Unicycle".equalsIgnoreCase(type))
			return new Unicycle();
		else if ("Bicycle".equalsIgnoreCase(type))
			return new Bicycle();
		else if("Tricycle".equalsIgnoreCase(type))
			return  new Tricycle();
		else {
			System.out.println("Type doesn't match");
			System.out.println("returning default Bicycle object");
			return new Bicycle();
		}
	}
}

class CycleFactoryMain {
	public static void main(String[] args) {
		Cycle unicycle = CycleFactory.createCycle("Unicycle");
		unicycle.numberOfTyres();
		Cycle bicycle = CycleFactory.createCycle("Bicycle");
		bicycle.numberOfTyres();
		Cycle tricycle = CycleFactory.createCycle("Tricycle");
		tricycle.numberOfTyres();
	}

}