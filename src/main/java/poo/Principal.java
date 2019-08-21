package poo;

public class Principal {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Entrada incorreta");
        } else {

            switch (args[1].hashCode()) {
                case '+':
                    System.out.println(Integer.parseInt(args[0]) + Float.parseFloat(args[2]));
                    break;
                case '-':
                    System.out.println(Integer.parseInt(args[0]) - Float.parseFloat(args[2]));
                    break;
                case '/':
                    System.out.println(Integer.parseInt(args[0]) / Float.parseFloat(args[2]));
                    break;
                case 'x':
                    System.out.println(Integer.parseInt(args[0]) * Float.parseFloat(args[2]));
                    break;
            }
        }
    }
}
