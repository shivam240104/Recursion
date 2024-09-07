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

//  <<<<<problem-5>>>>>>   <<<<<< print fibbonacci of nth numbers>>>>>>

public static int fab( int n){
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }

     int Fab=fab(n-1)+fab(n-2);
    return Fab;
}

//  <<<<<problem-6>>>>>>   <<<<<< To check given array is sorted or not  >>>>>>

public static boolean isSorted(int arr[], int i){
    if(i == arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
   return isSorted(arr, i+1);
}



    public static void main (String []args){
        int n=10;
        printDec(n);
        printInc(n);

        System.out.println(fact(5));
        System.out.println(sum(n));
        System.out.println(fab(5));

        int arr[]={1,2,3,4,5,6,7};
       System.out.println(isSorted(arr, 0));
    }
}