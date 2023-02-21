import java.util.Scanner;
public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwę miasta:");
        String ulubionemiasto = klawiatura.nextLine();
        int liczbaZnakow = ulubionemiasto.length();
        String wielkielitery = ulubionemiasto.toUpperCase();
        String malelitery = ulubionemiasto.toLowerCase();
        char pierwszyznak = ulubionemiasto.charAt(0);

        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZnakow + "\n" + "Nazwa miasta zapisaną wielkimi literami: " + wielkielitery + "\n" +
                "Nazwa miasta zapisaną małymi literami: " + malelitery + "\n" + "Pierwszy znak nazwy miasta: " + pierwszyznak);
    }
}
