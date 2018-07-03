import java.util.*;
public class Zbiory {

        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<> ();
            Random random = new Random();
            int suma = 0;

            for (int i = 0; i < 50; i++) {
                int a = random.nextInt (1000);
                while (set.contains (a)) {
                    a = random.nextInt (1000);
                }
                set.add (a);
                suma += a;
            }
            System.out.println ("najmniejsza liczba: "+set.first () );
            System.out.println ("największa liczba: "+set.last ()) ;
            int srednia = suma / set.size ( );
            System.out.println ("średnia liczb: " + srednia);

            System.out.println("Liczby większe od średniej:");
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext ())
            {
                if (iterator.next() > srednia) {
                    int nextNum = iterator.next ();
                    System.out.println (nextNum);
                }
            }
        }
    }

