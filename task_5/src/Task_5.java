//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Task_5 implements Task_5_base {
    public Task_5() {
    }

    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        ArrayList<Integer> newlist = new ArrayList();

        for(int i = 0; i < data.size(); ++i) {
            if ((Integer)data.get(i) % k == 0 && (Integer)data.get(i) % n != 0) {
                newlist.add((Integer)data.get(i));
            }
        }

        return newlist;
    }

    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        ArrayList<Integer> newList = new ArrayList();
        int i = 0;
        int ch = 1;

        for(int rv = 0; i < size; ++i) {
            newList.add(ch);
            ++rv;
            if (ch == rv) {
                ++ch;
                rv = 0;
            }
        }

        return newList;
    }

    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        s1.retainAll(s2);
        return s1;
    }

    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        s1.addAll(s2);
        return s1;
    }

    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> s3 = new HashSet(s2);
        s3.retainAll(s1);
        s2.removeAll(s3);
        return s2;
    }

    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> s3 = new HashSet(s1);
        HashSet<Integer> s4 = new HashSet(s2);
        s3.removeAll(s2);
        s4.removeAll(s1);
        s4.addAll(s3);
        return s4;
    }

    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        HashMap<String, Double> map = new HashMap();
        float size = (float)data.size();
        double start_percent = (double)(100.0F / size);
        int i = 0;

        for(int repeat = 0; i < data.size(); ++i) {
            if (!map.containsKey(data.get(i))) {
                for(int j = i; j < data.size(); ++j) {
                    if (Objects.equals(data.get(i), data.get(j))) {
                        ++repeat;
                    }
                }

                map.put((String)data.get(i), start_percent * (double)repeat);
                repeat = 0;
            }
        }

        return map;
    }

    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        double mean = 0.0D;
        HashMap<String, Double> map = new HashMap();
        map.put("max", (Double)Collections.max(data));
        map.put("min", (Double)Collections.min(data));

        Double i;
        for(Iterator var5 = data.iterator(); var5.hasNext(); mean += i) {
            i = (Double)var5.next();
        }

        map.put("mean", mean / (double)data.size());
        return map;
    }
}
