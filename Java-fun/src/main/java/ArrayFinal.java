public class ArrayFinal {
    public static void main(String args[])
    {
        final int arr[] = {1, 2, 3};
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for(int i = 0; i < 3 ; i++ )
        {
            System.out.println(arr[i]);
        }

        // You can't re-assign it. it will throw compilation error
        // arr = new int[5];

    }
}
