package pck1;

import java.util.ArrayList;
import java.util.List;

class Uczestnik {
    private int id;
    private String imie;
    private int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Imię: " + imie + ", Wiek: " + wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

class Wydarzenie {
    private List<Uczestnik> uczestnicy;

    public Wydarzenie() {
        uczestnicy = new ArrayList<>();
    }

    public void dodajUczestnika(Uczestnik uczestnik) {
        uczestnicy.add(uczestnik);
    }

    public void usunUczestnika(Uczestnik uczestnik) {
        uczestnicy.remove(uczestnik);
    }

    public List<Uczestnik> getUczestnicy() {
        return uczestnicy;
    }

    public List<Uczestnik> filtrujNiepelnoletnich() {
        List<Uczestnik> niepelnoletni = new ArrayList<>();

        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() < 18) {
                niepelnoletni.add(uczestnik);
            }
        }

        return niepelnoletni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Uczestnik uczestnik : uczestnicy) {
            sb.append(uczestnik.toString()).append("\n");
        }
        return sb.toString();
    }
}

 class Main {
    public static void main(String[] args) {
        Wydarzenie wydarzenie = new Wydarzenie();

        Uczestnik uczestnik1 = new Uczestnik(1, "Jan", 20);
        Uczestnik uczestnik2 = new Uczestnik(2, "Anna", 17);
        Uczestnik uczestnik3 = new Uczestnik(3, "Piotr", 25);

        wydarzenie.dodajUczestnika(uczestnik1);
        wydarzenie.dodajUczestnika(uczestnik2);
        wydarzenie.dodajUczestnika(uczestnik3);

        System.out.println("Lista uczestników:");
        System.out.println(wydarzenie);

        System.out.println("Uczestnicy niepełnoletni:");
        List<Uczestnik> niepelnoletni = wydarzenie.filtrujNiepelnoletnich();
        for (Uczestnik uczestnik : niepelnoletni) {
            System.out.println(uczestnik);
        }
    }
}
