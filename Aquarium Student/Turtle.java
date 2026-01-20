import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends SmoothMover
{
    double velocity = 0;

    public void act()
    {
        double xPos = getExactX();
        double yPos = getExactY();

        if (velocity >= 0) {
            setImage("turtleRight.png");
        } else {
            setImage("turtleLeft.png");
        }

        if (Greenfoot.isKeyDown("right")) {
            velocity += 0.01;  
        }
        else if (Greenfoot.isKeyDown("left")) {
            velocity -= 0.01;   
        }
        else {
            if (velocity > 0) {
                velocity -= 0.001;
                if (velocity < 0){ 
                velocity = 0; // prevent overshoot
                }
            }
            else if (velocity < 0) {
                velocity += 0.001;
                if (velocity > 0) {
                    velocity = 0;
                }
            }
        }

        // Apply horizontal movement once
        xPos += velocity;

        // Vertical movement
        if (Greenfoot.isKeyDown("up")) {
            yPos--;
        }
        else if (Greenfoot.isKeyDown("down")) {
            yPos++;
        }

        // Final position update
        setLocation(xPos, yPos);
    }
}

