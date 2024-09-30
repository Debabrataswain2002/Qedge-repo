class GCD {
  public static void main(String[] args) {

    int n1 = 81, n2 = -153;

    // Always set to positive
    n1 = ( n1 > 0) ? n1 : -n1;
    n2 = ( n2 > 0) ? n2 : -n2;

    while(n1 != n2) {
        
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }
    
    System.out.println("GCD: " + n1);
  }
}
#new changed code
  public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
