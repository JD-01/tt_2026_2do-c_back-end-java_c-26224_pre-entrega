package talentotech.backendjava.preentrega.controlador;
//
import talentotech.backendjava.preentrega.util.controlador.IControladorBase;
import talentotech.backendjava.preentrega.vista.MenuPrincipal;
//
public class ControladorMain implements IControladorBase
{
  public static void iniciar ( ) throws Exception
  {
    //
    do {
      MenuPrincipal.desplegar ( );
      //
      int opcion = MenuPrincipal.procesarOpcion ( );
      System.out.println ( opcion );
      //
      switch ( opcion )
      {
        //case 1:  
      }
      //
    //
    } while ( false );
  }
}