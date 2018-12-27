public class Recursion{
   //part1: factorial non-recursion
   
   
   
   //part2: factorial recursion
    public static int factorial(int n) {
    	if(n==1||n==0) {
    		return 1;
    	}
    	return n*factorial(n-1);
    }
   
   
   
   //part3: fibonacci sequence non-recursion
   
   
   
   //part4: fibonacci sequence recursion
   public static int feedrabbit(int n) {
    	if(n==1||n==2) {
    		return 1;
    	}
    	return feedrabbit(n-1)+feedrabbit(n-2);
    }


}
