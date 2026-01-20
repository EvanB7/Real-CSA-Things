import greenfoot.*;

public class Seahorse extends Actor {
    int wouldbeFacing = 0;

    public void act() {
        wouldbeFacing++;      

        turn(wouldbeFacing);  
        move(2);             
        turn(-wouldbeFacing); 
    }
}