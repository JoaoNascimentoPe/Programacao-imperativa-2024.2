public class atv1 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 101) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
            i++;
        }
        
        int j = 10;
        int somatorio = 0;
        while (j < 1001) {
            if (j % 2 == 1) {
                somatorio += j;
            }
            j++;
        }
        System.out.println("\n" + somatorio);
        
        int inicio = 1;
        int fim = 100; 

        for (int x = inicio; x <= fim; x++) {
            if (x % 3 == 0 && x % 10 != 3) {
                System.out.print(x + ", ");
            }
        }
    };
}