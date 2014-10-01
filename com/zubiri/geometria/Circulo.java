
package com.zubiri.geometria;

/* Clase para calcular el area y la circunferencia de un circulo */

	public class Circulo {


		/* Se declaran las variables publicas radio, area y circunferencia */
		private double radio;
		private double area;
		private double circunferencia;


		/* Metodo para dar valor a radio mediante el dato introducido */
		public void setRadio (double radiointroducido)
 		{
			radio = radiointroducido;
 		}
		
		/* Metodo para obtener (get) el valor de la variable radio */
		public double getRadio()
 		{
			return radio;
 		}


		/* Metodo para calcular y establecer el valor del area teniendo en cuenta el valor introducido */
		public double area()
 		{
			double result;
			result = 3.1416 * Math.pow(this.radio,2);
			return result;
		}


		/* Metodo para calcular y establecer el valor de la circunferencia teniendo en cuenta el valor introducido */
		public double circunferencia()
 		{
			double result;
			result = 2 * 3.1416 * this.radio;
			return result;
 		}

	}
