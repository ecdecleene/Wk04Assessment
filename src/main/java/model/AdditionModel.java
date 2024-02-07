package model;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Feb 6, 2024  
*/
public class AdditionModel {
	private int num1;
	private int num2;
	private int addition;
	
	public AdditionModel() {
		
	}
	
	public AdditionModel(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		setAddition(num1, num2);
	}

	/**
	 * @return the addition
	 */
	public int getAddition() {
		return addition;
	}

	/**
	 * @param addition the addition to set
	 */
	public void setAddition(int num1, int num2) {
		this.addition = num1 + num2;
	}
}
