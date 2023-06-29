package src.Lab._03_StackOfStrings_04;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);            //използваме методите на ArrayList-а
    }

    public String pop() {
        return this.data.remove(this.data.size() - 1);
    }

    public String peek() {
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        if (this.data.isEmpty()) {
            isEmpty = true;
        }
        return isEmpty;
    }
}
