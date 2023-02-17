package zoo;

public class Shark extends Predator implements Swimable {
    int speedSwimming = 70;
    @Override
    public int getSpeedSwimming() {
        return this.speedSwimming;
    }

    public Shark(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "буль-буль";
    }
}
