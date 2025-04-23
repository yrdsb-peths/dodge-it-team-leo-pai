import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero2 extends Actor
{
    boolean atBottom = false;
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            atBottom = !atBottom;
        }
        
        if(atBottom){
            setLocation(300, 300);
        }else{
            setLocation(300, 100);
        }
    }
}
