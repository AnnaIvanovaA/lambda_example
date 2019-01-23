package com.jet.debugtoolwindow.variables;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class VariablesRepresentation {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>(10);
        map.put("a", "str");
        map.put("b", 1);
        map.put("c", 2.0d);
        map.put("d", 3L);
        map.put("e", System.currentTimeMillis());
        map.put("f", new Date());
        map.put("g", LocalDateTime.now());
        map.put("h", 'c');
        System.out.println(map.size());

    }
}
