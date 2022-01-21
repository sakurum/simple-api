/**
 * Foo
 */
public class FooModel {
    final String name;

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