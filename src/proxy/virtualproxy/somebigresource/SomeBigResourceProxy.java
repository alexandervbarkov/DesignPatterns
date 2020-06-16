package proxy.virtualproxy.somebigresource;

public class SomeBigResourceProxy implements SomeBigResourceAccessor {
    private String someBigResource;

    @Override
    public String getSomeBigResource() {
        if (someBigResource == null) {
            someBigResource = new SomeBigResource().getSomeBigResource();
        } else {
            System.out.println("Retrieved from cache");
        }
        return someBigResource;
    }
}
