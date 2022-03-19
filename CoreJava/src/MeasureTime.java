// measure elapsed time or check time taken by method
public class MeasureTime {
		
	 public static void main(String args[]) 
	    { 
	        System.out.println(MeasureTime.test()); 
	    }

	    public static int test()
	    {
	        try {
	        	return 1;
	           
	            //throw new Exception();
	            
	        } catch(Exception e) {
	            return 2;
	        } finally {  
	            return 3;
	        }
	    }
}
	