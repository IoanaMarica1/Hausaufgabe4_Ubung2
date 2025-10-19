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
        int min =Zahlen[0];
        for(int n:Zahlen){
            if(n<min){
                min = n;
            }
        }
        return min;
    }
    //3
    int maximaleSum(int[] Zahlen){
        int sum = 0;
        int min = minimaleZahl(Zahlen);
        for(int n:Zahlen){
            sum+=n;
        }
        sum-=min;
        return sum;
    }
    //4
    int minimaleSum(int[] Zahlen){
        int sum = 0;
        int max = maximaleZahl(Zahlen);
        for(int n:Zahlen){
            sum+=n;
        }
        sum-=max;
        return sum;
    }

}
