import greenfoot.*; 


public class Food extends SmoothMover
{
    private double yPos;

    public Food() {
        int n = Greenfoot.getRandomNumber(6); 
        setImage("food" + n + ".png");
        yPos = 1;
    }

    @Override
    public void act() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;   // prevent setLocation() from running
        } 
        
        if (isTouching(Turtle.class)) {
            getWorld().removeObject(this);
            Greenfoot.playSound("blop.mp3");
            return;   // prevent setLocation() from running
        }

        yPos += 0.2;
        setLocation(getX(), yPos);
    }
}
