package JAVA8NEWFEATURE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachandStream {
	public static void main(String[] args) {
   List<String> asList=new ArrayList<String>();
     asList.add("Riddhi");
     asList.add("Siddhi");
     asList.add("Viddhi");
     asList.add("Niddhi");
     List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 
     
     //asList.forEach(System.out::println);
     //asList.stream().forEachOrdered(System.out::println);
     list.stream().filter(num->num%5==0).forEachOrdered(System.out::println);
     String s="riddhi";
     Chracter chars=s.str
     
     
     
	}

   
}
