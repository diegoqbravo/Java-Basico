
package cbank;

public class cRegistro {
    
    //atributos
    private cAlumno objCliente[];
    private int contador;
    //constructor
    public cRegistro(int n) {
        objCliente=new cAlumno[n];
        //
        objCliente[0]=new cAlumno();
        objCliente[0].setCodigo(6);
        objCliente[0].setNombres("CARLOS");
        objCliente[0].setRut(181118066);
        objCliente[0].setFondo(3000.0);
        objCliente[0].setEstado(1);
        objCliente[1]=new cAlumno();
        objCliente[1].setCodigo(6);
        objCliente[1].setNombres("CARLOS");
        objCliente[1].setRut(181118066);
        objCliente[1].setFondo(3000.0);
        objCliente[1].setEstado(2);
        contador=2;
    }
    //operaciones
    public void agregar_cliente(int codigo,String nombres,int rut,Double fondo,int estado){
        int flag=0;
        for(int i=0;i<contador;i++){
            if(codigo==objCliente[i].getCodigo()){
                flag=1;
            }
        }
        if(flag==0){
            if(contador<objCliente.length){
                objCliente[contador]=new cAlumno();
                objCliente[contador].setCodigo(codigo);
                objCliente[contador].setNombres(nombres);
                objCliente[contador].setRut(rut);
                objCliente[contador].setFondo(fondo);
                objCliente[contador].setEstado(estado);
                contador++;
            }
            else{
                System.out.println("NO SE PUEDE AGREGAR cliente...VECTOR LLENO!!!");
            }
        }
        else{
            System.out.println("EL CODIGO INGRESADO ES REPETIDO...!!!");
        }
    }
    public String listar_clientes(){
        String lista="LISTA DE clienteS\n";
        for(int i=0;i<contador;i++){
            lista+=(i+1)+".-"+"\t"+objCliente[i].getCodigo()+"\t"+objCliente[i].getNombres()+"\t"+objCliente[i].calcular_promedio()+"\n";
        }
        return lista;
    }
    public void buscar_cliente(int codigo)
    {
        int posicion=-1;
        for(int i=0;i<contador;i++){
            if(codigo==objCliente[i].getCodigo())
                posicion=i;
        }
        if(posicion!=-1){
            System.out.println("EL cliente DE CODIGO: "+codigo+" ES "+ objCliente[posicion].getNombres());
        }
        else{
            System.out.println("EL cliente DE CODIGO: "+codigo+" NO EXISTE");
        }
    }
    public void buscar_cliente(String nombres){
        int posicion=-1;
        for(int i=0;i<contador;i++){
            if(nombres.equals(objCliente[i].getNombres()))
                posicion=i;
        }
        if(posicion!=-1){
            System.out.println("EL cliente DE NOMBRE: "+nombres+" TIENE EL CODIGO "+objCliente[posicion].getCodigo());
        }
        else{
            System.out.println("EL cliente DE NOMBRE: "+nombres+" NO EXISTE");
        }
    }
    public void ordenar_codigo(){
        for (int i=0; i<contador-1; i++){
            for (int j=i+1;j<contador; j++){
                if(objCliente[i].getCodigo() > objCliente[j].getCodigo()){
                    cAlumno temp=objCliente[i];
                    objCliente[i]=objCliente[j];
                    objCliente[j]=temp;
                }
            }
        }
    }
    public void ordenar_nombres(){
        for (int i=0; i<contador-1; i++){
            for (int j=i+1; j<contador; j++){
                if(objCliente[i].getNombres().compareTo(objCliente[j].getNombres())>1){
                    cAlumno temp=objCliente[i];
                    objCliente[i]=objCliente[j];
                    objCliente[j]=temp;
                }
            }
        }
    }
   public int encontrar_cliente(int codigo)
    {
        int posicion=-1;
        for(int i=0;i<contador;i++){
            if(codigo == objCliente[i].getCodigo()){
                posicion=i;
            }
        }
        return posicion;
    }
    public void eliminar_cliente(int codigo){
        int index;
        index=encontrar_cliente(codigo);
        if(index==-1){
            System.out.println("EL cliente DE CODIGO: "+codigo+" NO EXISTE");
        }
        else{
            for(int i=index;i<contador;i++){
                objCliente[i]=objCliente[i+1];
            }
            contador--;
        }
    }
    public String listar_aprobados(){
        String lista="LISTA DE cliente APROBADOS\n";
        for(int i=0;i<contador;i++){
            if(2000.0<=objCliente[i].calcular_promedio()){
                lista+=(i+1)+".-"+"\t"+objCliente[i].getCodigo()+"\t"+objCliente[i].getNombres()+"\t"+objCliente[i].calcular_promedio()+"\n";
            }
        }
        return lista;
    }
}