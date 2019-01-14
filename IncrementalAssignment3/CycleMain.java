class Cycle{
	
}

class Unicycle extends Cycle {
	void balance(){
		System.out.println("Unicycle balance method");
	}
}

class Bicycle extends Cycle {
	void balance(){
		System.out.println("Bicycle balance method");
	}
}

class Tricycle extends Cycle {

}

class CycleMain {
	public static void main(String[] args) {
		Unicycle unicycle = new Unicycle();
		Bicycle  bicycle  = new Bicycle();
		Tricycle tricycle = new Tricycle();
		Cycle[] cycleArr  = new Cycle[3];
		cycleArr[0] = unicycle;
		cycleArr[1] = bicycle;
		cycleArr[2] = tricycle;
		for(int i=0; i<3; i++){
			// cycleArr[i].balance();
			// Cannot execute above line since there is not method balance in Cycle class
		}

		((Unicycle)cycleArr[0]).balance();
		((Bicycle)cycleArr[1]).balance();
		// ((Tricycle)cycleArr[2]).balance();
		// cannot downcast and call balance because no balance method in Tricycle class
	}
}