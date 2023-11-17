import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

  @Test
  public void whenEmptyString_thenAccept() {
    Palindrome palindromeTester = new Palindrome();
    Assert.assertTrue(palindromeTester.isPalindrome(""));
  }

  @Test
  public void whenPalindrom_thenAccept() {
    Palindrome palindromeTester = new Palindrome();
    Assert.assertTrue(palindromeTester.isPalindrome("noon"));
  }

  @Test
  public void whenNotPalindrom_thenReject() {
    Palindrome palindromeTester = new Palindrome();
    Assert.assertFalse(palindromeTester.isPalindrome("box"));
  }

  @Test
  public void whenNearPalindrom_thenReject() {
    Palindrome palindromeTester = new Palindrome();
    Assert.assertFalse(palindromeTester.isPalindrome("neon"));
  }
}
