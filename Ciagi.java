package Powtorki;

import java.util.Scanner;

public class Ciagi {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("podaj ilosc elementow : ");
        int iloscelementow = skan.nextInt();
        System.out.println("podaj pierwszy wyraz ciągu : ");
        int pierwszyWYrazCiagu = skan.nextInt();
        ciagArytmetyczny(skan, pierwszyWYrazCiagu, iloscelementow);
        System.out.println("_________");
//        roznicaCiaguArytmetycznego(skan, pierwszyWYrazCiagu, iloscelementow);
//        System.out.println("_______________");
        ciągGeometryczny(skan, pierwszyWYrazCiagu, iloscelementow);
        System.out.println("-------------");
        sumaArytmetycznego(pierwszyWYrazCiagu,iloscelementow);
        System.out.println("-------------");
        sumaCiaguGeometrycznego(pierwszyWYrazCiagu,iloscelementow);
        System.out.println("-----------------");
        ciąg_fibbaciego(pierwszyWYrazCiagu,iloscelementow);
    }

    static int ciagArytmetyczny(Scanner skan, int pierwszyWYrazCiagu, int iloscelementow) {

        for (int x = 0; x < iloscelementow; x++) {
            System.out.println(pierwszyWYrazCiagu);
            pierwszyWYrazCiagu++;

        }
        return pierwszyWYrazCiagu;
    }

    static int roznicaCiaguArytmetycznego(Scanner skan, int pierwszyWYrazCiagu, int ilosc) {
        System.out.println(" podaj roznice w ciagu arytmetycznym :");
        int roznica = skan.nextInt();

        for (int x = 0; x < ilosc; x++) {
            System.out.println(pierwszyWYrazCiagu);
            pierwszyWYrazCiagu = pierwszyWYrazCiagu + roznica;
        }
        return pierwszyWYrazCiagu;

    }

    static void ciągGeometryczny(Scanner skan, int firstelement, int quantitiOfElements) {
        System.out.println("kolejne elementyciagu geometrycznego :");
        for (int x = 0; x < quantitiOfElements; x++) {
            System.out.println(firstelement);
            firstelement = firstelement + firstelement;

        }
    }
    static void sumaArytmetycznego(int firstelement, int quantitiOfElements ){
        int sumaciaguarytmetycznego=0;

        for (int x = 0; x < quantitiOfElements; x++) {

          sumaciaguarytmetycznego=firstelement+sumaciaguarytmetycznego;
          firstelement++;


        }
        System.out.println("suma ciagu Arytm  : ");
        System.out.println(sumaciaguarytmetycznego);

    }
    static void sumaCiaguGeometrycznego(int firstelement, int quantitiOfElements ){
        int sumaciagGeometr=0;
        for (int x = 0; x < quantitiOfElements; x++) {
            sumaciagGeometr=firstelement+firstelement;
            firstelement=firstelement+firstelement;

        }
        System.out.println("suma ciag Geometry : ");
        System.out.println(sumaciagGeometr);
    }
    static void ciąg_fibbaciego(int firstelement ,int quantitielements){
       int ciągFibbaciego=0;
       int b=1;
        System.out.println(" Początek Ciągu Fibbaciego:");
//        System.out.println(firstelement);
        for (int x=0;x<quantitielements;x++){

            ciągFibbaciego=firstelement+b;
            System.out.println(ciągFibbaciego);
            firstelement=b;
            b=ciągFibbaciego;

        }

    }
}