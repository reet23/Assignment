package Practice;

public class SumOfDigits {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5873;
         int rev=0;
         int sum = 0;
         while(n>0) {
        	 int rem=n%10;
        	 sum=sum+rem;
        	 n=n/10;
        	 }
         System.out.println(sum);
         while(sum>0) {
        	 int rem=sum%10;
        	 rev=rev+rem;
        	 sum=sum/10;
        	 }
         System.out.println(rev);
	}

}
