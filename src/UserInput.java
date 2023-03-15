
import java.util.Scanner;

public class UserInput {
    private boolean isCorrect = false; // Флаг проверки корректности входа
    protected int userGo;

    protected int welcome() {
        isCorrect = false;
        while (!isCorrect) {
            Scanner user = new Scanner(System.in);
            System.out.println("Введите любые 6 чисел!");
            if (user.hasNextInt()) {
                userGo = user.nextInt();
                isCorrect = true;
            } else {
                System.out.println("Вы ввели не корректное число.");
            }
        }
        return userGo;
    }
}
