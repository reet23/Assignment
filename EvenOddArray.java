package Practice;
import java.util.Scanner;
public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=sc.nextInt();
     int[]num=new int[n];
     for(int i=0;i<num.length;i++) {
    	 System.out.println("Enter  number of element:");
    	 num[i]=sc.nextInt();
     }
     for(int i=0;i<num.length;i++) {
    	 if(num[i]%2==0) {
    		num[i]=0;
    	 }
    	 else {
    		 num[i]=1;
    	 }
     }
     for(int i=0;i<num.length;i++) {
    	 System.out.print(num[i]+" ");
     }
	}

}
