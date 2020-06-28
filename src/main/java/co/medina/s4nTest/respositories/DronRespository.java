package co.medina.s4nTest.respositories;

import co.medina.s4nTest.entities.Location;

public class DronRespository {
    public Location processRoute(String route) {
        char[] routeChars = route.toCharArray();
        for (char caracter : routeChars) {
            switch (caracter) {
                case 'A':
                    break;
                case 'I':
                    break;
                default:
            }
        }
        return new Location();
    }
}