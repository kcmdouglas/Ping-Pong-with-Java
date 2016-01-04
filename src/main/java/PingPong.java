import java.io.Console;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public boolean isPingPong(Object userInput) {
    Console console = System.console();

    System.out.println("What number shall I count to?");
    String stringEndNumber = console.readLine();
    Integer endNumber = Integer.parseInt(stringEndNumber);

    ArrayList<Object> pingPongArray = new ArrayList<Object>();

    for (Integer index = 1 ; index < endNumber + 1 ; index ++) {
      pingPongArray.add(index);
    }

    System.out.println(pingPongArray);
    return isPingPong();
  }
}
