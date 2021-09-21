public class StackImpl<E> implements Stack<E> {
    E[] data;
    private int p;

    public StackImpl(int len)
    {
        data = (E[])new Object[len];
    }

    @Override
    public void push(E e) throws FullStackException{

        if (this.p < data.length) {
            this.data[this.p++] = e;
        }
        else {
            throw new FullStackException();
        }
    }

    @Override
    public E pop() throws EmptyStackException{
        if (this.p==0) throw new EmptyStackException();
        else
        {
            this.data[this.p]=null;
            p=p-1;
        }
        return null;
    }

    @Override
    public int size() throws NullSize {
        if (this.p > 0) {
            return p;
        } else {
            throw new NullSize();
        }
    }
}
