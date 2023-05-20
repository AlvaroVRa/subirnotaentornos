import org.junit.Assert;
import org.junit.Test;

public class ClaseTest {
    
    @Test
    public void testInsertarAlumnoExitoso() {
        Clase clase = new Clase();
        clase.insertarAlumno();
        
        int contadorEsperado = 1;
        int cantidadAlumnos = clase.contador;
        
        Assert.assertEquals(contadorEsperado, cantidadAlumnos);
    }
    
    @Test
    public void testInsertarAlumnoClaseLlena() {
        Clase clase = new Clase();
        
        for (int i = 0; i < clase.maximos_alumnos; i++) {
            clase.insertarAlumno();
        }

        clase.insertarAlumno();
        
        int contadorEsperado = clase.maximos_alumnos;
        int cantidadAlumnos = clase.contador;
        
        Assert.assertEquals(contadorEsperado, cantidadAlumnos);
    }
}

