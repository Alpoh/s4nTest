package co.medina.s4nTest.entities;

public class Location {
    private int xPosition = 0;
    private int yPosition = 0;
    private String direction = "North";

    public Location() {
    }

    public Location(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public Location processCommands(String commands) {
        return new Location();
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((direction == null) ? 0 : direction.hashCode());
        result = prime * result + xPosition;
        result = prime * result + yPosition;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Location other = (Location) obj;
        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;
        if (xPosition != other.xPosition)
            return false;
        if (yPosition != other.yPosition)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Location [direction=" + direction + ", xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
    }

}