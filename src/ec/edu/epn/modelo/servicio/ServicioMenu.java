package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.MenuVO;

public class ServicioMenu {

	public List<MenuVO> listarEntradas(){
		ConexionBD con = new ConexionBD();		
		List<MenuVO> entradas = new ArrayList<MenuVO>(); 		
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='1'");
		
		try {
			while(rs.next()){
				MenuVO i=new MenuVO();
				i.setNombrePlato(rs.getString(1));
				i.setDescripcionPlato(rs.getString(2));
				i.setPrecio(rs.getDouble(3));
				entradas.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return entradas; 
	}
	
	public List<MenuVO> listarPlatosFuertes()
	{
		ConexionBD con = new ConexionBD();
		List<MenuVO> platosFuertes = new ArrayList<MenuVO>();
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='2'");
		
		try 
		{
			while(rs.next())
			{
				MenuVO pf = new MenuVO();
				pf.setNombrePlato(rs.getString(1));
				pf.setDescripcionPlato(rs.getString(2));
				pf.setPrecio(rs.getDouble(3));
				platosFuertes.add(pf);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return platosFuertes;
	}
	
	public List<MenuVO> listarPostres()
	{
		ConexionBD con = new ConexionBD();
		List<MenuVO> postres = new ArrayList<MenuVO>();
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='3'");
		
		try 
		{
			while (rs.next()) 
			{
				MenuVO po = new MenuVO();
				po.setNombrePlato(rs.getString(1));
				po.setDescripcionPlato(rs.getString(2));
				po.setPrecio(rs.getDouble(3));
				postres.add(po);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return postres;
	}
	
	public List<MenuVO> listarBebidas()
	{
		ConexionBD con = new ConexionBD();
		List<MenuVO> bebidas = new ArrayList<MenuVO>();
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='4'");
		
		try 
		{
			while(rs.next())
			{
				MenuVO be = new MenuVO();
				be.setNombrePlato(rs.getString(1));
				be.setDescripcionPlato(rs.getString(2));
				be.setPrecio(rs.getDouble(3));
				bebidas.add(be);
			}			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return bebidas;
	}
	
}
