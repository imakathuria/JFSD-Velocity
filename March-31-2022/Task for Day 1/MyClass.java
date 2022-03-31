public class MyClass {
    public void isLeap(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println();
        System.out.println();
    }
    public void DayOfMonth(int date){
        if(date>31){
            System.out.print("Invalid input");
        }
        date = date%7;
        switch(date){
            case 0 : 
                System.out.print("monday");
                break;
            case 1 : 
                System.out.print("Tuesday");
                break;
            case 2 : 
                System.out.print("wednesday");
                break;
            case 3 : 
                System.out.print("thursday");
                break;
            case 4 : 
                System.out.print("friday");
                break;
            case 5 : 
                System.out.print("saturday");
                break;
            case 6 : 
                System.out.print("sunday");
                break;
            
            default:
                System.out.print("invalid day");
        }
        System.out.println();
        System.out.println();
    }
    public void printPattern1(int n){
        System.out.println("-----Pattern 1-----");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printPattern2(int n){
        System.out.println("-----Pattern 2-----");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printPattern3(int n){
        System.out.println("-----Pattern 3-----");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printPattern4(int n){
        System.out.println("-----Pattern 4-----");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printPattern5(int n){
        System.out.println("-----Pattern 5-----");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.isLeap(2022);
        System.out.println();
        obj.DayOfMonth(28);
        System.out.println();
        obj.printPattern1(5);
        System.out.println();
        obj.printPattern2(5);
        System.out.println();
        obj.printPattern3(5);
        System.out.println();
        obj.printPattern4(5);
        System.out.println();
        obj.printPattern5(5);
        System.out.println();
        
    }
}