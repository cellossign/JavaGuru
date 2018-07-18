package waterFlower;

public class WaterCan {
    private boolean isTaken;   //lejka vzjata

    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public void Polivatj(Flower flower, WaterCan can) {
        if (can.isTaken) {
            flower.setPolit(true);
        } else {
            System.out.println("please take a can");
        }
        flower.soobshitj();
    }
}
