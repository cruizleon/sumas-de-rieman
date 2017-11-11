/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rieman;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


/**
 *
 * @author LCristhian Javier Ruiz León
 */



public class Rieman {
public static void main (String[]args) throws NumberFormatException, IOException 
{
BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );

bw.write( "Suma de riemann "+ suma_riemann(0, 10, 1) + "\n");
bw.write( "Suma de riemann "+ suma_riemann(0, 10, 2) + "\n");
bw.flush() ;

}

private static double suma_riemann (int initial_point, int final_point, int step_increment ) 
{
double response = 0.0;
double temp;

double x_i, x_i_1, y_i;

x_i_1 = initial_point;
x_i = step_increment + x_i_1 ;

for (int i = (int) x_i; i <= final_point; i += step_increment  ) 
{
y_i = (x_i * x_i_1);
temp = (y_i) * (x_i - x_i_1);
response += temp;

x_i_1 = x_i;
x_i = step_increment + x_i_1;
}

return response;
}

}

