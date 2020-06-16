package composite.menu;

public interface MenuAction <T> {
    T perform(Menu menu);
}
