package br.maua.linked_list_test_drive;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import br.maua.models.Conta;
import br.maua.models.Pessoa;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Midoria", "999"));
        pessoas.add(new Pessoa("Bakugo", "998"));
        pessoas.add(new Pessoa("Todoroki", "997"));
        pessoas.add(new Pessoa("Uraraka", "996"));
        pessoas.addFirst(new Pessoa("All Might", "001"));
        
        System.out.println("Pessoas:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        
        LinkedList<Conta> contas = new LinkedList<>();
        contas.addAll(Arrays.asList(new Conta(10), new Conta(20), new Conta(35)));
        System.out.println("\nPassa pela lista de contas:");
        contas.forEach(conta -> System.out.println(conta));

        
        System.out.println("\nPassando pelos elementos com o Iterator:");
        Iterator<Conta> iterator = contas.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
