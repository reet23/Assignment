package Practice;

public class Cb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=4;i++) {
    	for(int j=1;j<=i;j++) {
    		if(i==1||j==1) {
    			System.out.print(j);
    		}
    		else {
    		System.out.print("*"+j);
    	}
    }
    	System.out.println();
	}
	}
}
