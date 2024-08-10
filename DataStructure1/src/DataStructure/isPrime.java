package DataStructure;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int flag=0;
		if(num<=1) {
			System.out.println("not prime");
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
			System.out.println("not prime");
			flag=1;
			break;
			}
		}
		if(flag==0) {
		System.out.println("Prime");
		}

	}

}

//public class PrimeCheck {
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
