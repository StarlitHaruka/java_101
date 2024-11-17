
public class Loops {

    
    public static void main(String[] args) {

        int x = 0;
        
        //while loop: performs action based on if var  meets a condition

        while (x < 2) {
            System.out.println("hai!! x is = " + x + " rn");
            x = x + 1;
        }



        int[] arr = new int[100];
        
            //for loop:
            // format = define var, condition for var, update var)
            //In general, we use for loops when we want to iterate through a range of values in a predictable, consistent way.
            //So, for instance, if we want to loop through all the indices of an array, or if we want to loop through the multiples of two below 1000. 
            // or for example run the exact same way some number of times.

		for (int index = 0; index < 100; index = index + 1) {
			arr[index] = 2 - index % 2; 

        }

        String s = "";
		for (int i = 0; i < 9; i++) {
			s += "- - - - - - - - -\n";
		}
		System.out.println(s);

        
	}
}






    
    
    

