/*Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
 * Create two subclasses Car and Motorcycle. 
 * Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
 */
public class Vehical {
	void startEngine(){
		
	}
	void stopEngine() {
		
	}

}
class Car extends Vehical{
	 @Override
	    void startEngine() {
	        System.out.println("Starting the engine of the car");
	       
	    }

	    @Override
	    void stopEngine() {
	        System.out.println("Stopping the engine of the car");
	       
	    }
	
}
class Motorcycle extends Vehical{
	 @Override
	    void startEngine() {
	        System.out.println("Starting the engine of the motorcycle");
	       
	    }

	    @Override
	    void stopEngine() {
	        System.out.println("Stopping the engine of the motorcycle");
	       
	    }
}
