import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    boolean atTop = true;
    boolean atMid = false;
    boolean atLow = false;
    boolean side = true;
    public void act()
    {
        setImage("ppl1.png");
        if(atTop){
            setLocation(100, 100);
            if(Greenfoot.mouseClicked(null)){
                atTop = false;
                atMid = true;
            }
        }else if(atMid){
            setLocation(100, 200);
            if(Greenfoot.mouseClicked(null)){
                atMid = false;
                if(side){
                   atLow = true; 
                   side = false;
                }else{
                    atTop = true;
                    side = true;
                }
            }
        }else if(atLow){
            setLocation(100, 300);
            if(Greenfoot.mouseClicked(null)){
                atLow = false;
                atMid = true;
            }
        }
    }
}