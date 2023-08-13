package Practice;
import java.util.Scanner;
public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    double[][][] cgpa=new double[2][2][3];
    for(int i=0;i<cgpa.length;i++) {
    	for(int j=0;j<cgpa[i].length;j++) {
    		for(int k=0;k<cgpa[i][j].length;k++) {
    			System.out.println("Please enter cgpa "+i+" "+j+" "+k+" is: ");
    			cgpa[i][j][k]=sc.nextDouble();
    		}
    	}
    }
    for(int i=0;i<cgpa.length;i++) {
    	for(int j=0;j<cgpa[i].length;j++) {
    		for(int k=0;k<cgpa[i][j].length;k++) {
    			System.out.print(cgpa[i][j][k]+" ");
	}
    		System.out.println("  ");
    } 	
}
}
}