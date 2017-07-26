package creational.maze;

public class Room extends MapSite {

    MapSite[] _sides = new MapSite[4];
    int _roomNumber;

    public Room(int roomNumber) {
        this._roomNumber = roomNumber;
        // could initialize sides with walls ahead of time
    }

    void enter() {

    }

    public void setSide(Direction direction, MapSite side) {
        if(direction == Direction.North) {
            _sides[0] = side;
        } else if(direction == Direction.East) {
            _sides[1] = side;
        } else if(direction == Direction.South) {
            _sides[2] = side;
        } else {
            _sides[3] = side;
        }
    }

    public MapSite getSide(Direction direction) {
        if(direction == Direction.North) {
            return _sides[0];
        } else if(direction == Direction.East) {
            return _sides[1];
        } else if(direction == Direction.South) {
            return _sides[2];
        } else {
            return _sides[3];
        }
    }

}
