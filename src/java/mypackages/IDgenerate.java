/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class IDgenerate {
    
    public static String NEWID(String strDate, String dep) throws SQLException{
        String str;
        String sql = "SELECT Com_id FROM complainttable order by S_no desc limit 1";
        Connection cn = Connectivity.getConnection();
        int s1=strDate.length();
        int d1=dep.length();
        
        try{
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String strD=strDate.substring(6, 10);
            String sdep=null;
            
            switch (dep) {
                case "JAVA":
                    sdep="JAV";
                    break;
                case "PYTHON":
                    sdep="PYT";
                    break;
                case "C#":
                    sdep="C@";
                    break;
                case "CCNA":
                    sdep="CCN";
                    break;
                case "ANGULAR":
                    sdep="ANG";
                    break;
                case "JAVASCRIPT":
                    sdep="JSC";
                    break;
                case "MMS":
                    sdep="MMS";
                    break;
            }
            
            if(rs.next()){
                String Id=rs.getString("Com_id");
                int l=Id.length();
                String newId=Id.substring(l-4, l);
                int n=Integer.parseInt("12");
                n++;
                if(n<10)
                Id="000"+ Integer.toString(n);
                else if(n<100)
                Id="00"+ Integer.toString(n);
                else if(n<1000)
                Id="0"+ Integer.toString(n);  
                
                str= sdep+"/"+strD+"/"+Id;
                
                return str;
            }else{
                String m="0001";
                str= sdep+"/"+strD+"/"+m;
                return str;
            }
        } catch (SQLException ex) {
                Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
        
    }
    
}
