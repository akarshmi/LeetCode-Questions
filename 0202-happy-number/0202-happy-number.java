class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int rem=0;
        while(n>0){
           
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        if(sum==1)
        return true;
        else if(sum>4)
        return isHappy(sum);

        else return false;
    }
}