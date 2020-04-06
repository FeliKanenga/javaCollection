import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {

    int Number = 9;

    public static int queue(int subSize){
        //numbers needed to added by instructions
        LinkedList <Integer> queue = new LinkedList <Integer>();
        queue.add(6);
        queue.add(2);
        queue.add(2);
        queue.add(8);
        queue.add(3);
        queue.add(7);
        queue.add(1);
        queue.add(4);
        queue.add(4);



        int [] subArray = new int [subSize]; // subArray based on size of the subArray declaration/parameter
        int uniqueNumber = 1;
        int uniqueNumberCount = 0;
        int x = 0;
        while (x < queue.size()-subSize) {
            ArrayList <Integer> verifiedNumbers = new ArrayList<>();

            for (int i = 0; i < subSize; i++) {
                subArray[i]=queue.get(x+i);
            }

            for(int a : subArray) {

                while(subArray[0] != a && !verifiedNumbers.contains(a)){
                    verifiedNumbers.add(a);
                    uniqueNumber++;
                }
            }

            if (uniqueNumber > uniqueNumberCount){
                uniqueNumberCount = uniqueNumber;
            }
            uniqueNumber = 1;
            x++;
        }
        System.out.println(+uniqueNumberCount);
        return +uniqueNumberCount;

    }public static void main(String[] args) {


        queue(3);
    }

}
