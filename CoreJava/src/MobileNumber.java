

public final class MobileNumber {
    private final int prefix;
    private final int mobileNumber;
	
    public MobileNumber(int prefix, int mobileNumber) {
        this.prefix = prefix;
        this.mobileNumber = mobileNumber;
    }
	
    // equals method implementation
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if ( !(o instanceof MobileNumber) ) { // checks for null also
            return false;
        }

        MobileNumber mn = (MobileNumber) o;
        return (mn.mobileNumber == mobileNumber && mn.prefix == prefix);
    }
    
    // hashCode method implementation	
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + prefix;
        result = 31 * result + mobileNumber;
        return result;
    }
	
    // Test
    public static void main(String[] args) {
    	MobileNumber mobileNumber1 = new MobileNumber(91, 1234565789);
    	MobileNumber mobileNumber2 = new MobileNumber(92, 1234565789);
    	System.out.println(mobileNumber1.equals(mobileNumber2));
    	
    	MobileNumber mobileNumber3 = new MobileNumber(91, 1234565789);
    	System.out.println(mobileNumber1.equals(mobileNumber3));
    }	


}
	

