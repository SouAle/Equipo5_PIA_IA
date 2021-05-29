/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author ASUS
 */
public class Solucion extends javax.swing.JFrame {

    ArrayList<JSpinner> heuristicos = new ArrayList();
    Map<String, Float> heuristica = new TreeMap<>();
    Grafo grafo = EdicionGrafo.auxiliar;
    boolean algoritmo = EdicionGrafo.algoritmo_informado;

    /**
     * Creates new form Solucion
     */
    public Solucion() {
        initComponents();
        hPanel.setVisible(false);
        hText.setVisible(false);
        Volver.setVisible(false);
        if(algoritmo){
        resolver.setVisible(false);
        }else{
            resolver.setAlignmentX(Aceptar.getAlignmentX());
            resolver.setAlignmentY(Aceptar.getAlignmentY());
            Aceptar.setVisible(false);
        }
        this.setSize(this.getWidth(), 300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nodoText = new javax.swing.JLabel();
        nodosPanel = new javax.swing.JPanel();
        metaText = new javax.swing.JLabel();
        nodoMeta = new javax.swing.JSpinner();
        inicialText = new javax.swing.JLabel();
        nodoInicial = new javax.swing.JSpinner();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hPanel = new javax.swing.JScrollPane();
        heuristicaPanel = new javax.swing.JPanel();
        hText = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        resolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nodoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nodoText.setText("Nodos");

        nodosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));

        metaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        metaText.setText("Nodo meta:");

        nodoMeta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nodoMeta.setModel(new javax.swing.SpinnerNumberModel());

        inicialText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inicialText.setText("Nodo inicial:");

