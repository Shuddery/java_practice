package by.bsu.company.practice.action;

public class Method {

    public static double [] mnk(double [] X, double  [] Y, int n)
    {
        double sx2,sx,sy,sxy;
        double a,b,d,da,db;
        int i;
        sx2=sx=sy=sxy=0.0;
        for (i=0; i<n; i++)
        {
            sx+=X[i];
            sy+=Y[i];
            sx2+=X[i]*X[i];
            sxy+=X[i]*Y[i];
        }

        d=((double) n)*sx2-sx*sx;
        da=((double) n)*sxy-sx*sy;
        db=sx2*sy-sx*sxy;
        a=da/d;
        b=db/d;
        double [] res=new double[2];
        res[0]=a;
        res[1]=b;
        return res;
    }
}
