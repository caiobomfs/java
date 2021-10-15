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
public class Pe implements IUnidadeMetrica {

	private double metro;
	private double pe;



	public Pe(double metro) {
		super();
		this.metro = metro;
	}


	@Override
	public void converter() {
		this.pe = metro*3.28084;

	}


	public double getPe() {
		converter();
		return pe;
	} 


}