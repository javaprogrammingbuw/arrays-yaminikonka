//2D Arrays
public class MatrixMultiplication {
	
	//Todo: Each 2D Array can be treated like a matrix.
	//Write a method which takes two matrices as input and returns the result.
	//Write a main-method where you call your created method for matrix multiplication
	//and print the result properly
      
      public static int[][] matrixMultip(int[][] array1, int[][] array2){
      	// int[][] outputarray=new int[array1.length][array2[0].length];
      	// int[] outputarray=new int[0][0];
      	if(array1[0].length==array2.length){
      		int[][] outputarray=new int[array1.length][array2[0].length];
      		  int a=0,b=array1[0].length;
      		if(array1.length>=array2[0].length){
      			 a=array1.length;
      			 // System.out.println(a);
      		}else{
      				a=array2[0].length;
      			}
      		    for(int i=0;i<a;i++){
      		    	for(int k=0;k<a;k++){
      		    	    int sum=0;
      			            for(int j=0;j<b;j++){
                                sum+=array1[i][j]*array2[j][k];
      			            }
                        outputarray[i][k]=sum;
                        // sum=0;
      			     }       
      			 }
      			 return outputarray;   
      		}

      		// else{
      			// a=array2[0].length;
      			// return matrixMultip( array1, array2 );

      		// }
      		// return outputarray;
      		return new int[0][0];
      		    
      	}
      	// else{
      		// return new int[0][0];

      	// }
      		public static void main(String[] args){
      	int[][] testarr1={{1,2,3},
                         {3,4,3},
                         {5,6,3}};
        int[][] testarr2={{1,2,5},
                          {3,4,6},
                          {5,6,3}};                
         for(int o=0;o<testarr1.length;o++){
         	for(int l=0;l<testarr1.length;l++){
         		System.out.print(matrixMultip(testarr1,testarr2)[o][l]+" ");
         	}
         	System.out.println();
         }
      }
     }
      	// return outputarray;
      	 

      



