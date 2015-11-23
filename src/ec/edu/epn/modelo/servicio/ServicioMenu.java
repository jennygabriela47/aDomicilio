package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.MenuVO;
import ec.edu.epn.modelo.vo.PedidoVO;

public class ServicioMenu {

	public List<MenuVO> listarEntradas(){
		ConexionBD con = new ConexionBD();		
		List<MenuVO> entradas = new ArrayList<MenuVO>(); 		
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO,p.CODIGOPLATO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='1'");
		
		try {
			while(rs.next()){
				MenuVO i=new MenuVO();
				i.setNombrePlato(rs.getString(1));
				i.setDescripcionPlato(rs.getString(2));
				i.setPrecio(rs.getDouble(3));
				i.setCodigoPlato(Integer.parseInt(rs.getString(4)));
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
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO,p.CODIGOPLATO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='2'");
		
		try 
		{
			while(rs.next())
			{
				MenuVO pf = new MenuVO();
				pf.setNombrePlato(rs.getString(1));
				pf.setDescripcionPlato(rs.getString(2));
				pf.setPrecio(rs.getDouble(3));
				pf.setCodigoPlato(Integer.parseInt(rs.getString(4)));
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
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO,p.CODIGOPLATO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='3'");
		
		try 
		{
			while (rs.next()) 
			{
				MenuVO po = new MenuVO();
				po.setNombrePlato(rs.getString(1));
				po.setDescripcionPlato(rs.getString(2));
				po.setPrecio(rs.getDouble(3));
				po.setCodigoPlato(Integer.parseInt(rs.getString(4)));
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
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO,p.CODIGOPLATO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='4'");
		
		try 
		{
			while(rs.next())
			{
				MenuVO be = new MenuVO();
				be.setNombrePlato(rs.getString(1));
				be.setDescripcionPlato(rs.getString(2));
				be.setPrecio(rs.getDouble(3));
				be.setCodigoPlato(Integer.parseInt(rs.getString(4)));
				bebidas.add(be);
			}			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return bebidas;
	}
	
	public List<PedidoVO> listarPedido(int codPedido)
	{
		ConexionBD con = new ConexionBD();
		List<PedidoVO> pedido = new ArrayList<PedidoVO>();
		
		ResultSet rs = con.consultar("select d.*,p.* from DETALLE d join PLATO p on d.CODIGOPLATO = p.CODIGOPLATO where d.CODIGOORDEN ='"+codPedido+"'");
		
		try 
		{
			while(rs.next())
			{
				PedidoVO ped = new PedidoVO();
				ped.setCodigoPlato(Integer.parseInt(rs.getString(2)));
				ped.setNombrePlato(rs.getString(6));
				ped.setPrecio(rs.getDouble(8));
				ped.setCantidad(Integer.parseInt(rs.getString(3)));
				pedido.add(ped);
			}			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return pedido;
	}
	
	public void setPlatoPedido (int codOrden,int codPlato,int cantidad){
		ConexionBD con = new ConexionBD();		
		con.insertar("INSERT INTO DETALLE (CODIGOORDEN,CODIGOPLATO,CANTIDAD) VALUES ("+codOrden+","+codPlato+","+cantidad+")");		
	}
	
	public void delPlatoPedido (int codOrden,int codPlato){
		ConexionBD con = new ConexionBD();		
		con.insertar("DELETE FROM DETALLE WHERE CODIGOORDEN = '"+codOrden+"' AND CODIGOPLATO = '"+codPlato+"'");		
	}
	
	public void setOrden (int codOrden){
		ConexionBD con = new ConexionBD();		
		con.insertar("INSERT INTO ORDEN (CODIGOORDEN) VALUES ("+codOrden+")");		
	}
	
	public int setOrden (int codUsr, int codSuc){
		ConexionBD con = new ConexionBD();	
		int codOrden = this.lastIdOrden()+1;
		con.insertar("INSERT INTO ORDEN (CODIGOORDEN,CODIGOUSUARIO,CODIGOSUCURSAL) VALUES ('"+codOrden+"','"+codUsr+"','"+codSuc+"')");
		return codOrden;
	}
	
	public void updateOrden (int codOrden,double subtotal,double total){
		ConexionBD con = new ConexionBD();		
		con.insertar("UPDATE ORDEN SET SUBTOTAL='"+subtotal+"', TOTAL='"+total+"' WHERE CODIGOORDEN='"+codOrden+"'");		
	}
	public void setPlato (String nombrePlato, String descripcionPlato, String precio, String idCategoria){
		ConexionBD con = new ConexionBD();		
		int id = this.lastIdPlato()+1;
		con.insertar("INSERT INTO PLATO (CODIGOPLATO, NOMBREPLATO, DESCRIPCIONPLATO, PRECIO, CODIGOCATEGORIA) VALUES ('"+id+"','"+nombrePlato+"','"+descripcionPlato+"','"+precio+"','"+idCategoria+"')");		
	}
	
	public int lastIdPlato(){
		ConexionBD con = new ConexionBD();
		
		ResultSet rs = con.consultar("select MAX(CODIGOPLATO) maxId from PLATO");
		
		int numero=0;
		
		try 
		{
			while(rs.next())
			{
				numero = rs.getInt("maxId");
			}			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return numero;
	}
	
	public int numPlatos(){
		ConexionBD con = new ConexionBD();
		
		ResultSet rs = con.consultar("select COUNT(*) AS 'NUMERO' FROM PLATO");
		
		int numero=0;
		
		try 
		{
			while(rs.next())
			{
				numero = rs.getInt("NUMERO");
			}			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return numero;
	}
	
	public int lastIdOrden(){
		ConexionBD con = new ConexionBD();
		
		ResultSet rs = con.consultar("select MAX(CODIGOORDEN) maxId from ORDEN");
		
		int numero=0;
		
		try 
		{
			while(rs.next())
			{
				numero = rs.getInt("maxId");
			}			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return numero;
	}
}
