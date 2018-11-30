import java.util.Arrays;

public class RankingAlgorithm {
               // Driver code
        public static void main(String args[])
        {

           /* Map<String, Integer> scoreMap = new HashMap<>();

            scoreMap.put("Addy",5 );
            scoreMap.put("Amit", 7);
            scoreMap.put("Geo", 8);
            scoreMap.put("Abhi", 9);
            scoreMap.put("Ishan", 3);
            scoreMap.put("Vinay", 3);

            Integer[] scores = scoreMap.values().toArray(new Integer[0]);
            Arrays.sort(scores, Collections.reverseOrder());

            System.out.println(Arrays.toString(scores));*/


           int[] scores = {6,8,3,5,2,5,3,2};
            Arrays.sort(scores);
            int length = scores.length;

            int[] scoresSorted = new int[scores.length];

            for(int i=0; i<length; i++){

                scoresSorted[i] = scores[length-1-i];
            }


            int[] rankings = new int[scores.length];

            rankings[0] = 1;

            for (int i =1; i< scoresSorted.length; i++){
                if (scoresSorted[i] == scoresSorted[i-1]){
                    rankings[i] = rankings[i-1];
                }

                else{
                    rankings[i] = i+1;
                }
            }

            for (int i = 0; i<rankings.length; i++){
                System.out.println("Rank of the player with score " +scoresSorted[i]+ " is " +rankings[i]);
            }
        }
}
