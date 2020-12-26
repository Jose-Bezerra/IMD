public class ForEach {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4};
    // Iterando arrays de forma diferente.
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
    }
    System.out.println();

    for (int n : a) {
      System.out.print(n);
    }
  }
}
