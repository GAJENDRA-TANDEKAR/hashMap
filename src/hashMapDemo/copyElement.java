package hashMapDemo;

public class copyElement {
	public static void main(String[] args) {
		
		int [] original = new int[] { 11,22,33,44,55,66,77,88,99} ;
		int [] copy = original;
		
		System.out.println( " original array = " );
		
		for (int i=0;i<original.length;i++) {
		  System.out.print(original[i]+ " ");
		}
		  
		  System.out.println(" coping array = ");
		  
		  for (int i=0;i<copy.length;i++) {
		  System.out.print(copy[i]+"  ");
		  }
		
	
	}
}
