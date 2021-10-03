import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

            System.out.println("****************************************************EMPRESA INFORDATA****************************************************");

            //EMPRESAS
            InforData inforData = new InforData("mxt","america",12345678,10,1293);
            //System.out.println(inforData);
            //System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            //PROVEEDORES
            Proveedores BussinesTadeito = new Proveedores("Tadeo","La paz",6536782,2,6576, Calendar.getInstance().getTime(),12,"Monitores");
            //System.out.println(BussinesTadeito);
           // System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            //CATALOGO
            Catalogos cat1= new Catalogos(10, "monitor", "AX", 100, 123, 1000, 100, "1080p") {
                @Override
                public void estado() {

                }
            };

            //System.out.println(cat1);
            //System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            //CLIENTES
            Cliente cliente1=new Cliente("chino","arocagua",7456321,Calendar.getInstance().getTime(),1200,12,"monitor",666);
            //System.out.println(cliente1);
            //System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");        //SOPORTE
            Soporte soporte1=new Soporte("chino",Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"se cayo al agua","monitor",666);
            //System.out.println(soporte1);
            //System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");




              /*  Proveedores infordata = (Catalogos) cat1;
               // System.out.println(infordata);
                InforData inf =(Proveedores)BussinesTadeito;
               // System.out.println(inf);
                InforData inf1 =(Cliente)cliente1;
               // System.out.println(inf1);
                InforData inf2 = (Soporte)soporte1;
               // System.out.println(inf2);

                InforData[] inf4 = new InforData[3];
                inf4[0]= infordata;
                inf4[1]= inf;
                inf4[2]=inf1;

            for (int i = 0; i < inf4.length; i++) {
                System.out.println(inf4[i]);

            }*/


        cat1.reset();
        cliente1.estado();


    }


}
