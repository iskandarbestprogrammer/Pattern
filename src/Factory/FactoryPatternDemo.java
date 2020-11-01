package Factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=createShape("circle");
        Shape shape=shapeFactory.getShape();

        shape.draw();
    }

    static ShapeFactory createShape(String shape){
        if (shape.equalsIgnoreCase("circle")){
            return new CircleShapeFactory();
        }else if(shape.equalsIgnoreCase("square")){
            return new SquareShapeFactory();

        }else if (shape.equalsIgnoreCase("Rectangle")){
            return new RectangleShapeFactory();
        }else {
            throw new RuntimeException(shape + " не нашли такого форму");
        }
    }
}
