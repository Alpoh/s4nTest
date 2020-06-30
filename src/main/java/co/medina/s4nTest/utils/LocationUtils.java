package co.medina.s4nTest.utils;

import co.medina.s4nTest.entities.Location;

public class LocationUtils {

    public Location changeDirection (){
        return new Location();
    }

    public Location moveFoward (){
        switch (checkDirection()) {
            case 'A':
                break;
            case 'I':
                break;
            default:
        }
        return new Location();
    }

    private String checkDirection (){
        return "";
    }
    
}