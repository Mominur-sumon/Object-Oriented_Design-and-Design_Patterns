public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        // show the message
        object.showMessage();

        // show the message again to prove that the same instance is used
        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();

        // show the message again to prove that the same instance is used
        SingleObject object3 = SingleObject.getInstance();
        object3.showMessage();
        
    }
}
