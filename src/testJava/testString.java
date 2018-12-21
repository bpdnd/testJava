package testJava;

import java.util.Arrays;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String string = "123";
//        String string2 = "456";
//        System.out.println(string.length());
//        System.out.println(string+string2);
        //
		String string = "  www.runoob.com  ";
		System.out.println(string.charAt(3));
        
	    
        System.out.println(string.trim());
        StringBuffer buffer = new StringBuffer("123");
        System.out.println(buffer);
        
        StringBuilder builder = new StringBuilder("23");
        System.out.println(builder);
        //数组
        // 数组大小
        int size = 10;
        // 升序
        System.out.println("sort---------------");
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        Arrays.sort(myList);
        for (double d : myList) {
			System.out.println(d);
		}
        System.out.println("冒泡---------------");
        for (int i = 0; i < myList.length-1; i++) {
			for (int j = i+1; j < myList.length; j++) {
				if (myList[i] < myList[j]) {
					double m = myList[i];
					myList[i] = myList[j];
					myList[j] = m;
				}
			}
		}
        for (double d : myList) {
        	System.out.println(d);
		}

        
        
        
        
        
	}
}
