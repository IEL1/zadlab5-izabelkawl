package pl.edu.ur.oopl5;
import java.util.Scanner;
/**
 *
 * @author Izabela
 */
public class zad6 {
    liczba_zad6 liczba;
    
    public void Pokaz(){
        liczba.pokaz();
    }    
    private void usawianieWartosci(){
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wartosc: ");
        String wartosc = in.nextLine();
        
        liczba = new liczba_zad6(wartosc);
    }
    
    private void silniaS(){
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe, z ktorej ma zostac policzona silnia: ");
        int n = in.nextInt();
        System.out.println("Silnia z " + n + " jest równa: " + silnia(n));
    }   
    private long silnia(int n){
        long wynik = 1;
        for (int i=1; i<=n; i++){
            wynik = wynik * i;
        }
        return wynik;
    }    
    public void menu(){
        Scanner in = new Scanner(System.in);
        int menu = 1;
        
        usawianieWartosci();
        while(menu !=0){
            System.out.println("1. Wypisz");
            System.out.println("2. Pomnóż");
            System.out.println("3. Silnia");
            System.out.println("0. Cofnij");
            menu = in.nextInt();
            
            switch(menu){
                case 1: Pokaz(); break;
                case 2: liczba.multi(); break;
                case 3: silniaS(); break;
                case 0: break;
            }
        }
    }
}