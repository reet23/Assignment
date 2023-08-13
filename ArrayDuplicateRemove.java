package Practice;
import java.util.Scanner;
public class ArrayDuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a size of array:");
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<a.length;i++) {
    	System.out.println("Please enter number :");
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]+" ");
    }
    System.out.println();
    int idx=a[0];
    for(int i=0;i<a.length;i++) {
    	if(idx!=a[i]) {
    		b[i]=a[i];
    		
    	}
    	System.out.print(idx+" ");
    }
	}

}
