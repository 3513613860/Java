class Solution {
    public int numSpecial(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    int count = 0;
                    for(int k = 0; k < mat.length; k++){
                        if(mat[k][j] == 1){
                            count++;
                        }
                    }

                    for(int z = 0; z < mat[i].length; z++){
                        if(z == j){
                            continue;
                        }
                        if(mat[i][z] == 1){
                            count++;
                        }
                    }
                    if(count == 1){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}