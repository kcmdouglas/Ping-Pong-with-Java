import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void isPingPong_forCountingInArrayList_returnsArrayValue() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expectedArray = new ArrayList<Object>();
     expectedArray.add(1);
     expectedArray.add(2);;
    assertEquals(expectedArray, testPingPong.isPingPong(2));
  }

  @Test
  public void isPingPong_forNumbersDivisibleBy3_returnsPing() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expectedArray = new ArrayList<Object>();
     expectedArray.add(1);
     expectedArray.add(2);
     expectedArray.add("ping");
     expectedArray.add(4);
    assertEquals(expectedArray, testPingPong.isPingPong(3));
  }

}
