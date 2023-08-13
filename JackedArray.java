package Practice;
import java.util.Scanner;
public class JackedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int [][] age=new int[3][];
    age[0]=new int[2];
    age[1]=new int[4];
    age[2]=new int[3];
    for(int i=0;i<age.length;i++) {
    	for(int j=0;j<age[i].length;j++) {
    		System.out.println("Please enter age "+i+" "+j+" is:");
    		age[i][j]=sc.nextInt();
    	}
    }
    for(int i=0;i<age.length;i++) {
    	for(int j=0;j<age[i].length;j++) {
    		System.out.print(age[i][j]+" ");
	}
    	System.out.println();
    }
}
}