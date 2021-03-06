package interfaceUsuario;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class FrameSecundario extends FramePrincipal {
	protected JTextArea txtAreaExplicacao;
	protected String texto;
	protected int widthTexto;
	protected int heightTexto;
	public FrameSecundario() {

		height = 900;
		width = 750;
		definirTexto();
		inicializaCaixaDeTexto();
	}

	/***************************************************************************/

	protected void inicializaCaixaDeTexto() {
		widthTexto = 3*width / 4;
		heightTexto = height / 8;
		txtAreaExplicacao = new JTextArea(texto);
		txtAreaExplicacao.setEditable(false);
		txtAreaExplicacao.setFont(new Font("Arial", 0, 14));
		JScrollPane scrollPane = new JScrollPane(txtAreaExplicacao);
		Dimension d = txtAreaExplicacao.getPreferredSize();

		scrollPane.setBounds(width / 8, height / 6, widthTexto, heightTexto);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane);

	}
	
	protected abstract void definirTexto();
}
