package Powtorki;

import java.util.Random;
import java.util.Scanner;

public class SortowanieBombelkowe {
    public static void main(String[] args) {
        int tmp = 0;

        Scanner skan = new Scanner(System.in);
        int[] tab = new int[10];
        Random rand = new Random();
        System.out.println("wartosci tablicy : ");
        for (int x =0;x<10;x++) {
           tab[x] = rand.nextInt(20);

            System.out.print(tab[x]+",");
        }
        sortowanko(tab,tmp);
        }


        static void sortowanko(int []tabi,int tmp){
        for (int i=0;i<tabi.length;i++){
            for (int j=0;j<tabi.length-1;j++){
                if(tabi[j]>tabi[j+1]){
                    tmp=tabi[j];
                    tabi[j]=tabi[j+1];
                    tabi[j+1]=tmp;
                }
            }

        }
            System.out.println();
            System.out.println("posortowana tablica : ");
           for (int x=0;x<tabi.length;x++){
               System.out.print(tabi[x]+",");
           }
        }

}
