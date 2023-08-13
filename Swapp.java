package Practice;

public class Swapp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {10,20,30,40};
      int n=3;
      for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+" ");
      }
      
    
    for(int i=0;i<n;i++) {
    	int temp=arr[arr.length-1];
    		
    	
    for(int j=arr.length-1;j>0;j--) {
    	arr[j]=arr[j-1];
    	
    }
    arr[0]=temp;
    }
    System.out.println();
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
        }
	}
}
