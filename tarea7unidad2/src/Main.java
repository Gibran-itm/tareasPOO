import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        int opcion = 0, opcionDatos;
        boolean productoEncontrado;
        Scanner input = new Scanner(System.in);
        ArrayList<Producto> Inventario = new ArrayList<>();
        String nombre;
        int precio, stock;

        // Productos ya hechos
        Producto prod1 = new Producto("oreo", 18);
        Producto prod2 = new Producto("pan", 25, 22);
        Inventario.add(prod1);
        Inventario.add(prod2);

        // Menu
        while (opcion != 6) {
            productoEncontrado = false;
            opcion = 0;
            while (opcion < 1 || opcion > 6) {
                System.out.println("//////////////////////////");
                System.out.println("Administrador de Stock");
                System.out.println("1.Agregar Producto ➕\n2.Eliminar Producto ➖\n3.Aumentar stock ⬆\n4.Disminuir stock ⬇\n5.Mostrar Productos\n6.Salir del programa \uD83D\uDEAA");
                System.out.print("Opcion: ");
                opcion = input.nextInt();
            }
            System.out.println("----------");
            switch (opcion) {
                // Agregar Producto
                case 1:
                    opcionDatos = 0;
                    while (opcionDatos < 1 || opcionDatos > 2) {
                        System.out.println("1.Ingresar nombre, precio y stock\n2. Ingresar nombre y precio");
                        opcionDatos = input.nextInt();
                    }
                    switch (opcionDatos) {
                        case 1:
                            System.out.print("Ingrese nombre: ");
                            nombre = input.next();
                            input.nextLine();
                            System.out.print("Ingrese precio: ");
                            precio = input.nextInt();
                            input.nextLine();
                            System.out.print("Ingrese stock: ");
                            stock = input.nextInt();
                            input.nextLine();
                            Producto productoOp1 = new Producto(nombre, precio, stock);
                            Inventario.add(productoOp1);
                            break;
                        case 2:
                            System.out.print("Ingrese nombre: ");
                            nombre = input.next();
                            input.nextLine();
                            System.out.print("Ingrese precio: ");
                            precio = input.nextInt();
                            input.nextLine();
                            Producto productoOp2 = new Producto(nombre, precio);
                            Inventario.add(productoOp2);
                            break;
                    }
                    break;
                // Eliminar Producto
                case 2:
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = input.next();
                    input.nextLine();
                    for (Producto producto : Inventario) {
                        if (producto.getNombre().equals(nombre)) {
                            productoEncontrado = true;
                            System.out.println(nombre + " eliminado");
                            Inventario.remove(producto);
                            break;
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println(nombre + " no existe");
                    }
                    break;
                // Aumentar Stock
                case 3:
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = input.next();
                    input.nextLine();
                    for (Producto producto : Inventario) {
                        if (producto.getNombre().equals(nombre)) {
                            productoEncontrado = true;
                                System.out.println("Nombre: " + producto.getNombre());
                                System.out.println("Stock: " + producto.getStock());
                                stock = 0;
                                while (stock <= producto.getStock()) {
                                    System.out.print("Ingrese nuevo stock: ");
                                    stock = input.nextInt();
                                    input.nextLine();
                                }
                            producto.setStock(stock);
                            System.out.println("----------");
                            System.out.println("Nombre: " + producto.getNombre());
                            System.out.println("Stock: " + producto.getStock());
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println(nombre + " no existe");
                    }
                    break;
                // Disminuir Stock
                case 4:
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = input.next();
                    input.nextLine();
                    for (Producto producto : Inventario) {
                        if (producto.getNombre().equals(nombre)) {
                            productoEncontrado = true;
                            System.out.println("Nombre: " + producto.getNombre());
                            System.out.println("Stock: " + producto.getStock());
                            stock = 0;
                            if (producto.getStock() == 0) {
                                System.out.println("El stock no puede ser negativo");
                            } else {
                                do {
                                    System.out.print("Ingrese nuevo stock: ");
                                    stock = input.nextInt();
                                    input.nextLine();
                                } while (stock <= producto.getStock());
                                producto.setStock(stock);
                                System.out.println("----------");
                                System.out.println("Nombre: " + producto.getNombre());
                                System.out.println("Stock: " + producto.getStock());
                            }
                            break;
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println(nombre + " no existe");
                    }
                    break;
                // Mostrar Productos
                case 5:
                    if (Inventario.isEmpty()) {
                        System.out.println("\nNo existen productos en el sistema");
                        return;
                    }
                    for (Producto producto : Inventario) {
                        System.out.println("Nombre: " + producto.getNombre());
                        System.out.println("Precio: " + producto.getPrecio());
                        if (producto.getStock() > 0) {
                            System.out.println("Stock: " + producto.getStock());
                        }
                        System.out.println("----------");
                    }
                    break;
                case 6:
                    System.out.println("Programa finalizado");
                    break;

            }




        }


    }
}