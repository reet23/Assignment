package Practice;

public class Digits {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//     for(int i=1;i<=5;i++) {
//    	 for(int j=1;j<=5;j++) {
//    		 if(i==1||i==5||j==1||j==5) {
//    			 System.out.print(i);
//    		 }
//    		 else {
//    			 System.out.print(" ");
//    		 }
//    	 }
//    	 System.out.println();
//     }
//	}

	public static void main(String[]args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
			for(int k=1;k<=(5-i);k++) {
				System.out.print("*");
				if(k<(5-i)) {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		for(int i=2;i<=4;i++) {
			for(int j=1;j<=(5-i);j++) {
					System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				if(k<i) {
				System.out.print(" ");	
				}
			}
			System.out.println();
		}

	}
}
 