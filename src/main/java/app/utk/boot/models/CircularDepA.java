package app.utk.boot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CircularDepA {

    private CircularDepB circB;

    @Autowired
    public CircularDepA(CircularDepB circB) {
        this.circB = circB;
    }
}
