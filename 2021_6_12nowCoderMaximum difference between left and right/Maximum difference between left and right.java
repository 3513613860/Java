import java.util.*;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max = 0;
        int max1 = A[0];
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] > max1){
                max1 = A[i];
            }
            int max2 = A[i+1];
            for(int j = i+1; j < A.length; j++){
                if(A[j] > max2){
                    max2 = A[j];
                }
            }
            max = Math.max(max,Math.abs(max1-max2));
        }
        return max;
    }
}