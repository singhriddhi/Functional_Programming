package DataStructure;



//Write a Java program to find the missing number in an array of integers from 1 to n
public class missingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,6,7,5,0};
		int n=7;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==n) {
				System.out.println(i);
			}
		}
		

	}

}
