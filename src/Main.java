import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] primer = input.split("[+\\-*/]");
        if (primer.length !=2) throw new Exception("Пример содержит больше 2 переменных или был введён неверный знак");
        int a = Integer.parseInt(primer[0]);
        int b = Integer.parseInt(primer[1]);
        int c;
        String operation = calc(input);
        System.out.println(operation);
        if ((a<11 && a>0) && (b<10 && b>0)){
            switch (operation) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
            }


        }
            else{
                System.out.println("Введённые числа выходят за границу");
            }
    }


    public static String calc (String input) {
        if (input.contains("+")) {
            return "+";
        }
        if (input.contains("-")) {
            return "-";
        }
        if (input.contains("*")) {
            return "*";
        }
        if (input.contains("/")) {
            return "/";
        }


        else return null;
    }


}
