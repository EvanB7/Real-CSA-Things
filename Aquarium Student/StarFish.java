import greenfoot.*; 

public class StarFish extends Actor
{
    public void act() 
    {
        move(1);
        int x = (Greenfoot.getRandomNumber(90) + 1);
        if(isAtEdge()){
            turn(x);
        }
    }    
}
