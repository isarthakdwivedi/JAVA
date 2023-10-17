public class arm2 {

   static int leg(int n)
    { int count=0;
        while(n!=0)
        {
          count++;
            n/=10;

        }
        return count;
    }
   static int power(int n)
    {
        int p=int leg(n);
        return p;
    }
   
    void isArm(int n)
    {
int x=leg(n);
       int p=power(n);
        while(n!=0)
        {
           int y=Math.pow(n%10,p);
            n/=10;
        }
        Object system;
        if(y==n)
        {
            System.out.println("YES")
            else
            System.out.println("No")

        }
    public static void main(String[] args) {
        System.out.println();
        
    }
}
