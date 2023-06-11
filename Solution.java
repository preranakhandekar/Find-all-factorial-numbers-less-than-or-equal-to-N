class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> arr=new ArrayList<>();
        for(long i=1;i<=N;i++){
            long f=fact(i);
            if(f<=N){
                arr.add(f);
            }
            else{
                break;
            }
        }
        return arr;
    }
    static long fact(long n){
        if(n<1){
            return 1;
        }
        return n*fact(n-1);
    }
}
