import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_forCountingInArrayList_returnsArrayList() {
    PingPong testPingPong = new PingPong();
    assertEquals( [1, 2] , testPingPong.isPingPong(2));
  }
}
