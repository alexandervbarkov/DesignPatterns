package proxy.virtualproxy;

import proxy.virtualproxy.somebigresource.SomeBigResourceAccessor;
import proxy.virtualproxy.somebigresource.SomeBigResourceProxy;

public class Application {
    public static void main(String[] args) {
        SomeBigResourceAccessor someBigResource = new SomeBigResourceProxy();
        System.out.println(someBigResource.getSomeBigResource());
        System.out.println(someBigResource.getSomeBigResource());
    }
}
