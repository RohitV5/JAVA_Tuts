class program1
{
    public static void main( String args[]){
        // System is a predefined class
        // out is a variable
        // print is a function
        // javac will generate the class file same as your class name 

        // a *= 4 ==> a = a * 4;
        // pre increment y = ++x first increment then assign
        // post increment y = x++  first assign then increment
        System.out.print("first program");

        int myFirstNumber = 5;

        System.out.print(myFirstNumber);
        intDataType();
    }

    public static void intDataType(){
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.print("Max value " + maxValue);
        System.out.print("MIn value" + minValue);

        //Overflow
        System.out.print("Busted Max value" + (maxValue + 1));
        System.out.print("Busted Min" + (minValue-1));


        //ways to format int
        int myMaxTest = 2_147_483_647;


    }
}