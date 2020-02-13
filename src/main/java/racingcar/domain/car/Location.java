package racingcar.domain.car;

public class Location {
    private static final String MARK = "-";

    private int location;

    Location() {
        this.location = 0;
    }

    Location(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void moveForward() {
        location++;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < location; i++) {
            result.append(MARK);
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Location) {
            return location == ((Location) o).location;
        }
        return false;
    }
}
