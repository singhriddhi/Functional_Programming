package DataStructure;



//Write a Java program to merge two sorted arrays into a single sorted array
public class mergesortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		int[] arr3= {};
		int k=0;
		for(int i=1;i<arr1.length-1;i++) {
			for(int j=1;j<arr2.length-1;j++) {
				if(arr1[i]<arr2[j]) {
					arr3[k]=arr1[i];
					k++;
				}else {
					arr3[k]=arr2[j];
					k++;
				}
				
			}
		}
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr3[k];
			k++;
			System.out.println(arr3[i]);
		}
		

	}

}
//Write a Java program to find all the start indices of anagrams of a given string in another string
//Write a Java program to find the length of the longest substring without repeating characters
//Write a Java program to merge two sorted arrays into a single sorted array
