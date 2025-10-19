public class ArrayOperations {
    //1
    int maximaleZahl(int[] Zahlen){
        int max = 0;
        for(int n:Zahlen){
            if(n>max){
                max = n;
            }
        }
        return max;
    }
    //2
    int minimaleZahl(int[] Zahlen){
        int min = 0;
        for(int n:Zahlen){
            if(n<min){
                min = n;
            }
        }
        return min;
    }

}
