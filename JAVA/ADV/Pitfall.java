 /**********/
  1 class Test{
  2   public static void main(String[] args){
  3     Person p1 = new Person();
  4     Person p2 = new Person();
  5     if(p1.equals(p2)){
  6       System.out.println("p1 equals p2");
  7     }
  8     else {
  9       System.out.println("p1 not equals p2");
 10     }
 11   }
 12 }
 13 class Person{
 14   public int i;
 15 }
$ java Test
p1 not equals p2
--- ---
  1 class Test{
  2   public static void main(String[] args){
  3     Person p1 = new Person();
  4     Person p2 = new Person();
  5     p1.i = p2.i = 11;
  6     if(p1.equals(p2)){
  7       System.out.println("p1 equals p2");
  8     }
  9     else {
 10       System.out.println("p1 not equals p2");
 11     }
 12   }
 13 }
 14 class Person{
 15   public int i;
 16 }
$ java Test
p1 not equals p2
--- ---
  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4     if(p.equals(p)){
  5       System.out.println("p equals p");
  6     }
  7     else {
  8       System.out.println("p not equals p");
  9     }
 10   }
 11 }
 12 class Person{
 13   public int i;
 14   public double[] d;
 15   public String str;
 16 }
$ java Test
p equals p

/**********/