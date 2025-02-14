public class TwoDArray{
    public static void main(String args[]){
        String[][]courses={{"cse","ds"},
                           {"cs","aiml",},
                           {"ece","eee"},
                          };
        for(int i=0;i<courses.length;i++){
            System.out.println();
            for(int j=0;j<courses[i].length;j++){
                System.out.print(courses[i][j]+" ");
            }
        }
    }
}