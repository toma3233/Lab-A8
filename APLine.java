// Question A2 on 2010 AP Exam
/**
 * 
 * @author Tom Abraham
 * Period # 1
 *
 */
public class APLine {
	private int a = 1;
	private int b = 1;
	private int c = 1;
	//declare instance variables that represent the coefficients a and b and the constant
	//c in the equation of the line ax + by + c = 0
	
	/**
	 * Constructor to initialize the coefficients a and b and the constant c in the
	 * equation of the line ax + by + c = 0
	 * @param a - coefficient of x
	 * @param b - coefficient of y
	 * @param c - constant
	 */
	public APLine(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;//Your code goes here

	}// end constructor
	/**
	 * Method to compute the slope of the line
	 * @return slope of the line
	 */
	public double getSlope()
	{
		double slope = (double) -a / b;
		return slope; //Your code goes here


	}// end method getSlope
	/**
	 * Method to check if the given point (x,y) falls on the line
	 * @param x - x coordinate of the point
	 * @param y - y coordinate of the point
	 * @return true if the point falls on the line, false otherwise
	 */
	public boolean isOnLine(int x, int y)
	{
		if ((a * x) + (b * y) + c == 0) {
			
			return true;//Your code goes here
		}
		else {
			return false;
		}
	}// end method isOnLine
}// end class

