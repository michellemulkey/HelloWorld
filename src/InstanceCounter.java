
public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }
    private static void addInstance() {
        numInstances++;
    }
    InstanceCounter() {
        InstanceCounter.addInstance();
    }
 }