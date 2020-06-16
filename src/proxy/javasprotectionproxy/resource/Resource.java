package proxy.javasprotectionproxy.resource;

public class Resource implements ResourceAccessor {

    @Override
    public String getResource() throws IllegalAccessException {
        return "Resource";
    }
}
