package logic;

public class MainClass {
    //This method return the string length without final space.
    //There's a bug because the spaces are also a characters and, it is not count
    public int stringLength(String s) {
        return s.trim().length();
    }
}
