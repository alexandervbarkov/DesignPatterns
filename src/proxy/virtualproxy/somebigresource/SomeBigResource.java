package proxy.virtualproxy.somebigresource;

public class SomeBigResource implements SomeBigResourceAccessor {
    @Override
    public String getSomeBigResource() {
        System.out.println("Retrieved from DB");
        return "Some Big Resource";
    }
}
