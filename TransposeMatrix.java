package Practice;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.println("please enter the number of rows in array:");
    int row=sc.nextInt();
    System.out.println("please enter the number of columns in  array:");
    int col=sc.nextInt();
    int[][]a=new int[row][col];
    int[][]b=new int[col][row];
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		System.out.println("Please enter a number :");
    		a[i][j]=sc.nextInt();
    	}
    }
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
	}
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		b[j][i]=a[i][j];
    	}
	}
    for(int i=0;i<b.length;i++) {
    	for(int j=0;j<b[i].length;j++) {
    		System.out.print(b[i][j]+" ");
    	}
    	System.out.println();
	}
	}
}
