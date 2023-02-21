import java.util.Scanner;
public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int kalorieCiasteczka = 300 / 4;
        System.out.println("Podaj liczbę zjedzonych ciasteczek:");
        int liczbaCiasteczek = klawiatura.nextInt();
        int liczbaKalorii = liczbaCiasteczek * kalorieCiasteczka;
        System.out.println("Liczba kalorii po zjedzeniu " + liczbaCiasteczek + " wynosi: " + liczbaKalorii);
    }
}
