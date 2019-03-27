//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
	public static boolean magicSquare(int[][] array){
		int sum1=0, sum2=0,sum3=0,dia1=0,dia2=0;
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length;j++){
				sum1+=array[i][j];  // this is for the rows
				sum2+=array[j][i];   // this is for the columns
				if(i<array.length-1){
					sum3+=array[i+1][j];  // for checking first row is equal to all other rows
					// sum4+=array[j][i+2];
				}
			}
			for(int k=0;k<array.length;k++){
                  dia1+=array[k][k];
                  dia2+=array[k][array.length-1-k];
			}

            if(sum1==sum2&&sum1==sum3&&dia1==dia2&&dia1==sum1){
                sum1=0;sum2=0;sum3=0;
                return true;
            }
            else{
            //     // System.out.println("the given matrix is not a magic square");
                return false;
            }
            // for(int k=0;k<array.length-1;k++){
            //     sum1+=array[k][i];
            //     sum2+=array[k+1][i];
            // }
            // if(sum1==sum2){
            // 	sum1=0;sum2=0;
            // }else{
            // 	return false;
            // }
		}
		return true;
	}
	public static void main(String[] args){
		int[][] testarray={{8,11,14,1},                  //{{1,11,10,12},
	                       {13,2,7,12},                   //{3,15,7,9},
		                   {3,16,9,6},                   //{14,2,13,5},
		                   {10,5,4,15}};                 //{16,6,4,8}};
	    boolean a=magicSquare(testarray);
	     if(a==true){
	     	System.out.println("the given matrix is a magic square");
	     }else{
	     	System.out.println("the given matrix is not a magic square");
	     }                  
	}
}
