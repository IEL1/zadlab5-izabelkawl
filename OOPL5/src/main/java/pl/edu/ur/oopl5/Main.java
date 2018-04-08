package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie3");
        int p, n, m, j, c, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokońć stosu: ");
        p = scanner.nextInt();
        zad3 stos = new zad3(p);

        do {
            System.out.println();
            System.out.println("Dołóż wartość na stos - wciśnij 1");
            System.out.println("Zdejmij wartość ze stosu -wciśnij 2");
            System.out.println("Pokaż wartość na szczycie stosu - wciśnij 3");
            System.out.println("Wyjdź - wciśnij 0");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    if (!stos.isFull()) {
                        System.out.print("Podaj liczbę:");
                        m = scanner.nextInt();
                        stos.push(m);
                    } else {
                        System.out.println("Stos jest pełny");
                    }
                    break;

                case 2:
                    if (!stos.isEmpty()) {
                        System.out.println(stos.pop() + " zostało zdjęte ze stosu!");
                    } else {
                        System.out.println("Stos jest pusty");
                    }
                    break;
                case 3:
                    stos.top();
                    break;

                case 0:
                    System.out.println("Koniec działania programu");
                    break;

                default:
                    System.out.println("Zła liczba, powrót do wyboru");
            }
        } while (n != 0);

        System.out.println("Zadanie5");
        firma_zad5 firma = new firma_zad5();
        do {
            String[][] x = firma.dane;
            System.out.println();
            System.out.println("1. Wprowadź pracownika");
            System.out.println("2. Wyświetl pracownika");
            System.out.println("0. Wyjdź");
            c = scanner.nextInt();

            switch (c) {
                case 1:
                    firma.dodajPracownika(i, x);
                    if (i < 100) {
                        i++;
                    }
                    break;

                case 2:

                    firma.wyswietlPracownikow(i, x);
                    break;

                case 0:
                    System.out.println("Koniec dziełania programu");
                    break;

                default:
                    System.out.println("Zła liczba");
            }
        } while (c != 0);

        System.out.println("Zadanie6");
        zad6 zad6 = new zad6();
        zad6.menu();
    }
}
