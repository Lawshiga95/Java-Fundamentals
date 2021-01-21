import java.util.Scanner;
public class Average{
	public static void main(String args[]) {
		int sum = 0;
		for(int i=0; i<10; i++){
			
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			sum += x;
		}
		System.out.println("Average:" + (sum/10));
	}	
}