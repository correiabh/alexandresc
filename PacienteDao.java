/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexandresc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author e227070
 */
public class PacienteDao extends Conexao{
    
    public String TelaCadastroPaciente(Paciente paciente)
    {
	try
	{
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL,'" + paciente.getNome() + "','" + paciente.getCpf ()
            + "','" + paciente.getIdade() + "')";
        return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
                return e.getMessage();
        }
    }

public String atualizarPaciente(Paciente paciente)
    {
        try 
        {
            String sentenca;
            sentenca = "UPDATE PACIENTE SET NOME ='" + paciente.getNome() +
                "',CPF = '" + paciente.getCpf() + "',Idade = '" +
                paciente.getIdade() +
                "' WHERE IDPACIENTE = " + paciente.getIdpaciente();
            return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
    }

public String excluirPaciente(String idpaciente)
    {
        try 
        {
            String sentenca;
            sentenca = "DELETE FROM PACIENTE WHERE IDPACIENTE =" + idpaciente;
            return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
    }
    
public ArrayList listarPaciente()
    {
        try {
            ArrayList pacientes = new ArrayList();
            String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            
            while (rs.next())
            {
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("IDPACIENTE"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setCpf(rs.getString("CPF"));
                paciente.setIdade(rs.getInt("IDADE"));
                pacientes.add(paciente);
            }
            return pacientes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
