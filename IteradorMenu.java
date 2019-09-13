import java.util.Iterator;
import java.util.NoSuchElementException

public interface IteradorMenu<T> extends Iterator<T> {
	
	public boolean hasPrevious();

	public T previous();

	public boolean hasNext();

	public Object next();

}