/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class ruleta {

    public static void main(String[] args) {

        int nIntegrantes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de integrantes"));
//         showMessageDialog(null, a, "Calculando", 1);
        int nEjercicios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de ejercicios"));

        ArrayList<String> listaNombres = new ArrayList<String>();

        for (int i = 0; i < nIntegrantes; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Digite el nombre del estudiante");
            listaNombres.add(nombre);
        }
////------------------------------------------------------------------------------------------
        Integer[] listaEjercicios = new Integer[nEjercicios];
        for (int i = 0; i < listaEjercicios.length; i++) {
            listaEjercicios[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(listaEjercicios));
//        System.out.println(Arrays.toString(listaEjercicios));
////------------------------------------------------------------------------------------------
        int ejercicioXintegrante = (int) Math.floor(nEjercicios / nIntegrantes);
        int sobrantes = nEjercicios - nIntegrantes * ejercicioXintegrante;

        ArrayList<Integer>[] lista = new ArrayList[nIntegrantes];

        if (sobrantes == 0) {
            int valor = 0;
            for (int i = 0; i < nIntegrantes; i++) {

                System.out.println(listaNombres.get(i));
                for (int j = 0; j < ejercicioXintegrante; j++) {

                    System.out.println(listaEjercicios[valor]);
                    valor++;
                }
            }
        } else {
            int valor = 0;
            for (int i = 0; i < nIntegrantes; i++) {

                System.out.println(listaNombres.get(i));
                for (int j = 0; j < ejercicioXintegrante; j++) {

                    System.out.println(listaEjercicios[valor]);
                    valor++;
                }

            }
    
       Collections.shuffle(listaNombres);     
            
            System.out.println("Existe un exeso, estudiantes con ejercicios extra: ");
            for (int j = 0; j < sobrantes; j++) {
                
                System.out.println(listaNombres.get(j));
                
                System.out.println(listaEjercicios[valor]);
                valor++;
            }
        }

    }

}
