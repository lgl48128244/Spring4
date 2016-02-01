package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.util.Assert;

//@Service
public class JdbcTemplateService {
	//private JdbcTemplate jdbcTemplate = (JdbcTemplate) SpringUtil.getBean("jdbcTemplate");
	//@Resource(name = "jdbcTemplate")
	//@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void test() {
		jdbcTemplate.afterPropertiesSet();
		String updatesql = "update user_copy set pwd = '123456' where id='2001' ";
		String insertsql = "insert into user_copy (uname) values ('2580') ";
		//jdbcTemplate.batchUpdate(updatesql);
		jdbcTemplate.batchUpdate(insertsql);

	}

	public void testPreparedStatement() {
		int count = jdbcTemplate.execute(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				return con.prepareStatement("select count(1) from user_copy");
			}
		}, new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.execute();
				ResultSet rs = ps.getResultSet();
				rs.next();
				return rs.getInt(1);
			}
		});
		
		// Assert.notNull(count, "count not null");
		 org.junit.Assert.assertEquals(1, count);  
	}
}