        nodoInicial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nodoInicial.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout nodosPanelLayout = new javax.swing.GroupLayout(nodosPanel);
        nodosPanel.setLayout(nodosPanelLayout);
        nodosPanelLayout.setHorizontalGroup(
            nodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodosPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(nodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(metaText)
                    .addComponent(inicialText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nodoInicial)
                    .addComponent(nodoMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        nodosPanelLayout.setVerticalGroup(
            nodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicialText)
                    .addComponent(nodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metaText)
                    .addComponent(nodoMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de Entrada");

        hPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));

        heuristicaPanel.setLayout(new java.awt.GridBagLayout());
        hPanel.setViewportView(heuristicaPanel);

        hText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hText.setText("Heuristica");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        resolver.setText("Resolver");
        resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nodosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hPanel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nodoText)
                                    .addComponent(hText))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(Aceptar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(Volver)
                                .addGap(32, 32, 32)
                                .addComponent(resolver)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nodoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nodosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(resolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        nodosPanel.setVisible(false);
        nodoText.setVisible(false);
        
        
        if(algoritmo){
        Aceptar.setVisible(false);
        hPanel.setVisible(true);
        hText.setVisible(true);
        Volver.setVisible(true);
        resolver.setVisible(true);
        }

        GridBagLayout modeloL = new GridBagLayout();
        GridBagConstraints espacio = new GridBagConstraints();
        heuristicaPanel.removeAll();
        heuristicaPanel.setLayout(modeloL);

        heuristicos = new ArrayList<>();
        int x = 0, y = 0;
        for (Nodo nodo : grafo.getNodos()) {
            JLabel num = new JLabel("h(" + String.valueOf(nodo.getNum()) + ") = ");
            espacio.gridx = x;
            espacio.gridy = y;
            espacio.gridwidth = 1;
            espacio.gridheight = 1;
            heuristicaPanel.add(num, espacio);
            JSpinner h = new JSpinner();
            Dimension dim = new Dimension(60, 20);
            h.setPreferredSize(dim);
            SpinnerNumberModel modeloS = new SpinnerNumberModel(0.0, 0, Float.POSITIVE_INFINITY, 1.0);
            h.setModel(modeloS);
            h.setEditor(new JSpinner.NumberEditor(h, "##.####################"));
            x += 1;
            espacio.gridx = x;
            espacio.gridy = y;
            if (String.valueOf(nodo.getNum()).equals(nodoMeta.getValue().toString())) {
                h.setEnabled(false);
            }
            h.setName(String.valueOf(nodo.getNum()));
            heuristicos.add(h);
            heuristicaPanel.add(h, espacio);
            heuristicaPanel.updateUI();
            x = 0;
            y += 1;
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        nodosPanel.setVisible(true);
        nodoText.setVisible(true);
        Aceptar.setVisible(true);

        hPanel.setVisible(false);
        hText.setVisible(false);
        Volver.setVisible(false);
        resolver.setVisible(false);

        //heuristicaPanel.removeAll();
    }//GEN-LAST:event_VolverActionPerformed

    private void resolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolverActionPerformed
        Nodo inicial, meta;
        inicial = obtenerNodo(Integer.parseInt(nodoInicial.getValue().toString()));
        meta = obtenerNodo(Integer.parseInt(nodoMeta.getValue().toString()));
        if (algoritmo) {
            algoritmoA(nodoInicial.getValue().toString(), nodoMeta.getValue().toString());
        } else {
            var solution = new UniformCost().search(inicial, meta);
            printSolution(solution);
        }
        EdicionGrafo.ver.setVisible(true);
        dispose();
    }//GEN-LAST:event_resolverActionPerformed

    public void algoritmoA(String inicial, String meta) {
        StyledDocument documento = EdicionGrafo.resultado.getStyledDocument();
        Style estilo = EdicionGrafo.resultado.addStyle("Estilo", null);

        obtenerHeuristica();
        //String inicial = JOptionPane.showInputDialog("Nodo Inicial: ");
        //String meta = JOptionPane.showInputDialog("Nodo Meta: ");

        float costo_acumulado = 0;
        int pos;
        int bandera;

        String nodo_actual = inicial;

        ArrayList<Nodo> nodos = grafo.getNodos();
        ArrayList<String> nodos_visitados = new ArrayList<>();
        ArrayList<String> recorrido = new ArrayList<>();

        //Busqueda
        while (!nodo_actual.equals(meta)) {
            Map<String, Float> hijos = new TreeMap<>();
            System.out.println("Nodo actual: " + nodo_actual);
            nodos_visitados.add(nodo_actual);
            recorrido.add(nodo_actual);
            bandera = 0;
            //calculamos el costo del nodo actual, hacia sus hijos
            for (int i = 0; i < nodos.size(); i++) {

                if (nodo_actual.equals(String.valueOf(nodos.get(i).getNum()))) {
                    Iterator it = nodos.get(i).getAdyacentes().keySet().iterator();
                    while (it.hasNext()) {
                        //nombre del nodo adyacente
                        float cant_hijos;
                        String key = it.next().toString();
                        if (nodos_visitados.contains(key) == false) {
                            cant_hijos = costo_acumulado + nodos.get(i).getAdyacentes().get(key) + heuristica.get(key);
                            hijos.put(key, cant_hijos);
                        }
                    }
                }
            }
            if (hijos.isEmpty()) {
                nodo_actual = inicial;
                costo_acumulado = 0;
                recorrido = new ArrayList<>();
                recorrido.add(nodo_actual);
            } else {
                Iterator c = hijos.keySet().iterator();
                String auxKey = c.next().toString();
                float auxCost = hijos.get(auxKey);
                Iterator b = hijos.keySet().iterator();
                while (b.hasNext()) {
                    String key = b.next().toString();
                    if (hijos.get(key) <= auxCost) {
                        auxKey = "";
                        auxKey = key;
                        auxCost = hijos.get(key);
                    }
                }
                costo_acumulado = hijos.get(auxKey) - heuristica.get(auxKey);
                nodo_actual = auxKey;
                System.out.println("    Costo: " + (hijos.get(auxKey) - heuristica.get(auxKey)));
            }
        }
        StyleConstants.setForeground(estilo, Color.black);
        try {
            documento.insertString(documento.getLength(), "Costo Total: ", estilo);
        } catch (BadLocationException e) {
        }

        StyleConstants.setForeground(estilo, Color.red);
        try {
            documento.insertString(documento.getLength(), String.valueOf(costo_acumulado), estilo);
        } catch (BadLocationException e) {
        }

        System.out.println("Costo TOTAL: " + costo_acumulado);
        nodos_visitados.add(meta);
        recorrido.add(meta);
        EdicionGrafo.visitados = recorrido;
    }

    public void obtenerHeuristica() {
        heuristica = new TreeMap<>();
        for (JSpinner h : heuristicos) {
            heuristica.put(h.getName(), Float.valueOf(h.getValue().toString()));
        }
        System.out.println(heuristica);
    }

    private static void printSolution(Priority solution) {
        StyledDocument documento = EdicionGrafo.resultado.getStyledDocument();
        Style estilo = EdicionGrafo.resultado.addStyle("Estilo", null);

        System.out.println("Solution");
        System.out.println("Cost: " + solution.getCost());
        try {
            documento.insertString(documento.getLength(), "Costo Total: ", estilo);
        } catch (BadLocationException e) {
        }

        StyleConstants.setForeground(estilo, Color.red);
        try {
            documento.insertString(documento.getLength(), String.valueOf(solution.getCost()), estilo);
        } catch (BadLocationException e) {
        }
        System.out.print("Path: ");
        ArrayList<String> nodos_visitados = new ArrayList<>();
        for (Nodo node : solution.getPath()) {
            nodos_visitados.add(String.valueOf(node.getNum()));
        }
        EdicionGrafo.visitados = nodos_visitados;
    }

    public Nodo obtenerNodo(int aux) {
        for (Nodo nodo : grafo.getNodos()) {
            if (nodo.getNum() == aux) {
                return nodo;
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(Solucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Volver;
    private javax.swing.JScrollPane hPanel;
    private javax.swing.JLabel hText;
    private javax.swing.JPanel heuristicaPanel;
    private javax.swing.JLabel inicialText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel metaText;
    private javax.swing.JSpinner nodoInicial;
    private javax.swing.JSpinner nodoMeta;
    private javax.swing.JLabel nodoText;
    private javax.swing.JPanel nodosPanel;
    private javax.swing.JButton resolver;
    // End of variables declaration//GEN-END:variables
}