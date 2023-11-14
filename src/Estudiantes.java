public class Estudiantes {

// Atributos


int matricula;
String nombre;
int edad;
double calificaciones;

public Estudiantes(int matricula, String nombre, int edad, double calificaciones){

  this.matricula =matricula;
  this.nombre =nombre;
  this.edad=edad;
  this.calificaciones=calificaciones;

}

public void impresionest(){

System.out.println("\nNombre: " + nombre);
System.out.println("matricula: "+matricula);


}

    public static void main(String[] args) {

 Estudiantes estudiante1= new Estudiantes(4654564, "predo", 15, 68);
 Estudiantes estudiante2= new Estudiantes(43543534, "juan", 13, 60);



  }

}
