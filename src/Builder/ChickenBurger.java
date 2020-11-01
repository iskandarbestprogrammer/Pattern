package Builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 70;
    }

    @Override
    public String name() {
        return "Бургер с курицей";
    }
}
