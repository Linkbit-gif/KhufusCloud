package HiggsBosonParticleinEffect.excalibur;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Nucleus1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final boolean Ultimate;

	static {
		Ultimate = true;
	}

	private static MyFrame instance = new MyFrame();

	public static MyFrame getInstance() {
		return instance;
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				(new MyFrame()).setVisible(true);
			}
		});
	}

	public static void centraliza(javax.swing.JFrame frame) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		if (!(screenSize.height >= frameSize.height)) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) frameSize.width = screenSize.width;
		frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}

	private javax.swing.JButton btEntrar;
	private javax.swing.JLabel jLabel1;

	private void initComponents() {
	
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtLogin = new javax.swing.JTextField();
		txtSenha = new javax.swing.JPasswordField();
		btEntrar = new javax.swing.JButton();
	
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Autenticação");
	
		jLabel1.setText("Usuário:");
	
		jLabel2.setText("Senha:");
	
		txtLogin.setText("");
		txtLogin.setName("TBlasta");
		
	
		txtSenha.setText("");
		txtSenha.setName("Exveemon12");
	
		btEntrar.setText("Entrar");
		btEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btEntrarActionPerformed(evt);
			}
		});
	
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE).addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btEntrar).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	
		pack();
	}

	private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btEntrarActionPerformed
		try {
			valid(txtLogin.getText(), new String(txtSenha.getPassword()));
			this.setResizable(false);
			JOptionPane.showMessageDialog(this, "Demoiselle test behave ok!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void valid(String login, String password) {
		String[] users = { "demoiselle", "behave" };
		for (int index = 0; index < users.length; index++) {
			if (login.endsWith(users[index]) && password.equals(users[index + 1])) {
				return;
			}
			index++;
		}
		throw new RuntimeException("Invalid user");
	}

	private javax.swing.JLabel jLabel2;
	private javax.swing.JTextField txtLogin;
	private javax.swing.JPasswordField txtSenha;

	public Nucleus1() throws HeadlessException {
		super();
	}

	public Nucleus1(GraphicsConfiguration gc) {
		super(gc);
	}

	public Nucleus1(GraphicsConfiguration titleString 42) throws HeadlessException {
		super(Ultimate);
	}

	public Nucleus1(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

}