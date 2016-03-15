 package com.co.hsg.generator.core;
 
 import com.co.hsg.generator.bean.ReportField;
 import com.co.hsg.generator.bean.ReportParams;
 import com.co.hsg.generator.bean.Reports;
 import com.co.hsg.generator.db.DBManagerDAO;
 import com.co.hsg.generator.io.FileManager;
 import com.co.hsg.generator.log.LogInfo;
 import com.co.hsg.generator.util.Util;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Map;
 
 public class DataFileManager
 {
   private DBManagerDAO db;
   private static final String PRE = "REPORT.";
 
   public DataFileManager()
   {
     this.db = new DBManagerDAO();
   }
 
   public List<Object> dataToObject(Reports repo, String data)
     throws Exception
   {
     LogInfo.T("[DataFileManager] cargando Informacion..");
     List objects = new ArrayList();
 
     boolean cont = true;
     try
     {
       switch (repo)
       {
       case CONTRATO_ADMON_VIVIENDA:
         LogInfo.T("[DataFileManager] convirtiendo Objetos DVC_MES");
         objects.add(datatoReport(data));
         LogInfo.T("[DataFileManager] agregado ");
       }
 
     }
     catch (ArrayIndexOutOfBoundsException e)
     {
       LogInfo.E("[DataFileManager] Falla al generar  por  datos recibidos Incompletos ", e);
     }
 
     return objects;
   }
 
   private ReportField datatoReport(String data)
     throws ArrayIndexOutOfBoundsException
   {
     String[] inf = data.split(",");
 
     ReportField v = new ReportField();
     v.setARRENDATARIO1("arreendador uno");
     v.setDEUDOR1("Deudor 1");
 
     return v;
   }
 
   public void addReport()
   {
   }
 
   public ReportParams getReportInfo(Reports report, String contractID) throws Exception {
     ReportField reportInfo = this.db.getContract(contractID, report);
 
     ReportParams r = new ReportParams();
     r.setReport(report);
     r.generateUID();
     String jasper = "", subreportHeader = "",subreportSign = "",subreportArr = "";
     
     jasper = FileManager.getInst().leerPropiedad("REPORT." + report.name());
     subreportSign = FileManager.getInst().leerPropiedad("SUBREPORT.SIGN");
     subreportHeader = FileManager.getInst().leerPropiedad("SUBREPORT.HEADER");
     subreportArr = FileManager.getInst().leerPropiedad("SUBREPORT.HEADER_ARRENDATARIOS");
     
     r.setJasperFile(Util.getAbsolutePath(jasper));
     //SUBREPORTS
     r.addParam("SUBREPORT", Util.getAbsolutePath(subreportHeader));
     r.addParam("SUBREPORTSIGN", Util.getAbsolutePath(subreportSign));
     r.addParam("SUBREPORTARRENDATARIOS", Util.getAbsolutePath(subreportArr));

     if (reportInfo != null) {
       r.setDatos(reportInfo);
       return r;
     }
     return null;
   }
 
   public Map<Reports, ReportParams> chargeParams()
     throws Exception
   {
     return null;
   }
 
   public void insertReportToSugar(ReportParams reportInfo, Reports reportTemplate) throws Exception
   {
     this.db.saveFile(reportInfo.getReportID(), reportInfo.getDatos(), reportInfo.getFileName(), reportTemplate.name());
   }
 }

