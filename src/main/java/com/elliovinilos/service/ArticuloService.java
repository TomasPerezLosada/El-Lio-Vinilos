package com.elliovinilos.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.elliovinilos.model.Articulo;

public class ArticuloService {
	
	// Funciones Helper;
	
	public static int leerEntero(Scanner scanner, String mensaje) {

        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            	System.out.println("\n");
                System.out.println("Error: debe ingresar un número entero válido!\n");
                System.out.println("\n");
            }
        }
    }
	
	
	public static Articulo buscarArticuloPorCodigo(ArrayList<Articulo> articulos, int codigo) {

        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }

        return null;
    }
	
	
	public static double leerDoubleNoNegativo(Scanner scanner, String mensaje) {

        while (true) {
            try {
                System.out.print(mensaje);
                double valor = Double.parseDouble(scanner.nextLine());

                if (valor < 0) {
                	System.out.println("\n");
                    System.out.println("Error: el precio no puede ser negativo!\n");
                    System.out.println("\n");
                    continue;
                }

                return valor;
            } catch (NumberFormatException e) {
            	System.out.println("\n");
                System.out.println("Error: debe ingresar un número decimal válido!\n");
                System.out.println("\n");
            }
        }
    }
	
	
	public static String leerTextoNoVacio(Scanner scanner, String mensaje) {

        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine();

            if (!texto.trim().isEmpty()) {
                return texto.trim();
            }
            System.out.println("\n");
            System.out.println("Error: el texto no puede estar vacío!");
            System.out.println("\n");
        }
    }
	
	
	// Funciones de Flujo de App;
	
	public static void ingresarArticulo(Scanner scanner, ArrayList<Articulo> articulos) {

        System.out.println("\n---  INGRESAR ARTÍCULO  ---");
        System.out.println("\n");

        int codigo = leerEntero(scanner, "Ingrese el código del artículo: ");

        if (buscarArticuloPorCodigo(articulos, codigo) != null) {
        	System.out.println("\n");
            System.out.println("Error: ya existe un artículo con ese código!");
            System.out.println("\n");
            return;
        }

        String nombre = leerTextoNoVacio(scanner, "Ingrese el nombre del artículo: ");
        double precio = leerDoubleNoNegativo(scanner, "Ingrese el precio del artículo: ");

        Articulo articulo = new Articulo(codigo, nombre, precio);

        articulos.add(articulo);

        System.out.println("\n");
        System.out.println("Artículo ingresado correctamente!");
        System.out.println("\n");
    }
	
	
	public static void listarArticulos(ArrayList<Articulo> articulos) {

		System.out.println("\n");
		System.out.println("\n");
        System.out.println("\n---  LISTADO DE ARTÍCULOS  ---");
        System.out.println("\n");

        if (articulos.isEmpty()) {
        	System.out.println("\n");
            System.out.println("No hay artículos cargados.");
            System.out.println("\n");
            return;
        }

        for (Articulo articulo : articulos) {
            System.out.println(articulo);
            System.out.println("\n");
        }
    }
	
	
	public static void consultarArticulo(Scanner scanner, ArrayList<Articulo> articulos) {

        System.out.println("\n---  CONSULTAR ARTÍCULO  ---");
        System.out.println("\n");

        if (articulos.isEmpty()) {
            System.out.println("No hay artículos cargados.");
            System.out.println("\n");
            return;
        }

        int codigo = leerEntero(scanner, "Ingrese el código del artículo a consultar: ");

        Articulo articulo = buscarArticuloPorCodigo(articulos, codigo);

        if (articulo == null) {
        	System.out.println("\n");
            System.out.println("El artículo no existe.");
            System.out.println("\n");
        } else {
        	System.out.println("\n");
            System.out.println("Artículo encontrado: ");
            System.out.println(articulo);
            System.out.println("\n");
        }
    }
	
	
	public static void modificarArticulo(Scanner scanner, ArrayList<Articulo> articulos) {

        System.out.println("\n---  MODIFICAR ARTÍCULO  ---");
        System.out.println("\n");

        if (articulos.isEmpty()) {
        	System.out.println("\n");
            System.out.println("No hay artículos cargados.");
            System.out.println("\n");
            return;
        }

        int codigo = leerEntero(scanner, "Ingrese el código del artículo a modificar: ");

        Articulo articulo = buscarArticuloPorCodigo(articulos, codigo);

        if (articulo == null) {
        	System.out.println("\n");
            System.out.println("El artículo no existe.");
            System.out.println("\n");
            return;
        }

        String nuevoNombre = leerTextoNoVacio(scanner, "Ingrese el nuevo nombre del artículo: ");
        double nuevoPrecio = leerDoubleNoNegativo(scanner, "Ingrese el nuevo precio del artículo: ");

        articulo.setNombre(nuevoNombre);
        articulo.setPrecio(nuevoPrecio);
        
        System.out.println("\n");
        System.out.println("Artículo modificado correctamente!");
        System.out.println("\n");
    }
	
	
	public static void eliminarArticulo(Scanner scanner, ArrayList<Articulo> articulos) {

        System.out.println("\n---  ELIMINAR ARTÍCULO  ---");

        if (articulos.isEmpty()) {
        	System.out.println("\n");
            System.out.println("No hay artículos cargados.");
            System.out.println("\n");
            return;
        }

        int codigo = leerEntero(scanner, "Ingrese el código del artículo a eliminar: ");

        Articulo articulo = buscarArticuloPorCodigo(articulos, codigo);

        if (articulo == null) {
        	System.out.println("\n");
            System.out.println("El artículo no existe.");
            System.out.println("\n");
            return;
        }

        articulos.remove(articulo);

        System.out.println("\n");
        System.out.println("Artículo eliminado correctamente!");
        System.out.println("\n");
    }

}
