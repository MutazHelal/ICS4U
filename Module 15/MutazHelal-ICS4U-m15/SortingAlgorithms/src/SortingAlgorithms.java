/*
 * Mutaz Helal
 * March 25
 * SortingAlgorithms
 * This program generates a list of random numbers and implements
 * different sorting algorithms to sort the lists.
 */

import java.util.ArrayList;

public class SortingAlgorithms extends javax.swing.JFrame {

    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<Integer> nums2 = new ArrayList<>();
    ArrayList<Integer> nums3 = new ArrayList<>();

    //initialize static counters
    static int loops;
    static int comparisons;
    static int shifts;

    /**
     * Creates new form SortingAlgorithms
     */
    public SortingAlgorithms() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        number = new javax.swing.ButtonGroup();
        order = new javax.swing.ButtonGroup();
        ten = new javax.swing.JRadioButton();
        hundred = new javax.swing.JRadioButton();
        thousand = new javax.swing.JRadioButton();
        fiveThousand = new javax.swing.JRadioButton();
        ascending = new javax.swing.JRadioButton();
        descending = new javax.swing.JRadioButton();
        unsortedLabel = new javax.swing.JLabel();
        sortedLabel = new javax.swing.JLabel();
        sort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        unsortedNums = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sortedNums = new javax.swing.JTextArea();
        selectionTime = new javax.swing.JLabel();
        selectionLoops = new javax.swing.JLabel();
        selectionComparisons = new javax.swing.JLabel();
        selectionShifts = new javax.swing.JLabel();
        bubbleTime = new javax.swing.JLabel();
        bubbleLoops = new javax.swing.JLabel();
        bubbleComparisons = new javax.swing.JLabel();
        bubbleShifts = new javax.swing.JLabel();
        insertionTime = new javax.swing.JLabel();
        insertionLoops = new javax.swing.JLabel();
        insertionComparisons = new javax.swing.JLabel();
        insertionShifts = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        sortingAlgorithmsGFX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ten.setBackground(new java.awt.Color(25, 25, 25));
        number.add(ten);
        ten.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ten.setForeground(new java.awt.Color(255, 255, 255));
        ten.setText("10");
        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });
        getContentPane().add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        hundred.setBackground(new java.awt.Color(25, 25, 25));
        number.add(hundred);
        hundred.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hundred.setForeground(new java.awt.Color(255, 255, 255));
        hundred.setText("100");
        hundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredActionPerformed(evt);
            }
        });
        getContentPane().add(hundred, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        thousand.setBackground(new java.awt.Color(25, 25, 25));
        number.add(thousand);
        thousand.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thousand.setForeground(new java.awt.Color(255, 255, 255));
        thousand.setText("1000");
        thousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thousandActionPerformed(evt);
            }
        });
        getContentPane().add(thousand, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        fiveThousand.setBackground(new java.awt.Color(25, 25, 25));
        number.add(fiveThousand);
        fiveThousand.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fiveThousand.setForeground(new java.awt.Color(255, 255, 255));
        fiveThousand.setText("5000");
        fiveThousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveThousandActionPerformed(evt);
            }
        });
        getContentPane().add(fiveThousand, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        ascending.setBackground(new java.awt.Color(25, 25, 25));
        order.add(ascending);
        ascending.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ascending.setForeground(new java.awt.Color(255, 255, 255));
        ascending.setText("Ascending");
        ascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendingActionPerformed(evt);
            }
        });
        getContentPane().add(ascending, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        descending.setBackground(new java.awt.Color(25, 25, 25));
        order.add(descending);
        descending.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descending.setForeground(new java.awt.Color(255, 255, 255));
        descending.setText("Descending");
        descending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendingActionPerformed(evt);
            }
        });
        getContentPane().add(descending, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        unsortedLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unsortedLabel.setForeground(new java.awt.Color(255, 255, 255));
        unsortedLabel.setText("Unsorted List");
        getContentPane().add(unsortedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        sortedLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sortedLabel.setForeground(new java.awt.Color(255, 255, 255));
        sortedLabel.setText("Sorted List");
        getContentPane().add(sortedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        sort.setBackground(new java.awt.Color(25, 25, 25));
        sort.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sort.setForeground(new java.awt.Color(168, 130, 80));
        sort.setText("Sort");
        sort.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                sortMouseMoved(evt);
            }
        });
        sort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sortFocusLost(evt);
            }
        });
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });
        getContentPane().add(sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(25, 25, 25));
        jScrollPane1.setForeground(new java.awt.Color(168, 130, 80));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        unsortedNums.setEditable(false);
        unsortedNums.setBackground(new java.awt.Color(25, 25, 25));
        unsortedNums.setColumns(20);
        unsortedNums.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unsortedNums.setForeground(new java.awt.Color(168, 130, 80));
        unsortedNums.setRows(5);
        unsortedNums.setBorder(null);
        unsortedNums.setCaretColor(new java.awt.Color(168, 130, 80));
        jScrollPane1.setViewportView(unsortedNums);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 297));

        jScrollPane2.setBackground(new java.awt.Color(25, 25, 25));
        jScrollPane2.setForeground(new java.awt.Color(168, 130, 80));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        sortedNums.setEditable(false);
        sortedNums.setBackground(new java.awt.Color(25, 25, 25));
        sortedNums.setColumns(20);
        sortedNums.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sortedNums.setForeground(new java.awt.Color(168, 130, 80));
        sortedNums.setRows(5);
        sortedNums.setBorder(null);
        sortedNums.setCaretColor(new java.awt.Color(168, 130, 80));
        jScrollPane2.setViewportView(sortedNums);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 110, 297));

        selectionTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectionTime.setForeground(new java.awt.Color(168, 130, 80));
        selectionTime.setText(" ");
        getContentPane().add(selectionTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 300, -1));

        selectionLoops.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectionLoops.setForeground(new java.awt.Color(168, 130, 80));
        selectionLoops.setText(" ");
        getContentPane().add(selectionLoops, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 300, -1));

        selectionComparisons.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectionComparisons.setForeground(new java.awt.Color(168, 130, 80));
        selectionComparisons.setText(" ");
        getContentPane().add(selectionComparisons, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 300, -1));

        selectionShifts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectionShifts.setForeground(new java.awt.Color(168, 130, 80));
        selectionShifts.setText(" ");
        getContentPane().add(selectionShifts, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 300, -1));

        bubbleTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bubbleTime.setForeground(new java.awt.Color(168, 130, 80));
        bubbleTime.setText(" ");
        getContentPane().add(bubbleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 300, -1));

        bubbleLoops.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bubbleLoops.setForeground(new java.awt.Color(168, 130, 80));
        bubbleLoops.setText(" ");
        getContentPane().add(bubbleLoops, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 300, -1));

        bubbleComparisons.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bubbleComparisons.setForeground(new java.awt.Color(168, 130, 80));
        bubbleComparisons.setText(" ");
        getContentPane().add(bubbleComparisons, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 300, -1));

        bubbleShifts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bubbleShifts.setForeground(new java.awt.Color(168, 130, 80));
        bubbleShifts.setText(" ");
        getContentPane().add(bubbleShifts, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 300, -1));

        insertionTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertionTime.setForeground(new java.awt.Color(168, 130, 80));
        insertionTime.setText(" ");
        getContentPane().add(insertionTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 300, -1));

        insertionLoops.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertionLoops.setForeground(new java.awt.Color(168, 130, 80));
        insertionLoops.setText(" ");
        getContentPane().add(insertionLoops, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 300, -1));

        insertionComparisons.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertionComparisons.setForeground(new java.awt.Color(168, 130, 80));
        insertionComparisons.setText(" ");
        getContentPane().add(insertionComparisons, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 300, -1));

        insertionShifts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertionShifts.setForeground(new java.awt.Color(168, 130, 80));
        insertionShifts.setText(" ");
        getContentPane().add(insertionShifts, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 300, -1));

        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 730, 20));

        sortingAlgorithmsGFX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sortingAlgorithmsGFX.png"))); // NOI18N
        getContentPane().add(sortingAlgorithmsGFX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        //clear lists and assign variable values
        String tempN = "";
        String numsN = "";

        nums.clear();
        nums2.clear();
        nums3.clear();

        //generate and sort 10 numbers
        if (ten.isSelected() == true) {
            //ascending order
            if (ascending.isSelected() == true) {
                generate(10, tempN);

                int timeSelection = selectionAscending(9, 10);
                selectionOut(timeSelection);

                int timeBubble = bubbleAscending(9);
                bubbleOut(timeBubble);

                int timeInsertion = insertionAscending(10);
                insertionOut(timeInsertion);
                display(numsN);

                //descending order
            } else if (descending.isSelected() == true) {
                generate(10, tempN);

                int timeSelection = selectionDescending(9, 10);
                selectionOut(timeSelection);

                int timeBubble = bubbleDescending(9);
                bubbleOut(timeBubble);

                int timeInsertion = insertionDescending(10);
                insertionOut(timeInsertion);
                display(numsN);

                //output error message
            } else {
                errorLabel.setText("Please select how you want the list to be"
                        + " ordered(ascending/descending order).");
            }

            //generate and sort 100 numbers    
        } else if (hundred.isSelected() == true) {

            //ascending order
            if (ascending.isSelected() == true) {
                generate(100, tempN);

                int timeSelection = selectionAscending(99, 100);
                selectionOut(timeSelection);

                int timeBubble = bubbleAscending(99);
                bubbleOut(timeBubble);

                int timeInsertion = insertionAscending(100);
                insertionOut(timeInsertion);
                display(numsN);

                //descending order
            } else if (descending.isSelected() == true) {
                generate(100, tempN);

                int timeSelection = selectionDescending(99, 100);
                selectionOut(timeSelection);

                int timeBubble = bubbleDescending(99);
                bubbleOut(timeBubble);

                int timeInsertion = insertionDescending(100);
                insertionOut(timeInsertion);
                display(numsN);

                //output error message
            } else {
                errorLabel.setText("Please select how you want the list to be"
                        + " ordered(ascending/descending order).");
            }

            //generate and sort 1000 numbers   
        } else if (thousand.isSelected() == true) {

            //ascending order
            if (ascending.isSelected() == true) {
                generate(1000, tempN);

                int timeSelection = selectionAscending(999, 1000);
                selectionOut(timeSelection);

                int timeBubble = bubbleAscending(999);
                bubbleOut(timeBubble);

                int timeInsertion = insertionAscending(1000);
                insertionOut(timeInsertion);
                display(numsN);

                //descending order
            } else if (descending.isSelected() == true) {
                generate(1000, tempN);

                int timeSelection = selectionDescending(999, 1000);
                selectionOut(timeSelection);

                int timeBubble = bubbleDescending(999);
                bubbleOut(timeBubble);

                int timeInsertion = insertionDescending(1000);
                insertionOut(timeInsertion);
                display(numsN);

                //output error message
            } else {
                errorLabel.setText("Please select how you want the list to be"
                        + " ordered (ascending/descending order).");
            }

            //generate and sort 5000 numbers 
        } else if (fiveThousand.isSelected() == true) {

            //ascending order
            if (ascending.isSelected() == true) {
                generate(5000, tempN);

                int timeSelection = selectionAscending(4999, 5000);
                selectionOut(timeSelection);

                int timeBubble = bubbleAscending(4999);
                bubbleOut(timeBubble);

                int timeInsertion = insertionAscending(5000);
                insertionOut(timeInsertion);
                display(numsN);

                //descending order
            } else if (descending.isSelected() == true) {
                generate(5000, tempN);

                int timeSelection = selectionDescending(4999, 5000);
                selectionOut(timeSelection);

                int timeBubble = bubbleDescending(4999);
                bubbleOut(timeBubble);

                int timeInsertion = insertionDescending(5000);
                insertionOut(timeInsertion);
                display(numsN);

                //output error message
            } else {
                errorLabel.setText("Please select how you want the list to be"
                        + " ordered(ascending/descending order).");
            }
            //output error message
        } else {
            errorLabel.setText("Please make your selections by clicking on"
                    + " the circle options.");

        }
        sort.setFocusable(false);
    }//GEN-LAST:event_sortActionPerformed

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
        clearAll();
        sort.setFocusable(true);
    }//GEN-LAST:event_tenActionPerformed

    private void hundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundredActionPerformed
        clearAll();
        sort.setFocusable(true);
    }//GEN-LAST:event_hundredActionPerformed

    private void thousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thousandActionPerformed
        clearAll();
        sort.setFocusable(true);
    }//GEN-LAST:event_thousandActionPerformed

    private void fiveThousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveThousandActionPerformed
        clearAll();
        sort.setFocusable(true);
    }//GEN-LAST:event_fiveThousandActionPerformed

    private void ascendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendingActionPerformed
        clearAll();
        sort.setFocusable(true);
    }//GEN-LAST:event_ascendingActionPerformed

    private void descendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendingActionPerformed
        clearAll();
        sort.setFocusable(true);
    }//GEN-LAST:event_descendingActionPerformed

    private void sortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sortFocusGained
        clearAll();
        sort.setText("Generating numbers...");
    }//GEN-LAST:event_sortFocusGained

    private void sortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sortFocusLost
        sort.setText("Sort");
    }//GEN-LAST:event_sortFocusLost

    private void sortMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortMouseMoved
        sort.setFocusable(true);
    }//GEN-LAST:event_sortMouseMoved

    public int selectionAscending(int A, int B) {
        //selection sort (ascending order)
        long start, finish, elapsed;
        start = System.currentTimeMillis();

        for (int i = 0; i < A; i++) {
            loops++;
            for (int j = i + 1; j < B; j++) {
                loops++;

                comparisons++;
                if (nums.get(i) < nums.get(j)) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    shifts++;
                    nums.set(j, temp);
                    shifts++;
                }
            }
        }
        //calculate and return time
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        return (int) elapsed;
    }

    public int selectionDescending(int A, int B) {
        //selection sort (descending order)
        long start, finish, elapsed;
        start = System.currentTimeMillis();

        for (int i = 0; i < A; i++) {
            loops++;
            for (int j = i + 1; j < B; j++) {
                loops++;

                comparisons++;
                if (nums.get(i) > nums.get(j)) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    shifts++;
                    nums.set(j, temp);
                    shifts++;

                }
            }
        }
        //calculate and return time
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        return (int) elapsed;
    }

    public int bubbleAscending(int bottom) {
        //bubble sort (ascending order)
        boolean hasSwapped = true;
        long start, finish, elapsed;

        start = System.currentTimeMillis();

        while (hasSwapped == true) {
            loops++;
            hasSwapped = false;

            for (int j = 0; j < bottom; j++) {
                loops++;

                comparisons++;
                if (nums2.get(j) > nums2.get(j + 1)) {
                    int temp = nums2.get(j);
                    nums2.set(j, nums2.get(j + 1));
                    shifts++;
                    nums2.set(j + 1, temp);
                    shifts++;
                    hasSwapped = true;
                }

            }
            bottom--;
        }
        //calculate and return time
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        return (int) elapsed;

    }

    public int bubbleDescending(int bottom) {
        //bubble sort (descending order)
        boolean hasSwapped = true;
        long start, finish, elapsed;

        start = System.currentTimeMillis();

        comparisons++;
        while (hasSwapped == true) {
            loops++;
            hasSwapped = false;

            for (int j = 0; j < bottom; j++) {
                loops++;
                
                comparisons++;
                if (nums2.get(j) > nums2.get(j + 1)) {
                    int temp = nums2.get(j);
                    nums2.set(j, nums2.get(j + 1));
                    shifts++;
                    nums2.set(j + 1, temp);
                    shifts++;
                    hasSwapped = true;
                }

            }
            bottom--;
        }
        //calculate and return time
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        return (int) elapsed;

    }

    public int insertionAscending(int a) {
        //insertion sort (ascending order)
        long start, finish, elapsed;

        start = System.currentTimeMillis();

        for (int n = 1; n < a; n++) {
            loops++;
            int temp = nums3.get(n);
            int j = n - 1;

            comparisons++;
            while (j >= 0 && nums3.get(j) < temp) {
                loops++;
                nums3.set(j + 1, nums3.get(j));
                shifts++;
                j = j - 1;
            }
            nums3.set(j + 1, temp);
            shifts++;
        }
        //calculate and return time
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        return (int) elapsed;
    }

    public int insertionDescending(int a) {
        //insertion sort (descending order)
        long start, finish, elapsed;

        start = System.currentTimeMillis();

        for (int n = 1; n < a; n++) {
            loops++;
            int temp = nums3.get(n);
            int j = n - 1;

            comparisons++;
            while (j >= 0 && nums3.get(j) > temp) {
                loops++;
                nums3.set(j + 1, nums3.get(j));
                shifts++;
                j = j - 1;
            }
            nums3.set(j + 1, temp);
            shifts++;
        }
        //calculate and return time
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        return (int) elapsed;

    }

    public void display(String A) {
        //display sorted list
        for (int i = 0; i < nums.size(); i++) {
            A = nums.get(i) + "\n" + A;
            sortedNums.setText(A);
        }

    }

    public void generate(int A, String a) {
        //generate random numbers
        for (int i = 0; i < A; i++) {
            int temp = (int) Math.floor((Math.random() * 20001) - 10000);
            nums.add(temp);
            nums2.add(temp);
            nums3.add(temp);

            a = String.valueOf(temp) + "\n" + a;
            unsortedNums.setText(a);

        }
    }

    public void selectionOut(int time) {
        //display selection sort counters
        selectionTime.setText("Sort time: " + String.valueOf(time) + "ms.");
        selectionLoops.setText(String.valueOf(loops) + " loops.");
        selectionComparisons.setText(String.valueOf(comparisons) + " comparisons.");
        selectionShifts.setText(String.valueOf(shifts) + " shifted elements.");
        loops = 0;
        comparisons = 0;
        shifts = 0;
    }

    public void bubbleOut(int time) {
        //display bubble sort counters
        bubbleTime.setText("Sort time: " + String.valueOf(time) + "ms.");
        bubbleLoops.setText(String.valueOf(loops) + " loops.");
        bubbleComparisons.setText(String.valueOf(comparisons) + " comparisons.");
        bubbleShifts.setText(String.valueOf(shifts) + " shifted elements.");
        loops = 0;
        comparisons = 0;
        shifts = 0;
    }

    public void insertionOut(int time) {
        //display insertion sort counters
        insertionTime.setText("Sort time: " + String.valueOf(time) + "ms.");
        insertionLoops.setText(String.valueOf(loops) + " loops.");
        insertionComparisons.setText(String.valueOf(comparisons) + " comparisons.");
        insertionShifts.setText(String.valueOf(shifts) + " shifted elements.");
        loops = 0;
        comparisons = 0;
        shifts = 0;
    }

    public void clearAll() {
        //format all output
        selectionTime.setText("");
        selectionLoops.setText("");
        selectionComparisons.setText("");
        selectionShifts.setText("");

        bubbleTime.setText("");
        bubbleLoops.setText("");
        bubbleComparisons.setText("");
        bubbleShifts.setText("");

        insertionTime.setText("");
        insertionLoops.setText("");
        insertionComparisons.setText("");
        insertionShifts.setText("");
        unsortedNums.setText("");
        sortedNums.setText("");

        errorLabel.setText("");
        loops = 0;
        comparisons = 0;
        shifts = 0;

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
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SortingAlgorithms().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ascending;
    private javax.swing.JLabel bubbleComparisons;
    private javax.swing.JLabel bubbleLoops;
    private javax.swing.JLabel bubbleShifts;
    private javax.swing.JLabel bubbleTime;
    private javax.swing.JRadioButton descending;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JRadioButton fiveThousand;
    private javax.swing.JRadioButton hundred;
    private javax.swing.JLabel insertionComparisons;
    private javax.swing.JLabel insertionLoops;
    private javax.swing.JLabel insertionShifts;
    private javax.swing.JLabel insertionTime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup number;
    private javax.swing.ButtonGroup order;
    private javax.swing.JLabel selectionComparisons;
    private javax.swing.JLabel selectionLoops;
    private javax.swing.JLabel selectionShifts;
    private javax.swing.JLabel selectionTime;
    private javax.swing.JButton sort;
    private javax.swing.JLabel sortedLabel;
    private javax.swing.JTextArea sortedNums;
    private javax.swing.JLabel sortingAlgorithmsGFX;
    private javax.swing.JRadioButton ten;
    private javax.swing.JRadioButton thousand;
    private javax.swing.JLabel unsortedLabel;
    private javax.swing.JTextArea unsortedNums;
    // End of variables declaration//GEN-END:variables
}
