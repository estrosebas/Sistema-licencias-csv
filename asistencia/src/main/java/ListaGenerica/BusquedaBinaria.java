package ListaGenerica;

import Entidad.Establecimiento;

public interface BusquedaBinaria {

	public ListaEnlazadaImpl<Establecimiento> buscarPorRuc(String Ruc);

	public ListaEnlazadaImpl<Establecimiento> buscarPorGiro(String Giro);

	public ListaEnlazadaImpl<Establecimiento> buscarPorArea(Double Area);

	public ListaEnlazadaImpl<Establecimiento> buscarPorTipoLicencia(String TipoLicencia);

	public ListaEnlazadaImpl<Establecimiento> buscarPorCombinacion(String Ruc, String Giro, Double Area, String TipoLicencia);
}