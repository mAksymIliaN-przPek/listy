import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        while (true) {
            System.out.print("Wprowadź imię (wpisz '-' aby zakończyć): ");
            String name = scanner.nextLine();
            if (name.equals("-")) {
                break;
            }
            names.add(name);
        }

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Liczba unikalnych imion: " + uniqueNames.size());
    }
}
