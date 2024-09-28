package interfacedemo;

interface Car{
    public void start();
}

class electricCar implements Car{
    public void start(){
        System.out.println("electric car starts");
    }
}

class dieselCar implements Car{
    public void start()
    {
        System.out.println("diesel car start");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Car Tesla = new electricCar();
        Car xuv700 = new dieselCar();
        Tesla.start();
        xuv700.start();

    }
}
