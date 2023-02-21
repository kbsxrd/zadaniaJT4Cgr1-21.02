import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String firstName, middleName, lastName;
        System.out.println("Podaj swoje pierwsze imie: ");
        firstName= klawiatura.nextLine();
        System.out.println("Podaj swoje drugie imie: ");
        middleName = klawiatura.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        lastName = klawiatura.nextLine();
        char PierwszyInitial = firstName.charAt(0);
        char DrugiInitial = middleName.charAt(0);
        char NazwiskoInitial = lastName.charAt(0);
        System.out.print("Twoje inicjaly to:" + PierwszyInitial + DrugiInitial + NazwiskoInitial);
    }
}
