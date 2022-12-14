import java.util.ArrayList;

public class Ship {
    private ShipType ship;
    private int hitCount;
    private ArrayList<Coordinate> coordinates;
    

    public Ship(ShipType ship, int hitCount, ArrayList<Coordinate> coordinates){
        this.ship = ship;
        this.hitCount = 0;
        this.coordinates = coordinates;
    }
    public int registerHit(){
        return ++hitCount;         
    }

    public boolean isSunk(){
        if(hitCount == ship.getLength()){
            return true;
        } else{
            return false;
        }
    }


    
}
