package chapter15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class SelectDAO extends DAO {

	public int review() throws Exception {
		List<Bean> list = new ArrayList<>();
		Connection con = ds.getConnection();

		Bean b = new Bean();
		String count = b.getCount();
		String payment = b.getMail();
		String review = b.getName();
		String mail = b.getPayment();

		String sql = "insert into productreview(count,payment,review,mail) values(?,?,?,?)";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, count);
		st.setString(2, payment);
		st.setString(3, review);
		st.setString(4, mail);
		int line = st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}
