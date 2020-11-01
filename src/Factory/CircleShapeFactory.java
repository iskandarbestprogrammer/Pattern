package Factory;

public class CircleShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
