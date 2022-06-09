/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexandresc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author e227070
 */
public class MedicoDao extends Conexao{
    
    public String cadastrarMedico(Medico medico)
    {
	try
	{
            String sentenca;
            sentenca = "INSERT INSO MEDICO VALUES (NULL,'" + medico.getNome() + "','"+ medico.getEspecialidade ()
            + "','" + medico.getCrm () + "','" + medico.getCpf () + "')";
        return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
                return e.getMessage();
        }
    }
    public String atualizarMedico (Medico medico)
    {
        try 
        {
            String sentenca;
            sentenca = "UPADATE MEDICO SET NOME ='" + medico.getNome() +
            "',ESPECIALIDADE ='" + medico.getEspecialidade()+ "'CRM = '" +
            medico.getCrm() + "'CPF = '" + medico.getCpf()+
            "' WHERE IDMEDICO = " + medico.getIdmedico ();
             return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
       
    }
    public String excluirMedico(String idmedico)
    {
        try {
            String sentenca;
            sentenca = "DELETE FROM MEDICO WHERE IDMEDICO =" + idmedico;
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public ArrayList listarMedico()
    {
        try {
            ArrayList listarMedicos = new ArrayList();
            String sentenca = "SELECT * FROM MEDICO ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while (rs.next())
            {
                Medico medico = new Medico();
                medico.setIdmedico(rs.getInt("IDMEDICO"));
                medico.setNome(rs.getString("NOME"));
                medico.setEspecialidade(rs.getInt("ESPECIALIDADE"));
                medico.setCrm(rs.getInt("CRM"));
                medico.setCpf(rs.getString("CPF"));
                listarMedicos.add(medico);
            }
            return listarMedicos;
        } 
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
         }
    }
}