package TAD_Establecimiento;

public interface BusquedaBinariaEstablecimiento {

    public ListaEnlazadaImplEstablecimiento buscarPorRuc(String Ruc);

    public ListaEnlazadaImplEstablecimiento buscarPorGiro(String Giro);

    public ListaEnlazadaImplEstablecimiento buscarPorArea(Double Area);

    public ListaEnlazadaImplEstablecimiento buscarPorTipoLicencia(String TipoLicencia);

    public ListaEnlazadaImplEstablecimiento buscarPorCombinacion(String Ruc, String Giro, int Area, String TipoLicencia);
}