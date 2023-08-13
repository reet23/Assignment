package Practice;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of an array:");
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<a.length;i++) {
    	System.out.println("Enter array elements:");
    	a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    System.out.println("Enter key element:");
    int key=sc.nextInt();
    boolean isPresent=false;
    	int low=0;
    	int high=a.length-1;
    	int mid=(low+high)/2;
    	while(low<=high) {
    	if(key==a[mid]) {
    		isPresent=true;
    		break;
    	}
    	else if(key>a[mid]) {
    		low=mid+1;
    		mid=(low+high)/2;
    		
    	}
    	else  {
    		high=mid-1;
    		mid=(low+high)/2;
    		
    	}
    }
    	if(isPresent==true) {
    		System.out.println("Element is present at index:"+mid);
    	}
    	else {
    		System.out.println("Not present");
    	}
	}

}
