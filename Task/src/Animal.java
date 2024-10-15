/*Write a Java program to create a base class Animal with methods move() and makeSound(). 
 * Create two subclasses Bird and Panthera.
 *  Override the move() method in each subclass to describe how each animal moves. 
 *  Also, override the makeSound() method in each subclass to make a specific sound for each animal.
 */

public class Animal {
   void move () {
	   
   }
   void makeSound() {
	   
   }
}
class Bird extends Animal{
	@Override
    void move() {
        System.out.println("Bird is flying.");
    }

    @Override
    void makeSound() {
        System.out.println("Bird is chirping.");
    }
	
}
class Panther extends Animal{
	@Override
    void move() {
        System.out.println("Panthera is running.");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera is roaring.");
    }
	
}