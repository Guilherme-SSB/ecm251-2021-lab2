package br.maua.sets;

import br.maua.models.Item;

import java.util.LinkedHashSet;   // Garanto que não há cópias + mantenho a ordem inserida
import java.util.Set;

public class LinkekHastSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new LinkedHashSet<>();
        //Adiciona itens no HashSet
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 3));

        //Passa por todos os seus elementos
        itemSet.forEach( item -> System.out.println(item));
    }
}
