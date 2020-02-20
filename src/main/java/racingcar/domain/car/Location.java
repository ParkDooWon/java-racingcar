package racingcar.domain.car;

public class Location {
    private int location;

    Location() {
        this.location = 0;
    }

    public int getLocation() {
        return location;
    }

    public void moveForward() {
        location++;
    }

    public boolean isMatch(int maxLocation) {
        return this.location == maxLocation;
    }
}
