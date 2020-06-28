package co.medina.s4nTest;

import co.medina.s4nTest.entities.Location;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Location location = new Location();
        System.out.println("Hello World! " + location.toString());
    }
}
