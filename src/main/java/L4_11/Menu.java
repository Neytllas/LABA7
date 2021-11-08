package L4_11;

import java.util.Scanner;

public class Menu {
    //Объект класса-группы
    static Company com = new Company();
    
    //Стандартный конструктор
    public Menu() {    
        getResult();
    }
    
    //Метод, объединяющий в себе логику класса
    static private void getResult() {
        
        int option = getOption();
        
        switch(option) {
            case(1): 
                System.out.println(com.getList());
                break;
            case(2):
                addObj();
                break;
            case(3):
                deleteObj();
                break;
            case(4):
                findObj();
                break;
            case(5):
                System.exit(0);
                break;
        }
        
        getResult();
    }
    
    //Метод для получения варианта
    static private int getOption() {
        //Переменная для хранения варианта
        int option = 0;
        //Сканер для получения введенного пользователем варианта
        Scanner in = new Scanner (System.in, "Cp1251");
        //Предлагаем выбрать вариант 
        System.out.print("Выберете действие:\n1 - Посмотреть список транспортных средств\n2 - Добавить транспортное средство\n3 - Удалить транспортное средство\n4 - Найти транспортное средство\n5 - Завершить работу\n");
        //Получает вариант
        String strTmp = in.nextLine();
        
        if (strTmp.equals("1")) {
            option = 1;
        } else if (strTmp.equals("2")) {
            option = 2;
        } else if (strTmp.equals("3")) {
            option = 3;
        } else if (strTmp.equals("4")) {
            option = 4;
        } else if (strTmp.equals("5")) {
            option = 5;
        } else {
            System.out.println("Введен неверный вариант");
            System.exit(0);
        }
        
        return option;
    }
    //Метод для добавления объекта
    static private void addObj() {
        Vehicle vehicle = null;
        
        //Сканер для получения введенного пользователем варианта
        Scanner in = new Scanner (System.in, "Cp1251");
        //Предлагаем выбрать вариант 
        System.out.print("Добавить:\n1 - Автомобиль\n2 - Экспресс\n");
        //Получает вариант
        String strTmp = in.nextLine();
        
        if (strTmp.equals("1")) {
            //Предлагаем ввести данные и считываем данные
            System.out.println("Введите название: ");
            String name = in.nextLine();

            System.out.println("Введите скорость: ");
            int speed = Integer.parseInt(in.nextLine());

            System.out.println("Введите вес: ");
            int weight = Integer.parseInt(in.nextLine());

            System.out.println("Введите цвет: ");
            String color = in.nextLine();

            System.out.println("Введите количество колес: ");
            int wheelsCount = Integer.parseInt(in.nextLine());

            //Создаем объект класса Car
             com.addVehicle(name, speed, weight, color, wheelsCount);
        } else if (strTmp.equals("2")) {
            //Предлагаем ввести данные и считываем данные
            System.out.println("Введите название: ");
            String name = in.nextLine();

            System.out.println("Введите скорость: ");
            int speed = Integer.parseInt(in.nextLine());

            System.out.println("Введите вес: ");
            int weight = Integer.parseInt(in.nextLine());

            System.out.println("Введите цвет: ");
            String color = in.nextLine();
            
            System.out.println("Введите тип экспресса: ");
            String type = in.nextLine();
            
            //Создаем объект класса Express
            com.addVehicle(name, speed, weight, color, 2, type);
        }
        
        System.out.println("Транспортное средство добавлено");
    }
    //Метод для удаления объекта
    static private void deleteObj() {
        //Сканер для получения введенного пользователем варианта
        Scanner in = new Scanner (System.in, "Cp1251");
        //Предлагаем выбрать вариант 
        System.out.print("Введите название: ");
        //Получает вариант
        String strTmp = in.nextLine();
            
        com.deleteVehicle(strTmp);
    }
      //Метод для поиска объекта
    static private void findObj() {
        //Сканер для получения введенного пользователем варианта
        Scanner in = new Scanner (System.in);
        //Предлагаем выбрать вариант 
        System.out.print("Введите название: ");
        //Получает вариант
        String strTmp = in.nextLine();
        
        System.out.println(com.findVehicle(strTmp));
    }
}
