import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChallengeTest {

  @Test
  public void shouldReturnTrueWhenAllAreUnique() {
    allUnique(true, "abcdefghijklm");
    allUnique(true, " abcC");
    allUnique(true, "iopkgysrwTn\u0008\u007f");
    allUnique(true, "903kslgoHjREW");
    allUnique(true, "");
    allUnique(true, null);
  }

  @Test
  public void shouldReturnFalseWhenAnyAreRepeated() {
    allUnique(false, "abb");
    allUnique(false, "   ");
    allUnique(false, "apdofjeuafy");
    allUnique(false, "\u007f\u0008\u0009\u0009");
  }

  void allUnique(boolean expectedResult, String str) {
    assertEquals(expectedResult, Challenge.hasUniqueChars(str),
     String.format("Only unique characters: '%s'", str));
  }
}
