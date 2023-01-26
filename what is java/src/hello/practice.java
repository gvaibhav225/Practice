package hello;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package hibernate;

import hibernate.Entity;

@Entity
public class employee {

	private int id;
	private String name;
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

} 












package hibernate;

import java.lang.module.Configuration;


public class storedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee e1=new employee(1,"vaibhav");
		
		//create session factory object
		SessionFactory s=new Configuration()
		
		
		
		
		
		
		
	}

}



























<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-mapping PUBLIC 
"-//Hibernate/Hibernate Mapping DTD//EN"
"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd"> 

<hibernate-mapping>
   <class name = "hibernate.employee" table = "employee">
      

      
      <id name = "id" type = "int" column = "id">
         <generator class="assigned"/>
      </id>
      
      <property name = "id" column = "id" type = "string"/>
      <property name = "name" column = "last_name" type = "string"/>
    
      
   </class>
</hibernate-mapping>






















<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC 
  "-//Hibernate/Hibernate Configuration DTD 3.0//EN" 
  "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<!-- Version 8 MySQL hiberante-cfg.xml example for Hibernate 5 -->
<hibernate-configuration>
  <session-factory>
    <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <!-- property name="connection.driver_class">com.mysql.jdbc.Driver</property -->
    <property name="connection.url">jdbc:mysql://localhost/sqlconnect</property>
    <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
    <property name="connection.username">root</property>
    <property name="connection.password">Gvaibhav522@</property>
    <property name="connection.pool_size">3</property>
    <!--property name="dialect">org.hibernate.dialect.MySQLDialect</property-->
    <property name="current_session_context_class">thread</property>
    <property name="show_sql">true</property>
    <property name="format_sql">true</property>
    <property name="hbm2ddl.auto">update</property>
    <mapping resource="employee.hbm.xml" />
  </session-factory>
</hibernate-configuration>


































