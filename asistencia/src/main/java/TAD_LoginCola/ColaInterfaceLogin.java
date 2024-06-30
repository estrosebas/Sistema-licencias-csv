package TAD_LoginCola;

import Entidad.Login;

public interface ColaInterfaceLogin {

	public void encolar(Login login);

	public Login desencolar();

	public Login frente();

	public boolean estaVacia();

	public void mostrar();
}
