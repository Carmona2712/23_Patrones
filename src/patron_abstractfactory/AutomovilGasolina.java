/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_abstractfactory;

/**
 *
 * @author Ricardo Carmona
 */
public class AutomovilGasolina extends Automovil{
    
public AutomovilGasolina(String modelo, String color, int potencia, double espacio)
{
super(modelo, color, potencia, espacio);
}

@Override
 public void mostrarCaracteristicas()
 {
 System.out.println(
 "Automovil de gasolina de modelo: " + modelo +
 " de color: " + color + " de potencia: " +
 potencia + " de espacio: " + espacio);
 } 

    
}
