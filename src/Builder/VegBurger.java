package Builder;

public class VegBurger  extends Burger{
    @Override
    public float price() {
        return 33.0f;
    }

    @Override
    public String name() {
        return "Овощной бургер";
    }
}
