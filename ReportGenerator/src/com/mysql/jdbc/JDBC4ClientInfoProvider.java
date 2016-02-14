package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Properties;

public abstract interface JDBC4ClientInfoProvider
{
  public abstract void initialize(Connection paramConnection, Properties paramProperties)
    throws SQLException;

  public abstract void destroy()
    throws SQLException;

  public abstract Properties getClientInfo(Connection paramConnection)
    throws SQLException;

  public abstract String getClientInfo(Connection paramConnection, String paramString)
    throws SQLException;

  public abstract void setClientInfo(Connection paramConnection, Properties paramProperties)
    throws SQLClientInfoException;

  public abstract void setClientInfo(Connection paramConnection, String paramString1, String paramString2)
    throws SQLClientInfoException;
}

/* Location:           C:\xampp\htdocs\SuiteCRM\SuiteCRM-7.5.1\custom\modules\AOS_Contracts\ReportGenerator.jar
 * Qualified Name:     com.mysql.jdbc.JDBC4ClientInfoProvider
 * JD-Core Version:    0.6.0
 */