package com.shadowinlife.app.SQLModelFactory;

import java.io.*;
import java.sql.*;

public class LearnSkill extends BaseBean implements Serializable {
    public LearnSkill() {
        super();
    }
    private int iAccountType;
    private int iGameId;
    private int iWorldId;
    public int getiAccountType() {
        return iAccountType;
    }
    public int getiGameId() {
        return iGameId;
    }
    public int getiWorldId() {
        return iWorldId;
    }
    public void setiAccountType(int iAccountType) {
        this.iAccountType = iAccountType;
    }
    public void setiGameId(int iGameId) {
        this.iGameId = iGameId;
    }
    public void setiWorldId(int iWorldId) {
        this.iWorldId = iWorldId;
    }
    private Timestamp dtEventTime;
    public void setdtEventTime(Timestamp dtEventTime){
        this.dtEventTime=dtEventTime;
    }
   public Timestamp getdtEventTime() {
        return dtEventTime;
    }

    private Long iEventId;
    public void setiEventId(Long iEventId){
        this.iEventId=iEventId;
    }
   public Long getiEventId() {
        return iEventId;
    }

    private String vVersionId;
    public void setvVersionId(String vVersionId){
        this.vVersionId=vVersionId;
    }
   public String getvVersionId() {
        return vVersionId;
    }

    private String vUin;
    public void setvUin(String vUin){
        this.vUin=vUin;
    }
   public String getvUin() {
        return vUin;
    }

    private Integer iRoleId;
    public void setiRoleId(Integer iRoleId){
        this.iRoleId=iRoleId;
    }
   public Integer getiRoleId() {
        return iRoleId;
    }

    private String vRoleName;
    public void setvRoleName(String vRoleName){
        this.vRoleName=vRoleName;
    }
   public String getvRoleName() {
        return vRoleName;
    }

    private Integer iRoleJob;
    public void setiRoleJob(Integer iRoleJob){
        this.iRoleJob=iRoleJob;
    }
   public Integer getiRoleJob() {
        return iRoleJob;
    }

    private Integer iRoleGender;
    public void setiRoleGender(Integer iRoleGender){
        this.iRoleGender=iRoleGender;
    }
   public Integer getiRoleGender() {
        return iRoleGender;
    }

    private Integer iRoleLevel;
    public void setiRoleLevel(Integer iRoleLevel){
        this.iRoleLevel=iRoleLevel;
    }
   public Integer getiRoleLevel() {
        return iRoleLevel;
    }

    private Integer iRoleVipLevel;
    public void setiRoleVipLevel(Integer iRoleVipLevel){
        this.iRoleVipLevel=iRoleVipLevel;
    }
   public Integer getiRoleVipLevel() {
        return iRoleVipLevel;
    }

    private Integer iRoleReputationLevel;
    public void setiRoleReputationLevel(Integer iRoleReputationLevel){
        this.iRoleReputationLevel=iRoleReputationLevel;
    }
   public Integer getiRoleReputationLevel() {
        return iRoleReputationLevel;
    }

    private String vRoleElse1;
    public void setvRoleElse1(String vRoleElse1){
        this.vRoleElse1=vRoleElse1;
    }
   public String getvRoleElse1() {
        return vRoleElse1;
    }

    private String vRoleElse2;
    public void setvRoleElse2(String vRoleElse2){
        this.vRoleElse2=vRoleElse2;
    }
   public String getvRoleElse2() {
        return vRoleElse2;
    }

    private Integer iMapId;
    public void setiMapId(Integer iMapId){
        this.iMapId=iMapId;
    }
   public Integer getiMapId() {
        return iMapId;
    }

    private Integer iPosX;
    public void setiPosX(Integer iPosX){
        this.iPosX=iPosX;
    }
   public Integer getiPosX() {
        return iPosX;
    }

    private Integer iPosY;
    public void setiPosY(Integer iPosY){
        this.iPosY=iPosY;
    }
   public Integer getiPosY() {
        return iPosY;
    }

    private Integer iSkillTpye;
    public void setiSkillTpye(Integer iSkillTpye){
        this.iSkillTpye=iSkillTpye;
    }
   public Integer getiSkillTpye() {
        return iSkillTpye;
    }

