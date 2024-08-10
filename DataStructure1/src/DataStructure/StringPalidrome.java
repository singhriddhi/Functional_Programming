package DataStructure;




//Write a Java program to check if a given string is a palindrome
public class StringPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naveen";
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				System.out.println(false);
			}
			left++;
			right--;
			
		}
		

	}

}
