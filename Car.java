import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private boolean isRemoved = false; 
    
    public void act() {
        if (isRemoved){ 
            return;
        }
        move(-10);
        
        if (getX() <= 0) {
            resetCar();
        }
        
        if (isTouching(Hero.class) || isTouching(Hero2.class)){
            End end = new End();
            getWorld().addObject (end, 300, 200);
            getWorld().removeObject(this);
            isRemoved = true;
        }
    }
    
    public void resetCar(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
