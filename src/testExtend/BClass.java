package testExtend;
import testExtend.AClass;

public class BClass extends AClass{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	   BClass bClass = new BClass();
	   bClass.eat();
		try {
	        AClass aClass = new AClass();
	        aClass.name = "小红";
	        aClass.age  = "12";
	        aClass.sex  = "男";
	        aClass.eat();
	        aClass.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
