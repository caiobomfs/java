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
public class Metro implements IUnidadeMetrica {

	private double metro;
	private double pe;



	public Metro(double pe) {
		super();
		this.pe = pe;
	}


	@Override
	public void converter() {
		this.metro = pe/3.28084;

	}


	public double getMetro() {
		converter();
		return metro;
	}







}
