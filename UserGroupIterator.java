
import java.util.Iterator;
import java.util.List;
public class UserGroupIterator<T extends User> implements Iterator<User> {

    private int counter;
    private final List<User> users;

    public UserGroupIterator(UserGroup<T> userGroup) {
        this.users = userGroup.getUsers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < users.size();
    }

    @Override
    public User next() {
        if (!hasNext()){
            throw new RuntimeException("Students");
        }

        return users.get(counter++);
    }
}