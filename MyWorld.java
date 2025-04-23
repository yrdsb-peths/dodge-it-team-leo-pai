import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Car car = new Car();
        addObject(car, 600, 100);
        
        Jet jet = new Jet();
        addObject(jet, 600, 200);
    }
}
