public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[][] votesTable =
                {{12, 13, 14, 10, 15, 16}, // candidate 0
                        {5, 2, 6, 8, 4, 3}, // candidate 1
                        {13, 15, 10, 12, 11, 17}, // candidate 2
                };

        int voteCount;
        System.out.println("Votes Table length:" + votesTable.length);
        for (int row[] : votesTable) {// each row (candidates)
            voteCount = 0;
            for (int vote : row) {
                voteCount += vote;
            }
            System.out.println("Votes: " + voteCount);

        }

    }

}


