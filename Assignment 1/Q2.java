class Q2
{
    public static void main(String Args[])
    {
        int A=56,B=1055,C=-17,D=0;
        Addition Add2 = new Addition(A,C);
        Addition Add3 = new Addition(A,B,C);
        Addition Add4 = new Addition(A,B,C,D);
    }
}
class Addition
{
    Addition(int A,int B)
    {
        System.out.println("A + B = " + (A+B));
    }
    Addition(int A,int B,int C)
    {
        System.out.println( "A + B + C = " + (A+B+C));
    }
    Addition(int A,int B,int C,int D)
    {
        System.out.println( "A + B + C + D = " + (A+B+C+D));
    }
}
