class Solution{
    long sum(long N, long M){
        long hcf = gcd(N, M);
        long q1 = N/hcf;
        long q2 = M/hcf;
        long summ = q1+q2;
   		return summ;
    }
    
    static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    
}
