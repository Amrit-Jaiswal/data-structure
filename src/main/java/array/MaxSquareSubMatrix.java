package array;

//Algo
// M[i][j] is given 2d array with 0 and 1 values
// copy 1st row and column in S[i][j]
//if M[i][j] = 1
//then S[i][j] = min( S[i][j-1], S[i-1][j-1], S[i-1][j] ) + 1
//else if M[i][j] = 0 then 0

public class MaxSquareSubMatrix {
    public static void main(String[] args) {
        int[][] input = {
                {0,1,1,1,1,1,0},
                {0,1,1,1,1,1,0},
                {0,0,1,1,1,0,1},
                {0,0,1,1,1,0,0},
                {1,1,0,0,1,0,1}};
        solution(input);
    }

    private static void solution(int[][] input){
        int max = 0;
        int maxRowIndex=0, maxColIndex=0;
        int rowLen = input.length;
        int colLen = input[0].length;
        int[][] temp = new int[rowLen][colLen];
        for(int i=0; i<1; i++){
            for (int j=0; j<colLen; j++){
                temp[i][j] = input[i][j];
            }
        }
        for(int i=0; i<rowLen; i++){
            for (int j=0; j<1; j++){
                temp[i][j] = input[i][j];
            }
        }

        for(int i=1; i<rowLen; i++){
            for (int j=1; j<colLen; j++){
                if(input[i][j] == 1){
                    int a = temp[i][j-1];
                    int b = temp[i-1][j-1];
                    int c = temp[i-1][j];
                    int min = 0;
                    if(a <= b && b <= c){
                        min = a;
                    }else if(b<=a && a<=c){
                        min = b;
                    }else {
                        min = c;
                    }
                    temp[i][j] = min + 1;
                    if(max <= temp[i][j]){
                        max = temp[i][j];
                        maxRowIndex = i;
                        maxColIndex = j;
                    }
                }else {
                    temp[i][j] = 0;
                }
            }
        }

        System.out.println("indexes : "+maxRowIndex + " : "+maxColIndex + ", max value :"+max);
        System.out.println("Print max sub square");
        for(int i=maxRowIndex; i> maxRowIndex-max; i--){
            for (int j=maxColIndex; j> maxColIndex-max; j--){
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

    }
}
