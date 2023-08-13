package Practice;
import java.util.Scanner;
public class TwoDAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of classes(rows):");
		int rows=sc.nextInt();
		System.out.println("Please enter number of students(columns):");
		int columns=sc.nextInt();
     int[][]marks=new int[rows][columns];
     for(int i=0;i<marks.length;i++) {
    	 for(int j=0;j<marks[i].length;j++) {	
    		 System.out.println("Please enter marks");
    		 marks[i][j]=sc.nextInt();
    	 }
     }
     for(int i=0;i<marks.length;i++) {
    	 for(int j=0;j<marks[i].length;j++) {																																																																	
    		 System.out.print(marks[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}

}
