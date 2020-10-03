
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;

public class ejercicio1 {
    //metodo para mostrar el array
    public static void mostrar(double vec[],int n){
        System.out.print("El arreglo = [ ");
        for(int i = 0;i < n; i++)
        {
            System.out.print("   " + vec[i]);
        }
        System.out.println("]");
    } 
    
    public static void main(String[] args) {
        int n = (int)(Math.random()*(10-5+1)+5);
        System.out.println("cantidad = " + n);
        double[] numd = new double[n];
        double ingreso = 0.0;
        //Llenado de datos al array
        for(int i = 0;i < n;i++)
        {   
            ingreso = (double)(Math.random()*(90-45+1)+45);
            BigDecimal bd = new BigDecimal(ingreso).setScale(2, RoundingMode.UP);
            numd[i] = bd.doubleValue(); 
        }
        mostrar(numd,n);
        //calculo del promedio
        double suma=0;
        double promedio = 0;
        for(int i = 0; i< n; i++)
        {
            suma = suma + numd[i];
        }
        BigDecimal bds = new BigDecimal(suma).setScale(2, RoundingMode.UP);
        promedio = suma/n;
        BigDecimal bdp = new BigDecimal(promedio).setScale(2, RoundingMode.UP);
        System.out.println("La suma es = " + bds.doubleValue());
        System.out.println("El Promedio es = " + bdp.doubleValue());
        //calculo del mayor
        Arrays.sort(numd);
        double mayor = 0;
        double segmayor = 0;
        for(int i =0 ; i < n; i++)
        {            
            if(numd[i] > mayor)
            {
                segmayor = mayor;
                mayor = numd[i];                
            }
        }
        System.out.println("El mayor es = " + mayor);
        
       //calculo de la diferencia entre el segundo mas grande con el segundo mas pequeño
        double segmenor = numd[1];
        System.out.println("segundo mayor = " + segmayor + "  y Segundo menor = " + segmenor);
        double resta = segmayor - segmenor;
        BigDecimal bdr = new BigDecimal(resta).setScale(2, RoundingMode.UP);
        System.out.println("La diferencia es = " + bdr.doubleValue());        
    }
    
}
