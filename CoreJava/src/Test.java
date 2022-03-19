public class Test {
	private enum LOB { 
        AWM ("Asset & Wealth Management"),
        WM ("Wealth Management"),
        CIB ("Consumer & Invetment banking"),
        CCB ("Consumer and coporate banking");
    
        private String description;
        
        private LOB(String description) {
        	this.description = description;
        }
        
        public String getDescription() {
            return description;
        }
   }
	
   public static void main(String[] args) {
        System.out.println(LOB.valueOf("AWM"));
        System.out.println(LOB.valueOf("WM"));
        System.out.println(LOB.valueOf("CIB"));
        System.out.println(LOB.valueOf("CCB"));
    }
}