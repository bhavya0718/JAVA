pattern problems:
 

1.public class Main
{
	public static void main(String[] args) {
	    /* *****
	       *****
	       *****
	       *****
	       *****
	   */
	    
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=5;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		/* *****
		   *   *
		   *   *
		   *****
		*/
		for(int m=1;m<=5;m++){
		    for(int n=1;n<=4;n++){
		        if(m==1||n==1||m==5||n==4){
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		}
		System.out.println();
	}
	/* *
	   **
	   ***
	   ****
	   *****
	*/
	    for(int k=1;k<=5;k++){
	        for(int l=1;l<=k;l++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
}
}
2.

public class Main
{
	public static void main(String[] args) {
	    /* *****
	       ****
	       ***
	       **
	       *
	   */
	    
		for(int i=5;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		/*     *
		      ** 
		     ***
		    ****
		   *****
		*/
		for(int m=5;m>=1;m--){
		    for(int n=1;n<m;n++){
		        System.out.print(" ");
		}
		for(int n=0;n<=5-m;n++){
		System.out.print("*");
	}
	System.out.println();
}
	/* 1
	   12
	   123
	   1234
	   12345
	*/
	    for(int k=1;k<=5;k++){
	        for(int l=1;l<=k;l++){
	            System.out.print(l);
	        }
	        System.out.println();
	    }
}
}
3.

public class Main
{
	public static void main(String[] args) {
	    /* 12345
	       1234
	       123
	       12
	       1
	   */
	    
		for(int i=5;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print(j);
		    }
		    System.out.println();
		}
		/*     *
		      ** 
		     ***
		    ****
		   *****
		*/
		int number=1;
		for(int m=1;m<=5;m++){
		    for(int n=1;n<=m;n++){
		        System.out.print(number+" ");
		        number++;
		}
		
	    System.out.println();
}
	/* 1
	   01
	   010
	   0101
	   01010
	*/
	    for(int k=1;k<=5;k++){
	        for(int l=1;l<=k;l++){
	            int sum=k+l;
	            if(sum%2==0){
	            System.out.print(1+" ");
	            }else{
	                System.out.print(0+" ");
	            }
	        }
	        System.out.println();
	    }
}
}
