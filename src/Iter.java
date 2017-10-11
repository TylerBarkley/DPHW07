public interface Iter<T> {
    public void reset();
    public void next();
    public boolean isDone();
    public T currentItem();
}
