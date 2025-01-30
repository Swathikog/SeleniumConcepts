package overRide;
//video-- v1-cssSelectors
public class OverRidingChild extends OverRiddenParent {

	public static void main(String[] args) {
		//Call OverRidden Method
		OverRiddenParent p=new OverRiddenParent();
		 p.area();
		 
		//Call OverRiding Method 
		 OverRidingChild ch=new OverRidingChild();
		 ch.area();			

	}
	
//OverRiding Method
	
	public void area() {		//A Triangle appears on left to show that it is an overRidden method
		double weight=54.5;
		double height=6.6;
		System.out.println(weight+height);
		
	}

}
