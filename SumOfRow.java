package Practice;
import java.util.Scanner;
public class SumOfRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int [][]arr=new int[4][4];
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    	System.out.println("Enter number of array element:");
    	arr[i][j]=sc.nextInt();
    }
	}
   //to print matrix
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		System.out.print(arr[i][j]+" ");
    	}
    	System.out.println();
    }
    //to calculate sum of row
    int sumRow=0,high=0,rownum=0;
    for(int i=0;i<arr.length;i++) {
    	sumRow=0;
    	for(int j=0;j<arr[i].length;j++) {
    	sumRow=sumRow+arr[i][j];
    	}
    	
    	if(sumRow>high) {
    		high=sumRow;
    		rownum=i;
    	}
    	System.out.println("sum of "+i+" is:"+sumRow);
    }
    System.out.println("greatest row is"+rownum+" "+high);
    //to calculate sum of columns
    int sumCol=0,High=0,colnum=0;
    for(int i=0;i<4;i++) {
    	sumCol=0;
    	for(int j=0;j<arr.length;j++) {
    		
    	sumCol=sumCol+arr[j][i];
    }
    	
    	if(sumCol>High) {
    		High=sumCol;
    		colnum=i;
    	}
    	System.out.println("sum of "+i+" is:"+sumCol);
	}
    System.out.println("greatest col is"+colnum+" "+High);
    
    //sum of diagonal number
    
    int sum=0;
    
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		if(i==j) {
    			sum=sum+arr[i][j];
    			
    		}
    	}
    }
    System.out.println("Sum of diagonal 1 is :"+sum);
    sum=0;
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		if((i+j)==(arr[i].length-1)) {
    	sum=sum+arr[i][j];
    	}
    	}
    }
    	System.out.println("Sum of diagonal 2 is: "+sum);
    	}
}

