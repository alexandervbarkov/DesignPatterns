package proxy.javasprotectionproxy.resource;

import java.lang.reflect.Proxy;

public class ResourceAccessorProxy implements ResourceAccessor {
    private ResourceAccessor resource;

    public ResourceAccessorProxy(boolean allowAccess) {
        this.resource = (ResourceAccessor) Proxy.newProxyInstance(
                Resource.class.getClassLoader(),
                Resource.class.getInterfaces(),
                (proxy, method, args) -> {
                    if (allowAccess) {
                        return method.invoke(new Resource());
                    }
                    throw new IllegalAccessException();
                });
    }

    @Override
    public String getResource() throws IllegalAccessException {
        return resource.getResource();
    }
}
