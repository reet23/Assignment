package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
	public static void main(String[] args) {
		// Array sorting.....
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an array size:");
    int n=sc.nextInt();
    int[]a=new int[n];
    for(int i=0;i<a.length;i++) {
    	System.out.println("Enter an array elements:");
    	a[i]=sc.nextInt();
    }
    //Arrays.sort(a);
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]+" ");
    }
    System.out.println();
    //bubble sort
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a.length-1;j++) {
    		int temp=0;
    		if(a[j]>a[j+1]) {
    			temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		}
    	}
    }
    System.out.println("Sorted array:");
    for(int i=0;i<a.length;i++) {
    System.out.print(a[i]+" ");
	}
}
}