package src;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;
import java.util.Scanner;
import java.lang.String;

/* Programa para calcular el area y circunferencia de un circulo o el area y perimetro de un rectangulo. */

public class OperacionesGeometricas {

	public static void main (String args[]) {

		/* Se declara la variable objetogeometrico; que recojera si el objeto es un circulo o un rectangulo */
		String objetogeometrico, circulo, rectangulo;
	
		/* Se utiliza la clase Scanner para solicitar valores de entrada */
		Scanner sc = new Scanner(System.in);

		/* Se solicita el tipo de objeto geometrico */
		System.out.print("\nIntroduce el objeto geometrico (circulo o rectangulo): ");

		objetogeometrico = sc.nextLine();

		/* Se crea una condicion. Dependiendo del valor de objetogeometrico, el programa hara una cosa u otra */
		
			/* Si el objeto es un circulo el programa hara esto: */
			if (objetogeometrico.equalsIgnoreCase("circulo"))
			{
				double radiointroducido, area, circunferencia;
				/* Pide introducir el valor del radio */
				System.out.println("\nHas seleccionado circulo, introduce el valor del radio (en metros):");
				radiointroducido = sc.nextDouble();
				/* Se crea un nuevo objeto circulo1 */
				Circulo circulo1 = new Circulo();
				/* El valor del radio se pasa a la clase setRadio */
				circulo1.setRadio(radiointroducido);
				/* Se recupera el valor del area y circunferencia */
				area = circulo1.area();
				circunferencia = circulo1.circunferencia();
				/* Muestra los resultados en pantalla */
				System.out.println("\nEl area del circulo es:" + area + "m²");
				System.out.println("\nLa circunferencia del circulo es:" + circunferencia + "m");
			
			}

			/* Si el objeto es un rectangulo el programa hara esto: */
			else if (objetogeometrico.equalsIgnoreCase("rectangulo"))
			{
				double baseintroducida, altointroducido, area, perimetro;
				/* Pide introducir el valor del alto y la base */
				System.out.println("\nHas seleccionado rectangulo, introduce el valor de la base y del alto");
				System.out.println("\nValor de la base (en metros):");
				baseintroducida = sc.nextDouble();
				System.out.println("\nValor del alto (en metros):");
				altointroducido = sc.nextDouble();
				/* Se crea un nuevo objeto rectangulo1 */
				Rectangulo rectangulo1 = new Rectangulo();
				/* El valor del alto y la base se pasa a las clases setAlto y setBase */
				rectangulo1.setAlto(altointroducido);
				rectangulo1.setBase(baseintroducida);
				/* Se recupera el valor del area y perimetro */
				area = rectangulo1.area();
				perimetro = rectangulo1.perimetro();
				/* Muestra los resultados en pantalla */
				System.out.println("\nEl area del rectangulo es:" + area + "m²");
				System.out.println("\nEl perimetro del rectangulo es:" + perimetro + "m");
			}

			/* Si el valor introducido no coincide con "rectangulo" o "circulo", nos dara un aviso: */
			else
			{
				System.out.println("Introduce un valor valido!");
			}

	}

}
