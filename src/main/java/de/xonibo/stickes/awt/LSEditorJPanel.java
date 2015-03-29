package de.xonibo.stickes.awt;

import de.xonibo.stickes.LSEntry;
import de.xonibo.stickes.LSList;
import de.xonibo.stickes.StichData;
import de.xonibo.stickes.assemble.LindenmayerTurtle;
import de.xonibo.stickes.stiches.Plain;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class LSEditorJPanel extends javax.swing.JPanel {

    private final Visual visual;
    private final LSList lslist = new LSList();

    public LSEditorJPanel() {
        this.visual = null;
    }

    public LSEditorJPanel(Visual visual) {
        this.visual = visual;
        initComponents();
        listDefaults();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAngle = new javax.swing.JLabel();
        jLabelIterations = new javax.swing.JLabel();
        jLabelAxiom = new javax.swing.JLabel();
        jLabelRule1 = new javax.swing.JLabel();
        jLabelRule2 = new javax.swing.JLabel();
        jButtonDeleteLS = new javax.swing.JButton();
        jButtonAddRule = new javax.swing.JButton();
        jButtonRunLS = new javax.swing.JButton();
        jButtonSaveLS = new javax.swing.JButton();
        axiom = new javax.swing.JTextField();
        rule1 = new javax.swing.JTextField();
        rule2 = new javax.swing.JTextField();
        jCheckBoxAutoRun = new javax.swing.JCheckBox();
        angle = new javax.swing.JSpinner();
        iterations = new javax.swing.JSpinner();
        jLabelStepWidth = new javax.swing.JLabel();
        stepwidth = new javax.swing.JSpinner();
        jLabelRule3 = new javax.swing.JLabel();
        rule4 = new javax.swing.JTextField();
        rule3 = new javax.swing.JTextField();
        jLabelRule4 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        jLabel = new javax.swing.JLabel();

        jLabelAngle.setText("Angle");

        jLabelIterations.setText("Iterations");

        jLabelAxiom.setText("Axiom");

        jLabelRule1.setText("Rule1");

        jLabelRule2.setText("Rule2");

        jButtonDeleteLS.setText("Delete");
        jButtonDeleteLS.setEnabled(false);

        jButtonAddRule.setText("add Rule");
        jButtonAddRule.setEnabled(false);
        jButtonAddRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRuleActionPerformed(evt);
            }
        });

        jButtonRunLS.setText("Run");
        jButtonRunLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunLSActionPerformed(evt);
            }
        });

        jButtonSaveLS.setText("Save");
        jButtonSaveLS.setEnabled(false);

        axiom.setText("FX");
        axiom.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                axiomCaretUpdate(evt);
            }
        });
        axiom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                axiomActionPerformed(evt);
            }
        });

        rule1.setText("X=X+YF+");
        rule1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rule1CaretUpdate(evt);
            }
        });
        rule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rule1ActionPerformed(evt);
            }
        });

        rule2.setText("Y=-FX-Y");
        rule2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rule2CaretUpdate(evt);
            }
        });
        rule2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rule2ActionPerformed(evt);
            }
        });

        jCheckBoxAutoRun.setText("autoRun");
        jCheckBoxAutoRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAutoRunActionPerformed(evt);
            }
        });

        angle.setModel(new javax.swing.SpinnerNumberModel(90, -180, 180, 1));
        angle.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                angleStateChanged(evt);
            }
        });
        angle.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                angleVetoableChange(evt);
            }
        });

        iterations.setModel(new javax.swing.SpinnerNumberModel(10, 1, 42, 1));
        iterations.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                iterationsStateChanged(evt);
            }
        });

        jLabelStepWidth.setText("Stepwidth");

        stepwidth.setModel(new javax.swing.SpinnerNumberModel(10, 1, 50, 1));
        stepwidth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stepwidthStateChanged(evt);
            }
        });

        jLabelRule3.setText("Rule3");

        rule4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rule4CaretUpdate(evt);
            }
        });
        rule4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rule4ActionPerformed(evt);
            }
        });

        rule3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rule3CaretUpdate(evt);
            }
        });
        rule3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rule3ActionPerformed(evt);
            }
        });

        jLabelRule4.setText("Rule4");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Example Lindemayer System" }));
        jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItemStateChanged(evt);
            }
        });

        jLabel.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRunLS)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxAutoRun))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelIterations)
                                        .addComponent(jLabelAngle)
                                        .addComponent(jLabelRule3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelRule2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelRule4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelRule1)
                                    .addComponent(jLabelAxiom, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStepWidth)
                                    .addComponent(jLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jComboBox, 0, 241, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSaveLS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDeleteLS))
                                    .addComponent(rule2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rule3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rule1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rule4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(axiom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(angle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(iterations, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stepwidth, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAddRule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveLS)
                    .addComponent(jButtonDeleteLS)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAngle)
                    .addComponent(angle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIterations)
                    .addComponent(iterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stepwidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStepWidth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(axiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAxiom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRule1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRule2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rule3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRule3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rule4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRule4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddRule)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRunLS)
                    .addComponent(jCheckBoxAutoRun))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRuleActionPerformed
// xxxx
    }//GEN-LAST:event_jButtonAddRuleActionPerformed

    private void rule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule1ActionPerformed
