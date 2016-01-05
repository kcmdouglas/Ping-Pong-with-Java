import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void isPingPong_forCountingInArrayList_returnsArrayValue() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, testPingPong.isPingPong(2));
  }
}
