import greenfoot.*;

public class ClownFish extends Actor
{
    public void act() 
    {
        if (isAtEdge()){
            move(-1100);
        }
        else{
            move(1);
        }
    }    
}

