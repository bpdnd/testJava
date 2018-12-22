package testExtend;


/**
 * @author admin
 *
 */
public class AClass {
   /*属性*/
   public String name; //姓名
   public String age;  //年龄
   public String sex;  //性别
   
   /*方法*/
   //吃
   public void eat() {
	  System.out.println(this.name);
   }
   public void show() {
	 System.out.println("姓名:"+this.name+"--"+"年龄:"+this.age+"--"+"性别:"+this.sex);
   }

}
