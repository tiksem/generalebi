package com.utils.framework;

import java.util.List;

/**
 * Created by CM on 9/11/2015.
 */
public class Lists {
    public static <T> T getLast(List<T> list) {
        int index = list.size() - 1;
        return list.get(index);
    }

    public static <T> T getLast(List<T> list, T defaultValue) {
        if (list.isEmpty()) {
            return defaultValue;
        } else {
            return getLast(list);
        }
    }

    public static <T> T setLast(List<T> list, T value) {
        int index = list.size() - 1;
        return list.set(index, value);
    }

    public static <T> T getFirstOrNull(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    public static <T> T removeLast(List<T> list) {
        int index = list.size() - 1;
        return list.remove(index);
    }
}
