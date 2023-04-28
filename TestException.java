public class TestException {

    public static void main (String[] argv) {
        String[] a = {"one", "four", null, "seven"};
        for (String str: a) {
            try {
                System.out.println( getStringSize(str) );
            } catch (Exception e) {
                System.err.println("A problem has occurred: " + e);
            }
        }
    }

    static String getStringSize (String str)
            throws NullPointerException
    {
        if (str == null) {
            throw new NullPointerException("This string is a null");
        }
        else {
            return ("\"" + str + "\" has " + str.length() + " characters");
        }
    }
}
