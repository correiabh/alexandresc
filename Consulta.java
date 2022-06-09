/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexandresc;

/**
 *
 * @author e227070
 */
public class Consulta {

    /**
     * @return the idconsulta
     */
    public int getIdconsulta() {
        return idconsulta;
    }

    /**
     * @param idconsulta the idconsulta to set
     */
    public void setIdconsulta(int idconsulta) {
        this.idconsulta = idconsulta;
    }

    /**
     * @return the idmedico
     */
    public int getIdmedico() {
        return idmedico;
    }

    /**
     * @param idmedico the idmedico to set
     */
    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    /**
     * @return the idpaciente
     */
    public int getIdpaciente() {
        return idpaciente;
    }

    /**
     * @param idpaciente the idpaciente to set
     */
    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    /**
     * @return the convenio
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
    private int idconsulta;
    private int idmedico;
    private int idpaciente;
    private String convenio;
    
}
