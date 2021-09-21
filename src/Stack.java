
public interface Stack<E> {
    public void push(E e) throws FullStackException;
    public E pop () throws EmptyStackException; //Això del final ens ajuda a petar el programa si la cua esta buida i vull treure alguna cosa
    public int size() throws NullSize;
}
