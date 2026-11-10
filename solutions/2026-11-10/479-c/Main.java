import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static class Exam implements Comparable<Exam> {
        int a, b;

        Exam(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Exam o) {
            if (this.a != o.a) {
                return Integer.compare(this.a, o.a);
            }
            return Integer.compare(this.b, o.b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());

        Exam[] exams = new Exam[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            exams[i] = new Exam(a, b);
        }

        Arrays.sort(exams);

        int lastDay = -1;
        for (Exam e : exams) {
            if (e.b >= lastDay) {
                lastDay = e.b;
            } else {
                lastDay = e.a;
            }
        }

        System.out.println(lastDay);
    }
}