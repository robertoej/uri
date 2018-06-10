import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int n, m, a;

        boolean containsZero;

        String line;

        while ((line = in.readLine()) != null) {
            String[] temp = line.split(" ");
            
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);

            a = 0;

            while (n-- > 0) {
                temp = in.readLine().split(" ");
                
                containsZero = false;
                
                for (int i=0; i<m; i++) {
                    if (temp[i].equals("0")) {
                        containsZero = true;
                        break;
                    }    
                }

                if (!containsZero) {
                    a++;
                }
            }

            out.append(a).append("\n");
        }

        System.out.print(out.toString());
    }
}