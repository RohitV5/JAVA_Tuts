package com.rohit;


class program
{
    public static void main( String args[]){
          // intDataType();
          // byteDataType();
          // longDataType();
          // castingDataTypes();
          // floatPrecision();


    }


    public static void  classDemo(){
        Car porsche = new Car();

        //setter method used
        porsche.setModel("carrerra");

        //getter method used
        System.out.print(porsche.getModel());
    }

    public static void info(){
        // System is a predefined class
        // out is a variable
        // print is a function
        // javac will generate the class file same as your class name

        // a *= 4 ==> a = a * 4;
        // pre increment y = ++x first increment then assign
        // post increment y = x++  first assign then increment
    }

    public static void intDataType(){
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.print("Max value " + maxValue);
        System.out.print("MIn value" + minValue);

        //Overflow
        System.out.print("Busted Max value" + (maxValue + 1));
        System.out.print("Busted Min" + (minValue-1));


        // ways to format int
        // int occupies 32 bit    2power32
        int myMaxTest = 2_147_483_647;


    }


    public static void byteDataType(){
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        System.out.print("Max value " + maxValue);
        System.out.print("MIn value" + minValue);

        //Overflow
        System.out.print("Busted Max value" + (maxValue + 1));
        System.out.print("Busted Min" + (minValue-1));


        // ways to format byte
        // byte occupies 8 bit    2power8
        byte myMaxTest = 127;


    }

    public static void longDataType(){
        long maxValue = Long.MAX_VALUE;
        long minValue = Long.MIN_VALUE;
        System.out.print("Max value " + maxValue);
        System.out.print("MIn value" + minValue);

        //Overflow
        System.out.print("Busted Max value" + (maxValue + 1));
        System.out.print("Busted Min" + (minValue-1));


        // ways to format Long
        // long occupies 64 bit    2power64
        //
        long myMaxTest = 100L;
        System.out.print(myMaxTest);  //gives 100


    }


    public static void castingDataTypes(){
        // casting is coverting one data type to another
        int val1 = 127;
        short val2 = 2;
        byte val3 = (byte)(val1+val2);
        System.out.print(val3);

    }

    public static void floatPrecision(){
        float minMinFloat = Float.MIN_VALUE;
        float maxMinFloat = Float.MAX_VALUE;

        System.out.print("Float Max value " + minMinFloat);
        System.out.print("Float MIn value" + maxMinFloat);

        float myFloat = 5.25f; //5.25
        double myDouble = 5.25d; //5.25

        // float is single precision 32bit and double is double 64 bit
    }


    public static void expressions(){
        int score = 100;
        if(score > 99){
            // do something statements
        }

    }
}