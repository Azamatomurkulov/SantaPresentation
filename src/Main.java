import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Admin admin = new Admin();

        Employee employee1 = new Employee( "Ruslan" );
        employee1.setGift("Кофеварка");
        Employee employee2 = new Employee( "Yaroslav");
        employee2.setGift("Термокружка");
        Employee employee3 = new Employee( "Richard");
        employee3.setGift("Чайник");
        Employee employee4 = new Employee( "Freya");
        employee4.setGift("Книга");
        Employee employee5 = new Employee( "Lolita");
        employee5.setGift("Тостер");
        Employee employee6 = new Employee( "Li");
        employee6.setGift("Наушники");
        Employee employee7 = new Employee( "Martin");
        employee7.setGift("Мышка");
        Employee employee8 = new Employee( "Arsen");
        employee8.setGift("Кресло - мешок");
        Employee employee9 = new Employee( "Janna");
        employee9.setGift("Bluetooth - колонка");


        admin.addEmployee(1,employee1);
        admin.addEmployee(2,employee2);
        admin.addEmployee(3,employee3);
        admin.addEmployee(4,employee4);
        admin.addEmployee(5,employee5);
        admin.addEmployee(6,employee6);
        admin.addEmployee(7,employee7);
        admin.addEmployee(8,employee8);
        admin.addEmployee(9,employee9);


        MainMenu.start(admin);
    }

}
