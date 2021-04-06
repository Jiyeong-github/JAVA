package sec06.ch06;

public class InstanceExam2 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Dog puppy=dog;
		
		dog.name="송이";
		puppy.name="쏭이";
		
		dog.bark();
		puppy.bark();
	}

} 
