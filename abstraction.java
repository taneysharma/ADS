// 50% abstraction to achieve 

abstract class Animal {

	abstract void makeSound() ;
	
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal {
	
	@Override 
	void makeSound() {
		System.out.println("Dog barks");
	}
}

public class abstraction{
	public static void main(String[] args) {
	try{
		Animal myPet = new Dog() ;
		myPet.makeSound() ;
		myPet.sleep() ;
		
		Animal nullAnimal = null ;
		nullAnimal.makeSound() ;
	}
	catch(Exception e) {
		//System.out.println("exception occured"+e); 
		e.printStackTrace();
	}
	
	}
}