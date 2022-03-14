import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Shoffee {
    public static void main(String[] args) throws Exception {
        getCase();
        getCase();

    }

    public static void getCase() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NK[] = br.readLine().trim().split(" ");
        String V[] = br.readLine().trim().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        int counter = 0;

        int Vi[] = new int[N];
        for (int i = 0; i < N; i++) {
            Vi[i] = Integer.parseInt(V[i]);
        }
        for (int i = 0; i < N; i++) {
            int next = (i + 1);
            int sum = 0;
            sum = Vi[i];
            System.out.println(sum);
            if (sum >= K) {
                counter++;
            }
            int divider = 1;
            while (next < N) {
                sum += Vi[next];
                divider++;

                int average = sum / (divider);
                System.out.println("average" + average);
                if (average >= K) {
                    counter++;
                }
                next++;
            }

        }

        System.out.println(counter);
    }

}
