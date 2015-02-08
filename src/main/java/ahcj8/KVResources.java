package ahcj8;

import com.google.common.collect.ImmutableSet;

import javax.ws.rs.core.Application;
import java.util.Set;

public class KVResources extends Application {
    private static final ImmutableSet services = ImmutableSet.of(
            EntryPoint.class
    );

    @Override
    public Set<Class<?>> getClasses(){
        return services;
    }
}
