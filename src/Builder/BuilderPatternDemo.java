package Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Овощная мука");
        vegMeal.showItems();
        System.out.println("Общая стоимость: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nНевегетарианская еда");
        nonVegMeal.showItems();
        System.out.println("Общая стоимость: " +nonVegMeal.getCost());
    }
}
