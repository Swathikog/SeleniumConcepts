package amazon;

public class StringPalindrome {

	public static void main(String[] args) {
		 
		String input="madam";
		String reversed="";
  
       //boolean ispanidrome=true;
        for(int i=input.length()-1;i>=0;i--) {
        	
        	reversed=input.charAt(i)+reversed;
        }
        
        if(input.equals(reversed)) {
        	System.out.println("The given string is a palindrom: "+input);
        }else {
        	System.out.println("The given string is not a palindrom: "+input);
		}

	}

}
