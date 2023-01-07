import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int dogum_yili, kalan;
        String cinzodya = null;
        System.out.print("Lütfen Doğum Yılınızı Giriniz:");
        dogum_yili=input.nextInt();
        System.out.println("Doğum Yılınız: "+dogum_yili);
        kalan=dogum_yili%12;
        switch (kalan)
        {
            case 0:
                cinzodya="Maymun";
            break;
            case 1:
                cinzodya="Horoz";
                break;
            case 2:
                cinzodya="Köpek";
                break;
            case 3:
                cinzodya="Domuz";
                break;
            case 4:
                cinzodya="Fare";
                break;
            case 5:
                cinzodya="Öküz";
                break;
            case 6:
                cinzodya="Kaplan";
                break;
            case 7:
                cinzodya="Tavşan";
                break;
            case 8:
                cinzodya="Ejderha";
                break;
            case 9:
                cinzodya="Yılan";
                break;
            case 10:
                cinzodya="At";
                break;
            case 11:
                cinzodya="Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: "+ cinzodya);

    }
}