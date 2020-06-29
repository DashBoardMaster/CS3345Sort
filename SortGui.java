import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;


public class SortGui extends JPanel{
	private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private ButtonGroup group;
    private JRadioButton jcomp9;
    private JRadioButton jcomp10;
    private JRadioButton jcomp11;
    private JRadioButton jcomp12;
    private JSlider jcomp13;
    private JTextField jcomp14;
    private JButton jcomp15;
    private JLabel jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;
    private JLabel jcomp19;
    private JLabel jcomp20;
    private JLabel jcomp21;
    private JLabel jcomp22;
    private JTextField jcomp23;
    private JTextField jcomp24;
    private JTextField jcomp25;
    private JTextField jcomp26;
    private JTextField jcomp27;
    private JTextField jcomp28;
    private JTextField jcomp29;
    
    private ChangeListener listener;
    
    String RadioSelection = "";
    
    int sliderValue = 0;
    
    int n;
	String dataType;
	String sort;
	int comparisons;
	int movements;
	long totalTime;


	    private int[] data;

	    public SortGui() {
	        //construct components
	    	 jcomp1 = new JButton ("Insertion Sort");
	    	 	jcomp1.setActionCommand("Insertion Sort");
	    	 	
		        jcomp2 = new JButton ("Selection Sort");
		        jcomp2.setActionCommand("Selection Sort");
		        
		        jcomp3 = new JButton ("Quick Sort");
		        jcomp3.setActionCommand("Quick Sort");
		        
		        jcomp4 = new JButton ("Merge Sort");
		        jcomp4.setActionCommand("Merge Sort");
		        
		        jcomp5 = new JButton ("Heap Sort");
		        jcomp5.setActionCommand("Heap Sort");
		     
		        jcomp6 = new JButton ("Radix Sort");
		        jcomp6.setActionCommand("Radix Sort");
		    
		        jcomp7 = new JLabel ("Winning Algorithm");
		        jcomp8 = new JLabel ("List Properties");
		        jcomp9 = new JRadioButton ("InOrder");
		        jcomp9.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		RadioSelection = "InOrder";
		        		
		        	}
		        });
		        jcomp10 = new JRadioButton ("ReverseOrder");
		        jcomp10.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		RadioSelection = "ReverseOrder";
		        	}
		        });
		        jcomp11 = new JRadioButton ("AlmostOrder");
		        jcomp11.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		RadioSelection = "AlmostOrder";
		        	}
		        });
		        jcomp12 = new JRadioButton ("Random");
		        jcomp12.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		RadioSelection = "Random";
		        	}
		        });
		        
		        group = new ButtonGroup();
		        group.add(jcomp9);
		        group.add(jcomp10);
		        group.add(jcomp11);
		        group.add(jcomp12);
		        
			   	listener = new ChangeListener()
		         {
		            public void stateChanged(ChangeEvent e)
		            {
		               // update text field when the slider value changes
		            	if(e.getSource() instanceof JSlider) {
		            		 JSlider source = (JSlider) e.getSource();
		            		 jcomp14.setText("" + source.getValue());
				               sliderValue = source.getValue();
				               n= sliderValue;
		            	}
		              
		            }
		         };
	    	
		        jcomp13 = new JSlider (JSlider.HORIZONTAL,0, 30000,0);
		        
		        jcomp14 = new JTextField(5);
		        jcomp14.setText("0");
		        jcomp14.setEditable(false);
		        jcomp15 = new JButton ("Create The List");
		        jcomp15.setActionCommand("Create The List");
		        jcomp15.addChangeListener(listener);
		        
		        jcomp16 = new JLabel ("Expiremental Results");
		        jcomp17 = new JLabel ("N:");
		        jcomp18 = new JLabel ("DataType:");
		        jcomp19 = new JLabel ("Sort:");
		        jcomp20 = new JLabel ("Comparisons:");
		        jcomp21 = new JLabel ("Movements:");
		        jcomp22 = new JLabel ("Total time (ns):");
		        jcomp23 = new JTextField (5);
		        jcomp23.setEditable(false);
		        jcomp24 = new JTextField (5);
		        jcomp24.setEditable(false);
		        jcomp25 = new JTextField (5);
		        jcomp25.setEditable(false);
		        jcomp26 = new JTextField (5);
		        jcomp26.setEditable(false);
		        jcomp27 = new JTextField (5);
		        jcomp27.setEditable(false);
		        jcomp28 = new JTextField (5);
		        jcomp28.setEditable(false);
		        jcomp29 = new JTextField (5);
		        jcomp29.setEditable(false);

		        //set components properties
		        jcomp13.setOrientation (JSlider.HORIZONTAL);
		        jcomp13.setMinorTickSpacing (5000);
		        jcomp13.setMajorTickSpacing (10000);
		        jcomp13.setPaintTicks (true);
		        jcomp13.setPaintLabels (true);

		        //adjust size and set layout
		        setPreferredSize (new Dimension (735, 688));
		        setLayout (null);

		        //add components
		        add (jcomp1);
		        add (jcomp2);
		        add (jcomp3);
		        add (jcomp4);
		        add (jcomp5);
		        add (jcomp6);
		        add (jcomp7);
		        add (jcomp8);
		        add (jcomp9);
		        add (jcomp10);
		        add (jcomp11);
		        add (jcomp12);
		        addSlider(jcomp13);
		        add (jcomp14);
		        add (jcomp15);
		        add (jcomp16);
		        add (jcomp17);
		        add (jcomp18);
		        add (jcomp19);
		        add (jcomp20);
		        add (jcomp21);
		        add (jcomp22);
		        add (jcomp23);
		        add (jcomp24);
		        add (jcomp25);
		        add (jcomp26);
		        add (jcomp27);
		        add (jcomp28);
		        add (jcomp29);

		        //set component bounds (only needed by Absolute Positioning)
		        jcomp1.setBounds (30, 30, 225, 105);
		        jcomp2.setBounds (30, 240, 225, 105);
		        jcomp3.setBounds (30, 135, 225, 105);
		        jcomp4.setBounds (30, 345, 225, 105);
		        jcomp5.setBounds (30, 450, 225, 105);
		        jcomp6.setBounds (30, 555, 225, 105);
		        jcomp7.setBounds (435, 30, 110, 25);
		        jcomp8.setBounds (435, 115, 110, 25);
		        jcomp9.setBounds (350, 160, 120, 25);
		        jcomp10.setBounds (520, 160, 125, 25);
		        jcomp11.setBounds (350, 190, 125, 25);
		        jcomp12.setBounds (520, 190, 100, 25);
		        jcomp13.setBounds (350, 220, 240, 55);
		        jcomp14.setBounds (600, 230, 100, 30);
		        jcomp15.setBounds (350, 280, 350, 45);
		        jcomp16.setBounds (435, 360, 125, 25);
		        jcomp17.setBounds (350, 400, 100, 25);
		        jcomp18.setBounds (350, 425, 100, 25);
		        jcomp19.setBounds (350, 450, 100, 25);
		        jcomp20.setBounds (350, 475, 100, 25);
		        jcomp21.setBounds (350, 500, 100, 25);
		        jcomp22.setBounds (350, 525, 100, 25);
		        jcomp23.setBounds (470, 405, 155, 20);
		        jcomp24.setBounds (470, 430, 155, 20);
		        jcomp25.setBounds (470, 455, 155, 20);
		        jcomp26.setBounds (470, 480, 155, 20);
		        jcomp27.setBounds (470, 505, 155, 20);
		        jcomp28.setBounds (470, 530, 155, 20);
		        jcomp29.setBounds (305, 60, 375, 45);
	    }
	    
	    public SortGui(int data[]) {
	    	this();
	    	data = this.data;
	    }
	    
	    public void addSlider(JSlider s)
	    {
	       s.addChangeListener(listener);
	       add(s);
	    }


	    public static void main (String[] args) {
	        JFrame frame = new JFrame ("Sorting Project");
	        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add (new SortGui());
	        frame.pack();
	        frame.setVisible (true);
	    }

	public void printData()
	{
		for(int i = 0; i < data.length; i++)
		{
			if (i == data.length - 1)
			{
				System.out.print(data[i]);
			}
			else
			{
				System.out.print(data[i] + ",");
			}			
		}
		System.out.println();
	}
	
	/* Generates 50000 random numbers from 1 to 1000000 
	 * Duplicates allowed
	 * Store in array 
	 */
	
	public static int[] randomNumberGenerator(int size) 
	{
		int[] rand = new int[size];
		for(int i = 0; i < size; i++)
		{
			rand[i] = ThreadLocalRandom.current().nextInt(1, 1000001);
		}
		return rand;
	}
	
	public static int[] almostSortedDataGenerator(int size) {
	    int[] list1 = SortGui.sortedDataGenerator((int) (size * 0.8));
	    int[] list2 = SortGui.randomNumberGenerator((int) (size * 0.2));
	    int[] list = new int[list1.length + list2.length];
	    System.arraycopy(list1, 0, list, 0, list1.length);
	    System.arraycopy(list2, 0, list, list1.length, list2.length);
	    
	    return list;
	}
	
	public static int[] sortedDataGenerator(int size) 
	{
		int[] sorted = new int[size];
		for(int i = 0; i < size; i++)
		{
			sorted[i] = i;
		}
		return sorted;
	}
	
	public static int[] reverseDataGenerator(int size) 
	{
		int[] reverse = new int[size];
		for(int i = 0; i < size; i++)
		{
			reverse[i] = size - i;
		}
		return reverse;
	}
	
	public void actionPerformed(ActionEvent e) {
		  String command = e.getActionCommand();
	        if (command.equals("Create The List")) {
	        	switch(RadioSelection) {
	        	  case "InOrder":
	        		  dataType = "InOrder";
	        		  data = sortedDataGenerator(n);
	        		  break;
	        	  case "AlmostOrder":
	        		  dataType = "AlmostOrder";
	        		  data = almostSortedDataGenerator(n);
	        		  break;
	        	  case "ReverseOrder":
	        		  dataType = "ReverseOrder";
	        		  data = reverseDataGenerator(n);
	        		  break;	        		  
	        	  case "Random":
	        		  dataType = "Random";
	        		  data = randomNumberGenerator(n);
	        		  break;
	        	default:
	        		
	        	
	        	}
	        } else if (command.equals("Insertion Sort")) {
	        	System.out.println("Insertion");
	        	sort = "Insertion";
	        	
	        	long start = System.nanoTime();
	        	InsertionSort.insertionSort(data);
	        	long end = System.nanoTime();
	        	totalTime = end - start;
	        	
	        	jcomp23.setText(""+n);
	        	jcomp24.setText(dataType);
	        	jcomp25.setText(sort);
	        	jcomp24.setText(""+comparisons);
	        	jcomp25.setText(""+movements);
	        	jcomp26.setText(""+totalTime);
	        	
	        	
	        
	            
	        }else if (command.equals("Selection Sort")) {
	        	sort = "Selection";
	        	
	        	long start = System.nanoTime();
	        	SelectionSort.selectionSort(data);
	        	long end = System.nanoTime();
	        	totalTime = end - start;
	        	
	        	jcomp23.setText(""+n);
	        	jcomp24.setText(dataType);
	        	jcomp25.setText(sort);
	        	jcomp24.setText(""+comparisons);
	        	jcomp25.setText(""+movements);
	        	jcomp26.setText(""+totalTime);
	            
	        }else if (command.equals("Quick Sort")) {
	        	sort = "Quick";
	        	
	        	long start = System.nanoTime();
	        	QuickSort.quickSort(data);
	        	long end = System.nanoTime();
	        	totalTime = end - start;
	        	
	        	jcomp23.setText(""+n);
	        	jcomp24.setText(dataType);
	        	jcomp25.setText(sort);
	        	jcomp24.setText(""+comparisons);
	        	jcomp25.setText(""+movements);
	        	jcomp26.setText(""+totalTime);
	            
	        }else if (command.equals("Merge Sort")) {
	        	sort = "Merge";
	        	
	        	long start = System.nanoTime();
	        	MergeSort.mergeSort(data);
	        	long end = System.nanoTime();
	        	totalTime = end - start;
	        	
	        	jcomp23.setText(""+n);
	        	jcomp24.setText(dataType);
	        	jcomp25.setText(sort);
	        	jcomp24.setText(""+comparisons);
	        	jcomp25.setText(""+movements);
	        	jcomp26.setText(""+totalTime);
	            
	        }else if (command.equals("Heap Sort")) {
	        	sort = "Heap";
	        	
	        	long start = System.nanoTime();
	        	HeapSort.heapSort(data);
	        	long end = System.nanoTime();
	        	totalTime = end - start;
	        	
	        	jcomp23.setText(""+n);
	        	jcomp24.setText(dataType);
	        	jcomp25.setText(sort);
	        	jcomp24.setText(""+comparisons);
	        	jcomp25.setText(""+movements);
	        	jcomp26.setText(""+totalTime);
	            
	        }else if (command.equals("Radix Sort")) {
	        	sort = "Radix";
	        	
	        	long start = System.nanoTime();
	        	RadixSort.radixSort(data, comparisons);
	        	long end = System.nanoTime();
	        	totalTime = end - start;
	        	
	        	jcomp23.setText(""+n);
	        	jcomp24.setText(dataType);
	        	jcomp25.setText(sort);
	        	jcomp24.setText(""+comparisons);
	        	jcomp25.setText(""+movements);
	        	jcomp26.setText(""+totalTime);
	            
	        }

	}
}