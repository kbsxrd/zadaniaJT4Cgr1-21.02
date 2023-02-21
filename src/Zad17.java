import java.util.Scanner;
public class Zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.printf("Wprowadź cenę posiłku: ");
        double cenaposilku = klawiatura.nextDouble();

        double podatek = 0.0675;
        double cenapodatku = cenaposilku * podatek;
        double napiwek = 0.20;
        double cenanapiwku = (cenaposilku + cenapodatku) * napiwek;
        double lacznakwota = cenaposilku + cenapodatku + cenanapiwku;
        System.out.println("Cena za poasilek: "+cenaposilku+" Wartosc podatku: "+cenapodatku+" Wysokośc napiwku: "+cenanapiwku+" Łączna kwota: "+lacznakwota);
    }
}