import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChallengeTest {

  @Test
  public void shouldReturnTrueWhenAllAreUnique() {
    assertEquals(true, Challenge.hasUniqueChars("abcdefghijklm"));
    assertEquals(true, Challenge.hasUniqueChars(" abcC"));
    assertEquals(true, Challenge.hasUniqueChars("iopkgysrwTn\u0008\u007f"));
    assertEquals(true, Challenge.hasUniqueChars("903kslgoHjREW"));
    assertEquals(true, Challenge.hasUniqueChars(""));
  }

  @Test
  public void shouldReturnFalseWhenAnyAreRepeated() {
    assertEquals(false, Challenge.hasUniqueChars("abb"));
    assertEquals(false, Challenge.hasUniqueChars("   "));
    assertEquals(false, Challenge.hasUniqueChars("apdofjeuafy"));
    assertEquals(false, Challenge.hasUniqueChars("\u007f\u0008\u0009\u0009"));
  }
}
