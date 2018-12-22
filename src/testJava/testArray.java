package testJava;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;
public class testArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		testArray testArray = new testArray();
		int[] scores = new int[]{89 , -23 , 64 , 91 , 119 , 52 , 73};
		int[] arr =  testArray.hehe(scores);
		System.out.println(Arrays.toString(arr));
		
		
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
		
	}
    public int[] hehe(int[] scores){
        Arrays.sort(scores);
        int content = 0;
        int[] getArr = new int[3];
        for(int i= scores.length-1;i >= 0;i--){
            if(scores[i] < 0 ||scores[i] >100){
                continue;
            }else{
                if(content <=2){
                  getArr[content] = scores[i];
                  content++;
                }else{
                    break;
                }
            }
        }
        return getArr;
    }
}
