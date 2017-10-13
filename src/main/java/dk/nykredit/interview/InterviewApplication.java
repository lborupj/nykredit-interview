package dk.nykredit.interview;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS Application setup 
 */
@ApplicationPath("/")
public class InterviewApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        // Perhaps the JAX-RS annotated class should be added here?
        return Collections.emptySet();
    }
    
}
