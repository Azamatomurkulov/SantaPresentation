import java.io.IOException;
import java.util.Scanner;

public class EmployeeMenu {

    public static void start(Employee employee) throws IOException {


        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Главное меню сотрудника : ");

            System.out.println("1) Выбрать желаемую категорию подарка ");
            System.out.println("0) Выйти в меню регистрации ");

            int command = in.nextInt();

            if (command == 1) {
                employee.chooseGift();
            } else if (command == 0) {
                return;
            }else {
                System.out.println("Ошибка! выберите пункт из меню ");
            }
        }
    }


}


