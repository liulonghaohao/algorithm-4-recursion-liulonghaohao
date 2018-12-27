public class Recursion{
   //part1: factorial non-recursion
   public static int factorial(int n){
      int temp = 1;
      for(int i = n; i>0;i--){
           temp *= i;
      }
      return temp;
   }
   
   //part2: factorial recursion
    public static int factorial(int n) {
    	if(n==1||n==0) {
    		return 1;
    	}
    	return n*factorial(n-1);
    }
   
   
   
   //part3: fibonacci sequence non-recursion
      public static int feedrabbit(int n){//F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)
        int temp = 0;
      for(int i = 3;i<n;i++){
       temp+=2+(i-1)+(i-2);   
      }
         return temp;
      }
   
   
   //part4: fibonacci sequence recursion
   public static int feedrabbit(int n) {
    	if(n==1||n==2) {
    		return 1;
    	}
    	return feedrabbit(n-1)+feedrabbit(n-2);
    }


}
