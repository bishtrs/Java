import java.util.StringTokenizer;

public class StringSplitTest {

    public static void main(String[] args) {
        String str = "Hello world this is a tutorial";

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        str = "192.168.123.145";

        st = new StringTokenizer(str, ".");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

    }
}