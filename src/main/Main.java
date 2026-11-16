package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {
        Series s1 = new Series("Mentalista", "Netflix");
        Series s2 = new Series(Input.st("Informe o nome da série"));

        System.out.println(serie1.getNome());
        serie1.setNota(Input.db("Informe uma nota:"));
        System.out.println(serie2.getNome());
        serie2.setNota(Input.db("Informe uma nota:"));

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        if (!serie1.setNota(Input.db("Informe uma nota:"))) {
            System.out.println("Nota invalida!");
        }
    }
}
