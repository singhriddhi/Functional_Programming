package FunctionalProgramming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(4, 1, 7, 2, 7, 8, 4);
		// printOddNumbersInListFunctional(numbers);
		List<String> courses = List.of("Spring", "Spring boot", "Microservices", "Java");
		// printAllCoursesInListFunctional(courses);
		// printCoursesContainWordInListFunctional(courses);
		// printCoursesContainatLeast4LettersInListFunctional(courses);
		// printCubeofOddNumbersInListFunctional(numbers);
		printNumberofCharIneachCourseInListFunctional(courses);

	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

	private static void printAllCoursesInListFunctional(List<String> courses) {
		courses.stream().forEach(System.out::println);

	}

	private static void printCoursesContainWordInListFunctional(List<String> courses) {
		courses.stream().filter(name -> name.contains("Spring")).forEach(System.out::println);

	}

	private static void printCoursesContainatLeast4LettersInListFunctional(List<String> courses) {
		courses.stream().filter(name -> name.length() >= 4).forEach(System.out::println);

	}

	private static void printCubeofOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number)
				.forEach(System.out::println);
	}

	// print number of cahracter in each course
	private static void printNumberofCharIneachCourseInListFunctional(List<String> courses) {
		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);

	}

}
