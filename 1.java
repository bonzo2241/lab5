import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель первой дроби");
        int a = scanner.nextInt();
        System.out.println("Введите знаменатель первой дроби");
        int b = scanner.nextInt();
        System.out.println("Введите числитель второй дроби");
        int c = scanner.nextInt();
        System.out.println("Введите знаменатель второй дроби");
        int d = scanner.nextInt();
        System.out.println("Введите знак действия");
        String t = scanner.next();
        Fractions f1 = new Fractions(a,b);
        Fractions f2 = new Fractions(c,d);
        if (t.contains("+")){
            System.out.println(f1.sum(f1.num, f1.den,f2.num, f2.den));
        }

        if (t.contains("-")){
            System.out.println(f1.sub(f1.num, f1.den,f2.num, f2.den));
        }

        if (t.contains("*")){
            System.out.println(f1.mul(f1.num, f1.den,f2.num, f2.den));
        }
        if (t.contains("/")){
            System.out.println(f1.div(f1.num, f1.den,f2.num, f2.den));
        }
        else{
            System.out.println("Ошибка");
        }


    }
}