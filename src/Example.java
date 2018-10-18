
public class Example {

		  private static int currentCount = 0;

		  public static int SampleClass() {
		    return ++currentCount;
		    
		    
		  }

		  public void increaseCount() {
			  int i ;
			  i = SampleClass();
			  System.out.println(i);		   	    
		 
		  }
		
		  public static void main(String args[])
		  {
			  System.out.println(currentCount);
			  Example ex = new Example();
			  ex.increaseCount();
			  
	
		  }

}
