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
public class Libra implements IUnidadeMetrica {

	private double kilo;
	private double libra;



	public Libra(double kilo) {
		super();
		this.kilo = kilo;
	}


	@Override
	public void converter() {
		this.libra = kilo*2.2046;

	}


	public double getLibra() {
		converter();
		return libra;
	}
}