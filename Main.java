import java.util.Scanner;

//Ödev
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matNotu = 0, fizikNotu = 0, turkceNotu = 0, kimyaNotu = 0, muzikNotu = 0;

        System.out.print("Matematik Notunuz : ");
        matNotu = input.nextInt();
        if (matNotu < 0 || matNotu > 100) {
            matNotu = 0;
        }

        System.out.print("Fizik Notunuz : ");
        fizikNotu = input.nextInt();
        if (fizikNotu < 0 || fizikNotu > 100) {
            ;
            fizikNotu = 0;
        }

        System.out.print("Turkce Notunuz : ");
        turkceNotu = input.nextInt();
        if (turkceNotu < 0 || turkceNotu > 100) {
            turkceNotu = 0;
        }

        System.out.print("Kimya Notunuz : ");
        kimyaNotu = input.nextInt();
        if (kimyaNotu < 0 || kimyaNotu > 100) {
            kimyaNotu = 0;
        }

        System.out.print("Muzik Notunuz : ");
        muzikNotu = input.nextInt();
        if (muzikNotu < 0 || muzikNotu > 100) {
            muzikNotu = 0;
        }

        double average = ((matNotu + fizikNotu + turkceNotu + kimyaNotu + muzikNotu) / 5);

        if (average <= 55) {
            System.out.println("Sinifta Kaldiniz, seneye tekrar gorusmek uzere!");
        } else {
                System.out.println("Tebrikler, sinifi gectiniz!");

        }
        System.out.println("Ortalamaniz : " + average);

        }
    }


