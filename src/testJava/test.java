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
	}
}
