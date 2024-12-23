package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.OutroTitulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainAtividade {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<Integer>();

        lista.add(5);
        lista.add(2);
        lista.add(7);

        Collections.sort(lista);
        System.out.println(lista);

        ArrayList<OutroTitulo> outraListaDeTitulos = new ArrayList<>();
        outraListaDeTitulos.add(new OutroTitulo("C"));
        outraListaDeTitulos.add(new OutroTitulo("S"));
        outraListaDeTitulos.add(new OutroTitulo("A"));

        Collections.sort(outraListaDeTitulos);

        for (OutroTitulo outraListaDeTitulo : outraListaDeTitulos) {
            System.out.println(outraListaDeTitulo.getNome());
        }

    }
}
