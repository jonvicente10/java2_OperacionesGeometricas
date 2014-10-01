
package com.zubiri.geometria;

/* Clase para calcular el area y el perimetro de un rectangulo */

	public class Rectangulo {


	/* Declaracion de variables */

		/* Se declaran las variables privadas altura y base */
		private double alto, base;


	/* Setters y Getters de alto y base */

		/* Alto */

		public void setAlto (double altointroducido)
 		{
			alto = altointroducido;
 		}
		
		public double getAlto()
 		{
			return alto;
 		}


		/* Base */

		public void setBase (double baseintroducida)
 		{
			base = baseintroducida;
 		}

		public double getBase()
 		{
			return base;
 		}


	/* Operaciones para calcular el area y el perimetro */

		/* Metodo para calcular y establecer el valor del area teniendo en cuenta el valor introducido */
		public double area()
 		{
			double result;
			result = this.getAlto() * this.getBase();
			return result;
		}


		/* Metodo para calcular y establecer el valor del perimetro teniendo en cuenta el valor introducido */
		public double perimetro()
 		{
			double result;
			result = (2 * this.getBase()) + (2 * this.getAlto());
			return result;
 		}

	}
