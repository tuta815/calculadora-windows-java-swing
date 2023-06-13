package br.com.bondturbo.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.bondturbo.calc.modelo.Memoria;
import br.com.bondturbo.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;
	
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(36, 30, 30));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.BOLD, 40));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 17));
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
