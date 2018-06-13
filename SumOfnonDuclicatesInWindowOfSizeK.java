package kal_academy;

public class SumOfnonDuclicatesInWindowOfSizeK {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] input = {2,2,2,7,7,7,5,5,5};
		int windowSize = 9;
		int startIndex = 0; 
		int size = input.length;
		int lastStartIndex =size-windowSize;
		
		int sum = 0;
		
		while(startIndex <= lastStartIndex){
			int count = 1;
			for(int i=0;i<windowSize;i++){
				int compareEle = input[startIndex + i];
				for(int j=i+1;j<windowSize;j++){
					if(compareEle == input[startIndex+j])
						break;
					else {
						if(j == (windowSize-1))
							count++;
					}
				}	
			}
		    sum = sum + count;
			startIndex++;
		}
		System.out.println(sum);
	}

}
