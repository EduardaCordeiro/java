public class tabuada {
    public static void main(String[] args) {
        int numeroMaximo = 10;
        
        for (int i = 1; i <= numeroMaximo; i++) {
            System.out.println("Tabuada do " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            
            System.out.println(); // Adiciona uma linha em branco entre as tabuadas
        }
    }
}

