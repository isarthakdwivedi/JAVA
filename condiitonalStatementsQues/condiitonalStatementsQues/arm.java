public class arm
{
    int len(int n)
    {
        while(n!=0)
        {
            count++;
            n/=10;

        }
        return count;
    }
    int power(int n)
    {
        int pow=leg(n);
        return pow;
    }
    void isArm(int n)
    {
        x=leg(n);
        p=power(n);
        while(n!=0)
        {
            y=Math.pow(n%10,p);
            n/=10;
        }
        if(y==n)
        {
            system.out.println("YES")
            else
            system.out.println("No")

        }


        public static void main(string[] args){
            




        }
    }
}