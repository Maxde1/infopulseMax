package first_homework.secondTask;

import java.util.Iterator;

public interface OwnIterator<T> extends Iterator<T> {
    public T prev();
}
