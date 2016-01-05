import java.io.Console;
import java.util.ArrayList;


public class PingPong {
  public static void main(String[] args) {

  }

  public Object isPingPong(Integer userInput) {
    ArrayList<Object> pingPongArray = new ArrayList<Object>();

    for (Integer index = 1 ; index < userInput + 1; index ++) {
        if(index % 3 == 0){
          pingPongArray.add("ping");
        } else if(index % 5 == 0){
          pingPongArray.add("pong");
        } else {
        pingPongArray.add(index);
        }
      }
    return pingPongArray;

  }
}
