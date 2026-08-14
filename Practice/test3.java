@FunctionalInterface
interface test{
        void run();
      /// void test5();
       // default void testrun(){};
       
        public static void stop(){};
}

//  class test2 implements test{
//        public void run(){
//               System.out.println("hello");
//        }

//        public void stop(){
//               System.out.println("static2 method");
//             }
// }

 class test3  {
      public static void main(String[] args) {
            test obj = new test(){ 
               
               public void run(){
               System.out.println("hello");
               };

               public void stop(){
               System.out.println("static2 method");
                               }
       
            //      test2 obj1 = new test2();
            

      };
      obj.run();
      obj.stop();
       //       obj.testrun();
       //      obj1.stop();
       }
       
}

