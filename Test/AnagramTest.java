import static org.junit.Assert.*;
import junit.framework.TestCase;

public class AnagramTest extends TestCase{

    public void testAnagram() throws Exception {
        {
            boolean test = Anagram.anagram("zap", "run");
            assertTrue(!test);

            boolean test2 = Anagram.anagram("subtle", "Sublet");
            assertTrue(test2);

            boolean test3 = Anagram.anagram("torchwood", "doctor who");
            assertTrue(test3);

            boolean test4 = Anagram.anagram("brian", "standage");
            assertTrue(!test4);
        }
    }
}