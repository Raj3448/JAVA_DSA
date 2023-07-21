class Main {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            throw new Exception("Something went wrong!");
        } catch (Exception e) {
            // Default exception handler
            //e.printStackTrace();
        }
    }
}
