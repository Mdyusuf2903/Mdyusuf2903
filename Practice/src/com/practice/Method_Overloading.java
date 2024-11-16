package com.practice;

//public class Method_Overloading {
//
//	public static void main(String[] Yusuf) {
//		System.out.println("****************");
//
//		System.out.println(add(1b, 2b));
//
//		//System.out.println(add(1000, 2000));
//	}
//
//	// Cannot make a static reference to the non-static method add(int, int) from
//	// the type Method_Overloading
//	// change the add method to static
//	static byte add(byte a, byte b) {
//		return (byte) (a + b);
//	}
//
//}

//public class Method_Overloading {
//
//    public static void main(String[] Yusuf) {
//        System.out.println("****************");
//        
//        byte num1 = 1;
//        byte num2 = 2;
//
//        System.out.println(add(num1, num2));
//
//        // System.out.println(add(1000, 2000));
//    }
//
//    static byte add(byte a, byte b) {
//        return  (byte) (a + b);
//    }
//}
//***********************************************************************************************************************

//public class Method_Overloading {
//
//    public static void main(String[] Yusuf) {
//        System.out.println("****************");
//        
//
//        System.out.println(add(1, 2));
//
//        // System.out.println(add(1000, 2000));
//    }
//
//    static long add(long a, long b) {
//        return   (a + b);
//    }
//}

//***************************************************************************************************************************

//public class Method_Overloading {
//
//    public static void main(String[] Yusuf) {
//        System.out.println("****************");
//        
//
//        System.out.println(add(1000000000L, 2000000000L));
//
//        // System.out.println(add(1000, 2000));
//    }
//
//    static long add(long a, long b) {
//        return  (a + b);
//    }
//}

//***************************************************************************************************************************

public class Method_Overloading {

    public static void main(String[] Yusuf) {
        System.out.println("****************");
        
        //byte num1 = (byte)1;
        //byte num2 = (byte)2;
        
       // System.out.println(add((byte)100, (byte)200));
        //System.out.println(add(1000000000, 2000000000L));
        
        
     //   int num1 = (int)(100000000000L);
      //  int num2 = (int)(200000000000L);

         System.out.println(add((int)(100000000000L), (int)(200000000000L)));
    }
 //********************************************************   
    //byte
    
    //static byte add(byte a, byte b) {          // type cast is need for byte values i.e.   return   (byte) (a + b);
    // return   (byte) (a + b);
  //}
    
    
    
    
    
//****************************************************8
//    static int add(int a, long b) {
//        return  (int) (a + b);
//    }
    
//    static long add(int a, long b) {
//        return  (a + b);
//    }
//*************************************************    
    
    
//    static int add(long a, int b) {
//        return (int) (a + b);
//    }
    
//    static long add(long a, int b) {
//        return  (a + b);
//    }
    
//*********************************************************    
    static int add(int a, int b) {
        return  (a + b);
    }
    
//    static int add(long a, long b) {
//        return  (int)(a + b);
//    }
}

//***************************************************************************************************************************