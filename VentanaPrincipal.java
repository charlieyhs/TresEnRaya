/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteTriki;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author MARTHA
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int [3][3];
    private int casillasEmpate=0;
    private String usuario1,usuario2;
    private int vecesGano1=0,vecesGano2=0,vecesEmpate=0;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1=usuario1;
        this.usuario2=usuario2;
        
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        
        LlenarCasillas();
        llenarMatriz();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton9 = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        BotonArribaIzquierda = new javax.swing.JButton();
        BotonArriba = new javax.swing.JButton();
        BotonArribaDerecha = new javax.swing.JButton();
        BotonCentroIzquierda = new javax.swing.JButton();
        BotonCentro = new javax.swing.JButton();
        BotonCentroDerecha = new javax.swing.JButton();
        BotonAbajoIzquierda = new javax.swing.JButton();
        BotonAbajoCentro = new javax.swing.JButton();
        BotonAbajoDerecha = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        MenuJuego = new javax.swing.JMenu();
        ComenzarNuevo = new javax.swing.JMenuItem();
        MostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new java.awt.GridBagLayout());

        BotonArribaIzquierda.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArribaIzquierdaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonArribaIzquierda, gridBagConstraints);

        BotonArriba.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArribaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonArriba, gridBagConstraints);

        BotonArribaDerecha.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArribaDerechaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonArribaDerecha, gridBagConstraints);

        BotonCentroIzquierda.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonCentroIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCentroIzquierdaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonCentroIzquierda, gridBagConstraints);

        BotonCentro.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCentroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonCentro, gridBagConstraints);

        BotonCentroDerecha.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonCentroDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCentroDerechaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonCentroDerecha, gridBagConstraints);

        BotonAbajoIzquierda.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbajoIzquierdaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonAbajoIzquierda, gridBagConstraints);

        BotonAbajoCentro.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonAbajoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbajoCentroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonAbajoCentro, gridBagConstraints);

        BotonAbajoDerecha.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BotonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbajoDerechaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonAbajoDerecha, gridBagConstraints);

        MenuJuego.setText("Juego");
        MenuJuego.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ComenzarNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComenzarNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Documents\\NetBeansProjects\\TresEnRaya\\src\\main\\java\\Imagenes\\jugar_de_nuevo.png")); // NOI18N
        ComenzarNuevo.setText("Comenzar de nuevo");
        ComenzarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarNuevoActionPerformed(evt);
            }
        });
        MenuJuego.add(ComenzarNuevo);

        MostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MostrarResultados.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Documents\\NetBeansProjects\\TresEnRaya\\src\\main\\java\\Imagenes\\Tabla.png")); // NOI18N
        MostrarResultados.setText("Mostrar tabla de resultados");
        MostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarResultadosActionPerformed(evt);
            }
        });
        MenuJuego.add(MostrarResultados);
        MenuJuego.add(jSeparator1);

        Salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Documents\\NetBeansProjects\\TresEnRaya\\src\\main\\java\\Imagenes\\Salir.png")); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        MenuJuego.add(Salir);

        BarraMenu.add(MenuJuego);

        MenuAyuda.setText("Ayuda");
        MenuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAyudaMouseClicked(evt);
            }
        });
        MenuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAyudaActionPerformed(evt);
            }
        });
        BarraMenu.add(MenuAyuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LlenarCasillas(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    private void dibujarX(JButton boton){
        
        boton.setText("X");
    
    }
    
    private void dibujarO(JButton boton){
        
        boton.setText("O");
    
    }
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void BotonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArribaIzquierdaActionPerformed
        // TODO add your handling code here:
        
        if(casilla[0][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonArribaIzquierda);
                matriz[0][0]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonArribaIzquierda);
                matriz[0][0]=2;
                turno="usuario1";
            }
            casilla[0][0]=false;
            comprobarGanador();
        }
        
    }//GEN-LAST:event_BotonArribaIzquierdaActionPerformed

    private void BotonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArribaActionPerformed
        // TODO add your handling code here:
        if(casilla[0][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonArriba);
                matriz[0][1]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonArriba);
                matriz[0][1]=2;
                turno="usuario1";
            }
            casilla[0][1]=false;
            comprobarGanador();
        }
        
    }//GEN-LAST:event_BotonArribaActionPerformed

    private void BotonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArribaDerechaActionPerformed
        // TODO add your handling code here:
        if(casilla[0][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonArribaDerecha);
                matriz[0][2]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonArribaDerecha);
                matriz[0][2]=2;
                turno="usuario1";
            }
            casilla[0][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_BotonArribaDerechaActionPerformed

    private void BotonCentroIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCentroIzquierdaActionPerformed
        // TODO add your handling code here:
        if(casilla[1][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonCentroIzquierda);
                matriz[1][0]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonCentroIzquierda);
                matriz[1][0]=2;
                turno="usuario1";
            }
            casilla[1][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_BotonCentroIzquierdaActionPerformed

    private void BotonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCentroActionPerformed
        // TODO add your handling code here:
        if(casilla[1][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonCentro);
                matriz[1][1]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonCentro);
                matriz[1][1]=2;
                turno="usuario1";
            }
            casilla[1][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_BotonCentroActionPerformed

    private void BotonCentroDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCentroDerechaActionPerformed
        // TODO add your handling code here:
        if(casilla[1][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonCentroDerecha);
                matriz[1][2]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonCentroDerecha);
                matriz[1][2]=2;
                turno="usuario1";
            }
            casilla[1][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_BotonCentroDerechaActionPerformed

    private void BotonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbajoIzquierdaActionPerformed
        // TODO add your handling code here:
        
        if(casilla[2][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonAbajoIzquierda);
                matriz[2][0]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonAbajoIzquierda);
                matriz[2][0]=2;
                turno="usuario1";
            }
            casilla[2][0]=false;
            comprobarGanador();
        }
        
    }//GEN-LAST:event_BotonAbajoIzquierdaActionPerformed

    private void BotonAbajoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbajoCentroActionPerformed
        // TODO add your handling code here:
        if(casilla[2][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonAbajoCentro);
                matriz[2][1]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonAbajoCentro);
                matriz[2][1]=2;
                turno="usuario1";
            }
            casilla[2][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_BotonAbajoCentroActionPerformed

    private void BotonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbajoDerechaActionPerformed
        // TODO add your handling code here:
        if(casilla[2][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(BotonAbajoDerecha);
                matriz[2][2]=1;
                turno="usuario2";
            }else{
                dibujarO(BotonAbajoDerecha);
                matriz[2][2]=2;
                turno="usuario1";
            }
            casilla[2][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_BotonAbajoDerechaActionPerformed

    private void MostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarResultadosActionPerformed
        // TODO add your handling code here:
        
        MostrarResultados ventanaMR = new MostrarResultados(this,true,usuario1,usuario2,vecesGano1,vecesGano2,vecesEmpate);
        
        ventanaMR.setVisible(true);
        
    }//GEN-LAST:event_MostrarResultadosActionPerformed

    private void ComenzarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarNuevoActionPerformed
        // TODO add your handling code here:
        
        vecesGano1=0;
        vecesGano2=0;
        vecesEmpate=0;
        
        reiniciarJuego();
        
    }//GEN-LAST:event_ComenzarNuevoActionPerformed

    private void MenuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAyudaActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_MenuAyudaActionPerformed

    private void MenuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAyudaMouseClicked
        try {
            try {
                // TODO add your handling code here:

                Desktop.getDesktop().browse(new URI("https://www.mundodeportivo.com/uncomo/ocio/articulo/como-jugar-al-tres-en-raya-2442.html"));
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_MenuAyudaMouseClicked

    private void comprobarGanador(){
        
        boolean ganador1 = false;
        boolean ganador2 = false;
        
        //comprobamos si el ganador es el usuario1
        ganador1 = comprobar(1);
        //comprobamos si el ganador es el usuario2
        ganador2 = comprobar(2);
        
        if(ganador1==true){
            
            vecesGano1++;
            VentanaGanador ventanaG = new VentanaGanador(this,true,usuario1);
            ventanaG.setVisible(true);
            reiniciarJuego();
            
        }else if(ganador2==true){
            vecesGano2++;
            VentanaGanador ventanaG = new VentanaGanador(this,true,usuario2);
            ventanaG.setVisible(true);
            reiniciarJuego();
        }
        else{
            for(int i=0;i<3;i++){//tal vez el tablero este lleno, hay empate
                for(int j=0;j<3;j++){
                    if(matriz[i][j]!=0){//puede haber un numero 1 o 2
                        
                        casillasEmpate++;
                    }
                }
            }
            
           if(casillasEmpate==9){
               vecesEmpate++;
               VentanaEmpate ventanaE = new VentanaEmpate(this,true);
               ventanaE.setVisible(true);
               reiniciarJuego();
           } else{
               casillasEmpate=0;
           }
        }
    }
    
    private boolean comprobar(int num){
        boolean ganador = false;
        
        if(matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
            ganador = true;
        }
        else if(matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
            ganador = true;
        }
        else if(matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        else if(matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
            ganador = true;
        }
        else if(matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
            ganador = true;
        }
        else if(matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
            ganador = true;
        }
        else if(matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        else if(matriz[0][2]==num && matriz[1][1]==num && matriz[2][0]==num){
            ganador = true;
        }
        return ganador;
    }
    
    private void reiniciarJuego(){
        LlenarCasillas();
        llenarMatriz();
        
        BotonArribaIzquierda.setText(null);
        BotonArriba.setText(null);
        BotonArribaDerecha.setText(null);
        BotonCentroIzquierda.setText(null);
        BotonCentro.setText(null);
        BotonCentroDerecha.setText(null);
        BotonAbajoIzquierda.setText(null);
        BotonAbajoCentro.setText(null);
        BotonAbajoDerecha.setText(null);
        
        //Preguntar a usuario que va a jugar primero
        
        quienJuegaPrimero();        
    }
    
    private void quienJuegaPrimero(){
        
        VentanaEscogerTurno ventanaEt = new VentanaEscogerTurno(this,true,usuario1,usuario2);
        
        ventanaEt.setVisible(true);
        turno=ventanaEt.getTurno();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BotonAbajoCentro;
    private javax.swing.JButton BotonAbajoDerecha;
    private javax.swing.JButton BotonAbajoIzquierda;
    private javax.swing.JButton BotonArriba;
    private javax.swing.JButton BotonArribaDerecha;
    private javax.swing.JButton BotonArribaIzquierda;
    private javax.swing.JButton BotonCentro;
    private javax.swing.JButton BotonCentroDerecha;
    private javax.swing.JButton BotonCentroIzquierda;
    private javax.swing.JMenuItem ComenzarNuevo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuJuego;
    private javax.swing.JMenuItem MostrarResultados;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton jButton9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
