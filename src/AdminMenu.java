import java.io.IOException;
import java.util.Scanner;
public class AdminMenu {
    public static void start(Admin admin)throws IOException {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Главне меню Заказчика : ");
            System.out.println("1) Указать минимальную и максимальную стоимость подарка.");
            System.out.println("2) Добавление инструкций.");
            System.out.println("3) Указать дату окончания игры и время обмена подарками.");
            System.out.println("4) Показать цены.");
            System.out.println("5) Показать даты.");
            System.out.println("6) Показать инструкции.");
            System.out.println("0) Выход из главного меню.");

            int command = in.nextInt();

            if (command == 1) {
                admin.setPrice();
            } else if (command == 2) {
                admin.addInstructions();
            } else if (command == 3) {
                admin.setDateAndTime();
                System.out.println("********************************************************");
            } else if (command == 4) {
                System.out.println("********************************************************");
                admin.getPriceInfo();
                System.out.println("********************************************************");
            } else if (command == 5) {
                System.out.println("********************************************************");
                admin.dateAndTimeInfo();
                System.out.println("********************************************************");
            } else if (command == 6) {
                System.out.println("********************************************************");
                admin.instructionsInfo();
                System.out.println("********************************************************");
            } else if (command == 0) {
                MainMenu.start(admin);
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}