package builderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Car defaultCar = new CarBuilder().build();

        System.out.println("\nDefault Car Configuration:\n" + defaultCar);

        Car customCar = new CarBuilder()
                        .setModelName("Tesla 3")
                        .setEngineType("Electric")
                        .setColor(("Navy"))
                        .setTransmission("Automatic")
                        .setSunroof(true)
                        .setInfotainmentSystem(false)
                        .build() ;
         
                        
        System.out.println("\nCusmized car Configuration: \n"+customCar);                
    }

}
