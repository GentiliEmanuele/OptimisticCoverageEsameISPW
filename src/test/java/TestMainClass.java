import logic.MainClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMainClass {
    //If there is one or more space at the end of the string the stringLength does not count it.
    @Test
    public void TestReturnCharacter() {
        MainClass mainClass = new MainClass();
        String s = "Hello world!";
        Assertions.assertEquals(s.length(), mainClass.stringLength(s));
    }
}
