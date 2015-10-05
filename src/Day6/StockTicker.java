package Day6;

public class StockTicker implements Runnable {
	    public void run() {
	        try {
	            Thread.sleep(3000);
	        }
	        catch (InterruptedException ie) {
	            // do nothing
	        }
	        System.out.println("...");
	    }
}
