import org.example.BracketValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BracketValidatorTest {
    @Test
    void testValidSingleBrackets() {
        Assertions.assertTrue(BracketValidator.isValid("()"));
    }

    @Test
    void testValidMultipleBrackets() {
        Assertions.assertTrue(BracketValidator.isValid("()[]{}"));
    }

    @Test
    void testInvalidSingleBrackets() {
        Assertions.assertFalse(BracketValidator.isValid("(]"));
    }

    @Test
    void testInvalidDoubleBrackets() {
        Assertions.assertFalse(BracketValidator.isValid("([)]"));
    }

    @Test
    void testValidDoubleBrackets() {
        Assertions.assertTrue(BracketValidator.isValid("{[]}"));
    }

    @Test
    void testInvalidMultipleBrackets() {
        Assertions.assertFalse(BracketValidator.isValid("{[}]()"));
    }
}