//cc

    }//GEN-LAST:event_rule1ActionPerformed

    private void jButtonRunLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRunLSActionPerformed
        calculate();
    }//GEN-LAST:event_jButtonRunLSActionPerformed

    public void calculate() {
        int it = (int) iterations.getValue();
        int a = (int) angle.getValue();
        int sw = (int) stepwidth.getValue();
        List<String> rules = new ArrayList<>();
        rules.add(rule1.getText());
        rules.add(rule2.getText());
        rules.add(rule3.getText());
        rules.add(rule4.getText());
        LindenmayerTurtle ls = new LindenmayerTurtle(it, a, sw, axiom.getText(), rules);

        GeneralPath path = ls.getPath();
        StichData sd = new Plain(path).toStichData();
        visual.setStichData(sd);
        visual.init();
        visual.repaint();
    }

    private void jCheckBoxAutoRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAutoRunActionPerformed
        jButtonRunLS.setEnabled(!jCheckBoxAutoRun.isSelected());
    }//GEN-LAST:event_jCheckBoxAutoRunActionPerformed

    private void angleVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_angleVetoableChange
        //do something
    }//GEN-LAST:event_angleVetoableChange

    private void angleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_angleStateChanged
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_angleStateChanged

    private void iterationsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_iterationsStateChanged
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_iterationsStateChanged

    private void axiomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_axiomActionPerformed
        //
    }//GEN-LAST:event_axiomActionPerformed

    private void rule2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule2ActionPerformed
        //
    }//GEN-LAST:event_rule2ActionPerformed

    private void axiomCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_axiomCaretUpdate
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_axiomCaretUpdate

    private void rule1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rule1CaretUpdate
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_rule1CaretUpdate

    private void rule2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rule2CaretUpdate
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_rule2CaretUpdate

    private void stepwidthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stepwidthStateChanged
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_stepwidthStateChanged

    private void rule4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rule4CaretUpdate
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }
    }//GEN-LAST:event_rule4CaretUpdate

    private void rule4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rule4ActionPerformed

    private void rule3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rule3CaretUpdate
        if (jCheckBoxAutoRun.isSelected()) {
            calculate();
        }

    }//GEN-LAST:event_rule3CaretUpdate

    private void rule3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rule3ActionPerformed

    private void jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItemStateChanged
        LSEntry e = lslist.getSelectedItem();
        String[] rules = e.getRules();
        if (rules.length == 0) {
            return;
        }
        boolean remember = jCheckBoxAutoRun.isSelected();
        jCheckBoxAutoRun.setSelected(false);
        axiom.setText(e.getAxiom());
        stepwidth.setValue(e.getStepwidth());
        angle.setValue(e.getAngle());
        iterations.setValue(e.getIterations());
        rule4.setText("");
        rule3.setText("");
        rule2.setText("");
        rule1.setText("");
        switch (rules.length) {
            default:
                System.out.println("too many rules");
            case 4:
                rule4.setText(rules[3]);
            case 3:
                rule3.setText(rules[2]);
            case 2:
                rule2.setText(rules[1]);
            case 1:
                rule1.setText(rules[0]);
        }
        if (remember) {
            jCheckBoxAutoRun.setSelected(true);
            calculate();
        }
    }//GEN-LAST:event_jComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner angle;
    private javax.swing.JTextField axiom;
    private javax.swing.JSpinner iterations;
    private javax.swing.JButton jButtonAddRule;
    private javax.swing.JButton jButtonDeleteLS;
    private javax.swing.JButton jButtonRunLS;
    private javax.swing.JButton jButtonSaveLS;
    private javax.swing.JCheckBox jCheckBoxAutoRun;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabelAngle;
    private javax.swing.JLabel jLabelAxiom;
    private javax.swing.JLabel jLabelIterations;
    private javax.swing.JLabel jLabelRule1;
    private javax.swing.JLabel jLabelRule2;
    private javax.swing.JLabel jLabelRule3;
    private javax.swing.JLabel jLabelRule4;
    private javax.swing.JLabel jLabelStepWidth;
    private javax.swing.JTextField rule1;
    private javax.swing.JTextField rule2;
    private javax.swing.JTextField rule3;
    private javax.swing.JTextField rule4;
    private javax.swing.JSpinner stepwidth;
    // End of variables declaration//GEN-END:variables

    private void listDefaults() {
        lslist.addElement(new LSEntry("dragon", 11, 90, 10, "FX", "X=X+YF+", "Y=-FX-Y"));
        lslist.addElement(new LSEntry("fractal-plant", 6, 25, 10, "X", "X=C0F-[C2[X]+C3X]+C1F[C3+FX]-X", "F=FF"));
        lslist.addElement(new LSEntry("hilbert", 6, 90, 10, "X", "X=-YF+XFX+FY-", "Y=+XF-YFY-FX+"));
        lslist.addElement(new LSEntry("joined-cross", 3, 90, 10, "XYXYXYX+XYXYXYX+XYXYXYX+XYXYXYX", "F=", "X=FX+FX+FXFY-FY-", "Y=+FX+FXFY-FY-FY"));
        lslist.addElement(new LSEntry("kevs-pond-weed", 5, 27, 10, "F", "F=C0FF[C1-F++F][C2+F--F]C3++F--F"));
        lslist.addElement(new LSEntry("kevs-tree", 4, 22, 10, "F", "F=C0FF-[C1-F+F+F]+[C2+F-F-F]"));
        lslist.addElement(new LSEntry("kevs-wisply-tree", 5, 25, 10, "FX", "F=C0FF-[C1-F+F]+[C2+F-F]", "X=C0FF+[C1+F]+[C3-F]"));
        lslist.addElement(new LSEntry("koch-curve", 6, 90, 4, "-F", "F=F+F-F-F+F"));
        lslist.addElement(new LSEntry("koch-snowflake", 4, 60, 10, "F++F++F", "F=F-F++F-F", "X=FF"));
        lslist.addElement(new LSEntry("lace", 7, 30, 10, "W", "W=+++X--F--ZFX+", "X=---W++F++YFW-", "Y=+ZFX--F--Z+++", "Z=-YFW++F++Y---"));
        lslist.addElement(new LSEntry("penrose-tiling", 5, 36, 10, "[7]++[7]++[7]++[7]++[7]", "6=81++91----71[-81----61]++", "7=+81--91[---61--71]+", "8=-61++71[+++81++91]-", "9=--81++++61[+91++++71]--71", "1="));
        lslist.addElement(new LSEntry("plesant-error", 4, 72, 8, "F-F-F-F-F", "F=F-F++F+F-F-F"));
        lslist.addElement(new LSEntry("sierpinski-arrowtip", 7, 60, 10, "A", "A=B-A-B", "B=A+B+A"));
        lslist.addElement(new LSEntry("sierpinski-carpet", 4, 90, 10, "F", "F=F+F-F-F-G+F+F+F-F", "G=GGG"));
        lslist.addElement(new LSEntry("sierpinski-median", 8, 45, 10, "L--F--L--F", "L=+R-F-R+", "R=-L+F+L-"));
        lslist.addElement(new LSEntry("sierpinski-triangle", 6, 120, 10, "F-G-G", "F=F-G+F+G-F", "G=GG"));
        jComboBox.setModel(lslist);
    }
}
