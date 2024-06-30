/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author SrSebas
 */
public class Establecimiento {
	private String departamento;
	private String provincia;
	private String distrito;
	private String ubigeo;
	private String Gobierno_Local;
	private String Ruc_Estab;
	private String Giro_Actividad;
	private Double Area_Estab;
	private String Tipo_Licencia;

	public Establecimiento(String departamento, String provincia, String distrito, String ubigeo, String Gobierno_Local,
			String Ruc_Estab, String Giro_Actividad, Double Area_Estab, String Tipo_Licencia) {
		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
		this.ubigeo = ubigeo;
		this.Gobierno_Local = Gobierno_Local;
		this.Ruc_Estab = Ruc_Estab;
		this.Giro_Actividad = Giro_Actividad;
		this.Area_Estab = Area_Estab;
		this.Tipo_Licencia = Tipo_Licencia;
	}

	public Establecimiento(String Ruc_Estab, String Giro_Actividad, Double Area_Estab, String Tipo_Licencia) {
		this.Ruc_Estab = Ruc_Estab;
		this.Giro_Actividad = Giro_Actividad;
		this.Area_Estab = Area_Estab;
		this.Tipo_Licencia = Tipo_Licencia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getGobierno_Local() {
		return Gobierno_Local;
	}

	public void setGobierno_Local(String Gobierno_Local) {
		this.Gobierno_Local = Gobierno_Local;
	}

	public String getRuc_Estab() {
		return Ruc_Estab;
	}

	public void setRuc_Estab(String Ruc_Estab) {
		this.Ruc_Estab = Ruc_Estab;
	}

	public String getGiro_Actividad() {
		return Giro_Actividad;
	}

	public void setGiro_Actividad(String Giro_Actividad) {
		this.Giro_Actividad = Giro_Actividad;
	}

	public Double getArea_Estab() {
		return Area_Estab;
	}

	public void setArea_Estab(Double Area_Estab) {
		this.Area_Estab = Area_Estab;
	}

	public String getTipo_Licencia() {
		return Tipo_Licencia;
	}

	public void setTipo_Licencia(String Tipo_Licencia) {
		this.Tipo_Licencia = Tipo_Licencia;
	}
	@Override
    public String toString() {
        return "Establecimiento{" +
                "Ruc Establecimiento='" + Ruc_Estab + '\'' +
                ", Giro Actividad='" + Giro_Actividad + '\'' +
                ", Area Establecimiento=" + Area_Estab +
                ", Tipo Licencia='" + Tipo_Licencia + '\'' +
                '}';
    }
}