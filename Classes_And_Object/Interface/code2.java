
interface Demo1 {
    static void m1() {
        System.out.println("In M1 Demo1");
    }
}

interface Demo2 {
    static void m1() {
        System.out.println("In M1 Demo2");
    }
}

class Child implements Demo1, Demo2 {

}

class Client {
    
	Demo1 obj = new Child();

    	public static void main(String[] args) {
        	Demo1.m1(); // Calling m1() from Demo1 interface
    	}
}

