import java.util.StringJoiner;
   
public class TestStringJoinerMerge { 
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Harry")
        .add("Sally")
        .add("John");
        StringJoiner joiner2 = new StringJoiner(":");
        joiner.add("Ginger")
        .add("Jasmine")
        .add("Mike");
        
        joiner.merge(joiner2);
        System.out.println(joiner);
    }
}
	