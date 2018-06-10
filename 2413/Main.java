import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        String line;

        while ((line = in.readLine()) != null) {
            out.append(Integer.parseInt(line) * 4).append("\n");
        }

        System.out.print(out.toString());
    }
}