import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Aquarium extends World
{
    private int timeToSpawn = 0;
    
    public Aquarium()
    {    
        super(1136, 600, 1); 
    }
    
    public void act()
    {
        timeToSpawn ++;
        if (timeToSpawn >= 90){
            int randomX = Greenfoot.getRandomNumber(getWidth()); 
            addObject(new Food(), randomX, 1);    
            timeToSpawn = 0;
        }
        
    }
    
}
