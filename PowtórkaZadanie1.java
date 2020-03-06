package Powtorki;

import java.util.Random;
import java.util.Scanner;

public class PowtórkaZadanie1 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.printf(" Podaj wielkosc tablicy :");
        int liczba_elementow = skan.nextInt();
        int[] tab = new int[liczba_elementow];
        Random ran = new Random();
        System.out.println("do jakiego zakresu : ");
        int max = skan.nextInt();
        for (int x = 0; x < tab.length; x++) {
            tab[x] = ran.nextInt(max);

        }
        wyswieltWszystkieElementyTablicy(tab);
//        System.out.println("-----------------");
//        parzyste(tab);
//        System.out.println("-----------------");
//        odd(tab);
//        System.out.println("-----------------");
//        average(tab);
//        System.out.println("-----------------");
//        najmniejszaWartosc(tab);
//        System.out.println("-----------------");
//        najwieksza(tab);
//        System.out.println("-----------------");
//        elementyMniejszeOdLiczbyPodanejPrzezU(tab, skan);
        System.out.println("-----------------");
        dwuwymiarowa(tab);
        System.out.println("-------------");
        odwrotnakolejnosc(tab);
    }

    static void wyswieltWszystkieElementyTablicy(int[] tabi) {
        for (int x : tabi)
            System.out.println(x);
    }

    static int[] parzyste(int[] tab) {

        for (int t : tab) {
            if (t % 2 == 0) {
                System.out.println(t);
            }
        }
        return tab;
    }

    public static void odd(int[] tabe) {
        for (int x : tabe) {
            if (x % 2 != 0 && x % 3 == 0) {
                System.out.println(x);
            }
        }
    }

    static int[] average(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            suma = i + suma;
        }

        double sred = (double) suma / (double) tab.length;
        System.out.println(sred);
        return tab;
    }

    static void najmniejszaWartosc(int[] tabel) {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int x = 0; x < tabel.length; x++) {
            if (tabel[x] < min) {
                min = tabel[x];
                index = x;


            }


        }
        System.out.printf("wartość najmniejsza to : %d  wystepuje na indexie %d", min, index);
    }

    static int[] najwieksza(int[] tabelka) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int x = 0; x < tabelka.length; x++) {
            if (tabelka[x] > max) {
                max = tabelka[x];
                index = x;
            }
        }
        System.out.printf("wartość najwieksza to : %d  wystepuje na indexie %d", max, index);
        return tabelka;
    }

    static int[] elementyMniejszeOdLiczbyPodanejPrzezU(int[] tab, Scanner skani) {

        int liczbadocelowa = skani.nextInt();
        int rozmiarNowejTablicy = 0;
        for (int x : tab) {
            if (x < liczbadocelowa) {
//                System.out.println(x);
                rozmiarNowejTablicy++;
            }
        }
        int nowaTablica[] = new int[rozmiarNowejTablicy];
        int literacja = 0;
        for (int x = 0; x < tab.length; x++) {
            if (tab[x] < liczbadocelowa) {
                nowaTablica[literacja] = tab[x];
                System.out.println(nowaTablica[literacja]);
                literacja++;
            }
        }
        return nowaTablica;
    }

    static void dwuwymiarowa(int[] tab) {
        int iteracjaparzyste = 0;
        for (int t : tab) {
            if (t % 2 == 0) {

                iteracjaparzyste++;
            }
        }
        int nowaiteracja = 0;
        int[] tabelkaeven = new int[iteracjaparzyste];
        for (int x = 0; x < tab.length; x++) {
            if (tab[x] % 2 == 0) {
                tabelkaeven[nowaiteracja] = tab[x];
                nowaiteracja++;
            }
        }
        int iteracjaodd = 0;
        for (int t : tab) {
            if (t % 2 != 0) {

                iteracjaodd++;
            }
        }
        int nowaiteracjanieparzyste=0;
        int []odd=new int[iteracjaodd];
        for (int x=0;x<tab.length;x++){
            if (tab[x]%2!=0){
                odd[nowaiteracjanieparzyste]=tab[x];
                nowaiteracjanieparzyste++;
            }
        }
        int goshark[][]=new int[][]{tabelkaeven,odd};
        for(int x=0;x<goshark.length-1;x++){
            for (int i=0;i<odd.length;i++){
               System.out.printf(" nieparzyste : %d  ", odd[i]);
            }
            System.out.println("");
            for(int z=0;z<tabelkaeven.length;z++)
            {System.out.printf( " parzyste :%d  ", tabelkaeven[z]);}

        }
    }
    static void odwrotnakolejnosc(int[]tab){
        for(int x=tab.length;x>0;x--){
            System.out.println(tab[x-1]);
        }
    }
}
