package ru.geekbrains_java_core_1_hw_17_05_2022;

public class HomeWorkJavaCore1_17_05_2022 {
    public static void main(String[] args) {
            //checkSum();
            //checkNegativeOrPositive();
            //checkNegativeOrPositivee();
            //repeatTheString();
            checkTheYear(400);
    }


        private static boolean checkSum(int a, int b){

        int result = a + b;

        if (result < 10){
            System.out.println("false");
            return false;
        }else if(result > 20){
            System.out.println("false");
            return false;
        }else{
            System.out.println("true");
            return true;
        }

        }


        private static void checkNegativeOrPositive(int c){
            if(c >= 0){
                System.out.println("Positive");
            }else{
                System.out.println("Negative");
            }
        }

        private static boolean checkNegativeOrPositivee(int d){
            if(d >= 0){
                System.out.println("true");
                return true;
            }else{
                System.out.println("false");
                return false;
            }
        }


        private static void repeatTheString(String str, int countStr){
            for (int i = 0; i < countStr; i++) {
                System.out.println(str);
            }
        }

        private static boolean checkTheYear(int year){
            if(year == 100){
                System.out.println("false");
                return false;
            }else if(year == 0){
                System.out.println("false");
                return false;
            }else if(year % 400 == 0){
                System.out.println("true");
                return true;
            }else if(year % 4 == 0){
                System.out.println("true");
                return true;
            }else{
                System.out.println("false");
                return false;
            }
        }
}
