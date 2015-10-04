package Day6;

public class StockTicker implements Runnable {
	    public void run() {
	    	while (true) {
	        try {
	            Thread.sleep(3000);
	        }
	        catch (InterruptedException ie) {
	            // do nothing
	        }
	        System.out.println("...");
	    	}
	    }
}
