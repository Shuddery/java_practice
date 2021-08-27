package by.bsu.company.practice.runner;

import by.bsu.company.practice.action.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        double u[]={1,2,3,4,5,6,7,8,9,10};
        double j[]={0.5,1.1,1.45,2,2.51,3.01,3.55,4.1,4.5,4.95};
        double q[]= Method.mnk(u,j,10);
        System.out.println("R="+1.0/q[0]);
    }
}
