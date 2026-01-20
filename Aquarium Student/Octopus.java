import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Octopus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Octopus extends SmoothMover
{
    double velocity = 0;
    double yPos = 100;


    public void act()
    {
        velocity += 0.01;     
        yPos += velocity;    

        setLocation(getExactX(), yPos);

        // optional: reverse direction when too fast
        if (isAtEdge()) {
            velocity = -3;
        }
        
        if (Greenfoot.isKeyDown("space") && velocity > 2){
            velocity = -2;
            Greenfoot.playSound("blop.mp3");
        }
    }
}

