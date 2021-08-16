package test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test22 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //1.获取Class对象
        Class c1 = Person.class;
        Class c2 = Class.forName("test2.Person");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("============================");

        //2.获取构造方法
        Constructor [] arr = c1.getConstructors();
        for(Constructor c:arr){
            System.out.println(c);
        }
        System.out.println("============================");

        //3.获取方法
        Method [] methods = c1.getMethods();
        for(Method me:methods){
            System.out.println(me);
        }
        System.out.println("==============================");

        //4.获取属性
        Field field = c1.getDeclaredField("name");
        System.out.println(field);
    }
}


class Person{
    private String name;
    private int age;
    private boolean sex;

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}