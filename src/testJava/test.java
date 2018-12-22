package testJava;

import testJava.Person;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person = new Person();
        person.name = "姓名";
        person.age  = "12";
        person.sex  = "男";
        System.out.println(person.name+person.age+person.sex);
        int a= 1;
        String c = (a==1)?"true":"false";
        System.out.println(c);
        if (person.getClass()==Person.class	) {
			System.out.println("ok");
		}
        //do.....while
        do {
        	
			System.out.println(a);
			++a;
		} while (a==2);
        //for
        int x = 20;
        for (int i = 0; i < x; i++) {
			System.out.println(i);
		}
        //for增强 针对 数组
        String[] strings = {"数组0","数组1","数组2","数组3","数组4"};
        for (String string : strings) {
			System.out.println(string);
		}
        //随机数
        System.out.println(Math.random());
	}
}
