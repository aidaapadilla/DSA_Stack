public class StackImplTest {
    public static void main(String[] args) {
        System.out.println("<<<<< T E S T >>>>>" + "\n"); //shortcut sout

        Stack<Integer> s = new StackImpl<Integer>(4); //Fem una pila de nombres enters IMPORTANT CLASSIFICAR-LOS
        try {
            s.push(5);
            s.size();
            s.push(3);
            s.size();
            s.push(8);
            s.size();
            s.pop();
            s.size();

        }
        catch(EmptyStackException empty)
        {
            empty.printStackTrace();
            System.out.println("ERROR: pila vacía." + "\n");
        }

        catch (FullStackException full)
        {
            full.printStackTrace();
            System.out.println("ERROR: pila llena." + "\n");
        }

        catch (NullSize nullSize) {
            nullSize.printStackTrace();
            System.out.println("ERROR: la cantidad de elementos en la pila es 0." + "\n");
        }

        finally
        {
            System.out.println("<<<<< F I N  >>>>>"+ "\n");
        }
    }
}
