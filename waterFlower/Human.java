package waterFlower;

public class Human {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void TakeCan(WaterCan can) {
        can.setTaken(true);
        System.out.println(name + " has a can");
    }
}
