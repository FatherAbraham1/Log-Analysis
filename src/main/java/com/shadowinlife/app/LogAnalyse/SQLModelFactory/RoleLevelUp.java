package com.shadowinlife.app.LogAnalyse.SQLModelFactory;

import java.sql.Date;

/**
 * 
 * @author shadowinlife
 * 
+------------------+---------------------+------+-----+---------+-------+
| Field            | Type                | Null | Key | Default | Extra |
+------------------+---------------------+------+-----+---------+-------+
| vTableFlage      | varchar(64)         | NO   |     |         |       |
| iEventId         | varchar(64)         | NO   |     |         |       |
| iUin             | varchar(64)         | NO   |     |         |       |
| dtEventTime      | datetime            | YES  |     | NULL    |       |
| vClientIp        | varchar(32)         | NO   |     |         |       |
| iRoleId          | int(11) unsigned    | NO   |     | 0       |       |
| vRoleName        | varchar(32)         | NO   |     |         |       |
| iJobId           | int(11) unsigned    | NO   |     | 0       |       |
| iGender          | int(11) unsigned    | NO   |     | 0       |       |
| iRoleLevel       | int(11) unsigned    | NO   |     | 0       |       |
| iRoleExp         | int(11) unsigned    | NO   |     | 0       |       |
| lTotalOnlineTime | bigint(11) unsigned | NO   |     | 0       |       |
| iReason          | int(11) unsigned    | NO   |     | 0       |       |
+------------------+---------------------+------+-----+---------+-------+
 */
public class RoleLevelUp {

    private String iEventId;
    private String iUin;
    private Date dtEventTime;
    private String vClientIp;
    private int iRoleId;
    private String vRoleName;
    private int iJobId;
    private int iGender;
    private int iRoleLevel;
    private int iRoleExp;
    private long iTotalOnlineTime;
    private int iReason;

    public RoleLevelUp(String iEventId, String iUin, String dtEventTime, String vClientIp,
            String iRoleId, String vRoleName, String iJobId, String iGender, String iRoleLevel,
            String iRoleExp, String iTotalOnlineTime, String iReason) {
        try {
            this.iEventId = iEventId;
            this.iUin = iUin;
            this.dtEventTime = Date.valueOf(dtEventTime);
            this.vClientIp = vClientIp;
            this.iRoleId = Integer.valueOf(iRoleId);
            this.vRoleName = vRoleName;
            this.iJobId = Integer.valueOf(iJobId);
            this.iGender = Integer.valueOf(iGender);
            this.iRoleLevel = Integer.valueOf(iRoleLevel);
            this.iRoleExp = Integer.valueOf(iRoleExp);
            this.iTotalOnlineTime = Long.valueOf(iTotalOnlineTime);
            this.iReason = Integer.valueOf(iReason);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }

    public String getiEventId() {
        return iEventId;
    }

    public void setiEventId(String iEventId) {
        this.iEventId = iEventId;
    }

    public String getiUin() {
        return iUin;
    }

    public void setiUin(String iUin) {
        this.iUin = iUin;
    }

    public Date getDtEventTime() {
        return dtEventTime;
    }

    public void setDtEventTime(Date dtEventTime) {
        this.dtEventTime = dtEventTime;
    }

    public String getvClientIp() {
        return vClientIp;
    }

    public void setvClientIp(String vClientIp) {
        this.vClientIp = vClientIp;
    }

    public int getiRoleId() {
        return iRoleId;
    }

    public void setiRoleId(int iRoleId) {
        this.iRoleId = iRoleId;
    }

    public String getvRoleName() {
        return vRoleName;
    }

    public void setvRoleName(String vRoleName) {
        this.vRoleName = vRoleName;
    }

    public int getiJobId() {
        return iJobId;
    }

    public void setiJobId(int iJobId) {
        this.iJobId = iJobId;
    }

    public int getiGender() {
        return iGender;
    }

    public void setiGender(int iGender) {
        this.iGender = iGender;
    }

    public int getiRoleLEvel() {
        return iRoleLevel;
    }

    public void setiRoleLEvel(int iRoleLEvel) {
        this.iRoleLevel = iRoleLEvel;
    }

    public int getiRoleExp() {
        return iRoleExp;
    }

    public void setiRoleExp(int iRoleExp) {
        this.iRoleExp = iRoleExp;
    }

    public long getiTotalOnlineTime() {
        return iTotalOnlineTime;
    }

    public void setiTotalOnlineTime(long iTotalOnlineTime) {
        this.iTotalOnlineTime = iTotalOnlineTime;
    }

    public int getiReason() {
        return iReason;
    }

    public void setiReason(int iReason) {
        this.iReason = iReason;
    }

    public static RoleLevelUp parseFromLogFile(String logline) {
        String[] columnList = logline.split("\\|", 15);
        if (columnList.length == 12) {
            for (int i = 0; i < 12; i++) {
                if (columnList[i] == null) {
                    columnList[i] = "-1";
                }
            }
            return new RoleLevelUp(columnList[1], columnList[2], columnList[3], columnList[4],
                    columnList[5], columnList[6], columnList[7], columnList[8], columnList[9],
                    columnList[10], columnList[11], columnList[12]);
        } else {
            return null;
        }
    }
}