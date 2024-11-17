import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Write a function called countOccurrences that takes an integer array arr and an integer n, and returns the number of times that n appears in arr.
        int[] arr = {1, 2, 3, 2, 2};
        int target = 2;
        System.out.println(PracticeProblems.countOccurrences(arr, target));    


        //Write a function called reverseArray that takes an integer array arr and returns a new array with the elements of arr but in reverse order.
        int[] arr2 = {7, 7, 2, 1, 12, 5};
        System.out.println(Arrays.toString(PracticeProblems.reverseArray(arr2)));
          

        //Write a function called sumGrid that takes a 2d double array grid and returns the sum of all the elements. Hint: you can do this with nested for loops (look up what that is).
        int[][] arr3 = {
            {1, 2, 3,
            4, 5, 6, 
            7, 8, 9}
        };
        System.out.println(PracticeProblems.sumGrid(arr3)); 


        //Write a function called fib that takes an integer n and returns the nth number in the fibonacci sequence (starting with).
        System.out.println(PracticeProblems.fib(5)); 

        
        
    }
	
}

