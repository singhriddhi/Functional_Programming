package FunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Ques 1 &2 square and cube every number in a list and find the number of squares
//Ques - sum of odd number in a list
//Ques- create a list with even numbers filtered from the numbers list
//Ques- create a list with lengths of all the courses titles
public class FP02Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printAllNumbersInListStructured(List.of(6,2,7,8,1,9));
		List<Integer> numbers = List.of(6, 2, 7, 8, 1, 1, 9);
		List<Integer> resultList=evenNumberList(numbers);
		System.out.println(resultList);
		List<String> courses = List.of("Eng", "Hindi", "Math");
		List<Integer> OnlyLengthofCource=courses.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(OnlyLengthofCource);
		int sum = sqrofnumbers(numbers);
		// System.out.println(sum);
		//PlayWithNumbers(numbers);
		//PlayWithString(courses);

	}

	private static List<Integer> evenNumberList(List<Integer> numbers) {
		return numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
	}

	public static int sqrofnumbers(List<Integer> numbers) {
		// return numbers.stream().map(x->x*x).reduce(0,Integer::sum);
		// return numbers.stream().map(x->x*x*x).reduce(0,Integer::sum);
		return numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
	}
	// if you want to print distinct number or sorted number

	public static void PlayWithNumbers(List<Integer> numbers) {

		// numbers.stream().distinct().forEach(System.out::println);
		numbers.stream().sorted().forEach(System.out::println);
	}

	// sorting a string in alphabatical order
	public static void PlayWithString(List<String> courses) {

		// numbers.stream().distinct().forEach(System.out::println);
		//courses.stream().sorted().forEach(System.out::println);
		//courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//sort a string on the basis of length of the string
		courses.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
	}

}
