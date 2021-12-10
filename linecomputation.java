class LineComparisonComputation
{

static double d,d1;
static double distance(int x1, int y1, int x2, int y2)
{

    d = Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) * 1.0);
    return d;
}
static double distance1(int a1, int b1, int a2, int b2)
{

    d1 = Math.sqrt(Math.pow(a2 - a1, 2) +
                Math.pow(b2 - b1, 2) * 1.0);
    return d1;
}
    public static void main (String[] args)
    {
        System.out.println(Math.round(distance(3, 4, 4, 3)*100000.0)/100000.0);
	System.out.println(Math.round(distance1(2, 5, 5, 2)*100000.0)/100000.0);
        System.out.println(d == d1);
    }
}
