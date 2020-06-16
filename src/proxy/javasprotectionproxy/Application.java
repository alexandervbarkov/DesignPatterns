package proxy.javasprotectionproxy;

import proxy.javasprotectionproxy.resource.ResourceAccessor;
import proxy.javasprotectionproxy.resource.ResourceAccessorProxy;

public class Application {
    public static void main(String[] args) {
        ResourceAccessor allowedResourceAccessor = new ResourceAccessorProxy(true);
        try {
            System.out.println(allowedResourceAccessor.getResource());
        } catch (IllegalAccessException e) {
            System.out.println("This exception should not have occurred");
        }
        ResourceAccessor blockedResourceAccessor = new ResourceAccessorProxy(false);
        try {
            System.out.println(blockedResourceAccessor.getResource());
        } catch (IllegalAccessException e) {
            System.out.println("Exception occurred as expected");
        }
    }
}
