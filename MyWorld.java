import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Hero2 hero2 = new Hero2();
        addObject(hero2, 300, 300);
        
        Car car = new Car();
        addObject(car, 600, 100);
    }
}
