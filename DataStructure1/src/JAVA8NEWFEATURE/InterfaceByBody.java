package JAVA8NEWFEATURE;

public interface InterfaceByBody {
	
	default void Car() {
		System.out.println("Audi");
	}
	static void Exam() {
		System.out.println("Pass");
	}

}
public class DefaultMethods implements InterfaceByBody{  
     
      
    public static void main(String[] args) {  
        DefaultMethods dm = new DefaultMethods();  
        dm.say();   // calling default method  
        dm.sayMore("Work is worship");  // calling abstract method  
  
    } 
    }
