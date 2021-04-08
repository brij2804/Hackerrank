import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {


        Stack<Character> lstc= new Stack<>();
        String flag = "YES";
        Map<Character,Character> map= new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');


        char[] chs = s.toCharArray();
        System.out.println("chs.length  :"+chs.length);

        for(char c:chs){

            // if it is left hand bracket then push it in stack
            if(c=='(' || c=='{' || c=='['){
                lstc.push(c);
                // if it is right hand bracket then pop the bracket from stack and check with corresponding left hand brackt.
                // if it matches then true else false and break the loop
            }else{
                if(!lstc.isEmpty()){
                    char lchar=lstc.pop();
                    if(lchar != map.get(c)){
                        flag = "NO";
                        break;
                    }
                }else{
                    flag = "NO";
                    break;
                }

            }
        }

        if(!lstc.isEmpty()){
            flag = "NO";
        }
        return flag;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
