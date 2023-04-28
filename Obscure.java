public class Obscure {

    public static void main(String[] argv)
    {
        try {
            Integer I = 5;
            I <<= 2;
            if (I instanceof Integer) {
                System.out.println (++I);
            }

            byte b = (byte) I.intValue();
            switch (b % 2) {
                case 0: System.out.println ("b is even"); break;
                default: System.out.println ("b is odd"); break;
            }

            int k = Integer.parseInt ("Five");
        }
        catch (Exception e) {
            System.err.println ("Something bad just happened");
        }
    }
}
