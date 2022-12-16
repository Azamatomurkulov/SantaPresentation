import java.util.*;

public class Employee {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String password;
    private String gift;

    String[] gifts = new String[]{"Наушники" , "Мышка" , "Клавиатура" , "Кофеварка" , "Термокружка" , "Bluetooth - колонка" ,
            "Чайник" , "Книга" , "Тостер" , "Кресло - мешок" };


    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name,String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }
    public void chooseGift() {
        System.out.println("Выберите подарок");
        for (int i = 0; i < gifts.length; i++) {
            System.out.println((i+1) + " : " + gifts[i]);
        }int ch = sc.nextInt();
        System.out.println("Вы выбрали : " + gifts[ch - 1]);
        this.setGift(gifts[ch - 1]);
    }

    @Override
    public String toString() {
        return  " [Имя : " + name +
                " -- Подарок: " + gift+" ] ";

    }
}
