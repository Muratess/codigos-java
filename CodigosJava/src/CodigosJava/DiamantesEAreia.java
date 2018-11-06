import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt();
        char[] mine;
        int open, diamonds;
        while (N-- > 0) {
            mine = read().toCharArray();
            open = 0;
            diamonds = 0;
            for (char c : mine) {
                if (c == '<') {
                    open++;
                } else if (c == '>') {
                    if (open > 0) {
                        open--;
                        diamonds++;
                    }
                }
            }
            out.println(diamonds);
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}