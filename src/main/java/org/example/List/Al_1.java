package org.example.List;




public class Al_1{
@FunctionalInterface
 interface Inter{

    void demo();


    default void def(){}
    static void ik(){}

    }

    // one functionalinterface can extend another Functionalinterface ,
    // iff that interface does not contain any another abstract method ,But it can override the first one's abstract method
//  @FunctionalInterface
//  interface inter2 extends inter{
//
//    default void io(){}
//        static void nj(){}
//
//  }






}
