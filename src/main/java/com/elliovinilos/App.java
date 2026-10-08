package com.elliovinilos;

import java.util.ArrayList;
import java.util.Scanner;

import com.elliovinilos.model.Articulo;
import com.elliovinilos.service.ArticuloService;

public class App extends ArticuloService {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        ArrayList<Articulo> articulos = new ArrayList<>();

        int opcion;
		
        do {
            System.out.println("\n==========================================");
            System.out.println("   SISTEMA DE ARTÍCULOS - CLASE 2 (POO)");
            System.out.println("==========================================");
            System.out.println("1 - Ingresar artículo");
            System.out.println("2 - Listar artículos");
            System.out.println("3 - Consultar un artículo");
            System.out.println("4 - Modificar un artículo");
            System.out.println("5 - Eliminar un artículo");
            System.out.println("0 - Salir");
            System.out.println("==========================================");

            opcion = leerEntero(scanner, "Ingrese una opción: ");
		
            switch (opcion) {
            case 1:
                ingresarArticulo(scanner, articulos);
                break;
            case 2:
                listarArticulos(articulos);
                break;
            case 3:
                consultarArticulo(scanner, articulos);
                break;
            case 4:
                modificarArticulo(scanner, articulos);
                break;
            case 5:
                eliminarArticulo(scanner, articulos);
                break;
            case 0:
                System.out.println("\nSaliendo del sistema. Hasta luego!");
                break;
            default:
                System.out.println("\nError: la opción ingresada no es válida.");
            }

	    } while (opcion != 0);
	
	    scanner.close();
		
		
	}

}
