

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] imiona = new String[3];

        for (int i = 0; i < imiona.length; i++) {
            imiona[i] = readNameFromCommandLine();
        }

        for (String imie : imiona) {
            System.out.println(imie);
        }
    }

    private static String readNameFromCommandLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Imie: ");
        return sc.nextLine();
    }

}
