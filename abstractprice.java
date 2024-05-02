abstract class Car{
    abstract void rate();
    void rating(){
        System.out.println("5 star rating");
    }
}

class Maruti extends Car{
    void rate(){
   System.out.println("Market price of Maruti is 500000");
    }
}

class Honda extends Car{
    void rate(){
        System.out.println("Market price of Honda is 400000");
    }
}

class abstractprice{
    public static void main(String[] args) {
        Maruti c = new Maruti();
        Car f = new Honda();
        c.rate();
        c.rating();
        f.rate();
    }
}


