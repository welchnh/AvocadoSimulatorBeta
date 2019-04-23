/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	enum myEnum {A,B,C,D};	// Demo of enumerated date type

	public static void main(String[] args) {
		// Declare and instantiate an Avocado object
		Avocado bob = new Avocado("Green", Avocado.enumCondition.fresh, 100);
		
		// myEnum e = myEnum.A;
		// e = myEnum.B;
		// System.out.println(e.toString());

	}
}
