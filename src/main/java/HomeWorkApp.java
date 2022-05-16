import java.util.Scanner;


public class HomeWorkApp {

    public static void main(String[] args) {
        printColor();
        printThreeWords();
        compareNumbers();
        checkSumSign();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a: ");
        int a = sc.nextInt();
        System.out.println("Write b: ");
        int b = sc.nextInt();
        int c = a + b;
        if(c >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Set value: ");
        int value = sc.nextInt();

        if(value <= 0){
            System.out.println("Red");
        }else if(value > 0 && value <= 100){
            System.out.println("Yellow");
        }else if(value > 100){
            System.out.println("Green");
        }
    }

    public static void compareNumbers(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
}
