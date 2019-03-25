//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
	public static boolean magicSquare(int[][] array){
		int sum1=0, sum2=0;
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length;j++){
				sum1+=array[i][j];	// NOTE: you are checking (row-0, col-0), (row-1, col-1), ... not shure if this is always correct
				sum2+=array[j][i];
			}
             if(sum1==sum2){
                sum1=0;sum2=0;
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
	}	// NOTE: would be nice to have a blank line after each method
	public static void main(String[] args){
		int[][] testarray={{9,2,4}, // NOTE: added a real magic square
	                       {5,7,3},
		                   {1,6,8}};
		// int[][] testarray={{4,9,1},
	    //                    {3,5,7},
	    //                    {8,2,6}};
	     boolean a=magicSquare(testarray);
	     if(a==true){
	     	System.out.println("the given matrix is a magic square");
	     }else{
	     	System.out.println("the given matrix is not a magic square");
	     }                  
	}
}
