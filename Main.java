import java.util.Scanner;
import java.lang.Math;

class Main {
    Scanner sc = new Scanner(System.in);

    public int read_Int() {
        while (true) {
            try {
                return Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("Error: not an integer.");
            }
        }
    }
    
    public long read_Long() {
        while (true) {
            try {
                return Long.parseLong(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("Error: not a long integer.");
            }
        }
    }

    public char read_Char(){
        while (sc.hasNext()) {
            String first = sc.next();
            if (first.length() == 1) {
                return first.charAt(0);
            } else {
                System.out.println("Error: enter a single character");
            }
        }
        return ' ';
    }

    public char read_numChar(){
        while (sc.hasNext()) {
            String first = sc.next();
            if (first.length() == 1 && Character.isDigit(first.charAt(0))) {
                return first.charAt(0);
            } else {
                System.out.println("Error: enter a single digit character");
            }
        }
        return ' ';
    }

    public int sumLastNums(int x){
        return x%10 + (x%100 - x%10)/10;
    }

    public int charToNum(char x){
        return x - 48;
    }

    public boolean isUpperCase(char x){
        if (Character.isUpperCase(x)) return true;
        else return false;
    }

    public boolean isDivisor(int a, int b){
        if (a%b==0 || b%a==0){
            return true;
        } else return false;
    }

    public int lastNumSum(int a, int b){
        return (a % 10) + (b % 10);
    }

    public int abs(int x){
        return Math.abs(x);
    }

    public int safeDiv (int x, int y){
        if (y == 0) {
            return 0; 
        }
        return x / y;
    }

    public int sum2 (int x, int y){
        if (10<=x+y && x+y<=19) {
            return 20;
        }
        return x + y;
    }

     public String age (int x){
        if (x % 10 == 1 && x % 100 != 11) {
            return (String.valueOf(x) + " год");
        }
        if (x % 10 >= 2 && x % 10 <= 4 && (x % 100 < 10 || x % 100 >= 20)) {
            return (String.valueOf(x) + " года");
        }
        return (String.valueOf(x) + " лет");
     }

     public String day (int x){
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели";
        }
     }

     public String chet(int x){
        String result = "";
        for (int i = 0; i <= x; i=i+2) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += i;
        }
        return result;
     }

     public int numLen (long x){
        int length = 0;
        while (x != 0) {
            x /= 10;
            length++;
        }
        return length;
     }

     public void square (int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public void leftTriangle (int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public void rightTriangle (int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public int[] add (int[] arr, int x, int pos){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
     }

     public int[] addArr(int[] arr, int[] ins, int pos){
        int[] newArr = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            newArr[i + ins.length] = arr[i];
        }
        return newArr;
      }

     public void reverse (int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
     }

     public int[] findAll (int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
     }

     public int[] deleteNegative (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
     }

    public static void main(String[] args){
        Main obj = new Main();

        System.out.print("==First Task==\n");
        System.out.print("1)enter a whole number: ");
        int a = obj.read_Int();
        System.out.println(obj.sumLastNums(a));

        System.out.print("2)enter 0-9 number: ");
        char b = obj.read_numChar();    
        System.out.println(obj.charToNum(b));

        System.out.print("3)enter A-Z character: ");
        char c = obj.read_Char();    
        System.out.println(obj.isUpperCase(c));

        System.out.print("4)enter two whole numbers:\n");
        int d = obj.read_Int();    
        int e = obj.read_Int();
        System.out.println(obj.isDivisor(d,e));

        System.out.print("5)enter 5 numbers:\n");
        int result0 = obj.read_Int();
        for (int i = 0; i < 4; i++) {
            int tmp = obj.read_Int();
            System.out.println(result0 + " + " + tmp + " this is " + obj.lastNumSum(result0, tmp));
            result0 = obj.lastNumSum(result0, tmp);
        }
        System.out.println("Final sum: " + result0);

        System.out.print("==Second Task==\n");
        System.out.print("6)enter a number:\nx=");
        int f = obj.read_Int();
        System.out.println("Result: " + obj.abs(f));

        System.out.print("7)enter two numbers:\nx=");
        int g = obj.read_Int();
        System.out.print("y=");
        int h = obj.read_Int();
        System.out.println("Result: " + obj.safeDiv(g,h));

        System.out.print("8)enter two numbers:\nx=");
        int I = obj.read_Int();
        System.out.print("y=");
        int j = obj.read_Int();
        System.out.println("Result: " + obj.sum2(I,j));

        System.out.print("9)enter your age:\nx=");
        int k = obj.read_Int();
        System.out.println("Result: \"" + obj.age(k) + "\"");
        
        System.out.print("10)enter a number between 1 and 7 for the day of the week:\nx=");
        int l = obj.read_Int();
        System.out.println("Result: \"" + obj.day(l) + "\"");
        
        System.out.print("==Third Task==\n");
        System.out.print("11)enter a range of even numbers:\nx=");
        int m = obj.read_Int();
        System.out.println("Result: \"" + obj.chet(m) + "\"");

        System.out.print("12)enter a number:\nx=");
        long n = obj.read_Long();
        System.out.println("Result:" + obj.numLen(n));

        System.out.print("13)enter a number:\nx=");
        int o = obj.read_Int();
        System.out.println("Result:\n");
        obj.square(o);

        System.out.print("14)enter a number:\nx=");
        int p = obj.read_Int();
        System.out.println("Result:");
        obj.leftTriangle(p);

        System.out.print("15)enter a number:\nx=");
        int q = obj.read_Int();
        System.out.println("Result:");
        obj.rightTriangle(q);

        System.out.print("==Fourth Task==\n");
        System.out.print("16)enter the size of the array: ");
        int N = obj.read_Int();
        System.out.print("enter the elements of the array: ");
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.read_Int();
        }
        System.out.print("Enter the number to add: ");
        int x = obj.read_Int();
        System.out.print("Enter the position to add: ");
        int pos = obj.read_Int();
        int[] newArr = obj.add(arr, x, pos);
        System.out.print("Result: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        System.out.print("17)enter the size of the first array: ");
        int M = obj.read_Int();
        System.out.print("enter the elements of the first array: ");
        int[] arr2 = new int[M];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = obj.read_Int();
        }
        System.out.print("enter the size of the second array: ");
        int P = obj.read_Int();
        System.out.print("enter the elements of the second array: ");
        int[] arr3 = new int[P];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = obj.read_Int();
        }
        System.out.print("enter the position to add: ");
        int pos2 = obj.read_Int();
        int[] newArr2 = obj.addArr(arr2, arr3, pos2);
        System.out.print("Result: ");
        for (int i = 0; i < newArr2.length; i++) {
            System.out.print(newArr2[i] + " ");
        }

        System.out.print("18)enter the size of the array: ");
        int R = obj.read_Int();
        System.out.print("enter the elements of the array: ");
        int[] arr4 = new int[R];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = obj.read_Int();
        }
        obj.reverse(arr4);
        System.out.print("Result: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        System.out.print("19)enter the size of the array: ");
        int S = obj.read_Int();
        System.out.print("enter the elements of the array: ");
        int[] arr5 = new int[S];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = obj.read_Int();
        }
        System.out.print("enter the number to find: ");
        int y = obj.read_Int();
        int[] result = obj.findAll(arr5, y);
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.print("20)enter the size of the array: ");
        int T = obj.read_Int();
        System.out.print("enter the elements of the array: ");
        int[] arr6 = new int[T];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = obj.read_Int();
        }
        int[] result2 = obj.deleteNegative(arr6);
        System.out.print("Result: ");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.print("==The end==");
        
    }
}
