package model;

import java.util.Scanner;

public class Name {
    private String name;

    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void readNameFromCommandLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Imie: ");
        this.name = sc.nextLine();
    }

    @Override
    public String toString() {
        return "imie ='" + name + '\'';
    }
}
