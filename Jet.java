import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor
{
   boolean visible = true;
    public void act() {
        setImage("rocket.png");
        if (!visible) {
            maybeRespawn();
            return;
        }

        move(-10);
        
        if (getX() <= 0) {
            resetJet();
        }

        if (isTouching(Hero.class)){
            End end = new End();
            getWorld().addObject(end, 300, 200);
            getWorld().removeObject(this);
        }
        if (isTouching(Hero2.class)){
            End end = new End();
            getWorld().addObject (end, 300, 200);
            getWorld().removeObject(this);
        }
    }

    public void resetJet(){
        int num = Greenfoot.getRandomNumber(3);
        if (num == 0){
            visible = false;
            setLocation(-400, 200);
        } else {
            int x = Greenfoot.getRandomNumber(2) == 0 ? 600 : 800;
            setLocation(x, 200);
            visible = true;
        }
    }

    public void maybeRespawn(){
        if (Greenfoot.getRandomNumber(100) == 0) {
            resetJet();
        }
    }
}
