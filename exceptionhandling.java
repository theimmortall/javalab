class exceptionhandling{
    public static void main(String args[]){
        try{
            int data = 45/0;
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hello YMCIAN");
        }
    }
};
