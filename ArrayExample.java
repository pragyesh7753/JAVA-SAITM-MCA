public class ArrayExample {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i : arr) {
            System.out.println(i);
        }

        int arr1[] = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        System.out.println("\n");

        // Character Array
        char arr_c[] = { 'a', 'b', 'c', 'd', 'e' };
        for (char i : arr_c) {
            System.out.println(i);
        }
        char arr_ch[] = new char[5];
        arr_ch[0] = 'a';
        arr_ch[1] = 'b';
        arr_ch[2] = 'c';
        arr_ch[3] = 'd';
        arr_ch[4] = 'e';

        int abc[]={5,9,4,3,1};
        int sum=Integer.MAX_VALUE;

    }
}
