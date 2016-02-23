/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class LoginBeanDao {

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate template;

	static Logger logger = LogManager.getLogger(LoginBeanDao.class);
	public LoginBeanDao(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getLoginPassword(String userName) {
		try{

			String query = "select password from REQUESTOR_INFO where binary username=?";
			Object[] inputs = new Object[] { userName };

			String password = jdbcTemplate.queryForObject(query, inputs,
					String.class);
			logger.debug("Inside getLoginPassword() password:"+ password);
			return password;
		}
		catch(Exception e){
			logger.debug("Inside getLoginPassword() password:Not matched with DB");
			return "";
		}
	}
}

/*
 * @SuppressWarnings("unchecked") public List<LoginBean> getAllRequestorInfo() {
 * return (List<LoginBean>)jdbcTemplate.query("select * from REQUESTOR_INFO",
 * new RowMapper() {
 * 
 * @Override public LoginBean mapRow(ResultSet rs, int rownumber) throws
 * SQLException { LoginBean e = new LoginBean(); e.setUserName(rs.getString(2));
 * e.setPassWord(rs.getString(3)); return e; } }); }
 */

