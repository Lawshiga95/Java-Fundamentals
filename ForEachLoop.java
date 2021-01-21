public class ForEachLoop{
	public static void main(String args[]) {
		int[] list = {23, 45, 46, 16, 85, 88};
		for(int i : list) {
			if(i > 50 && i < 87){
				System.out.println(i);
			}
		}
	}	
}