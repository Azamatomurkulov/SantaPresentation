import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Admin{
    private final int password = 1010;
    ArrayList<String> instructions = new ArrayList<>();
    ArrayList<LocalDate> date = new ArrayList<>();
    ArrayList<LocalTime> time = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    Map<String, String> map = new HashMap<>();
    Map<Integer, Employee> employee = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    public void addEmployee(int index , Employee employee){
        this.employee.put(index, employee);
    }


    public void AdminRegistration(Admin admin) throws IOException {
        System.out.println("Введите логин: ");
        String lg = sc.nextLine();
        String login = sc.nextLine();
        System.out.println("Введите пароль: ");
        int password = sc.nextInt();
        if (login.equals("Admin") && password == this.password) {
            System.out.println("Добро пожаловать Админ ");
        } else {
            System.out.println("Вы ввели неверный логин или пароль");
            MainMenu.start(admin);
        }
    }

    public void EmployeeRegistration(Admin admin) throws IOException {
        System.out.println("Введите логин");
        String login = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();

        int index = (employee.size()+1);
        String pw1 = map.get(login);
        if (password.equals(pw1)) {
            System.out.println("Вы уже зарегистрированы");
            Employee foundedEmployee = employee.get(index);
            EmployeeMenu.start(foundedEmployee);
        } else {


            admin.addEmployee(index,new Employee(login,password));
            System.out.println("Добро пожаловать " + login);
            map.put(login, password);

            Employee foundedEmployee = employee.get(index);
            EmployeeMenu.start(foundedEmployee);
        }
    }



    public void setPrice()throws IOException {
        System.out.println("Установите минимальную стоимость подарка: ");
        double minSum = sc.nextDouble();
        System.out.println("Установите максимальную стоимость подарка: ");
        double maxSum = sc.nextDouble();
        prices.add(minSum);
        prices.add(maxSum);
        System.out.println("________________________________");
        System.out.println("Сумма успешно добавлена");
        System.out.println("________________________________");
        FileWriter setPrices = new FileWriter("SetPrice.txt");
        for(Double price: prices) {
            setPrices.write(String.valueOf(price));
        }setPrices.close();
    }
    public void getPriceInfo(){
        System.out.println("Минимальная сумма подарка : " + this.prices.get(0));
        System.out.println("Максимальная сумма подарка : " + this.prices.get(1));
    }


    public void setDateAndTime(){
        System.out.println("Введите день: ");
        int day = sc.nextInt();
        System.out.println("Введите месяц: ");
        int month = sc.nextInt();
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        System.out.println("Установите время начала обмена подарками : ");
        System.out.println("Часы: ");
        int hours = sc.nextInt();
        System.out.println("Минуты: ");
        int minutes = sc.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        System.out.println("Вы установили дату: " + date);
        this.date.add(date);
        LocalTime time = LocalTime.of(hours,minutes);
        System.out.println("Время начала: " + time);
        this.time.add(time);
    }
    public void dateAndTimeInfo(){
        System.out.println("Дата : " + this.date.get(0));
        System.out.println("Время : " + this.time.get(0));
    }


    public void addInstructions()throws IOException{
        System.out.println("Введите новую иструкцию для игры: ");
        String inst = sc.nextLine();
        String instruction = sc.nextLine();
        instructions.add(instruction);
        System.out.println("________________________________");
        System.out.println("Инструкция успешно добавлена");
        System.out.println("________________________________");
        FileWriter instruct = new FileWriter("Instructions.txt",true);
        instruct.write(String.valueOf(instructions));
        instruct.close();
    }
    public void instructionsInfo(){
        for (int i = 0; i < instructions.size(); i++) {
            System.out.println((i+1)+") "+instructions.get(i));
        }
    }

    public void usersInfo(){
        for (int i = 1; i < employee.size()+1; i++) {
            System.out.println(employee.get(i));
        }
    }
    public void randomSanta(){
        Set<Integer> setKeyEmployees = employee.keySet();
        List<Integer> listKeyEmployees = new ArrayList<>(setKeyEmployees);

        List<Integer> guests = new ArrayList<>(setKeyEmployees);
        Collections.shuffle(guests);

        for (int i = 0; i < listKeyEmployees.size(); i++) {
            if (listKeyEmployees.get(i) == guests.get(i)) {
                if (i + 1 < listKeyEmployees.size()){
                    Integer receiver = guests.get(i + 1);
                    guests.set(i + 1, guests.get(i));
                    guests.set(i , receiver);
                }else {
                    Integer receiver = guests.get(1);
                    guests.set(1, guests.get(i));
                    guests.set(i , receiver);
                }
            }
        }
        for (int j = 0; j < listKeyEmployees.size(); j++)
            System.out.println(employee.get(listKeyEmployees.get(j)) + " Становится сантой для  --> " + employee.get(guests.get(j)));
    }
}

