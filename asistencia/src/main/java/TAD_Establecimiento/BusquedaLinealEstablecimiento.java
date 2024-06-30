package TAD_Establecimiento;

public interface BusquedaLinealEstablecimiento {

	public ListaEnlazadaImplEstablecimiento buscarPorGiro(String giroActividad);

	public ListaEnlazadaImplEstablecimiento buscarPorArea(Double Area);

	public ListaEnlazadaImplEstablecimiento buscarPorTipoLicencia(String tipoLicencia);
}
