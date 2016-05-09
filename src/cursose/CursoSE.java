/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursose;

//import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import java.util.GregorianCalendar;

/**
 *
 * @author hikaru
 */
public class CursoSE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        JFrame ventana = new JFrame("Mi primera ventana swing");
        JPanel panel = new JPanel();
        JButton btnSaludar = new JButton("Ingresar");
        JButton btnSalir = new JButton("Salir");
        
        ventana.setSize(300, 200);
        ventana.setVisible(true);
        
        panel.add(btnSaludar);
        panel.add(btnSalir);
        
        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        btnSaludar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola mito code");
            }
        
        });
        
        btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispatchEvent(new WindowEvent(ventana, WindowEvent.WINDOW_CLOSING));
            }
        });
        
        /* Patron DAO    
//        Persona per = new Persona();
//        per.setId(1);
//        per.setNombre("Aldo Alfaro");
        
        try {
            PersonaDAO dao = new PersonaDaoImpl();
            for (Persona p : dao.listar()) {
                System.out.println(p.getNombre());
            }
//            dao.eliminar(per);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } */
             
        /* Excepcion personalizadas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();
        final int EDAD_MAX = 100;
        try {
            if (edad<=EDAD_MAX) {
                System.out.println("Bienvenido");
            }else{
                throw new EdadExcepcion("Edad no permitida");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        */
        
        /* Manejo de excepciones
        try {
            CursoSE ce = new CursoSE();
            ce.proceso();
        } catch (Exception e) {
            System.out.println("Error --> "+e.getMessage());
        }finally{
            System.out.println("Proceso finalizado");
        }*/
        
        /*HashSet agreagar una lista con orden impredesible y sin repetir datos
        Set<String> lista = new HashSet<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        for (String dato : lista) {
            System.out.println(dato);
        } */
        
        /* HashMap
        Map diccionario = new HashMap();
        
        diccionario.put("user", "hikaru");    
        diccionario.put("youtube", "www.youtube.com");    
        diccionario.put("facebook", "www.facebook.com");    
        
        String contenido = diccionario.get("user").toString();
        boolean respuesta = diccionario.containsKey("user");
        
        
        System.out.println(contenido);
        System.out.println(respuesta); */
        
        /* // LinkedList es mejor en .add() y .delete()
        //Mientras que ArrayList es mejor en get()
        
        List<Integer> lista = new LinkedList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        
        System.out.println(lista.get(lista.size()-1));
        */
        
 /*
        // Colecciones + Iterator
        
        Persona per1 = new Persona();
        per1.setNombre("Hikaru");
        per1.setMonto(1000);
        per1.setCuenta(1);
        
        Persona per2 = new Persona();
        per2.setNombre("Aldo");
        per2.setMonto(2000);
        per2.setCuenta(2);
        
        Persona per3 = new Persona();
        per3.setNombre("Sharmely");
        per3.setMonto(3000);
        per3.setCuenta(3);
        
        List<Persona> lista = new ArrayList<>();
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        
//        for (Persona persona : lista) {
//            System.out.println(persona.getNombre());
//        }
        
//        Iterator<Persona> iterator = lista.iterator();
//        while (iterator.hasNext()) {            
//            System.out.println(iterator.next().getNombre());
//        } */
     /*     
        StringBuilder texto = new StringBuilder();
        texto.append("Hola").append(" hikaru").append(" vas aprendiendo muy bien");
        System.out.println(texto);
    */
        
/*   
//    Caso aplicativo : banco 3 clientes depositos y retiros
//    Al final del dia que calcule
        
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Banco XYZ--------");
        System.out.println("Por favor ingrese numero de cueta:");
        int cuenta = sc.nextInt();
        String operacion = ""; 
        
        switch(cuenta){
            case 1:
                System.out.println("Bienvenido "+banco.getPer1().getNombre());
                System.out.println("Ingrese la opercaion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch(operacion){
                    case "A":
                        System.out.println("----------------");
                        System.out.println("Ingrese al monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        double montoanterior = banco.getPer1().getMonto();
                        banco.getPer1().setMonto(montoanterior+montoDeposito);
                        System.out.println("El monto final es "+banco.getPer1().getMonto());
                        break;
                    case "B":
                        System.out.println("----------------");
                        System.out.println("Ingrese al monto a retirar");
                        double montoRetiro = sc.nextDouble();
                        double montoRetiroAnterior = banco.getPer1().getMonto();
                        banco.getPer1().setMonto(montoRetiroAnterior - montoRetiro);
                        System.out.println("El monto final es "+banco.getPer1().getMonto());
                        break;
                    default:
                        System.out.println("Operacion no valida!");
                        System.exit(0);                        
                }
                break;
            case 2:
                System.out.println("Bienvenido "+banco.getPer2().getNombre());
                System.out.println("Ingrese la opercaion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch(operacion){
                    case "A":
                        System.out.println("----------------");
                        System.out.println("Ingrese al monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        double montoanterior = banco.getPer2().getMonto();
                        banco.getPer2().setMonto(montoanterior+montoDeposito);
                        System.out.println("El monto final es "+banco.getPer2().getMonto());
                        break;
                    case "B":
                        System.out.println("----------------");
                        System.out.println("Ingrese al monto a retirar");
                        double montoRetiro = sc.nextDouble();
                        double montoRetiroAnterior = banco.getPer2().getMonto();
                        banco.getPer2().setMonto(montoRetiroAnterior - montoRetiro);
                        System.out.println("El monto final es "+banco.getPer2().getMonto());
                        break;
                    default:
                        System.out.println("Operacion no valida!");
                        System.exit(0);                        
                }
                break;
            case 3:
                System.out.println("Bienvenido "+banco.getPer3().getNombre());
                System.out.println("Ingrese la opercaion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch(operacion){
                    case "A":
                        System.out.println("----------------");
                        System.out.println("Ingrese al monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        double montoanterior = banco.getPer3().getMonto();
                        banco.getPer3().setMonto(montoanterior+montoDeposito);
                        System.out.println("El monto final es "+banco.getPer3().getMonto());
                        break;
                    case "B":
                        System.out.println("----------------");
                        System.out.println("Ingrese al monto a retirar");
                        double montoRetiro = sc.nextDouble();
                        double montoRetiroAnterior = banco.getPer3().getMonto();
                        banco.getPer3().setMonto(montoRetiroAnterior - montoRetiro);
                        System.out.println("El monto final es "+banco.getPer3().getMonto());
                        break;
                    default:
                        System.out.println("Operacion no valida!");
                        System.exit(0);                        
                }
                break;
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);
        }
        System.out.println("El monto al final del dia es");
        System.out.println(banco.getPer1().getMonto()+banco.getPer2().getMonto()+banco.getPer3().getMonto());
*/              
        
        
//        Perro pe = new Perro();
//        
//        pe.tipoDeAnimal();   
//        pe.mostrarVida();
//        System.out.println(pe.nombreAnimal());
        
        
//        Calendar mes = new GregorianCalendar(2016, Calendar.DECEMBER, 23);
//        Calendar cal = Calendar.getInstance();
//        int anio = cal.get(Calendar.YEAR);
//        int mess = mes.get(Calendar.MONTH);
//        
//        System.out.println(anio);
//        System.out.println(mess);
        
        
        
        
//        Celular ce= new Celular();
//        
//        ce.setNombre("Wawei");
//        ce.setColor("Azul");
//        
//        ce.Mostrar();
    }
    
}
