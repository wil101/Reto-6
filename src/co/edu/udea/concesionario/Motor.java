
package co.edu.udea.concesionario;

/**
 *
 * @author wilmar.osorio1
 */
public class Motor {
    int peso,clindraje;
    String marca,referencia,descripcion;

    public void setPeso(int peso) throws numeroInvalido{
        if(peso >= 0){
            this.peso = peso;
        }else{
            throw new numeroInvalido();
        }
        
    }
    
}
