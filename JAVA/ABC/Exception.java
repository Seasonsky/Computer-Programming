  1 class TestException {
  2   public static void main(String[] args) {
  3     try {
  4       int result = new Test().divide(3,0);
  5       System.out.println("The result is" + result);
  6     }
  7     catch(Exception expt){
  8       System.out.println(expt.getMessage());
  9     }
 10     System.out.println("running end.");
 11   }
 12 }
 13 class Test {
 14   public int divide(int x, int y) {
 15     int result = x/y;
 16     return x/y;
 17   }
 18 }
Arthur@HOME /cygdrive/d/iCACHE/iPRO/test
$ java TestException
/ by zero
running end.

/**********/