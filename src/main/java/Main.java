import model.Name;

public class Main {

    public static void main(String[] args) {
        Name[] imiona = new Name[3];

        for (int i = 0; i < imiona.length; i++) {
            imiona[i] = new Name();
            imiona[i].readNameFromCommandLine();
        }

        for (Name imie : imiona) {
            System.out.println(imie);
        }
    }

}
