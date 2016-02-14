/*     */ package com.mysql.jdbc.jdbc2.optional;
/*     */ 
/*     */ import com.mysql.jdbc.Connection;
/*     */ import java.sql.SQLException;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.sql.StatementEvent;
/*     */ import javax.sql.StatementEventListener;
/*     */ 
/*     */ public class JDBC4MysqlPooledConnection extends MysqlPooledConnection
/*     */ {
/*     */   private Map<StatementEventListener, StatementEventListener> statementEventListeners;
/*     */ 
/*     */   public JDBC4MysqlPooledConnection(Connection connection)
/*     */   {
/*  51 */     super(connection);
/*     */ 
/*  53 */     this.statementEventListeners = new HashMap();
/*     */   }
/*     */ 
/*     */   public synchronized void close() throws SQLException {
/*  57 */     super.close();
/*     */ 
/*  59 */     if (this.statementEventListeners != null) {
/*  60 */       this.statementEventListeners.clear();
/*     */ 
/*  62 */       this.statementEventListeners = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void addStatementEventListener(StatementEventListener listener)
/*     */   {
/*  79 */     synchronized (this.statementEventListeners) {
/*  80 */       this.statementEventListeners.put(listener, listener);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void removeStatementEventListener(StatementEventListener listener)
/*     */   {
/*  96 */     synchronized (this.statementEventListeners) {
/*  97 */       this.statementEventListeners.remove(listener);
/*     */     }
/*     */   }
/*     */ 
/*     */   void fireStatementEvent(StatementEvent event) throws SQLException {
/* 102 */     synchronized (this.statementEventListeners) {
/* 103 */       for (StatementEventListener listener : this.statementEventListeners.keySet())
/* 104 */         listener.statementClosed(event);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\xampp\htdocs\SuiteCRM\SuiteCRM-7.5.1\custom\modules\AOS_Contracts\ReportGenerator.jar
 * Qualified Name:     com.mysql.jdbc.jdbc2.optional.JDBC4MysqlPooledConnection
 * JD-Core Version:    0.6.0
 */