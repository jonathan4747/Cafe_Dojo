public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve ";
        String mensajeListo = ", tu pedido está listo.";
        String mensajeMostrarTotal = " Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioFiltro = 2.5;
        double precioCafeLeche=4;
        double precioCapuchino= 5.5;
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";

    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;

    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1 + mensajePendiente + mensajeListo + estaListoOrden1 ); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //

        if (estaListoOrden4 == true){
            System.out.println(saludoGeneral + cliente4 + mensajePendiente + mensajeListo + mensajeMostrarTotal + precioCapuchino);
        }
        else{
            System.out.println(saludoGeneral + cliente4 + mensajePendiente + ", tu pedido no esta listo todavía");
        }

        double precioTotal= precioCafeLeche + precioCafeLeche;
        System.out.println(saludoGeneral + cliente2 + mensajeMostrarTotal + precioTotal);

        if (estaListoOrden2 == true){
            System.out.println(saludoGeneral + cliente2 + mensajePendiente + mensajeListo);
        }

        else{
            System.out.println(saludoGeneral + cliente2 + mensajePendiente + ", tu pedido no esta listo todavía");
        }

        double diferencia= precioCafeLeche - precioFiltro;
        System.out.println(saludoGeneral + cliente3 + ", la diferencia que debes abonar es: $"+diferencia);


    }
}