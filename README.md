# Code Complexity Analysis in Java

This repository contains two Java programs designed to analyze the time complexity of operations related to matrix and vector manipulations. These programs measure the time it takes to perform certain tasks, such as filling a matrix and initializing a large vector with random values.

## 1. **MatrixComplexity.java**

This program generates a square matrix of random numbers and measures the time it takes to fill it. The matrix is of size `n x n`, where `n` is passed as a command-line argument.

### How it works:
1. The program starts by reading the matrix size from the command-line arguments.
2. It then initializes a `size x size` matrix.
3. The matrix is filled with random integers between 0 and 100,000.
4. Finally, the time taken to fill the matrix is calculated and printed.

### Example usage:
```bash
java MatrixComplexity 1000
```

This command will create a 1000x1000 matrix and measure the time it takes to populate it.

### Code Explanation:
```java
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class MatrixComplexity {
    public static void main(String[] args) {
        Instant initNow = Instant.now();  // Record the start time
        if (args.length < 1) {
            System.exit(-1);  // Exit if no argument is passed
        }
        
        Random rand = new Random();  // Random number generator
        int size = Integer.parseInt(args[0]);  // Matrix size from argument
        double[][] matrix = new double[size][size];  // Initialize matrix
        
        // Filling matrix with random values
        for (int indx = 0; indx < size; indx++) {
            for (int indy = 0; indy < size; indy++) {
                matrix[indx][indy] = rand.nextInt(100000);
            }
        }
        
        // Measure the time taken to fill the matrix
        Instant finalNow = Instant.now();
        Duration intTime = Duration.between(initNow, finalNow);
        
        System.out.println("\nTime: " + intTime.toMillis() + " ms\n");  // Output the time in milliseconds
    }
}
```

---

## 2. **VectorComplexity.java**

This program generates a large vector (array) of random integers and measures the time it takes to initialize the vector. The vector size is set to 1,000,000 elements.

### How it works:
1. The program initializes a vector with 1,000,000 elements.
2. Each element of the vector is assigned a random integer between 0 and 10,000.
3. The program measures the time taken to fill the vector.

### Example usage:
```bash
java VectorComplexity
```

This command will generate a vector with 1,000,000 random integers and print the time taken for the initialization.

### Code Explanation:
```java
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class VectorComplexity {
    public static void main(String[] args) {
        int[] vector = new int[1000000];  // Initialize vector with 1 million elements
        Random randInt = new Random();  // Random number generator

        Instant now1 = Instant.now();  // Record the start time
        
        // Filling the vector with random values
        for (int indx = 0; indx < vector.length; indx++) {
            vector[indx] = randInt.nextInt(10000);
        }
        
        Instant now2 = Instant.now();  // Record the end time
        Duration intTime = Duration.between(now1, now2);  // Calculate time difference
        
        System.out.println("Time: " + intTime.toMillis() + " ms");  // Output the time in milliseconds
    }
}
```

---

## Key Concepts and Learning Points:
- **Time Complexity Analysis**: The programs are simple but useful for measuring and understanding how time grows as the size of the input increases.
- **Matrix Operations**: The first program helps in understanding how matrix operations scale with the input size.
- **Vector Operations**: The second program is a demonstration of handling large data structures and observing the time taken to populate them.

## Performance Considerations:
- As the size of the matrix or vector increases, the time taken to perform the operation will grow significantly, especially for larger inputs. For example, a matrix of size `n x n` has a time complexity of O(n²), while initializing a vector has a time complexity of O(n).

## Conclusion:
These two programs provide basic insights into how operations scale with respect to the size of the data. They can be extended or modified for more advanced time complexity studies, such as comparing the performance of different algorithms or data structures.
