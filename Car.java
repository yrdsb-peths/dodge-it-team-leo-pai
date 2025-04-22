import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    public void act() {
        move(-10);
        
        if (getX() <= 0) {
            resetCar();
        }
        
        if (isTouching(Hero.class)){
            End end = new End();
            getWorld().addObject (end, 300, 200);
            getWorld().removeObject(this);
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
