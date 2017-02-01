package uso_empleado;


import java.util.*;


class Empleado
	{//5
	
 		public Empleado(String nom, double sue, int year, int month, int day ){//3. Metodo constructor
                        
			nombre = nom;
			sueldo = sue;
			
			GregorianCalendar calendario  = new GregorianCalendar(year, month, day);
			
			altaContrato = calendario.getTime();// asigna a altaContrato la el valor del objeto, usando el formato
			// del metodo getTime  de la clase GregorianCalendar
			
                        this.id = idSiguiente;
                        idSiguiente++;//Aumenta su valor en 1, para luego asignarlo al  id.
		}//3 
                
                
                public Empleado(String nom){
                    //constructores. Pues solamente recibe el valor String de uno de los  constructores creados 
                    // El cual posee solamente un parametro de tipo String.
                    this(nom, 6000000,2010,4,3 );
                /*
                    
La imagen anterior  muestra  como  this, llama  al  constructor que tenga esos parámetros,
                    para pasarle  los valores del  constructor en el que se encuentra el this.
                    Permitiendo de esta forma evitar  que las otras variables  distintas a nombre,
                    se inicialicen con cero o null.

                    */
			
 		 
			
		}//3 
		
		public String getNombre(){//4
			
			return nombre;
			
		}//4
		
             
		public double getSueldo(){
			
			return sueldo;
			
		}
		
		
		public Date getAltaContrato(){
			
			return altaContrato;
				
		}
		
		public void subeSueldo(double porcentaje){
			
			double aumento = (sueldo * porcentaje)/100;//determina el 5% del suedo.
			
			sueldo += aumento;// le añade al sueldo, el aumento
			
		}
                
                public int devolverID(){
                    
                    return id;
                }
		
               
		// variables de clase
		private String nombre;
		private double sueldo;
		private Date altaContrato;  
                private static int idSiguiente =0;//Esta variable no pertenece a ningun objeto.
                private int  id;
                
                
		
	
	}//5

