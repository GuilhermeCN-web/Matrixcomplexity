import java.util.Random;

public class VectorComplexity3 {
    
    public static void main(String[] args) {
        int[] vector = new int[1000000];
        boolean changed = true;

        Random randInt = new Random();

        for (int indx=0;
        indx < vector.length;
        indx++)
        {
            vector[indx] = randInt.nextInt(10000);
        }

        System.out.print("\n\n");
        while (changed)
        {
            changed = false;
            for (int i=0; i < vector.length - 1; i++) 
            {
                if (vector[i] > vector[i+1])
                {
                    swap(vector, i, i+1);
                    changed = true;
                }
            }
        }   

        for (int i=0; i < vector.length; i++) 
        {
            System.out.printf("\nvector[%5d] = %5d", i, vector[i]);
        }
    }
    public static void swap(int[] vector, int i, int j)
        {
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
        }
}
