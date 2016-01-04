import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_forCountingInArrayList_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, testPingPong.isPingPong(4));
  }
}
