package Day7;
import java.util.*;

public class CodeKeeper {
     ArrayList list;
     String[] codes = { "alpha", "lambda", "gamma", "delta", "zeta" };

     public CodeKeeper() {
         list = new ArrayList();
         // load built-in codes
         for (int i = 0; i < codes.length; i++) {
             addCode(codes[i]);
         }
     }

     public void addCode(String code) {
         if (!list.contains(code)) {
             list.add(code);
         }
     }

     public void displayAllCodes() {
         // display all codes
         for (Iterator ite = list.iterator(); ite.hasNext(); ) {
             String output = (String) ite.next();
             System.out.println(output);
         }    	 
     }
}
