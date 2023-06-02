import java.util.*;

public class PartnerFinder {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź imiona par (wpisz '-' jako pierwsze imię, aby zakończyć):");

        while (true) {
            String name1 = scanner.nextLine();

            if (name1.equals("-")) {
                break;
            }

            String name2 = scanner.nextLine();

            if (name2.equals("-")) {
                break;
            }

            names.add(name1);
            names.add(name2);
        }

        System.out.println("Podaj imię dla którego chcesz znaleźć partnera:");
        String searchedName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < names.size(); i += 2) {
            if (names.get(i).equals(searchedName)) {
                String partnerName = names.get(i + 1);
                System.out.println("Partner dla imienia " + searchedName + ": " + partnerName);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nie znaleziono partnera dla imienia " + searchedName);
        }
    }
}
