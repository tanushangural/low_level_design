package concurrency.SingletonClassWithInConcurrency;

import java.util.HashMap;
import java.util.Map;

public class EmployeeIdStore {
    private final Map<String, String> employees;
    private static EmployeeIdStore INSTANCE = null;
    private EmployeeIdStore() {
        this.employees = new HashMap<>();
        this.employees.put("101", "Tanush");
        this.employees.put("102", "Jiya");
        this.employees.put("103", "Shivani");
        this.employees.put("104","Shivam");
    }

    public static EmployeeIdStore getInstance() {
        // this is not thread same, needs to be handle for multithreading
        if(INSTANCE == null) {
            INSTANCE = new EmployeeIdStore();
        }
        return INSTANCE;
    }
}
