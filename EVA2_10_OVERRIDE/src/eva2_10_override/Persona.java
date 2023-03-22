/*

 */
package eva2_10_override;


public class Persona {

private String nombre;
private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//------------------------------------------------------------------------------

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
//------------------------------------------------------------------------------ 
    Persona(){
        this.nombre = "---";
        this.edad = 0;
    }

//------------------------------------------------------------------------------

@Override
public String toString(){
  String cade = "\nDatos. \n"
          + "Nombre: "+nombre+ "\n"
          + "Edad: "+edad;
 return cade;  
}
//método sobreescrito reemplazado de la superclase

    
}
