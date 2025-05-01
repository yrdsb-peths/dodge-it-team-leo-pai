import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero2 extends Actor
{
    boolean atBottom = false;
    public void act()
    {
        setImage("ppl3.png");
        if(Greenfoot.mouseClicked(null)){
            atBottom = !atBottom;
        }
        
        if(atBottom){
            setLocation(300, 100);
        }else{
            setLocation(300, 300);
        }
    }
}
