
package uso_empleado;

 
public class Uso_Empleado {//1

	public static void main (String args[]){//2
		
			    
                        Jefatura jefe_RRHH = new Jefatura("DonJuan", 25000, 3, 1, 2015);// Se inicializa el objeto de la clase
                        //jefatura.
                        
                        
			jefe_RRHH.estableceIncentivo(5000);//El objeto de la  clase jefatura establece un incentivo
                         System.out.println(jefe_RRHH.getSueldo());
                         
            
                        Empleado[]  misEmpleados = new  Empleado[6];/* Se crea un arreglo de objetos "misEmpleados", pertenecientes a la clase Empleado
                      El arreglo empieza a llamar a los  constructores de la clase Empleado. Por lo tanto  el primer constructor corresponde a
                        
                        */
			misEmpleados[0] = new  Empleado("Camilo",830000,2005,10,23);
			misEmpleados[1] = new  Empleado("Raul",125000,2014,3,1);
			misEmpleados[2] = new  Empleado("Carlos",650000,2000,3,30);
	          	misEmpleados[3] = new  Empleado("Federico");
                        misEmpleados[4] = jefe_RRHH; //principio de polimorfismo.Principio de sustitución
                        misEmpleados[5] = new  Jefatura("Maria", 10000, 2004, 5, 10);//Principio de polimorfismo versión 2
                        
                       /*
                        double num1 = 7.5;
                        int num2 =(int)num1;
                        
                        */
                       
                        Jefatura jefa_finanzas = (Jefatura)  misEmpleados[5];// casting, para convertir  el objeto 
                        //misEmpleados[5] que pertence a la clase Empleado, en un objeto de tipo  jefatura.
                       
                        jefa_finanzas.estableceIncentivo(10000);
                       
                        
                        for(Empleado e: misEmpleados)
                            
                        e.subeSueldo(5); // bucle for each
                        
                         
                        
                        /*
			for(int i = 0; i< 3; i++){
				
				misEmpleados[i].subeSueldo(5);
				
			}

                        */
                        
                        for(Empleado  e: misEmpleados){/* Fijaos que en la posición 5 no parece id 5, 
                            más bien, esta el id =0.Esto debido a que DonJuan fue el primer objeto en instanciarse.
                            */
                            
                            System.out.println
        (" nombre " + e.getNombre()+" id: "+e.devolverID()+ " Sueldo "+e.getSueldo()+" Fecha de alta "+e.getAltaContrato()) ;
                        }

                        /*
			for(int i = 0; i< 4; i++){
				
				System.out.println("nombre: "+misEmpleados[i].getNombre()+"sueldo: "+misEmpleados[i].getSueldo()+
						"Fecha de alta: "+misEmpleados[i].getAltaContrato());
			}
                        */

 	}//2
	
}//1



  class Jefatura extends Empleado{
    
    public Jefatura(String nom, double sueldo, int anio, int mes, int dia){// S inicializa el constructor con unos parametros  propios
    
        
        super(nom, sueldo, anio, mes, dia);// Como el constructor de la clase  padre debe recibir  derminados parametros
        // Se debe pasar la cantidad de parametros que mejor convenga. En este caso corresponde  5 parametros.
        // de esta forma se inicializan las variables que están en la superclase con los valore entregados en esta clase.
        
        }
    
    
    private double incentivo;

     public void estableceIncentivo(double b){
        
        incentivo = b;
    }
    
      
    @Override
    public double getSueldo(){
			
        
          double sueldoJefe = super.getSueldo();// Se cobreescribe el metodo getsueldo, el cual corresponde a la clase padre
          //por medio de la instrucción super, hacemos saber que corresponde a la superclase. El valor de este metodo es asignado 
          // a  la variabe sueldoJefe, el cual es incrementado y retornado.
          return sueldoJefe + incentivo;
          
			
		}
		
		  
        
    
    }
