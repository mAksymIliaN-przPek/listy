package packge3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaPierwsza = new ArrayList<>();
        listaPierwsza.add(1);
        listaPierwsza.add(2);
        listaPierwsza.add(3);
        listaPierwsza.add(4);
        listaPierwsza.add(5);

        List<Integer> listaDruga = new ArrayList<>();
        ListIterator<Integer> iterator = listaPierwsza.listIterator(listaPierwsza.size());

        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            listaDruga.add(element);
        }

        System.out.println("Lista Pierwsza: " + listaPierwsza);
        System.out.println("Lista Druga: " + listaDruga);
    }
}
