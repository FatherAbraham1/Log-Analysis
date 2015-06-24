package com.shadowinlife.app.SQLModelFactory;

import java.io.*;
import java.sql.*;

public class RefreshTimes extends BaseBean implements Serializable {
    public RefreshTimes() {
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

    private Integer iRoleExperience;
    public void setiRoleExperience(Integer iRoleExperience){
        this.iRoleExperience=iRoleExperience;
    }
   public Integer getiRoleExperience() {
        return iRoleExperience;
    }

    private Integer iRoleSword;
    public void setiRoleSword(Integer iRoleSword){
        this.iRoleSword=iRoleSword;
    }
   public Integer getiRoleSword() {
        return iRoleSword;
    }

    private Integer iPartyId;
    public void setiPartyId(Integer iPartyId){
        this.iPartyId=iPartyId;
    }
   public Integer getiPartyId() {
        return iPartyId;
    }

    private String vPartyName;
    public void setvPartyName(String vPartyName){
        this.vPartyName=vPartyName;
    }
   public String getvPartyName() {
        return vPartyName;
    }

    private Integer iPartyLevel;
    public void setiPartyLevel(Integer iPartyLevel){
        this.iPartyLevel=iPartyLevel;
    }
   public Integer getiPartyLevel() {
        return iPartyLevel;
    }

    private Integer iRefreshParty;
    public void setiRefreshParty(Integer iRefreshParty){
        this.iRefreshParty=iRefreshParty;
    }
   public Integer getiRefreshParty() {
        return iRefreshParty;
    }

    private Integer iRefreshType;
    public void setiRefreshType(Integer iRefreshType){
        this.iRefreshType=iRefreshType;
    }
   public Integer getiRefreshType() {
        return iRefreshType;
    }

    private Integer iRefreshState;
    public void setiRefreshState(Integer iRefreshState){
        this.iRefreshState=iRefreshState;
    }
   public Integer getiRefreshState() {
        return iRefreshState;
    }

    private Integer iRefreshStateId;
    public void setiRefreshStateId(Integer iRefreshStateId){
        this.iRefreshStateId=iRefreshStateId;
    }
   public Integer getiRefreshStateId() {
        return iRefreshStateId;
    }

    private String jCostMoney;
    public void setjCostMoney(String jCostMoney){
        this.jCostMoney=jCostMoney;
    }
   public String getjCostMoney() {
        return jCostMoney;
    }

    private String jCostItems;
    public void setjCostItems(String jCostItems){
        this.jCostItems=jCostItems;
    }
   public String getjCostItems() {
        return jCostItems;
    }

    public RefreshTimes parseFromLogFile(String[] args, String GameId, String AccountType, String WorldId){
        return new RefreshTimes(GameId, AccountType, WorldId, args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9],args[10],args[11],args[12],args[13],args[14],args[15],args[16],args[17],args[18],args[19],args[20],args[21],args[22],args[23],args[24]);
    }

    public RefreshTimes(String GameId, String AccountType, String WorldId, String dtEventTime,String iEventId,String vVersionId,String vUin,String iRoleId,String vRoleName,String iRoleJob,String iRoleGender,String iRoleLevel,String iRoleVipLevel,String iRoleReputationLevel,String vRoleElse1,String vRoleElse2,String iRoleExperience,String iRoleSword,String iPartyId,String vPartyName,String iPartyLevel,String iRefreshParty,String iRefreshType,String iRefreshState,String iRefreshStateId,String jCostMoney,String jCostItems){
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
        this.iRoleExperience = Integer.valueOf(iRoleExperience);
        this.iRoleSword = Integer.valueOf(iRoleSword);
        this.iPartyId = Integer.valueOf(iPartyId);
        this.vPartyName = String.valueOf(vPartyName);
        this.iPartyLevel = Integer.valueOf(iPartyLevel);
        this.iRefreshParty = Integer.valueOf(iRefreshParty);
        this.iRefreshType = Integer.valueOf(iRefreshType);
        this.iRefreshState = Integer.valueOf(iRefreshState);
        this.iRefreshStateId = Integer.valueOf(iRefreshStateId);
        this.jCostMoney = String.valueOf(jCostMoney);
        this.jCostItems = String.valueOf(jCostItems);
    }
}
