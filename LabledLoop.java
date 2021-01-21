public class LabledLoop {
	public static void main(String args[]) {
	first :for(int i=0;i<=5;i++)
	{
	second:for(int j=0;j<=3;j++)
	{
	if(j==2)
	{
	break first; //continue first;
	}
	System.out.println("j is"+j);
	}
	System.out.println("i is"+i);
	}
}
}