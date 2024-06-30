package TAD_Establecimiento;

import Entidad.Establecimiento;

public interface ListaInterfaceEstablecimiento {

	public void insertar(Establecimiento establecimiento);

	public boolean eliminar(String Ruc_Estab);

	public Establecimiento buscar(String Ruc_Estab);

	public void mostrar();

	public boolean estaVacia();
}
