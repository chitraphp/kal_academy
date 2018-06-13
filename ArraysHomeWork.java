package kal_academy;

import java.util.Arrays;

public class ArraysHomeWork{
	
	public static int search(int[] input) {
		//searching for target even index between lowerIndex and higherIndex
		int lowerIndex = 0;
		int higherIndex = input.length - 1;
		
		while(lowerIndex < higherIndex){
			//mid value decides which side of the mid needs to be searched
			int mid =(lowerIndex + higherIndex)/2;
			
			//if the value at the mid point is followed by same number the target lies on left side of the mid otherwise target lies on right side of the mid
			if(mid%2 == 0){
				if(input[mid] == input[mid+1]){
					lowerIndex = mid;
				}else {
					higherIndex = mid;
				}				
			}
			if(mid%2 == 1){
				if(input[mid] == input[mid-1]){
					lowerIndex = mid + 1;
				}else {
					higherIndex = mid;
				}				
			}								
		}
		return input[lowerIndex];		
	}
	
	public static int magicIndex(int[] input){
		int lowerIndex = 0;
		int mid=0;
		int higherIndex = input.length-1;
		while(lowerIndex < higherIndex){
			 mid = (lowerIndex + higherIndex) / 2;
			 if(input[mid] == mid){
				 break;
			 }else if (input[mid] > mid) {
				 higherIndex = mid;
			}else {
				lowerIndex = mid;
			}
		}
		return mid;
	}
	
	public static void splitArray(int[] input){
		int lastIndex = input.length-1;
		int[] elementsArray = new int[lastIndex];//this array holds all the elements of input except sum element
		int sum=0, greatestValueIndex=0, bigNumber=0;
		int[] sumArray = new int[1];
		
		//finding sum of elements and index of the big number
		for(int i=0;i<=lastIndex;i++){
			if(input[i] > bigNumber){
				bigNumber = input[i];
				greatestValueIndex = i;
			}
			sum = sum + input[i];
		}
		if(sum/2 == input[greatestValueIndex]){
			System.out.println("input is valid");
			sumArray[0] = input[greatestValueIndex];
			//copying array elements except sum element
			for(int i=0;i<=lastIndex-1;i++){
				if(i == greatestValueIndex){
					elementsArray[i] = input[greatestValueIndex+1];
				}	else{
					elementsArray[i] = input[i];
				}
			}
			System.out.println("Elements array" + Arrays.toString(elementsArray));
			System.out.println("sum of the elements array" + Arrays.toString(sumArray));			
		}	
	}
	
	public static int oneDuplicate(int[] input){
		
		//find the sum of n-1 elements
		int sum = 0, duplicate;
		for(int i=0;i<input.length;i++){
			sum = sum + input[i];
		}
		int n = input.length-1;//no of elements without duplicate
		int total = (n*(n+1))/2;
		duplicate = sum - total;
		return duplicate;
	}
	
	public static int adjacentEleofDiffOne(int[] input, int targetEle){
		int targetIndex=0;
		for(int i =0; i<input.length-1;i++){
			if((input[i] == targetEle) && (input[i+1] == targetEle-1)){
				targetIndex = i;
			}
		}
		return targetIndex;
	}
	
	
	
	public static void main(String[] args){
		
		int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,7};
		int[] a = {-1,-2,1,3,5};
		int[] x = {1,2,3,4,4};
		int[] splitArray = {2,3,9,4};
		int[] input = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3};
		int diffOne = adjacentEleofDiffOne(input,3 );
		System.out.println("index of element" + diffOne);
		int dupNum = oneDuplicate(x);
		splitArray(splitArray);
		int result = search(arr);
		int magicIndex = magicIndex(a);
		System.out.println(result);
		System.out.println(magicIndex);
		System.out.println("duplicate"+ dupNum);
	}

}
