import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<Integer> lastNumList = new ArrayList<Integer>();

        // create seqList of n seq

        List<List> seqList = new ArrayList<List>();

        for(int i=0; i<n ; i++){
            List<Integer> seq = new ArrayList<Integer>();
            seqList.add(seq);
        }

        // iterate over queries list

        int lastAnswer = 0;

        for(int j=0; j< queries.size(); j++){

            List<Integer> query = queries.get(j);
            int qNum = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int index = ((x^lastAnswer) % n);
            List<Integer> seq = seqList.get(index);


            if(qNum == 1){


                seq.add(y);

            }else{


                //int value = seq.get(y);
                int valueIndex = y % seq.size();
                int value = seq.get(valueIndex);
                lastAnswer = value;
                lastNumList.add(lastAnswer);

            }

        }

        return lastNumList;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = dynamicArray(n, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
