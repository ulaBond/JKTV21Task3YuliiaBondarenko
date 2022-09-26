/*Task 3 */
package jktv21task3yuliiabondarenko;

import java.util.Scanner;
/*@author pupil*/
public class JKTV21Task3YuliiaBondarenko {
    
    static enum Month {
        JAN, FEB, MART, APR, MAY, JUNI, JUULI, AUG, SEP, OKT, NOV, DEC
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Напиши свое имя и фамилию: ");
    String name1 = scanner.nextLine();
    System.out.println("Напиши свой личный код: ");
    String kod = scanner.nextLine();
    char pol = kod.charAt(0);
    int pol2 = Character.digit(pol, 10);
    char p1 = ' ';
    char p2 = ' ';
    char p3 = ' ';
    if(pol2%2 == 0){
        p1 = 'а';
        p2 = 'с';
        p3 = 'ь';
    }else {
        p1 = 'c';
        p2 = 'я';
        p3 = ' ';
    }
    char god1 = kod.charAt(1);
    char god2 = kod.charAt(2);
    char mes1 = kod.charAt(3);
    char mes2 = kod.charAt(4);
    char den1 = kod.charAt(5);
    char den2 = kod.charAt(6);
    int m1 = Character.digit(mes1, 10);
    int m2 = Character.digit(mes2, 10);
    int mes = m1*10+m2-1;
    char god3 = ' ';
    char god4 = ' ';
    if (pol == '5') {
        god3 = '2';
        god4 = '0';
    }else if (pol == '6') {
        god3 = '2';
        god4 = '0';
    }else {
        god3 = '1';
        god4 = '9';
    }        
        System.out.print(name1+" родил"+p1+p2+p3+" "+den1+den2+" ");
        System.out.print(Month.values()[mes]);
        System.out.print(" "+god3+god4+god1+god2+" года");
    }    
}
