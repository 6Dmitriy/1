import java.util.Scanner;
public class Calculator { 
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num1 = number1();
        char op = operation();
        int num2 = number2();
        int result = calculator(num1, num2, op);
        System.out.println(result);
    }
    public static int number1(){
        System.out.println("Введите число");
        int num1;
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        }else{
            System.out.println("Ошибка попробуйте еще раз");
            scanner.next();
            num1 = number1();
        }
        return num1;
    }
    public static char operation(){
        System.out.println("Введите операцию");
        char op;
        if (scanner.hasNext()){
            op = scanner.next().charAt(0);
        }else{
            System.out.println("Ошибка попробуйте еще раз");
            scanner.next();
            op = operation();
        }
        return op;
    }
    public static int number2(){
        System.out.println("Введите число");
        int num2;
        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        } else {
            System.out.println("Ошибка попробуйте еще раз");
            scanner.next();
            num2 = number2();
        }
        return num2;
    }
    public static int calculator(int num1, int num2, char op){
        int result;
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            case '*' -> result = num1 * num2;
            default -> {
                System.out.println("Оператор не найден");
                result = calculator(num1, num2, operation());
            }
        }
        return result;
    }
}

