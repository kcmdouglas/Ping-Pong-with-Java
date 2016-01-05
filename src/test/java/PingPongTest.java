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
    assertEquals(expectedArray, testPingPong.isPingPong(4));
  }

  @Test
  public void isPingPong_forNumbersDivisibleBy5_returnsPong() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expectedArray = new ArrayList<Object>();
     expectedArray.add(1);
     expectedArray.add(2);
     expectedArray.add("ping");
     expectedArray.add(4);
     expectedArray.add("pong");
     expectedArray.add("ping");
    assertEquals(expectedArray, testPingPong.isPingPong(6));
  }

  @Test
  public void isPingPong_forNumbersDivisibleBy15_returnsPingPong() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expectedArray = new ArrayList<Object>();
     expectedArray.add(1);
     expectedArray.add(2);
     expectedArray.add("ping");
     expectedArray.add(4);
     expectedArray.add("pong");
     expectedArray.add("ping");
     expectedArray.add(7);
     expectedArray.add(8);
     expectedArray.add("ping");
     expectedArray.add("pong");
     expectedArray.add(11);
     expectedArray.add("ping");
     expectedArray.add(13);
     expectedArray.add(14);
     expectedArray.add("pingpong");
     expectedArray.add(16);
    assertEquals(expectedArray, testPingPong.isPingPong(16));
  }

}
