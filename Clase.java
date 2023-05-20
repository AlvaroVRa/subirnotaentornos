public class Clase {
    public int contador = 0;
    public int maximos_alumnos = 20;
    public Alumno alumno[] = new Alumno[20];

    public void insertarAlumno(){
        if(!(contador>maximos_alumnos)){
            alumno[contador] = new Alumno();
            contador ++;
        }else{
            System.out.println("La clase ya está llena de alumnos");
        }
    }
}

