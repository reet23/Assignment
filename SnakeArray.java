package Practice;
import java.util.Scanner;
public class SnakeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows and columns:");
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<arr.length;i++) {
   	 for(int j=0;j<arr[i].length;j++) {
   		 System.out.print("Enter number of elements:");
   		 arr[i][j]=sc.nextInt();
   	 }
    }
   	 
    for(int i=0;i<arr.length;i++) {
	 for(int j=0;j<arr[i].length;j++) {
		 if(i==0||i<arr.length-1||j==0||j==arr[i].length-1) {
			 System.out.print(arr[i][j]+" ");
		}
		 else {
			 System.out.print(" ");
		 }
	 }
	System.out.println();
}
}
}