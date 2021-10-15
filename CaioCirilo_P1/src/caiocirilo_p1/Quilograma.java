/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caiocirilo_p1;

/**
 *
 * @author caiob
 */
public class Quilograma implements IUnidadeMetrica {

	private double kilo;
	private double libra;



	public Quilograma(double libra) {
		super();
		this.libra = libra;
	}


	@Override
	public void converter() {
		this.kilo = libra/2.2046;

	}


	public double getKilo() {
		converter();
		return kilo;
	}


}
