//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Task_1 implements Task_1_base {
    public Task_1() {
    }

    public int subtask_1_if(int first, int second, int third) {
        if (first < second & first < third) {
            return first;
        } else {
            return second < first & second < third ? second : third;
        }
    }

    public boolean subtask_2_if(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 100 == 0 && year % 400 == 0);
    }

    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        if (Math.abs(width - height) < 1.0E-6D) {
            if (!(Math.abs(x - left_up_x) < 1.0E-6D) && !(Math.abs(x - (left_up_x + width)) < 1.0E-6D) && !(Math.abs(left_up_y - y) < 1.0E-6D) && !(Math.abs(y - left_up_y + height) < 1.0E-6D)) {
                return x > left_up_x && x < left_up_x + width && y < left_up_y && y > left_up_y - height ? 1 : 0;
            } else {
                return 0;
            }
        } else {
            return 2;
        }
    }

    public int subtask_4_if(double x0, double y0, double k, double b) {
        if (Math.abs(y0 - (k * x0 + b)) < 1.0E-6D) {
            return 2;
        } else {
            return k * x0 + b < y0 ? 0 : 1;
        }
    }

    public String subtask_5_switch(int day_of_week) {
        String var10000;
        switch(day_of_week) {
            case 1:
                var10000 = "Понедельник";
                break;
            case 2:
                var10000 = "Вторник";
                break;
            case 3:
                var10000 = "Среда";
                break;
            case 4:
                var10000 = "Четверг";
                break;
            case 5:
                var10000 = "Пятница";
                break;
            case 6:
                var10000 = "Суббота";
                break;
            case 7:
                var10000 = "Воскресенье";
                break;
            default:
                var10000 = "Ошибка";
        }

        String result = var10000;
        return result;
    }

    public String subtask_6_switch(int direction) {
        String var10000;
        switch(direction) {
            case 1:
                var10000 = "север";
                break;
            case 2:
                var10000 = "юг";
                break;
            case 3:
                var10000 = "запад";
                break;
            case 4:
                var10000 = "восток";
                break;
            default:
                var10000 = "";
        }

        return var10000;
    }

    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        if (time > 1.0E-6D && speed > 1.0E-6D) {
            double V = Math.sqrt(wall * wall + vy * wall / vx * vy * wall / vx + vz * wall / vx * vz * wall / vx) / speed;
            if (V <= time) {
                return 1;
            } else {
                return Math.abs(V - time) < 1.0E-6D ? 1 : 0;
            }
        } else {
            return 2;
        }
    }

    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        if (Math.abs(k1 - k2) < 1.0E-6D && Math.abs(b1 - b2) > 1.0E-6D) {
            return 1;
        } else {
            return Math.abs(k1 - k2) < 1.0E-6D && Math.abs(b1 - b2) < 1.0E-6D ? 3 : 2;
        }
    }
}
