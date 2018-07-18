package waterFlower;

public class Flower {
    private boolean polit;

    public void setPolit(boolean polit) {
        this.polit = polit;
    }

    public void soobshitj() {
        if (polit) {
            System.out.println("Cvetok polit");
        } else System.out.println("Take a can!");
    }
}
