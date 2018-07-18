package waterFlower;

public class Zadacha {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Volodja");

        WaterCan can = new WaterCan();
        human.TakeCan(can);

        Flower flower = new Flower();
        can.Polivatj(flower, can);// не лишнее ли здесь то, что я передаю объект класса WaterCan в метод класса WaterCan?
    }
}
