package model;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Feb 6, 2024  
*/
public class MultiplicationModel {
	private int num1;
	private int num2;
	private int multiplication;
	
	public MultiplicationModel() {
		
	}
	
	/**
	 * @param num1
	 * @param num2
	 */
	public MultiplicationModel(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		setMultiplication(num1, num2);
	}
	
	/**
	 * @return the multiplication
	 */
	public int getMultiplication() {
		return multiplication;
	}
	/**
	 * @param multiplication the multiplication to set
	 */
	public void setMultiplication(int num1, int num2) {
		this.multiplication = num1 * num2;
	}
	
	
}
