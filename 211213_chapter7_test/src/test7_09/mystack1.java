package test7_09;

import java.util.ArrayList;
import java.util.*;

public class mystack1<T> implements IStack<T> {
    private final List<T> stack = new ArrayList<>();
    @Override
    public T pop() {
        if(stack.isEmpty()) return null;
        int lastIndex = stack.size()-1;
        T obj = stack.get(lastIndex);
        stack.remove(lastIndex);
        return obj;
    }

    @Override
    public boolean push(T ob) {
        stack.add(ob);
        return true;
    }
}
