package app.utk.boot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class CircularDepB {

    private CircularDepA circA;

    @Autowired
    public CircularDepB(CircularDepA circA) {
        this.circA = circA;
    }
}
/**
    The dependencies of some of the beans in the application context form a cycle:
    ┌─────┐
    |  circularDepA defined in file [CircularDepA.class]
    ↑     ↓
    |  circularDepB defined in file [CircularDepB.class]
    └─────┘
 */
