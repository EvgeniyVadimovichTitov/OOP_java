public class Chocolate extends Product{
    String chocolateName;


    @Override
    public String toString() {
        return String.format("%s %s",this.chocolateName, super.toString());
    }

    public Chocolate(double cost, String chocolateName) {
        super("шоколадка", cost);
        this.chocolateName = chocolateName;


    }
}
