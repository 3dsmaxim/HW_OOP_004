import java.util.Iterator;
import java.util.List;

public class UserGroup <T extends User> implements Iterator<User> {
    private List<User> users;
    private int counter;

    public UserGroup(List<User> users) {
        this.users = users;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {

        return counter < users.size();
    }

    @Override
    public User next() {
        if (!hasNext()) {
            throw new RuntimeException("Students");
        }

        return users.get(counter++);
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "User=" + users +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
