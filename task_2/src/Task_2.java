public class Task_2 implements Task_2_base {
    public Task_2() {
    }

    public int subtask_1_while(int num) {
        int m = 0;

        for(int i = 0; i * i <= num; ++i) {
            m = i * i;
        }

        return m;
    }

    public int subtask_2_while(int num) {
        int p0 = 1;

        for(int i = 1; i <= num; ++i) {
            int pk = 2 * p0 + 6;
            p0 = pk;
        }

        return p0;
    }

    public boolean subtask_3_while(int num, int base) {
        int b;
        for(b = base; b < num; b *= base) {
        }

        return b == num;
    }

    public int subtask_4_while(int start, int end) {
        int m = 0;

        while(start >= end) {
            if (start % 2 == 0 && start / 2 >= end) {
                start /= 2;
                ++m;
            }

            if (start % 2 == 1 && start > end) {
                --start;
                ++m;
            }

            if (start / 2 < end && start > end) {
                --start;
                ++m;
            }

            if (start == end) {
                break;
            }
        }

        return m;
    }
}
