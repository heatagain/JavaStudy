package Exam01;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		System.out.println("嫦體 偎熱" + ani.claw);
		System.out.println("窒葬 望檜" + ani.tailSize);
		System.out.println("鼠棧" + ani.pattern);
		System.out.println("檜說 偎熱" + ani.teeth);
		
		Dog dog = new Dog();
		dog.pattern = "還鼠棧";
		
		
		Animal ani2 = dog;	// 機議蝶た
		ani2.pattern = "滌賅曄";
		System.out.println(dog.pattern);
		
		

	}

}
