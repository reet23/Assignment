package Practice;
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int []a=new int[4];
    int []b=new int[3];
    for(int i=0;i<a.length;i++) {
    	System.out.println("Enter number of element:");
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<b.length;i++) {
    	System.out.println("Enter number of element:");
    	b[i]=sc.nextInt();
    }
    int[]c=new int[3];
    for(int i=0;i<c.length;i++) {
    	if(a[i]%2==0) {
    		c[i]=a[i];
    	}
    }
    int idx=a.length-1;
    for(int i=0;i<b.length;i++) {
    	if(b[i]%2==0) {
    		c[idx]=b[i];
    		idx++;
    	}
    }
    for(int i=0;i<b.length;i++) {
    	System.out.print(c[i]+" ");
    }
    }

}
