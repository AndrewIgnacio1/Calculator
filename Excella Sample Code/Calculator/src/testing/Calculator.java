package testing;

public class Calculator{

	private double firstInput;
	private double secondInput;
	private double results;
	
	
// < ------------ Constructor ------------ >
	
	public Calculator() {
		super();
		this.firstInput = 0;
		this.secondInput = 0;
		this.results = 0;
	}

	
// < ------------ Getters & Setters ------------ >
	
	public double getFirstInput() {
		return firstInput;
	}

	public void setFirstInput(double firstInput) {
		this.firstInput = firstInput;
	}

	public double getSecondInput() {
		return secondInput;
	}

	public void setSecondInput(double secondInput) {
		this.secondInput = secondInput;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}
	

// < ------------ Methods ------------ >
	
	public double addition(double inputOne, double inputTwo) {
		
		setFirstInput(inputOne);
		setSecondInput(inputTwo);
		setResults(getFirstInput() + getSecondInput());
		return results;
		
	}
	
	public double subtraction(double inputOne, double inputTwo) {
		
		setFirstInput(inputOne);
		setSecondInput(inputTwo);
		setResults(getFirstInput() - getSecondInput());
		return results;
		
	}
	
	public double multiplication(double inputOne, double inputTwo) {
		
		setFirstInput(inputOne);
		setSecondInput(inputTwo);
		setResults(getFirstInput() * getSecondInput());
		return results;
		
	}
	
	public double division(double inputOne, double inputTwo) {
		
		setFirstInput(inputOne);
		setSecondInput(inputTwo);
		setResults(getFirstInput() / getSecondInput());
		return results;
		
	}
	
	public double squared(double inputOne) {
		
		setFirstInput(inputOne);
		setResults(getFirstInput() * getFirstInput());
		return results;
		
	}
	
}