package chapter15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends DAO{
	
	public List<Bean> All(String sort) throws Exception{
		List<Bean> list=new ArrayList<>();
		
		
		Connection con = getConnection();
		
		String sql="select * from product order by price ";
		
		if ("asc".equals(sort)) {
			sql += "asc";
		} else {
			sql += "desc";
		}
		
		PreparedStatement st=con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Bean b = new Bean();
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			b.setPrice(rs.getInt("price"));
			list.add(b);
		}

		rs.close();
		st.close();
		con.close();

		return list;

	}
}
