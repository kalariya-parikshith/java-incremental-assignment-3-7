class FirstException extends Exception {
	FirstException(){
		System.out.println("First Exception raised");
	}
}

class SecondException extends Exception {
	SecondException(){
		System.out.println("Second Exception raised");
	}
}

class ThirdException extends Exception {
	ThirdException(){
		System.out.println("Third Exception raised");
	}
}

class ExceptionMain {
	static void invokeExceptions(int exceptionNumber) throws FirstException, SecondException, ThirdException{
		if(exceptionNumber == 1){
			throw new FirstException();
		}
		else if(exceptionNumber == 2) {
			throw new SecondException();
		}
		else
			throw new ThirdException();
	}
	public static void main(String[] args) {
		try{
			invokeExceptions(1);
		}
		catch (FirstException | SecondException | ThirdException e) {
			System.out.println("Exception caught");
		}
		finally{
			System.out.println("Finally called");
		}
	}
}