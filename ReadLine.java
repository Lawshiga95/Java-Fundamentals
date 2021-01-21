import java.io.*;

public class ReadLine{
	public static void main(String args[]) {
		Console console = System.console();
		System.out.println("Customer Number:");
		String customerNumber = console.readLine();
		
		System.out.println("Customer Telephone:");
		String customerTelephone = console.readLine();
		
		System.out.println(customerNumber + ":" + customerTelephone);
	}
}