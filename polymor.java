class mul{
    static int multiply(int a, int b){
      return a*b;
    }

    static double multiply(int a, int b, int c){
        return a*b*c;
    }
}

class polymor{
    public static void main(String args[]){
        System.out.println("With 2 parameter: "+mul.multiply(3,5));
        System.out.println("With 3 parameter: "+mul.multiply(3,5,2));
    }
}