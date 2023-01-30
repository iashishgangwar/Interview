// Java 1.8 required
import java.util.*;

class CharactersFrequency {

  public static void main(String[] args) {

    printCharactersFrequency("Write a program to find character occurrence.");

  }

  private static void printCharactersFrequency(String str) {
    final Map < Character, Integer > charMap = new HashMap < Character, Integer > ();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        if (charMap.containsKey(str.charAt(i))) {
          charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
        } else {
          charMap.put(str.charAt(i), 1);
        }
      }
    }

    charMap.forEach((key, value) ->
      System.out.println("Key: " + key + "  " + "Value:  " + value)
    );
  }
}