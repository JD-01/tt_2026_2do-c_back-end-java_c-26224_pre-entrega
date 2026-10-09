/**
 * # ============================= #
 * #  Talento Tech                 #
 * #  Back-End Java                #
 * #  2026 - 2do Cuatrimestre      #
 * #  Comisión: 26224              #
 * # ----------------------------- #
 * #  Pre-Entrega de Proyecto      #
 * # ============================= #
*/

package talentotech.backendjava.preentrega;
//
import talentotech.backendjava.preentrega.controlador.ControladorMain;
//
public class Main
{
  public static void main ( String [ ] args )
  {
    try {
      //
      ControladorMain.iniciar ( );
    //
    } catch ( Exception e ) {
      //
      System.out.println ( e.getMessage ( ) );
    }
  }
}