package org.example;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        LocalDateTime fechaCotizacion = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaCotizacion.format(formatter);

        //Entradas y variables
        String nombreCliente, correoCliente, documentoCliente, telefonoCliente, destinoViaje = "",
                descripcionDestino = "", servicioSeguroViaje, fechaTexto;
        short numPersonas, cantPersonasSeguro;
        double precioPersona = 0, subTotalPersonas = 0, costoSeguro = 0, descuentoGrupo=0, totalViaje, impuestoViaje;
        boolean deseaSeguro = false;
        byte eleccion;

        System.out.println("\n\u001B[34mBienvenido a la pagina de mundo aventurero");
        System.out.println("Donde calcularemos el presupuesto para tus vacaciones:");

        System.out.print("\nIngrese su nombre: " );
        nombreCliente = scanner.nextLine();
        System.out.print("Documento: " );
        documentoCliente = scanner.nextLine();
        System.out.print("Correo electronico: ");
        correoCliente = scanner.nextLine();
        System.out.print("Telefono: ");
        telefonoCliente = scanner.nextLine();
        System.out.print("Cantidad de personas que viajan: ");
        numPersonas = scanner.nextShort();

        System.out.print("\n A donde te gustaria viajar: " +
                "\n     1. Cartagena, costo: $1600000" +
                "\n     2. Bogota, costo: $800000" +
                "\n     3. San Andres, costo: $2100000" +
                "\n     4. Armenia, costo: $1500000" +
                "\nIngrese el numero de la opcion que desea: ");
                eleccion = scanner.nextByte();

                switch (eleccion){
                    case 1:
                        destinoViaje = "Cartagena";
                        precioPersona =1600000;
                        descripcionDestino = "\n * Playa privada vista al mar" +
                                "\n * Increible gastronomia" +
                                "\n * Jet Sky" +
                                "\n * Visitar islas aledañas";

                        break;

                    case 2:
                        destinoViaje = "Bogota";
                        precioPersona = 800000;
                        descripcionDestino = "\n * Habitaciones comodas y amuebladas" +
                                "\n * Atracciones turiticas" +
                                "\n * Visita Cerro monserrate" +
                                "\n * Visitar zonas emblematicas";
                        break;

                    case 3:
                        destinoViaje = "San Andres";
                        precioPersona = 2100000;
                        descripcionDestino = "\n * Isla privada en mar cristalino" +
                                "\n * Acceso al acuario Ihaynes cay" +
                                "\n * Visitar el mar siete colores"+
                                "\n * Adentrarse en la cueva de morgan";
                        break;

                    case 4:
                        destinoViaje = "Armenia";
                        precioPersona = 1500000;
                        descripcionDestino = "\n * Habitaciones comodas y amuebladas" +
                                "\n * Visitar el valle cocora" +
                                "\n * Acceso al parque nacional del cafe"+
                                "\n * Disfrute de los terminales de santa rosa";
                        break;
                }



        System.out.print("\n\nBeneficios del seguro de viaje: " +
                "\n -Gastos medicos y atencion hospitalaria" +
                "\n -Cancelacion o demora de vuelos" +
                "\n -Perdida de equipaje" +
                "\n -Asistencia legal" +
                "\n¿Desea incluir el servicio de viaje? (si/no): ");
            scanner.nextLine();
                servicioSeguroViaje = scanner.nextLine();


        deseaSeguro = servicioSeguroViaje.equalsIgnoreCase("si");
        System.out.print("Cantidad de personas que desean adquirir el seguro: ");
        cantPersonasSeguro = scanner.nextShort();

        if (deseaSeguro){
            costoSeguro = cantPersonasSeguro * 130000;
        }

        subTotalPersonas = numPersonas * precioPersona;

        if (numPersonas>=4){
            descuentoGrupo = subTotalPersonas * 0.08;
        }


        //Operaciones

        impuestoViaje = (subTotalPersonas - descuentoGrupo) * 0.12;
        totalViaje = subTotalPersonas + impuestoViaje +  costoSeguro;

                //Salidas
        System.out.println("\n\u001B[97m--------------------------------");
        System.out.println("\nUsuario " + nombreCliente + " su presupuesto seria el siguiente:");
        System.out.println("\nReserva a nombre de: " + nombreCliente);
        System.out.println("Documento: " + documentoCliente);
        System.out.println("Correo: " + correoCliente);
        System.out.println("Telefono: " + telefonoCliente);
        System.out.println("\u001B[34mFecha de creación de la cotización: " + fechaFormateada);
        System.out.println("\u001B[97mCantidad de acompañantes: " + numPersonas);
        System.out.println("Destino: " + destinoViaje);
        System.out.println("Beneficios del destino: " + descripcionDestino);
        System.out.println("Costo por persona: $" + decimalFormat.format(precioPersona));
        System.out.println("Costo total por personas: (No esta sujeto a impuestos, descuestos, ni seguros de viaje) " + decimalFormat.format(subTotalPersonas));
        System.out.println("\nEl costo final de su viaje es: " + decimalFormat.format(totalViaje));
    }
}