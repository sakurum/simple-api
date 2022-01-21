/**
 * Foo
 */
public class FooModel {
    String name;

    public FooModel (String name) {
        if (name == null) {
            throw Exception;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}