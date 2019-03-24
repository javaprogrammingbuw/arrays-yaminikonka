import java.util.Arrays;

public class SortAndSearch {
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search
	public static void swap(int a, int b){
		int c=a;
		a=b;
		b=c;
	}

	public static int[] bubbleSrt(int[] array){
		for(int pivot=array.length-1;pivot>0;--pivot){
			for(int i=0;i<pivot;i++){
         	   if(array[i]>array[i+1]){
         		// swap(array[i],array[i+1]);
         		int c=array[i];
         		array[i]=array[i+1];
         		array[i+1]=c;
         		// System.out.println(Arrays.toString(array));
         	   }
            }
		}
       return array;  
	}
	public static int binSrch(int[] array0, int n){
		int[] array=bubbleSrt(array0);
		int min=0, max=array.length-1;
		/** i tried this code to acheive by using recursion, it does not work at present:  **/
		
		/*if(array.length/2>n){
			// max=srchIndex-1;
			// array.length=(array.length/2)-1;
			int[] array1=new int[(array.length/2)-1];
             for(int i=0;i<(array.length/2)-1;i++){
             	array1[i]=array[i];
             }
			return binSrch(array1,n);
		}else if(array.length/2<n){
			// min=srchIndex+1;
			int[] array2=new int[(array.length/2)];
			for(int j=(array.length/2)+1;j<array.length;j++){
			array2[j-(array.length/2)+1]=array[j];}
			return binSrch(array2,n);
		}else{
			
			return n;
		}*/
	for(int i=0;i<array.length;i++){
		int srchIndex=Math.round((min+max)/2);
		if(array[srchIndex]>n){
			max=srchIndex-1;
		}else if(array[srchIndex]<n){
			min=srchIndex+1;
		}else{
			return n;
		}
	}
	return -1;

	}
	public static void main(String[] args){
		int[] testarray={4,12,0,1,12,9,44,100,2};
		System.out.println("sorted array is: ");
		for(int i=0;i<testarray.length;i++){
			System.out.print((bubbleSrt(testarray)[i])+",");
		}
		if(binSrch(testarray,7)==-1){
			System.out.println("number is not there");
		}else{
			System.out.println("number is there");
		}
		// System.out.println(binSrch(testarray, 2));
		
	}

}
