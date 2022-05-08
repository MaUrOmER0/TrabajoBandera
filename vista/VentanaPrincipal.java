package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
    //--------
    //Atributos
    //--------
    public PanelAmarillo miPanelAmarillo;
    public PanelAzul miPanelAzul;
    public PanelRojo miPanelRojo;
    //--------
    //Metodos
    //--------


    /*Metodo constructor*/
    public VentanaPrincipal(){
        //Contenedor de la ventana
        this.setLayout(null);

        //Crear y agregar el PanelAmarillo
        miPanelAmarillo = new PanelAmarillo();
        miPanelAmarillo.setBounds(20,20,460,200);
        this.add(miPanelAmarillo);
        
        
        //Crear y agregar el PanelOpearaciones
        miPanelAzul = new PanelAzul();
        miPanelAzul.setBounds(20,200,460,100);
        this.add(miPanelAzul);

        //Crear y agregar el PanelResultados
        miPanelRojo = new PanelRojo();
        miPanelRojo.setBounds(20,300,460,100);
        this.add(miPanelRojo);



        //Caracteristicas de la ventana
        this.setTitle("Bandera de Colombia");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}