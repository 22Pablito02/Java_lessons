
package Home_work_4.task3;

import java.util.Stack;

public class postfixCalculator {

    public static void main(String[] args) {

        String[] exp = "1 2 + 3 4 + * 2 ^".split(" ");

        int res = 0;
        for (String element : exp) {
            System.out.printf("%s", element);
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (Character.isDigit(exp[i].charAt(0))) {
                st.push(Integer.parseInt(exp[i]));
            } else if (!isDigit(exp[i])) {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    case "^":
                        int pow = st.pop();
                        int number = st.pop();
                        res = 1;
                        for (int j = 0; j < pow; j++) {
                            res *= number;
                        }

                        st.push(res);
                        break;
                    default:
                        System.out.print("Введено некорректное действие! Допустимы знаки:\n " +
                                "\"+\" - сложение\n \"-\" - вычитание\n \"/\" - деление\n \"*\" - умножение\n " +
                                "\"^\" - возведение в степень (слева от ^ показатель степени!)");
                        break;
                }
            }
        }
        if (st.size() == 1)
            System.out.printf("\n%d", st.pop());
    }

    private static boolean isDigit(String string) {
        return false;
    }
}
