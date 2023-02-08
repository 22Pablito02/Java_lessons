import java.util.Scanner;
public class main{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число, от которого вы хотите посчитать треугольник: ");
        int lol = getNum();
        getResult(lol);
    }

    static int getNum(){
        int num = input.nextInt();
        return num;
    }

    static void getResult(int num){
        int result = num * (num + 1) / 2;
        System.out.print(result);
    }
    
} 