import greenfoot.*; 

public class Crab extends Actor { 
    private boolean moveRight = true; 
    @Override public void act(){
        if (moveRight == true){
            move(1); 
        } 
        
        else { 
            move(-1); 
        } 
        
        if (this.isAtEdge() && moveRight == true){
            moveRight = false; 
        } 
        else if (this.isAtEdge() && moveRight == false){
            moveRight = true; 
        } 
    } 
}

  
