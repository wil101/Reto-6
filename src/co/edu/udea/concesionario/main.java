package co.edu.udea.concesionario;

/**
 *
 * @author emanuel.lopezh
 * @author wilmar.osorio1
 */
public class main {
    
    
    public static void main(String[] args){
        Llanta llanta  = new Llanta();
        Automovil auto = new Automovil("bpm198","bmw",2018,2000,"azul",500000000,"carro de alta gama");
        Motor motor    = new Motor();
        try {
            Vendedor vendido = new Vendedor("jose","jaimito","vendedor del concesionario",1002309203,17,40000000,2022);
        }
        catch(Exception numeroInvalido) {
            System.out.println(numeroInvalido);
            
        }
        
    }
    
    
}