    private Integer iSkillId;
    public void setiSkillId(Integer iSkillId){
        this.iSkillId=iSkillId;
    }
   public Integer getiSkillId() {
        return iSkillId;
    }

    private Integer iCurrSkillLv;
    public void setiCurrSkillLv(Integer iCurrSkillLv){
        this.iCurrSkillLv=iCurrSkillLv;
    }
   public Integer getiCurrSkillLv() {
        return iCurrSkillLv;
    }

    private Integer iSkillLvAfterLearn;
    public void setiSkillLvAfterLearn(Integer iSkillLvAfterLearn){
        this.iSkillLvAfterLearn=iSkillLvAfterLearn;
    }
   public Integer getiSkillLvAfterLearn() {
        return iSkillLvAfterLearn;
    }

    private Integer iNpcId;
    public void setiNpcId(Integer iNpcId){
        this.iNpcId=iNpcId;
    }
   public Integer getiNpcId() {
        return iNpcId;
    }

    private Integer iNpcPosX;
    public void setiNpcPosX(Integer iNpcPosX){
        this.iNpcPosX=iNpcPosX;
    }
   public Integer getiNpcPosX() {
        return iNpcPosX;
    }

    private Integer iNpcPosY;
    public void setiNpcPosY(Integer iNpcPosY){
        this.iNpcPosY=iNpcPosY;
    }
   public Integer getiNpcPosY() {
        return iNpcPosY;
    }

    public LearnSkill parseFromLogFile(String[] args, String GameId, String AccountType, String WorldId){
        return new LearnSkill(GameId, AccountType, WorldId, args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9],args[10],args[11],args[12],args[13],args[14],args[15],args[16],args[17],args[18],args[19],args[20],args[21],args[22],args[23]);
    }

    public LearnSkill(String GameId, String AccountType, String WorldId, String dtEventTime,String iEventId,String vVersionId,String vUin,String iRoleId,String vRoleName,String iRoleJob,String iRoleGender,String iRoleLevel,String iRoleVipLevel,String iRoleReputationLevel,String vRoleElse1,String vRoleElse2,String iMapId,String iPosX,String iPosY,String iSkillTpye,String iSkillId,String iCurrSkillLv,String iSkillLvAfterLearn,String iNpcId,String iNpcPosX,String iNpcPosY){
        this.iGameId = Integer.valueOf(GameId);
        this.iAccountType = Integer.valueOf(AccountType);
        this.iWorldId = Integer.valueOf(WorldId);
        this.dtEventTime = Timestamp.valueOf(dtEventTime);
        this.iEventId = Long.valueOf(iEventId);
        this.vVersionId = String.valueOf(vVersionId);
        this.vUin = String.valueOf(vUin);
        this.iRoleId = Integer.valueOf(iRoleId);
        this.vRoleName = String.valueOf(vRoleName);
        this.iRoleJob = Integer.valueOf(iRoleJob);
        this.iRoleGender = Integer.valueOf(iRoleGender);
        this.iRoleLevel = Integer.valueOf(iRoleLevel);
        this.iRoleVipLevel = Integer.valueOf(iRoleVipLevel);
        this.iRoleReputationLevel = Integer.valueOf(iRoleReputationLevel);
        this.vRoleElse1 = String.valueOf(vRoleElse1);
        this.vRoleElse2 = String.valueOf(vRoleElse2);
        this.iMapId = Integer.valueOf(iMapId);
        this.iPosX = Integer.valueOf(iPosX);
        this.iPosY = Integer.valueOf(iPosY);
        this.iSkillTpye = Integer.valueOf(iSkillTpye);
        this.iSkillId = Integer.valueOf(iSkillId);
        this.iCurrSkillLv = Integer.valueOf(iCurrSkillLv);
        this.iSkillLvAfterLearn = Integer.valueOf(iSkillLvAfterLearn);
        this.iNpcId = Integer.valueOf(iNpcId);
        this.iNpcPosX = Integer.valueOf(iNpcPosX);
        this.iNpcPosY = Integer.valueOf(iNpcPosY);
    }
}
