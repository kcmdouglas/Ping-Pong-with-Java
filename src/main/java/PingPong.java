import java.io.Console;
import java.util.ArrayList;


public class PingPong {
  public static void main(String[] args) {}

  public Object isPingPong(Integer userInput) {
    ArrayList<Integer> pingPongArray = new ArrayList<Integer>();

    for (Integer index = 1 ; index < userInput + 1; index ++) {
      pingPongArray.add(index);
    }

    if(pingPongArray.get(1) == 2){
      return true;
    } else {
      return false;
    }
  }
}
