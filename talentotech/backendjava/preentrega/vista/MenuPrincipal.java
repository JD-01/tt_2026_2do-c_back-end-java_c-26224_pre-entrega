package talentotech.backendjava.preentrega.vista;
//
//import talentotech.backendjava.preentrega.modelo.Producto;
//
import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
public class MenuPrincipal
{
  public static void desplegar ( )
  {
    System.out.print
    (
      "\n=================================================\n" +
      "        SISTEMA DE GESTIÓN DE PRODUCTOS\n"   +
      "=================================================\n\n" +

      "1. Visualizar Productos.\n"                          +
      "-------------------------------------------------\n" +
      "2. Buscar Producto por Id.\n"                        +
      "-------------------------------------------------\n" +
      "3. Agregar Producto.\n"                              +
      "-------------------------------------------------\n" +
      "4. Modificar Producto.\n"                            +
      "-------------------------------------------------\n" +
      "5. Eliminar Producto.\n"                             +
      "-------------------------------------------------\n" +
      "0. Salir.\n\n"
    );
  }
  //
  public static int procesarOpcion ( ) throws Exception
  {
    String  entrada = null;
    Scanner scanner = new Scanner ( System.in );
    //BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System.in ) );
    int     opcion  = 0;
    //
    do {
      System.out.print(">> ");
      entrada = scanner.nextLine ( ).trim ( );
      //entrada = bufferedReader.readLine ( );
      if ( entrada.matches ( "\\d" ) ) {
        //
        opcion = Integer.parseInt ( entrada );
        if ( opcion > 5 ) {
          System.out.print ( "La opción tiene que ser un número del 0 al 5. ¡Intenta de nuevo!\n\n" );
        // 
        } else break;
      //
      } else {
          System.out.print ( 
            "La opción: \"" + entrada + "\" no es valida. Tiene que ser un número del 0 al 5. ¡Intenta de nuevo!\n\n");
      }
    //
    } while ( true ); 
    //
    scanner.close();
    //bufferedReader.close();
    // 
    return opcion;
  }
  //
  public static void visualizarProductos ( ) throws Exception
  {
    //ArrayList productos =
  }
}