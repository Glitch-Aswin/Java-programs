public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Get the runtime instance to check memory
        Runtime runtime = Runtime.getRuntime();

        // Displaying initial memory usage
        System.out.println("Initial memory usage:");
        displayMemoryUsage(runtime);

        // Creating objects to consume memory
        for (int i = 0; i < 10000; i++) {
            new GarbageCollectionDemo();
        }

        // Displaying memory usage after object creation
        System.out.println("\nMemory usage after creating 10,000 objects:");
        displayMemoryUsage(runtime);

        // Requesting garbage collection
        System.out.println("\nRequesting garbage collection.");
        System.gc();

        // Displaying memory usage after garbage collection
        System.out.println("\nMemory usage after garbage collection:");
        displayMemoryUsage(runtime);

        System.out.println("\nEnd of program.");
    }

    // Method to display current memory usage
    private static void displayMemoryUsage(Runtime runtime) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total memory: " + totalMemory / 1024 + " KB");
        System.out.println("Free memory: " + freeMemory / 1024 + " KB");
        System.out.println("Used memory: " + usedMemory / 1024 + " KB");
    }

    
}
