public class ejercicioLetras {
    public static void main(String[] args){
        // IMPRIMIR 1-D / 2-L  / 3-D/......

        int num=1;
        String letra;

        while (num<=100){
            if (num%2==0){
                letra="L";
            }
            else{
                letra="D";
            }
            System.out.println(num + "-" +letra);
            num = num +1;
        }

    }

}
