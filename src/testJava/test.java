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
	}
}
