import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void testcase() {
        assertEquals("ssoR olleh", Rv.reverse("hello Ross"));
        assertEquals(" zyx", Rv.reverse("xyz "));
        assertNotEquals("Show eror", Rv.reverse("23 "));
        System.out.println("success");
    }

    @Test
    public void test1() {
        if (Rv.reverse("good") =="doog") {
            System.out.println("good");
        } else {
            System.out.println("error");
        }
    }
}