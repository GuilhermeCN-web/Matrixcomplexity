
import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class VectorComplexity2 {
    public static void main(String[] args) {
        int[] vector = new int[1000000];
        int valor = 0;
        int rep = 0;
        int indx = 0;

        Scanner keyboard = new Scanner(System.in);
        Random randInt = new Random();

        for (indx=0;
        indx < vector.length;
        indx++)
        {
            vector[indx] = randInt.nextInt(10000);

        }

        System.out.println("Repetições: " + indx);
		
		Instant now2 = Instant.now();
		Duration intTime = Duration.between(now1, now2);

        System.out.println("Tempo: " + intTime.toMillis());


        System.out.println("\nInforme o valor a ser pesquisado: ");
        valor = keyboard.nextInt();

        for (indx=0; indx < vector.length; indx++) {
            if(vector[indx] == valor)
            {
                System.out.printf("\nvector[%d] = %d", indx, vector[indx]);
                break;
            }
        }
    }
}
