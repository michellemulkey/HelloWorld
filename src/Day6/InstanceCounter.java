package Day6;

public class InstanceCounter {
    private static int numInstances = 0;
    public static int getCount() {
        return numInstances;
    }
    private static void addInstance() {
        numInstances++;
    }
    public InstanceCounter() {
        InstanceCounter.addInstance();
    }
 }