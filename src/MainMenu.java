import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    public static void start(Admin admin) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true){

            System.out.println("Главное меню : ");

            System.out.println("1) Админ");
            System.out.println("2) Сотрудник");
            System.out.println("3) Проверить информацию о сотрудниках");
            System.out.println("4) Жеребьевка");
            System.out.println("0) Выйти из меню");


            int command = in.nextInt();

            if (command == 1){
                admin.AdminRegistration(admin);
                AdminMenu.start(admin);
            } else if (command == 2) {
                RegistrationMenu.start(admin);
            }else if(command ==3){
                admin.usersInfo();
            }else if(command ==4){
                admin.randomSanta();
            } else if (command == 0) {
                break;
            }else {
                System.out.println("Ошибка! выберите пункт из меню ");
            }
        }
    }
}