/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Main {

    /**
     *
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {

        // Generar dato
        Calendar tiempo = Calendar.getInstance();

        int SecondI, SecondA;
        int HoraCal, MinutoCal, SegundoCal;

        //Datos Aleatorios
        int Hora = RND.nextInt(23 - 0 + 1) + 0;
        int Minuto = RND.nextInt(60 - 0 + 1) + 0;
        int Segundo = RND.nextInt(60 - 0 + 1) + 0;

        //Resultado 
        System.out.printf("Hora inicio ......:%02d:%02d:%02d%n", Hora, Minuto, Segundo);
        System.out.printf("Hora Actual ......:%tT%n ", tiempo);

        //Operaciones
        SecondI = Hora * 3600 + Minuto * 60 + Segundo;
        SecondA = tiempo.get(Calendar.HOUR_OF_DAY) * 3600 + tiempo.get(Calendar.MINUTE) * 60 + tiempo.get(Calendar.SECOND);
        //segundos
        System.out.println(SecondA);
        System.out.println(SecondI);

        SegundoCal = SecondA - SecondI;

        //Minutos
        MinutoCal = SegundoCal / 60;
        SegundoCal = SegundoCal % 60;

        //Horas
        HoraCal = MinutoCal / 60;
        MinutoCal = MinutoCal % 60;
        System.out.printf("Tiempo de clase ..: %02d:%02d:%02d%n", HoraCal, MinutoCal, SegundoCal);
    }

}
