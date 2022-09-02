public class javaExceptions {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            // handle exception
            System.out.println("Algo salió mal");
        }
    }
}
