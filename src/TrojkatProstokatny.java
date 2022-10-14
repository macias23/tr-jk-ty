import java.util.Scanner;

public class TrojkatProstokatny {
    public static void main(String[] args) {
        System.out.println("Podaj długość boków. Program sprawdza czy da się z nich zbudować trójkąt prostokątny.");
        Scanner scanner=new Scanner(System.in);
        double bok1 = scanner.nextDouble();
        double bok2 = scanner.nextDouble();
        double bok3 = scanner.nextDouble();
        if (Math.pow(bok1,2)+Math.pow(bok2,2)==Math.pow(bok3,2)){
            System.out.println("Da się zbudować trójkąt prostokątny.");
        }
        else if (Math.pow(bok1,2)+Math.pow(bok3,2)==Math.pow(bok2,2)){
            System.out.println("Da się zbudować trójkąt prostokątny");
        }
        else if (Math.pow(bok2,2)+Math.pow(bok3,2)==Math.pow(bok1,2))
        {
            System.out.println("Da się zbudować trójkąt prostokątny");
        }
        else System.out.println("Nie da się zbudować trójkąta prostokątnego.");
    }
}
