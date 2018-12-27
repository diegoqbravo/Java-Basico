package cbank;
import java.util.Scanner;

public class CBank {

static cRegistro objRegistro=new cRegistro(10);
    public static void ingreso_cliente(){
        Scanner br=new Scanner (System.in);
        int codigo,rut,estado;
        String nombres;
        double fondo;
        System.out.print("INGRESE UN CODIGO:");
        codigo=br.nextInt();
        System.out.print("INGRESE UN NOMBRE:");
        nombres=br.next();
        System.out.print("INGRESE RUT:");
        rut=br.nextInt();
        System.out.print("INGRESE FONDO:");
        fondo=br.nextDouble();
        System.out.print("INGRESE ESTADO:");
        estado=br.nextInt();

        objRegistro.agregar_cliente(codigo, nombres, rut, fondo, estado);
    }
    public static void mostrar_clientes(){
        System.out.println(objRegistro.listar_clientes());
    }
     public static void busca_cliente_codigo(){
         Scanner br=new Scanner (System.in);
         int cod;
         System.out.print("INGRESE CODIGO DEL CLIENTE BUSCAR: ");
         cod=br.nextInt();
         objRegistro.buscar_cliente(cod);
     }
     public static void busca_cliente_nombre(){
         Scanner br=new Scanner (System.in);
         String nomb;
         System.out.print("INGRESE NOMBRE DEL CLIENTE: ");
         nomb=br.next();
         objRegistro.buscar_cliente(nomb);
     }
     public static void ordenar_cliente_codigo() {
        objRegistro.ordenar_codigo();
    }
    public static void ordenar_cliente_nombre() {
        objRegistro.ordenar_nombres();
    }
       public static void eliminar_cliente() {
        int cod;
        Scanner br=new Scanner (System.in);
        System.out.print("INGRESE CODIGO DEL CLIENTE: ");
        cod=br.nextInt();
        objRegistro.eliminar_cliente(cod);
    }
    public static void mostrar_aprobados(){
        System.out.println(objRegistro.listar_aprobados());
    }
    public static void main(String[] args){
Scanner br=new Scanner (System.in);
        int opcion;
        do{
            System.out.println("MENU DE OPCIONES:");
            System.out.println("1. INGRESAR CLIENTES");
            System.out.println("2. MOSTRAR CLIENTES");
            System.out.println("3. BUSCAR CLIENTE POR CODIGO ");
            System.out.println("4. ELIMINAR CLIENTES");
            System.out.println("5. MOSTRAR CLIENTES APROBADOS");
            System.out.println("6. SALIR");

            do{
                System.out.print("INGRESE UNA OPCION [1-6]:");
                opcion=br.nextInt();
            }while(opcion<1||opcion>10);
            switch(opcion){
                case 1:
                    ingreso_cliente();
                    break;
                case 2:
                    mostrar_clientes();
                    break;
                case 3:
                    busca_cliente_codigo();
                    break;
                case 4:
                    eliminar_cliente();
                    break;
                case 5:
                    mostrar_aprobados();
                    break;
                case 6:
                    System.exit(0);
            }
        }while(opcion!=6);
    }
}

      




    