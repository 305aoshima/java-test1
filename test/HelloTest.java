import static org.testng.Assert.assertEquals;
import org.testng.annotations.*;

public class HelloTest {
  @Test public void test001() { D("test001"); }
  static void D(String format, Object... args) {
    System.out.printf(format + "\n", args);
  }
}
