import java.util.*;
public class Main {
    public static void main(String[] args) {
        Zad2_1 obiekt = new Zad2_1();
        System.out.println("Zainicjowane wartosci");
        System.out.println(obiekt.getLiczba());
        System.out.println(obiekt.getNapis());
        System.out.println(obiekt.getZnak());
        System.out.println();
        Zad2_2.Wypis();
        Uczen Tomasz= new Uczen("Tomasz", "Sowa", 18, 4.3);
        Uczen Jan = new Uczen();
        Uczen Fiolek = new Uczen("Fiolek", "Skowronek",23,5.0);
        Uczen Suzanna = new Uczen("Suzana", "Joles",32,3.3);
        Uczen Jan2 = new Uczen();
        Uczen Anna = new Uczen("Anna", "Canes", 52, 4.6);
        System.out.println("Wyswietlanie danych");

        System.out.println(" Imie: " + Tomasz.imie + " Nazwisko: " + Tomasz.nazwisko + " Srednia: " + Tomasz.srednia + " Wiek: " + Tomasz.wiek);
        System.out.println(" Imie: " + Jan.imie + " Nazwisko: " + Jan.nazwisko + " Srednia: " + Jan.srednia + " Wiek: " + Jan.wiek);
        System.out.println(" Imie: " + Fiolek.imie + " Nazwisko: " + Fiolek.nazwisko + " Srednia: " + Fiolek.srednia + " Wiek: " + Fiolek.wiek);
        System.out.println(" Imie: " + Suzanna.imie + " Nazwisko: " + Suzanna.nazwisko + " Srednia: " + Suzanna.srednia + " Wiek: " + Suzanna.wiek);
        System.out.println(" Imie: " + Jan2.imie + " Nazwisko: " + Jan2.nazwisko + " Srednia: " + Jan2.srednia + " Wiek: " + Jan2.wiek);
        System.out.println(" Imie: " + Anna.imie + " Nazwisko: " + Anna.nazwisko + " Srednia: " + Anna.srednia + " Wiek: " + Anna.wiek);

        Owoc cytrynka = new Owoc(true,"cytryna","zolty",3,'t',0.7);
        Owoc.wypiszOwoc(cytrynka);
        Owoc blueberry = new Owoc(true, "blueberry","dark blue",6,'t',0.3);
        Owoc.wypiszOwoc(blueberry);
        Owoc strawberry = new Owoc(false, "strawberry","red",6,'n',0.66);
        Owoc.wypiszOwoc(strawberry);
        Owoc nowyOwoc = new Owoc();
        Owoc.wypiszOwoc(nowyOwoc);
        nowyOwoc.setZawartoscWody(0.35);
        nowyOwoc.setNazwa("jabluszko");
        nowyOwoc.setKolor("zielony");
        nowyOwoc.setCzyCukier(true);
        nowyOwoc.setLiczba(7);
        nowyOwoc.setCzyPestki('t');
        Owoc.wypiszOwoc(nowyOwoc);
        OdliczanieWPetli.PetlaFor();
        System.out.println(" ");
        OdliczanieWPetli.PetlaWhile();
        System.out.println(" ");
        OdliczanieWPetli.PetlaDoWhile();
        System.out.println(" ");
        System.out.println("Wprowadz trzy wartosci odcinkow, z ktorych chcesz utworzyc trojkat: ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Trojkat.czyTrojkat(a.nextInt(),b.nextInt(),c.nextInt());
        System.out.println(" ");
        System.out.println("Wszystkie liczby z przedzialu <11,111> podzielne przez 13 bez reszty");
        LiczbyCalkowite.liczbyCalkowite();
        System.out.println("n liczb z ciagu Fibonacciego");
        System.out.println("Wprowadz liczbe n - ile kolejnych elementow z ciagu Fibonacciego nalezy wyswietlic");
        Scanner n= new Scanner(System.in);
        CiagFibonacciego.elementyZCiagu(n.nextInt());



    }
}