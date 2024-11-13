public class GarbageCollection {
    public static void main(String[] args) {
        //print initial memory
        Runtime rt = Runtime.getRuntime();
        System.out.println("Initial memory");
        memoryDetails(rt);

        //create objects
        for (int i = 0; i < 10000; i++) {
            new GarbageCollection();
        }

        //memory after creating 10000 objects
        System.out.println("Memeory after creating objects");
        System.out.println("");
        memoryDetails(rt);

        //performing garbage collection
        System.out.println("Performing garbage collection");
        System.gc();
        
        //Memory after garbage collection
        System.out.println("After grabage collection");
        System.out.println();
        memoryDetails(rt);
    }

    private static void memoryDetails(Runtime rt){
        long totalMemory = rt.totalMemory();
        long freeMemory = rt.freeMemory();
        long usedMemory = totalMemory- freeMemory;
        System.out.println("Total Memory: "+ totalMemory/1024+"KB");
        System.out.println("Free Memory: "+ freeMemory/1024+"KB");
        System.out.println("Used Memory: "+ usedMemory/1024+"KB");

    }
}
