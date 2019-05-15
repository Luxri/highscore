import java.util.ArrayList;
import java.util.Scanner;

public class points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList();
        int point;
        do {
            System.out.println("Input next score (-1 to quit):");
            point = in.nextInt();
            if (point != -1) {
                //ta reda på index
                int index;
                for (int i = 0 ; i < points.size() ; i++) {
                    // om point > points.get(i) så ska point in på plats i
                    if (point > points.get(i)) {
                        
                    }

                    points.add(index,point);
                }

            }
        } while (point != -1);

        //Skriv ut listan för koll
        for (int i = 0 ; i < points.size() ; i++)
            System.out.println(point.get(i));
        }
    }
}

}


