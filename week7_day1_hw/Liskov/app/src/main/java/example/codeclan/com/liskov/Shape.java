package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

abstract class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return this.type;
    }

}
