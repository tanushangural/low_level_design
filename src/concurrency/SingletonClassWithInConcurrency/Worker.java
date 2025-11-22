package concurrency.SingletonClassWithInConcurrency;

public class Worker implements Runnable{


    @Override
    public void run() {
        EmployeeIdStore employeeIdStore = EmployeeIdStore.getInstance();
        System.out.println(employeeIdStore);
    }
}
