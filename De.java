package Practice;

public class De {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//      for(int i=1;i<=5;i++) {
//    	  //space
//    	  for(int sp=1;sp<=(5-i);sp++) {
//    		  System.out.print("_");
//    	  }
//    	  //stars
//    	  for(int j=1;j<=i;j++) {
//    		  System.out.print("*");
//    		  if(j<i) {
//    			  System.out.print("_");
//    		  }
//    	  }
//    	  System.out.println();
//      }
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1;i<=5;i++) {
    	  //space
    	  for(int sp=1;sp<=(5-i);sp++) {
    		  System.out.print("_");
    	  }
    	  //stars
    	  for(int j=1;j<=i;j++) {
    		  System.out.print("*");
    		  if(j<i) {
    			  System.out.print("_");
    		  }
    	  }
    	  
    	  System.out.println();
      }
  for(int i=1;i<=4;i++) {
	  //space
	  for(int sp=1;sp<=i;sp++) {
		  System.out.print("_");
	  }
	  //stars
	  for(int j=1;j<=(5-i);j++) {
		  System.out.print("*");
		  if(j<(5-i)) {
			  System.out.print("_");
		  }
	  }
  
	  System.out.println();
  }
	}
  }
  
