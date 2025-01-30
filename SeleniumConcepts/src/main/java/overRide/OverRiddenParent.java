package overRide;
//video-- v1-cssSelectors
public class OverRiddenParent {

	/*	polymorphism-overloading and OverRiding
	 * 
	 * Overloading:static,non-static,Constructor(same class)
	 * 				:does not follow inheritance
	 * 				:main method can be overloaded
	 * 
	 * OverRiding:  follows Inheritance
	 * 				:non static method can be overridden
	 * 				: static and final methods cannot be overridden
	 * 		
	 * 				sam method for different purpose,showing difference in location
	 * 
	 * 			method: parent: overridden method		:	call using parent Object only
	 * 			method:  child: OverRiding Method		:	call using child object only
	 * 
	 *   Inheritance: Child object created in the child class calling all parent methods from parent class,and also child objects from child class is Inheritance
	 *   
	 * */	
	
//OverRidden Method
	public void area() {
		int length=3;
		int breadth=4;
		System.out.println(length*breadth);	
	}
}
