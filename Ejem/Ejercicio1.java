public class Ejercicio1 {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double menor = 0;

        double promedio = (num1 + num2 + num3) / 3;
        double producto = num1 * num2 * num3;

        if (num1 <= num2) {
            if (num1 <= num3) {
                 menor = num1;
            }else{
                 menor = num3;
            }
        }else if (num2 <= num3) {
             menor = num2;
        }else{
             menor = num3;
        }
    
    System.out.println(promedio);
    System.out.println(producto);
    System.out.println(menor);
    }

}