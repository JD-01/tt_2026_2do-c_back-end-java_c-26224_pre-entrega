package talentotech.backendjava.preentrega.modelo;
//
public class Producto
{
  //
  private int    id;
  private String nombre;
  private double precio;
  private String categoria;
  private int    disponibles;
  //
  public Producto ( )
  {

  }
  //
  public Producto setId ( int id )
  {
    this.id = id;
    return this;
  }
  //
  public Producto setNombre ( String nombre )
  {
    this.nombre = nombre;
    return this;
  }
  public Producto setPrecio ( double precio )
  {
    this.precio = precio;
    return this;
  }
  public Producto setCategoria ( String categoria )
  {
    this.categoria = categoria;
    return this;
  }
  public Producto setDisponibles ( int disponibles )
  {
    this.disponibles = disponibles;
    return this;
  }
  //
  public int getId ( ) { return id; }
  public String getNombre ( ) { return nombre; }
  public double getPrecio ( ) { return precio; }
  public String getCategoria ( ) { return categoria; }
  public int getDisponibles ( ) { return disponibles; }  
}