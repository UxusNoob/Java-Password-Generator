import java.util.Scanner;

public class PasswordGenerator {

    static String rand(int r)
    {

        String rand = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder str = new StringBuilder(r);

        for (int i = 0; i < r; i++) {

            int index = (int)(rand.length() * Math.random());
            str.append(rand.charAt(index));
        }

        return str.toString();
    }

    public static void main(String[] args)
    {
        System.out.print("How long will it be? ");
        Scanner ra = new Scanner(System.in);

        int n = ra.nextInt();
        System.out.println(PasswordGenerator.rand(n));



    }
}
