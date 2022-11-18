package com.anudip.Assignment;



	import org.springframework.jdbc.core.JdbcTemplate;
	public class Agentdao {

		private JdbcTemplate jdbcTemplate;

		public JdbcTemplate getjdbcTemplate() {
			return jdbcTemplate;
		}

		public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		
		public int saveAgent(Agent a)

		{
			String query = "insert into agent(id,name,commission) value(?,?,?)";
			return jdbcTemplate.update(query, a.getId(), a.getName(), a.getCommission());
		}

		// update agent details
		public int updateAgent(Agent a) {
			String query = "update agent set name='" + a.getName() + "',commission='" + a.getCommission()
					+ "' where id='" + a.getId() + "' ";
			return jdbcTemplate.update(query);
		}
		
		public int deleteAgent(Agent a) {
			String query = "delete From agent where id='" + a.getId() + "' ";
			return jdbcTemplate.update(query);
		}
}
