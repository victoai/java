package prj1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Custom annotation definition
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

// Class containing methods with custom annotation
class MyClass {

    @MyAnnotation("Hello")
    public void method1() {
        System.out.println("Method 1 is called.");
    }

    @MyAnnotation("Hi")
    public void method2() {
        System.out.println("Method 2 is called.");
    }
}

public class AnotationTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        
        Method[] methods = myClass.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                String value = annotation.value();
                System.out.println("Method name: " + method.getName() + ", Annotation value: " + value);
            }
        }
    }
}
