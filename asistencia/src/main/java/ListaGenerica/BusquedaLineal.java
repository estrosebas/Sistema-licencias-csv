package ListaGenerica;

import Entidad.Establecimiento;

public interface BusquedaLineal {
	
	public ListaEnlazadaImpl<Establecimiento> buscarPorGiro(String giroActividad);

	public ListaEnlazadaImpl<Establecimiento> buscarPorArea(Double Area);

	public ListaEnlazadaImpl<Establecimiento> buscarPorTipoLicencia(String tipoLicencia);
}
