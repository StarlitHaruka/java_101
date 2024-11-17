public class PracticeProblems {

    public static void main(String[] args) {
        
    }

    public static int countOccurrences(int[] arr, int target) {

        int occurences = 0;

        for(int i = 0; i < arr.length; i++) { 

            int currentnum = arr[i];
            if (currentnum == target) {
                occurences++;
            }
        }
        return occurences;
    }

    public static int[] reverseArray(int[] arr) {

        
            int[] revArray = new int[arr.length];
            int n = 0;
            for(int i = arr.length-1; i >= 0; i --) {
                revArray[n] = arr[i];
                n++;
            }
        

           return revArray;
        }
             
    public static int sumGrid(int[][] arr) {

        int ArraySum = 0; 
        int RowSum[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            ArraySum = 0;
            for(int num: arr[i]){
                ArraySum+=num;
        }
        RowSum[i] = ArraySum;
    }
    return ArraySum;
    }

    public static int fib(int n) {
        
        int num1 = 0;
        int num2 = 1;
        int newNum;

        if (n == 0) {
            System.out.println(num1);
        }

        for(int i = 2; i <= n; i++) {
            newNum = num1 + num2;
            num1 = num2;
            num2 = newNum;
            
        }

        return num2;
        
        
    }
    
}