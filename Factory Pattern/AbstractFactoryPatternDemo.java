
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // Get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // Call draw method of Circle
        shape1.draw();

        // Get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // Call draw method of Rectangle
        shape2.draw();

        // Get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // Call draw method of Square
        shape3.draw();


        // Get shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        // Get an object of Shape Circle
        Shape shape4 = roundedShapeFactory.getShape("CIRCLE");

        // Call draw method of Circle
        shape4.draw();

        // Get an object of Shape Rectangle
        Shape shape5 = roundedShapeFactory.getShape("RECTANGLE");

        // Call draw method of Rectangle
        shape5.draw();

        // Get an object of Shape Square
        Shape shape6 = roundedShapeFactory.getShape("SQUARE");

        // Call draw method of Square
        shape6.draw();
    }
}
