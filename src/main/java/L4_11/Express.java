package L4_11;

public class Express extends Train {
    //Поле, отвечающее за тип экспресса
    private String exressType;
    
    public Express(String name, int speed, int weight, String color, int railCount, String exressType) {
        //Передаем параметры в конструктор родителя
        super(name, speed, weight, color, railCount);
          //Заполняем поля этого класса
        this.exressType = exressType;
    }
    
    
    //Метод родителя для получения типа поезда
    public String getType() {
        return exressType;
    }
    //Перегружаем метод родителя для получения цвета
    @Override
    public String getColor() {
        return "Вагоны поезда типа - " + name + " имееют " + color + " цвет";
    }
    
}
