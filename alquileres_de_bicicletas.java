import java.util.Scanner;
public class alquileres_de_bicicletas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] clientes = new String[10];
        String[] tiposBicicleta = new String[10];
        String[] codigosBicicleta = new String[10];
        String[] fechas = new String[10];
        String[] horasInicio = new String[10];
        double[] horasAlquiler = new double[10];
        double[] tarifasHora = new double[10];
        double[] costosTotales = new double[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_alquiler_de_bicicletas|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal alquiler de bicicletas");
            System.out.println("1) Registrar alquiler");
            System.out.println("2) Editar alquiler");
            System.out.println("3) Listar alquileres");
            System.out.println("4) Buscar alquiler");
            System.out.println("5) Eliminar alquiler");
            System.out.println("6) Mostrar resumen de alquileres");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_alquiler|--//
                //------------------------//
                case 1:
                    if (total >= clientes.length) {
                        System.out.println("No hay espacio para registrar mas alquileres.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de alquiler");
                    System.out.println("id del alquiler a registrar: " + id);
                    System.out.print("nombre del cliente: ");
                    clientes[total] = entrada.nextLine();
                    System.out.print("tipo de bicicleta: ");
                    tiposBicicleta[total] = entrada.nextLine();
                    System.out.print("codigo de bicicleta: ");
                    codigosBicicleta[total] = entrada.nextLine();
                    System.out.print("fecha del alquiler: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("hora de inicio: ");
                    horasInicio[total] = entrada.nextLine();
                    System.out.print("horas de alquiler: ");
                    horasAlquiler[total] = entrada.nextDouble();
                    System.out.print("tarifa por hora: ");
                    tarifasHora[total] = entrada.nextDouble();
                    costosTotales[total] = horasAlquiler[total] * tarifasHora[total];
                    entrada.nextLine();
                    System.out.print("estado del alquiler: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Alquiler registrado correctamente.");
                    System.out.println("Costo total: " + costosTotales[total]);
                    total++;
                    break;
                //---------------------//
                //--|editar_alquiler|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen alquileres registrados.");
                        break;
                    }
                    System.out.println("Datos de los alquileres");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cliente: " + clientes[i] + " | Bicicleta: " + tiposBicicleta[i] + " | Codigo: " + codigosBicicleta[i] + " | Fecha: " + fechas[i] + " | Hora inicio: " + horasInicio[i] + " | Horas: " + horasAlquiler[i] + " | Tarifa hora: " + tarifasHora[i] + " | Costo total: " + costosTotales[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del alquiler: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del alquiler");
                        System.out.print("Nuevo nombre del cliente: ");
                        clientes[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de bicicleta: ");
                        tiposBicicleta[posicion] = entrada.nextLine();
                        System.out.print("Nuevo codigo de bicicleta: ");
                        codigosBicicleta[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha del alquiler: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de inicio: ");
                        horasInicio[posicion] = entrada.nextLine();
                        System.out.print("Nuevas horas de alquiler: ");
                        horasAlquiler[posicion] = entrada.nextDouble();
                        System.out.print("Nueva tarifa por hora: ");
                        tarifasHora[posicion] = entrada.nextDouble();
                        costosTotales[posicion] = horasAlquiler[posicion] * tarifasHora[posicion];
                        entrada.nextLine();
                        System.out.print("Nuevo estado del alquiler: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Alquiler actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|listar_alquileres|--//
                //-----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen alquileres registrados.");
                    } else {
                        System.out.println("Lista de alquileres");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Cliente: " + clientes[i] + " | Bicicleta: " + tiposBicicleta[i] + " | Codigo: " + codigosBicicleta[i] + " | Fecha: " + fechas[i] + " | Hora inicio: " + horasInicio[i] + " | Horas: " + horasAlquiler[i] + " | Tarifa hora: " + tarifasHora[i] + " | Costo total: " + costosTotales[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_alquiler|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen alquileres registrados.");
                        break;
                    }
                    System.out.println("busqueda de alquiler");
                    System.out.print("ingresa la id para buscar alquiler: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del alquiler encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Cliente: " + clientes[posicion] + " | Bicicleta: " + tiposBicicleta[posicion] + " | Codigo: " + codigosBicicleta[posicion] + " | Fecha: " + fechas[posicion] + " | Hora inicio: " + horasInicio[posicion] + " | Horas: " + horasAlquiler[posicion] + " | Tarifa hora: " + tarifasHora[posicion] + " | Costo total: " + costosTotales[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_alquiler|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen alquileres registrados.");
                        break;
                    }
                    System.out.println("Datos de los alquileres");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cliente: " + clientes[i] + " | Bicicleta: " + tiposBicicleta[i] + " | Codigo: " + codigosBicicleta[i] + " | Fecha: " + fechas[i] + " | Hora inicio: " + horasInicio[i] + " | Horas: " + horasAlquiler[i] + " | Tarifa hora: " + tarifasHora[i] + " | Costo total: " + costosTotales[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del alquiler a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            clientes[i] = clientes[i + 1];
                            tiposBicicleta[i] = tiposBicicleta[i + 1];
                            codigosBicicleta[i] = codigosBicicleta[i + 1];
                            fechas[i] = fechas[i + 1];
                            horasInicio[i] = horasInicio[i + 1];
                            horasAlquiler[i] = horasAlquiler[i + 1];
                            tarifasHora[i] = tarifasHora[i + 1];
                            costosTotales[i] = costosTotales[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Alquiler eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------------------//
                //--|mostrar_resumen_alquileres|--//
                //--------------------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen alquileres registrados.");
                        break;
                    }
                    double horasTotales = 0;
                    double ingresosTotales = 0;
                    double mayorDuracion = horasAlquiler[0];
                    int posicionMayor = 0;
                    int activos = 0;
                    int finalizados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        horasTotales += horasAlquiler[i];
                        ingresosTotales += costosTotales[i];
                        if (horasAlquiler[i] > mayorDuracion) {
                            mayorDuracion = horasAlquiler[i];
                            posicionMayor = i;
                        }
                        if (estados[i].equalsIgnoreCase("Activo")) {
                            activos++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    double promedioHoras = horasTotales / total;
                    String bicicletaMayor = tiposBicicleta[0];
                    int cantidadBicicletaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadBicicleta = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposBicicleta[i].equalsIgnoreCase(tiposBicicleta[j])) {
                                cantidadBicicleta++;
                            }
                        }
                        if (cantidadBicicleta > cantidadBicicletaMayor) {
                            cantidadBicicletaMayor = cantidadBicicleta;
                            bicicletaMayor = tiposBicicleta[i];
                        }
                    }
                    System.out.println("resumen de alquileres");
                    System.out.println("Alquileres registrados: " + total);
                    System.out.println("Horas alquiladas: " + horasTotales);
                    System.out.println("Ingresos totales: " + ingresosTotales);
                    System.out.println("Promedio de horas: " + promedioHoras);
                    System.out.println("Mayor duracion: " + clientes[posicionMayor] + " - " + mayorDuracion + " horas");
                    System.out.println("Tipo mas alquilado: " + bicicletaMayor);
                    System.out.println("Activos: " + activos);
                    System.out.println("Finalizados: " + finalizados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //--------------------------------//
                //--|salir_del_menu_principal|----//
                //--------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Alquiler de Bicicletas.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}