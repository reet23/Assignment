package Practice;
import java.util.Scanner;
public class NamesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter number:");
       int n=sc.nextInt();
       sc.nextLine();
       String name[]=new String[n];
       for(int i=0;i<name.length;i++) {
    	   System.out.println("Please enter a name:");
    	   name[i]=sc.nextLine();
       }
       for(int i=0;i<name.length;i++) {
    	   System.out.println(name[i]);
	}
	}
}
