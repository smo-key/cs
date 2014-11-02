package cslabs;

public class cs08calculator
{
	//instance variables
	private double num1;
	private double num2;
	private char operand;
	
	//default constructor
	public cs08calculator()
	{
		num1 = 0;
		num2 = 0;
		operand = 0;
	}
	
	//inialization constructor
	public cs08calculator(double num1, double num2, char operand)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.operand = operand;
	}
	
	//modifier method for num1
	public void setNum1(double n1)
	{
		num1 = n1;
	}
	
	//modifider method for num2
	public void setNum2(double n2)
	{
		num2 = n2;
	}
	
	//modifier method for operand
	public void setOp(char op)
	{
		operand = op;
	}
	
	//accessor method for num1
	public double getNum1()
	{
		return num1;
	}
	
	//accessor method for num2
	public double getNum2()
	{
		return num2;
	}
	
	//accessor method for operand
	public double getOp()
	{
		return operand;
	}
	
	//Create method to calculate the result
	private double calculate() throws Exception
	{
		switch (operand)
		{
			case '+': return num1 + num2;
			case '-': return num1 - num2;
			case '*': return num1 * num2;
			case '/': if (num2 == 0) { throw new Exception("not a number, you idiot"); } 
				      return num1 / num2;
			case '^': if ((num2 == 0) && (num1 == 0)) { throw new Exception("not a number, you idiot"); } 
			          return Math.pow(num1, num2);
			case '%': return num1 % num2;
			default: throw new Exception("an invalid operand");
		}
	}
	
	//Create the toString() method
	public String toString()
	{
		try
		{
			return String.valueOf(calculate());
		} 
		catch (Exception ex)
		{
			return ex.getMessage();
		}
	}
	
}