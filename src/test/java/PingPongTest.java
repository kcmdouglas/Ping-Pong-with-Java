import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void isPingPong_forCountingInArrayList_returnsArrayValue() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expectedArray = new ArrayList<Object>();
    expectedArray = {1, 2};
    assertEquals(expectedArray, testPingPong.isPingPong(2));
  }


}
