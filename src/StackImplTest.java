public class StackImplTest {
    public static void main(String[] args) {
        System.out.println("TEST"); //shortcut sout

        Stack<Integer> s = new StackImpl<Integer>(4); //Fem una pila de nombres enters IMPORTANT CLASSIFICAR-LOS
        try {
            s.push(5);
            System.out.println(s.size());
            s.push(3);
            System.out.println(s.size());

            Stack<String> s2 = new StackImpl<String>(3);
            s2.push("Hola");
            System.out.println(s2.size());
            s2.push("Em dic");
            System.out.println(s2.size());
            s2.push("Aida");

            s2.pop();

        }
        catch(EmptyStackException empty)
        {
            empty.printStackTrace();
            System.out.println("Empty stack");
        }

        catch (FullStackException full)
        {
            full.printStackTrace();
            System.out.println("full stack");
        }

        catch (NullSize nullSize) {
            nullSize.printStackTrace();
        }

        finally
        {
            System.out.println("Process finished");
            //Aqui entra hi hagi o no una excepció per tant es molt util
            //Aqui pasi el que pasi, allibero la conexió, per tant puc seguir treballant
        }
    }
}
