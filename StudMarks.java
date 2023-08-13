package Practice;
import java.util.Scanner;
public class StudMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter no of subjects:");
    int n=sc.nextInt();
    int marks[]=new int[n];
    for(int i=0;i<marks.length;i++) {
    	System.out.println("Please enter marks:");
    	marks[i]=sc.nextInt();
    }
    float sum=0;
    int max=marks[0];
    for(int i=0;i<marks.length;i++) {
    	 sum+=marks[i];
    	 if(marks[i]>max) {
    		 max=marks[i];
    	 }
    }
    float percentage=(sum/(n*100))*100;
    System.out.println(percentage);
    System.out.println("max marks:"+max);
	}

}
