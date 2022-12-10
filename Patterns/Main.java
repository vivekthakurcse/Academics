

class Main {
  public static void main(String[] args) {

    int i , j = 5;
    for ( i = 0 ; i<j;i++){
          System.out.print("*\n");
      for (j=i-1;j <= i; j++) {
        System.out.print("*\t");
      }
    }
  }
}