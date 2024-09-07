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

//  <<<<<problem-7>>>>>>   <<<<<< To find first occurance in array element >>>>>>

public static int firstOcc(int array[],int key, int i){
    if(i== array.length){
        return -1;
    }
    if(array[i]==key){
        return i;
    }

    return firstOcc(array,key,i+1);
}

//  <<<<<problem-8>>>>>>   <<<<<< To find last occurance in array element >>>>>>

public static int lastOcc(int array[], int key, int i){
    if(i== array.length){
        return -1;
    }
    int isFound= lastOcc(array, key, i+1);
    if(isFound== -1 && array[i]==key){
        return i;
    }

    return isFound;
}

//  <<<<<problem-10>>>>>>   <<<<<< To print a^n in o(logn) timecomplexcity >>>>>>

public static int Optomized(int a, int n){
    if(n==0){
        return 1;
    }
int halfpower=Optomized(a, n/2);
 int halfpowerSq= halfpower*halfpower;

 // if n is odd 
 if(n%2!=0){
    halfpowerSq=a*halfpowerSq;
 }
return halfpowerSq;
}


    public static void main (String []args){
    //     int n=10;
    //     printDec(n);
    //     printInc(n);

    //     System.out.println(fact(5));
    //     System.out.println(sum(n));
    //     System.out.println(fab(5));

    //     int arr[]={1,2,3,4,5,6,7};
    //    System.out.println(isSorted(arr, 0));

    //    int array[]={1,2,3,4,5,6,78,4,5,8,9};
    //    System.out.println(lastOcc(array, 4, 0));
       System.out.println(Optomized(2, 10));

    }
}