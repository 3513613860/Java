package demo05;

public class Demo01EvenOdd {
    public static void main(String[] args) {
        int [] arr = {2,7,4,1,8,5,6,3};
        int i = 0;
        int n = arr.length - 1;
        while( i < n){
            while(i < n && arr[i] % 2 != 0){
                i++;
            }
            while(i < n && arr[n] % 2 == 0){
                n--;
            }
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]+" ");
        }
    }
}
