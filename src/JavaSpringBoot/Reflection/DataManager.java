package JavaSpringBoot.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataManager {

    public int val;

    public static void manage(Object dataProcessor) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = dataProcessor.getClass();
        Method method = c.getDeclaredMethod("process");
        method.setAccessible(true); // dangerous and can be disable by java security management
        method.invoke(dataProcessor);
        Method method1 = c.getDeclaredMethod("process", new Class[]{int.class}); // method overiddings
        method1.setAccessible(true);
        method1.invoke(dataProcessor, 1);
//        Field[] fields = c.getFields();
//        System.out.println("inside manage");
//        for(Field field: fields) {
//            System.out.print(field.getName() + " ");
//        }
//        System.out.println();
//
//        Method[] methods = c.getMethods();
//        for(Method method: methods) {
//            System.out.print(method.getName() + " ");
//        }
//        System.out.println();
//
//
//        System.out.println("end of manage");


    }

    private void foo() {

    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        manage(new ApacheProcessor());
    }
}
