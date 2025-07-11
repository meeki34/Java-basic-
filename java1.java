import java.io.*;

class java1 {
    public static void main(String args[]) throws IOException {
        int a;
        float b;
        double c;
        long d;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the integer value");
        a = Integer.parseInt(in.readLine());
        System.out.println("Enter the float value");
        b = Float.parseFloat(in.readLine());
        System.out.println("Enter the double value");
        c = Double.parseDouble(in.readLine());
        System.out.println("Enter the long value");
        d = Long.parseLong(in.readLine());
        System.out.println("The integer value is " + a);
        System.out.println("The float value is " + b);
        System.out.println("The double value is " + c);
        System.out.println("The long value is " + d);
    }
}