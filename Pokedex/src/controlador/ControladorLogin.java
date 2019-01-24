package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import vista.VentanaLogin;



public final class ControladorLogin extends controlador implements KeyListener
{
	public String boxUsername;
	public char[] boxPassword;
        VentanaLogin vLogin;
        ControladorPrincipal cPrincipal;
        
	
	public ControladorLogin()
	{
            vLogin = new VentanaLogin();
            vLogin.setVisible(true);
            vLogin.GetBoxPassword().addKeyListener(this);
            vLogin.GetBoxUsername().addKeyListener(this);
	}


	@Override
	public void Notificar() 
	{
            if (cPrincipal != null)
            {
                cPrincipal.ValidarLogin();
            }
	}


	@Override
	public void keyPressed(KeyEvent e)
	{
            boolean isEnter = e.getKeyCode() == KeyEvent.VK_ENTER;
                
            if (isEnter) 
            {
               boxUsername = vLogin.GetBoxUsername().getText();
               boxPassword = vLogin.GetBoxPassword().getPassword();
               Notificar();
            }	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
        {
		// TODO Auto-generated method stub	
	}

        public void SetcPrincipal(ControladorPrincipal cPrincipal)
        {
            this.cPrincipal = cPrincipal;
        }
}
