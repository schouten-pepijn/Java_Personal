package compositePattern.problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Object> objects = new ArrayList<>();

    public void add(Object shape) {
        objects.add(shape);
    }

    // Problem: Does not work for all nested groups
    // Need to explicity check and cast each object
    // Solution: Use composite design pattern
    public void render() {
        for (var object : objects) {
            if (object instanceof Shape)
                ((Shape)object).render();
            else
                ((Group)object).render();
        }
    }
}
