package testJava;

import java.text.SimpleDateFormat;
import java.util.*;

public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Date date = new Date();
            System.out.println(date.toString());
            Thread.sleep(1000*3);
            //使用 SimpleDateFormat 格式化日期
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
            System.out.println("当前时间为"+format.format(date));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
