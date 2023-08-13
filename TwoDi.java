package Practice;
import java.util.Scanner;
public class TwoDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter number of classes:");
	int c=sc.nextInt();
	//array creation
	int[][]marks=new int[c][c];
	//array input
	for( int i=0;i<marks.length;i++) {
		for(int j=0;j<marks[i].length;j++) {
			System.out.println("please enter marks for classes "+i+" students "+j+":");
			marks[i][j]=sc.nextInt();
		}
	}
	//avg calculating
	int sum=0;
	for(int i=0;i<marks.length;i++) {
		for(int j=0;j<marks[i].length;j++) {
			sum+=marks[i][j];
			}
		double avg=sum/marks[i].length;
		System.out.println("Averag marks for row "+i+" ="+avg);
	}
	}

}
