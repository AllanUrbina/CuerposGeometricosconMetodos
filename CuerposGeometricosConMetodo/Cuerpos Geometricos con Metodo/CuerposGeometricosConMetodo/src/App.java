import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);
    static int intentos, intentos1;
    static double areaLateral, areaTotal, volumen, base, altura, apotema, perimetroBase, longitud, cantidadLados,
            resultado, radio, lados, longitudLados, generatriz;
    static double Radiomayor, Radio, radiomenor, radiosuperior, Area, Areazonaesferica, Volumenzonaesferica,
            Areacasqueteesferico, volumencasqueteesferico, Areadelacara;
    static double alfa, areaBase, perimetrosuperior, perimetroinferior, lado_base_superior, lado_base_inferior, angulo,
            profundidad, Diagonal, Altura, arista;
    static boolean reiniciar = true;

    public static void main(String[] args) throws Exception {
        do {
            int elegir = Menu();
            Casos(elegir);

            System.out.println("¿Desea volver a utilizar el programa? (1) para sí, 0) para no)");
            int respuesta = lector.nextInt();
            if (respuesta == 0) {
                System.out.println("Fin del programa");
                break;
            }
        } while (true);
    }

    public static int Menu() {

        System.out.println("Bienvenido al Programa");

        System.out.println("Se le dará a escoger qué figura geométrica desea efectuar con operaciones");

        System.out.println("::::::::::::::::::::::::::::::::::::::");

        System.out.println("1) Prisma ");

        System.out.println("2)Cilindro");

        System.out.println("3)Piramide");

        System.out.println("4)Cono");

        System.out.println("5)Esfera");

        System.out.println("6)Zona esferica");

        System.out.println("7)Casquete Esferico");

        System.out.println("8) Tronco de cono");

        System.out.println("9)Troco Piramide");

        System.out.println("10)Huso Esferico");

        System.out.println("11)Ortoedro");

        System.out.println("12)Tetraedro");

        System.out.println("13)Hexaedro");

        System.out.println("14)Octaedro");

        System.out.println("15)Dodecaedro");

        System.out.println("16)Icosaedro");

        System.out.println("17)Fin");
        while (intentos1 < 3) {
            System.out.println("Ingrese el caso que desea utilizar");
            int elegir = lector.nextInt();
            if (elegir > 0 && elegir < 18) {
                return elegir;
            } else {
                System.out.println("ingrese un caso entre 1 a 17");
                intentos1++;
            }
        }
        System.out.println("Ha excedido el maximo de intentos");

        return 17;
    }

    public static void Casos(int elegir) {

        switch (elegir) {

            case 1:
                Prisma();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");

                break;
            case 2:
                Cilindro();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");

                break;
            case 3:
                Piramide();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");

                break;
            case 4:
                Cono();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                break;
            case 5:
                Esfera();
                System.out.println("El Area de la Esfera es: " + Area + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("El Volumen de la Esfera es: " + volumen + "Centimetro Cubico");
                break;
            case 6:
                ZonaEsferica();
                System.out.println("El Area de la Esfera es: " + Areazonaesferica + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("El Volumen de la Esfera es: " + Volumenzonaesferica + "Centimetro Cubico");
                break;
            case 7:
                CasqueteEsferico();
                System.out.println("El Area de la Esfera es: " + Areacasqueteesferico + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("El Volumen de la Esfera es: " + volumencasqueteesferico + "Centimetro Cubico");
                break;
            case 8:
                Tronco_cono();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                break;
            case 9:
                Tonco_Piramide();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");

                break;
            case 10:
                Huso_Esferico();
                System.out.println("Area Total: " + Area + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                break;
            case 11:
                Ortoedro();
                System.out.println("Area: " + Area + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Diagonal: " + Diagonal + "Centimetro Cuadrado");
                break;
            case 12:
                Tetraedro();
                System.out.println("Area: " + Area + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Altura: " + Altura + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                break;
            case 13:
                Hexaedro();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: " + areaLateral + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                System.out.println("--------------------------------------------------------");
                System.out.println("Area Diagonal: " + Diagonal + "Centimetro Cuadrado");
                break;
            case 14:
                Octaedro();
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + "Centimetro Cubico");
                break;
            case 15:
                Dodecadro();
                System.out.println("Area Total: " + areaTotal + "Centimetro Cuadrado");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + " Centimetro Cubico ");
                System.out.println("--------------------------------------------------------");
                System.out.println("Apotema" + apotema + " Centimetro Cuadrado ");
                break;
            case 16:
                Icosaedro();
                System.out.println("Area Total: " + areaTotal + " Centimetro Cuadrado ");
                System.out.println("--------------------------------------------------------");
                System.out.println("Volumen: " + volumen + " Centimetro Cubico ");
                break;
            case 17:
                System.out.println("Fin del programa");

            default:
                System.out.println("Saliendo del programa");

                break;
        }
    }

    public static double Prisma() {

        System.out.println("Necesita altura,  longitud y la profundidad");
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Digite la altura:");
            altura = lector.nextDouble();

            if (altura < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("Digite la longitud de los lados:");
                longitudLados = lector.nextDouble();
                if (longitudLados < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {

                for (intentos = 0; intentos < 3; intentos++) {

                    System.out.print("Digite la  Profundidad:");
                    cantidadLados = lector.nextDouble();
                    if (cantidadLados < 0.1) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        intentos = 3;
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {
                    perimetroBase = cantidadLados * longitudLados;
                    areaLateral = perimetroBase * altura;
                    alfa = (Math.PI / 180) * (360 / cantidadLados);
                    apotema = longitudLados / (2 * Math.tan((alfa) / 2));
                    areaBase = (perimetroBase * apotema) / 2;
                    areaTotal = areaLateral + 2 * areaBase;
                    volumen = areaBase * altura;

                }
            }
        }
        return volumen;
    }

    public static double Cilindro() {

        System.out.println("Se necesita la altura y el radio");

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println("¿Cuál es la altura del cilindro?");
            altura = lector.nextDouble();

            if (altura < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {

                System.out.println("¿Cuál es el radio del cilindro?");
                radio = lector.nextDouble();

                if (radio < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                perimetroBase = (2 * Math.PI) * radio;
                areaLateral = perimetroBase * altura;
                areaBase = Math.PI * Math.pow(radio, 2);
                areaTotal = 2 * areaBase + areaLateral;
                volumen = areaBase * altura;
            }
        }
        return areaLateral;
    }

    public static double Piramide() {
        System.out.println("Se necesita base y altura");
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println("¿Cuál es la altura de la piramide");
            altura = lector.nextDouble();

            if (altura < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {
                System.out.println("Cuál es la base de la piramide");
                base = lector.nextDouble();

                if (base < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
                areaLateral = 4 * base * altura / 2;
                areaBase = Math.pow(base, 2);
                areaTotal = areaLateral + areaBase;
                volumen = areaBase * altura / 3;
            }
        }

        return areaLateral;
    }

    public static double Cono() {
        System.out.println("Se necesita la altura y el radio");

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println("¿Cuál es la altura del Cono?");
            altura = lector.nextDouble();

            if (altura < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {

                System.out.println("¿Cuál es el radio del Cono?");
                radio = lector.nextDouble();

                if (radio < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));

                areaLateral = Math.PI * radio * generatriz;

                areaBase = Math.PI * Math.pow(radio, 2);

                areaTotal = areaLateral + areaBase;

                volumen = areaBase * altura / 3;
            }
        }
        return areaLateral;
    }

    public static double Esfera() {
        System.out.println("Se necesita  el radio");

        for (intentos = 0; intentos < 3; intentos++) {

            System.out.println("¿Cuál es el radio de la Esfera");
            radio = lector.nextDouble();

            if (radio < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            Area = 4 * Math.PI * Math.pow(radio, 2);

            volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);

            System.out.println("Area:" + Area + "cuadrado");

            System.out.println("Volumen:" + volumen + "cubico");
        }
        return Area;
    }

    public static double ZonaEsferica() {
        System.out.println("Se necesita radio,RadioMayor,altura,radio superior");
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Digite el radio de la Zonaesferica: ");
            radio = lector.nextDouble();
            if (radio < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("Digite el Radio Mayor:");
                Radio = lector.nextDouble();

                if (Radio < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {

                for (intentos = 0; intentos < 3; intentos++) {
                    System.out.print("Digite la altura:");
                    altura = lector.nextDouble();
                    if (altura < 0.1) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        intentos = 3;
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {

                    for (intentos = 0; intentos < 3; intentos++) {

                        System.out.print("Digite radio superior:");
                        radiosuperior = lector.nextDouble();
                        if (radiosuperior < 0.1) {
                            System.out.println("No se aceptan valores menores a 0.1");
                        } else {
                            intentos = 3;
                        }
                    }

                    if (intentos == 3) {
                        System.out.println("Demasiados intentos fallidos");
                    } else {
                        Areazonaesferica = 2 * Math.PI * Radio * altura;

                        Volumenzonaesferica = Math.PI * altura * Math.pow(altura, 2) + 3 * Math.pow(radio, 2)
                                + 3 * Math.pow(radiosuperior, 2) / 6;
                    }
                }
            }
        }
        return Areazonaesferica;
    }

    public static double CasqueteEsferico() {
        System.out.println("Se necesita la altura y el Radio Mayor");

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println("¿Cuál es la altura del Casquete esferica?");
            altura = lector.nextDouble();

            if (altura < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {

                System.out.println("¿Cuál es el radio de la Caquete esferica?");
                Radio = lector.nextDouble();

                if (Radio < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                Areacasqueteesferico = 2 * Math.PI * Radio * altura;
                volumencasqueteesferico = Math.PI * Math.pow(altura, 2) * 3 * Radio - altura / 3;
            }
        }
        return Areacasqueteesferico;
    }

    public static double Tronco_cono() {
        System.out.println("Se necesita Radio Mayor,Radio Menor,altura");

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Digite el Radio Mayor:");
            Radio = lector.nextDouble();

            if (Radio < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("Digite el radio menor:");
                radiomenor = lector.nextDouble();
                if (radiomenor < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {

                for (intentos = 0; intentos < 3; intentos++) {

                    System.out.print("Digite la Altura:");
                    altura = lector.nextDouble();
                    if (altura < 0.1) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        intentos = 3;
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {
                    base = Radiomayor - radiomenor;
                    generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
                    areaLateral = Math.PI * generatriz * (Radiomayor + radiomenor);
                    areaTotal = Math.PI * generatriz * (Radiomayor + radiomenor) + Math.PI * Math.pow(Radiomayor, 2)
                            + Math.PI * Math.pow(radiomenor, 2);
                    volumen = (1.0 / 3.0) * Math.PI * altura
                            * (Math.pow(Radiomayor, 2) + Math.pow(radiomenor, 2) + Radiomayor * radiomenor);
                }
            }
        }
        return volumen;
    }

    public static double Tonco_Piramide() {
        System.out.println(
                "Se necesita perimetrosuperior,perimetroinferior,altura,lado base superior,lado base inferior");
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Digite el perimetro superior: ");
            perimetrosuperior = lector.nextDouble();
            if (perimetrosuperior < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("Digite el perimetro inferior:");
                perimetroinferior = lector.nextDouble();

                if (perimetroinferior < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {

                for (intentos = 0; intentos < 3; intentos++) {
                    System.out.print("Digite la altura:");
                    altura = lector.nextDouble();
                    if (altura < 0.1) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        intentos = 3;
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {

                    for (intentos = 0; intentos < 3; intentos++) {

                        System.out.print("Digite lado de la base superior:");
                        lado_base_superior = lector.nextDouble();
                        if (lado_base_superior < 0.1) {
                            System.out.println("No se aceptan valores menores a 0.1");
                        } else {
                            intentos = 3;
                        }
                    }

                    if (intentos == 3) {
                        System.out.println("Demasiados intentos fallidos");
                    } else {
                        for (intentos = 0; intentos < 3; intentos++) {
                            System.out.print("Digite lado de la base inferior :");
                            lado_base_inferior = lector.nextDouble();
                            if (lado_base_inferior < 0.1) {
                                System.out.println("No se aceptan valores menores a 0.1");
                            } else {
                                intentos = 3;
                            }
                        }

                        if (intentos == 3) {
                            System.out.println("Demasiados intentos fallidos");
                        } else {

                            base = perimetrosuperior - perimetroinferior;

                            apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

                            areaLateral = perimetrosuperior + perimetroinferior * apotema / 2;

                            areaTotal = areaLateral + lado_base_superior + lado_base_inferior;

                            volumen = (1.0 / 3.0) * altura * (lado_base_superior + lado_base_inferior
                                    + Math.sqrt(lado_base_superior + lado_base_inferior));
                        }
                    }
                }
            }
        }
        return areaLateral;
    }

    public static double Huso_Esferico() {
        System.out.println("Se necesita radio y angulo");
        System.out.println("Se necesita la altura y el Radio Mayor");

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println("¿Cuál es la altura del Casquete esferica?");
            radio = lector.nextDouble();

            if (radio < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {

                System.out.println("¿Cuál es el radio de la Caquete esferica?");
                angulo = lector.nextDouble();

                if (angulo < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                Area = Math.PI * Math.pow(radio, 2) * angulo / 90;
                volumen = Math.PI * Math.pow(radio, 3) * angulo / 270;
            }
        }

        return Area;
    }

    public static double Ortoedro() {
        System.out.println("Necesita altura,  longitud y la profundidad");
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Digite la altura:");
            altura = lector.nextDouble();

            if (altura < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("Digite la longitud:");
                longitud = lector.nextDouble();
                if (longitud < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {

                for (intentos = 0; intentos < 3; intentos++) {

                    System.out.print("Digite la  Profundidad:");
                    profundidad = lector.nextDouble();
                    if (profundidad < 0.1) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        intentos = 3;
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {
                    Area = 2 * (altura * longitud + altura * profundidad + longitud * profundidad);
                    Diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(longitud, 2) + Math.pow(profundidad, 2));
                    volumen = altura * longitud * profundidad;
                }
            }
        }
        return volumen;
    }

    public static double Tetraedro() {
        System.out.println("Se necesita la arista");
        for (intentos = 0; intentos < 3; intentos++) {

            System.out.print("Digite la arista : ");
            arista = lector.nextDouble();
            if (arista < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            Area = Math.pow(arista, 2) * Math.sqrt(3);
            Altura = arista * Math.sqrt(6) / 3;
            volumen = Math.sqrt(2) / 12 * Math.pow(arista, 3);

        }
        return Area;
    }

    public static double Hexaedro() {
        System.out.println("Se necesita la Arista");
        for (intentos = 0; intentos < 3; intentos++) {

            System.out.print("Digite la arista : ");
            arista = lector.nextDouble();
            if (arista < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            Areadelacara = Math.pow(arista, 2);

            areaTotal = 6 * Math.pow(arista, 2);

            volumen = Math.pow(arista, 3);

            Diagonal = arista * Math.sqrt(3);

            areaLateral = 4 * Areadelacara;
        }
        return areaLateral;

    }

    public static double Octaedro() {
        System.out.println("Se necesita la Arista");
        for (intentos = 0; intentos < 3; intentos++) {

            System.out.print("Digite la arista : ");
            arista = lector.nextDouble();
            if (arista < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            areaTotal = 2 * Math.pow(arista, 2) * Math.sqrt(3);

            volumen = Math.sqrt(2) / 3 * Math.pow(arista, 3);
        }

        return volumen;
    }

    public static double Dodecadro() {
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println(" Ingrese la arista del Dodecaedro");
            arista = lector.nextDouble();

            if (arista < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {

                System.out.println("Ingrese longitud de los lados ");
                longitudLados = lector.nextDouble();

                if (longitudLados < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                areaTotal = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));

                volumen = 1 / 4 * 15 + 7 * Math.sqrt(5) * Math.pow(arista, 3);

                apotema = longitudLados / (2 * Math.tan(36));
            }
        }

        return volumen;
    }

    public static double Icosaedro() {
        System.out.println("Se necesita la Arista");
        for (intentos = 0; intentos < 3; intentos++) {

            System.out.print("Digite la arista : ");
            arista = lector.nextDouble();
            if (arista < 0.1) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            areaTotal = 5 * Math.pow(arista, 2);
            volumen = 5 / 12 * 3 + Math.sqrt(5) * Math.pow(arista, 3);
        }

        return volumen;
    }
}
