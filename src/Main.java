import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        System.out.println("****************************************************EMPRESA INFORDATA****************************************************");

        //EMPRESAS
        InforData inforData = new InforData("mxt","america",12345678,10,1293);
        System.out.println(inforData);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //PROVEEDORES
        Proveedores BussinesTadeito = new Proveedores("Tadeo","La paz",6536782,2,6576, Calendar.getInstance().getTime(),12,"Monitores");
        System.out.println(BussinesTadeito);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //CATALOGO
        Catalogos cat1= new Catalogos(10,"monitor","AX",100,123,1000,100,"1080p");
        System.out.println(cat1);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //CLIENTES
        Cliente cliente1=new Cliente("chino","arocagua",7456321,Calendar.getInstance().getTime(),1200,12,"monitor",666);
        System.out.println(cliente1);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");        //SOPORTE
        Soporte soporte1=new Soporte("chino",Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"se cayo al agua","monitor",666);
        System.out.println(soporte1);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");



    }


}
