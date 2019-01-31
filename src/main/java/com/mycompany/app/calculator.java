import java.io.*;
public class calculator
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Operation:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus");
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		int x = 0;
		int y = 0;
		System.out.println("Enter First Number");
		x = Integer.parseInt(br.readLine());
		System.out.println("Enter Secong Number");
		y = Integer.parseInt(br.readLine());
		switch (n)
		{
			case 1:
			result = x + y;
			break;
			case 2:
			result = x - y; //Added By Subtract 
			break;
			case 3:
			result = x * y; //Added by Multiply
			break;
			case 4:
			result = x / y; //Added by Divide
			case 5:
			result = x % y; //Added by Mod
			break;
			default:
			System.out.println("Invalid Choice");	

		}
		System.out.println("Answer:" + result);	
		//Testing for merge showing up on Github		
	}
}
