package co.medina.s4nTest.entities;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private List<Dron> Squad = new ArrayList<Dron>();

    public List<Dron> getSquad() {
        return Squad;
    }

    public void setSquad(List<Dron> squad) {
        Squad = squad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Squad == null) ? 0 : Squad.hashCode());
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
        Squad other = (Squad) obj;
        if (Squad == null) {
            if (other.Squad != null)
                return false;
        } else if (!Squad.equals(other.Squad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Squad [Squad=" + Squad + "]";
    }

    public Squad() {
    }

    public Squad(List<Dron> squad) {
        Squad = squad;
    }

}