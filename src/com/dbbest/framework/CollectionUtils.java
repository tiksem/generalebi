package com.dbbest.framework;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Tikhonenko.S
 * Date: 05.11.13
 * Time: 15:20
 * To change this template use File | Settings | File Templates.
 */
public class CollectionUtils {
    public static boolean contentEquals(Collection a, Collection b){
        if(a == null){
            return b == null;
        } else if(b == null) {
            return false;
        }

        if(a.size() != b.size()){
            return false;
        }

        Iterator aIterator = a.iterator();
        Iterator bIterator = b.iterator();

        while (aIterator.hasNext()) {
            Object aItem = aIterator.next();
            Object bItem = bIterator.next();

            if(!aItem.equals(bItem)){
                return false;
            }
        }

        return true;
    }

    public static double sum(Collection<? extends Number> collection){
        double result = 0;
        for(Number number : collection){
            result += number.doubleValue();
        }

        return result;
    }

    public static <T> void removeAll(Collection<T> collection, Predicate<T> predicate){
        Iterator<T> iterator = collection.iterator();
        while(iterator.hasNext()){
            T item = iterator.next();
            if(predicate.check(item)){
                iterator.remove();
            }
        }
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> predicate){
        for(T object : iterable){
            if(predicate.check(object)){
                return object;
            }
        }

        return null;
    }
}
