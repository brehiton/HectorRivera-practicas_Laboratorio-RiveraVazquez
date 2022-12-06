package ex.ordinario.eval.ventanas;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame{

	public Ventana(){
		initComponents();
	}

	private void initComponents(){
		//establecer el tipo de frame como FlowLayout
		this.setLayout(new FlowLayout());
		//establecer que la ventana se cierre regresando el pormp de la consola
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb = new JMenuBar();
		//establecer el menu en la Ventana
		menu = new JMenu("Ordenar por ...");
		mb.add(menu);

		miMarca = new JMenuItem("Marca");
		//asignar una clase anónima en el clic miMarca
		miMarca.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//la accion manda llamar al método sortMarca(txContenido) de la clase Procesos
		menu.add(miMarca);

		miModelo = new JMenuItem("Modelo");
		//asignar una clase anónima en el clic miModelo
		miModelo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//la accion manda llamar al método sortModelo(txContenido) de la clase Procesos
		menu.add(miModelo);

		miCosto = new JMenuItem("Costo");
		//asignar una clase anónima en el clic miCosto
		miCosto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//la accion manda llamar al método sortCosto(txContenido) de la clase Procesos
		menu.add(miCosto);

		menu.addSeparator();

		miSalir = new JMenuItem("Salir");
		//asignar una clase anónima en el clic miSalir
		miSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//la accion manda llamar al método dispose()
		menu.add(miSalir);
		
		//marca
		lbMarca = new JLabel("Marca");
		add(lbMarca);
		txMarca = new JTextField(10);
		add(txMarca);
		//modelo
		lbModelo = new JLabel("Modelo");
		add(lbModelo);
		txModelo = new JTextField(10);
		add(txModelo);
		//costo
		lbCosto = new JLabel("Costo");
		add(lbCosto);
		txCosto = new JTextField(10);
		add(txCosto);
		//llantas
		lbLlantas = new JLabel("Llantas");
		add(lbLlantas);
		txLlantas = new JTextField(10);
		add(txLlantas);
		//remos
		lbRemos = new JLabel("Remos");
		add(lbRemos);
		txRemos = new JTextField(10);
		add(txRemos);

		addTerr = new JButton("Agregar Terrestre");
		//asignar una clase anónima en el clic addTerr
		addTerr.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//la accion manda llamar al método 
		// addTerrestre(txContenido, txMarca, txModelo, txCosto, txLlantas)
		// de la clase Procesos
		add(addTerr);

		addAqua = new JButton("Agregar Acuatico");
		//asignar una clase anónima en el clic addAqua
		addAqua.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//la accion manda llamar al método 
		// addAcuatico(txContenido, txMarca, txModelo, txCosto, txRemos)
		// de la clase Procesos
		add(addAqua);
		txContenido = new JTextArea(30,40);
		add(txContenido);
		setSize(550,650);
		setVisible(true);
	}
	
	JMenuBar mb;
	JMenu menu;
	JMenuItem miMarca, miModelo, miCosto, miSalir;
	JLabel lbMarca, lbModelo, lbCosto, lbLlantas, lbRemos;
	JTextField txMarca, txModelo, txCosto, txLlantas, txRemos;
	JButton addTerr, addAqua;
	JTextArea txContenido;
}
