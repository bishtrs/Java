package java8;

public class Hen implements Flyable, Walkable {
 
	public static void main(String[] args) {
		System.out.println(Flyable.fly());
		System.out.println(Walkable.fly());
    }
    
}