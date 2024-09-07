public class Problem{

//  <<<<<problem-1>>>>>>   <<<<<< print decrising number from n to 1>>>>>>
public static void printDec(int n){
    if(n==1){
        System.out.print("1");
        return ;

    }
    System.out.print(n+" ");
    printDec(n-1);
}

//  <<<<<problem-2>>>>>>   <<<<<< print incrising number from 1 to n>>>>>>

public static void printInc(int n){
    if(n==1){
        System.out.print("1");
        return;
    }
    printInc(n-1);
    System.out.print(n+ " ");
}

//  <<<<<problem-3>>>>>>   <<<<<< print incrising number from 1 to n>>>>>>

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        // int fnm1=fact(n-1);
        int fn = n*fact(n-1);
         return fn;
    }

//  <<<<<problem-4>>>>>>   <<<<<< print dum of n numbers>>>>>>

public static int sum(int n){
    if(n==1){
        return 1;
    }
     int Sum=n+sum(n-1);
     return Sum;
}


    public static void main (String []args){
        int n=10;
        printDec(n);
        printInc(n);

        System.out.println(fact(5));
        System.out.println(sum(n));
    }
}