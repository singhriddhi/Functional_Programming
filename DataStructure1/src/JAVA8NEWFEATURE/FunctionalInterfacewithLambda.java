package JAVA8NEWFEATURE;

public interface FunctionalInterfacewithLambda {
	
	abstract void drawing() ;
	

}
public interface FunctionalInrfacewithLambda {
	abstract void Car(String name);
}

class lambdawithexpression{
	public static void main(String[] args) {
		int width=10;
		FunctionalInterfacewithLambda func=()->{
			System.out.println("drawing "+width);
		};
		func.drawing();
	}
	//lambda expression with paramaneter
	 FunctionalInrfacewithLambda func1=(name)->{
		System.out.println("Name"+name);
	};
	func1.Car();
}
