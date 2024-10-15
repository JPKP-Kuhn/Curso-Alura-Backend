package br.com.jpk.lista;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Joao");
        pessoa1.setIdade(18);

        pessoa2.setNome("Maria");
        pessoa2.setIdade(12);

        pessoa3.setNome("Adriana");
        pessoa3.setIdade(48);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas);

    }
}
