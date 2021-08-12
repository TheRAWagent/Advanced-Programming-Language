/*
    Write a Java program to find the value of following variables:
    z=8,
    a= z++ + ++z,
    b= z-- + --z
    c= z++,
    d=++z,
    e=z--,
    f=--z
*/
class Q6{
    public static void main(String Args[])
    {
        int z =8;
        int a = z++ + ++z;
        int b = z-- + --z;
        int c = z++;
        int d=++z;
        int e=z--;
        int f=--z;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);


    }
}
