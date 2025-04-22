import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Car car = new Car();
        addObject(car, 600, 100);
    }
}
