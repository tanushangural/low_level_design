package JavaSpringBoot.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyClassB extends MyClassA {
    private void method3() {}
    public void method4() {}

    public static void main(String[] args) {
        Class c = MyClassB.class;
        Field[] fields = c.getFields();
        System.out.println("inside manage");
        for(Field field: fields) {
            System.out.print(field.getName() + " ");
        }
        System.out.println();

        Method[] methods = c.getDeclaredMethods();
        for(Method method: methods) {
            System.out.print(method.getName() + " ");
        }
        System.out.println();
    }
}
