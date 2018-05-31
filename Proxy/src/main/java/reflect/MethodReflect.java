package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodReflect {
    public static Object reflect(Object object, String methodName){
        try {
            Method method = object.getClass().getMethod(methodName);
            Object result = method.invoke(object);
            return result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
