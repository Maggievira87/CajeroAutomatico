import java.util.Scanner;

public class facturacion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String nombredeProducto;
        double preciodeProducto;
        int cantidad;
        final double IMPUESTO = 0.19;
        double saldodeCliente;


        System.out.print("Ingrese el nombre del producto: ");
        nombredeProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        preciodeProducto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad a comprar: ");
        cantidad = scanner.nextInt();

        System.out.print("Ingrese cuánto dinero tiene el cliente: ");
        saldodeCliente = scanner.nextDouble();


        double subtotal = preciodeProducto * cantidad;
        double totalAPagar = subtotal + (subtotal * IMPUESTO);


        int totalRedondiado = (int) totalAPagar;

        boolean puedeComprar = saldodeCliente >= totalRedondiado;


        System.out.println("\n========= TICKET =========");
        System.out.println("Producto: " + nombredeProducto);
        System.out.println("Precio Unitario: $" + preciodeProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (19%): $" + (subtotal * IMPUESTO));
        System.out.println("Total a Pagar (sin centavos): $" + totalRedondiado);
        System.out.println("Saldo del Cliente: $" + saldodeCliente);
        System.out.println("¿Compra aprobada?: " + puedeComprar);

        System.out.println("==========================");

        scanner.close();
    }
}


