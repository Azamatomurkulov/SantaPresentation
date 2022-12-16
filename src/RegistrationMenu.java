import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationMenu {

    public static void start(Admin admin) throws IOException {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Меню регистрации сотрудника : ");

            System.out.println("\nЖелаете ли вы зарегистрироваться на игру \"Тайный Санта\" ?");
            System.out.println("1) Пройти регистрацию ");
            System.out.println("2) Воздержаться ");
            System.out.println("0) Вернуться в главное меню");

            int command = in.nextInt();

            if (command == 1) {
                admin.EmployeeRegistration(admin);
            }else if (command == 2) {
                MainMenu.start(admin);//Возвращает в главное меню
            } else if (command == 0) {
                MainMenu.start(admin);
            } else {
                System.out.println("Ошибка! выберите пункт из меню ");
            }
        }
    }
}
