package Practice;
import java.util.Scanner;
public class ArrayStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an array size:");
    int n=sc.nextInt();
    
    String arr[]=new String[n];
    for(int i=0;i<arr.length;i++) {
    	System.out.println("Enter array element:");
    	arr[i]=sc.next();
    }
    for(String name:arr) {
    	System.out.println(name);
    }
	}

}
