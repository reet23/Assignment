package Practice;
import java.util.Scanner;
public class ArrayDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a size of  array:");
   int n=sc.nextInt();
    int [][] a=new int[n][n];
    int [][] b=new int[n][n];
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		System.out.println("Please enter a elements in a:");
    		a[i][j]=sc.nextInt();
    	}
    } 
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }    	
    for(int i=0;i<b.length;i++) {
    	for(int j=0;j<b[i].length;j++) {
    		System.out.println("Please enter a elements in b:");
    		b[i][j]=sc.nextInt();
    	}
    }
   
    for(int i=0;i<b.length;i++) {
    	for(int j=0;j<b[i].length;j++) {
    		System.out.print(b[i][j]+" ");
    	}
    	System.out.println();
    }    	
    System.out.println();
   int c[][]=new int[3][3];
   for(int i=0;i<c.length;i++) {
	   for(int j=0;j<c[i].length;j++) {
		   c[i][j]=a[i][j]-b[i][j];
	   }
   }
   for(int i=0;i<c.length;i++) {
	   for(int j=0;j<c[i].length;j++) {
		   System.out.print(c[i][j]+" ");
    }
	   System.out.println();
   }
}
}