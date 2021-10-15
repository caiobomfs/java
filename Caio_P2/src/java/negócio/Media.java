/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negócio;
public class Media implements IMedia{

     private float mediaNota;

    private void setResultado(float resultado) {
              this.mediaNota = resultado;
    }
public float getResultado() {
             return  this.mediaNota;
    }
    @Override
    public void calcularMedia(float p1, float p2) {
        float resultado = 0;
        resultado = (p1 + p2 )/ 2;
        this.setResultado(resultado);

    }

    @Override
    public void calcularMedia(float p1, float p2, float tp) {
        float   resultado = 0;
        resultado = (p1 + p2 + tp)/ 3;
        this.setResultado(resultado);

    }




}