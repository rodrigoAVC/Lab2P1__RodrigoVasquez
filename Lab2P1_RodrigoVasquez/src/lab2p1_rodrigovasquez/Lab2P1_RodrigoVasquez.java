
package lab2p1_rodrigovasquez;

import java.util.Scanner;

public class Lab2P1_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner gate = new Scanner(System.in);  
        int elect = 0;
        do{
            System.out.println("Ejercicio #1");
            System.out.println("Ejercicio #2");
            System.out.println("Ejercicio #3");
            System.out.print("¿A que ejercicio desea ingresar? ");
            elect = gate.nextInt(); 
            if(elect==1){
                System.out.print("Ingrese A: ");
                int A = gate.nextInt();
                System.out.print("Ingrese B: ");
                int B = gate.nextInt();
                int num1 = A;
                int num2 = B;
                while(A!=B){
                    if(A>B)
                        A = A - B;
                    else if(B>A)
                        B = B - A;
                }
                System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + A);  
            }else if(elect==2){
                System.out.print("Ingrese su año de nacimiento: ");
                int gen = gate.nextInt();
                if(gen>=1946&&gen<=1964)
                    System.out.println("Usted es de la generacion Baby Boomer Gen");
                else{ 
                    if(gen>=1965&&gen<=1979)
                        System.out.println("Usted es de la Generacion X");
                    else{
                        if(gen>=1980&&gen<=1985)
                            System.out.println("Usted es de la generacion Xennials");
                        else{
                            if(gen>=1986&&gen<=1994)
                                System.out.println("Usted es de la generacion Millenials");
                            else{
                                if(gen>=1995&&gen<=2012)
                                    System.out.println("Usted es de la generacion Gen Z");
                                else{
                                    if(gen>=2013&&gen<=2025)
                                        System.out.println("Usted es de la generacion Gen Alpha");
                                }
                            }
                        }
                    }
                }
            }else if(elect==3){ 
                System.out.println("---Tipos de Pokémon---");
                System.out.println("1. Fighting");
                System.out.println("2. Psychic");
                System.out.println("3. Steel");
                System.out.println("4. Fairy");
                System.out.print("Ingrese el Tipo del Atacador: ");
                int tipo_attack = gate.nextInt();
                System.out.println("Ingrese el Tipo del Defensor: ");
                int tipo_defense = gate.nextInt();
                if(tipo_attack == 1){
                    if(tipo_defense==1){
                        System.out.println("¡El tipo Fighting es Neutral contra el tipo Fighting!");
                    }else{
                        if(tipo_defense==2){
                            System.out.println("¡El tipo Fighting es Debil contra el tipo Psychic!");
                        }else{
                            if(tipo_defense==3){
                                System.out.println("¡El tipo Fighting es Super Eficaz contra el tipo Steel!");
                            }else{
                                if(tipo_defense==4){
                                    System.out.println("¡El tipo Fighting es Debil contra el tipo Fairy!");
                                }
                            }
                        }
                    }
                }else if(tipo_attack==2){
                    if(tipo_defense==1)
                        System.out.println("¡El tipo Psychic es Super Eficaz contra el tipo Fighting!");
                    else{
                        if(tipo_defense==2)
                            System.out.println("¡El tipo Psychic es Debil contra el tipo Psychic!");
                        else{
                            if(tipo_defense==3)
                                System.out.println("¡El tipo Psychic es Debil contra el tipo Steel!");
                            else{
                                if(tipo_defense==4)
                                    System.out.println("¡El tipo Psychic es Neutral contra el tipo Fairy!");
                            }
                        }
                    }
                }else if(tipo_attack==3){
                    if(tipo_defense==1)
                        System.out.println("¡El tipo Steel es Neutral contra el tipo Fighting!");
                    else{
                        if(tipo_defense==2)
                            System.out.println("¡El tipo Steel es Neutral contra el tipo Psychic!");
                        else{
                            if(tipo_defense==3)
                                System.out.println("¡El tipo Steel es Debil contra el tipo Steel!");
                            else{
                                if(tipo_defense==4)
                                    System.out.println("¡El tipo Steel es Super Eficaz contra el tipo Fairy!");
                            }
                        }
                    }
                }else if(tipo_attack==4){
                    if(tipo_defense==1)
                        System.out.println("¡El tipo Fairy es Super Eficaz contra el tipo Fighting!");
                    else{
                        if(tipo_defense==2)
                            System.out.println("¡El tipo Fairy es Neutral contra el tipo Psychic!");
                        else{
                            if(tipo_defense==3)
                                System.out.println("¡El tipo Fairy es Debil contra el tipo Steel!");
                            else{
                                if(tipo_defense==4)
                                    System.out.println("¡El tipo Fairy es Neutral contra el tipo Fairy!");          
                            }
                        }
                    }
                }                               
            }
        }while(elect>0&&elect<4);
    }
}
