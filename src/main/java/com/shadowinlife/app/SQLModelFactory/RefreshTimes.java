package com.shadowinlife.app.SQLModelFactory;
import java.io.*;
import java.sql.*;

public class RefreshTimes extends BaseBean implements Serializable {
    public RefreshTimes() {
        super();
    }
    private Long iAccountType;
    private Long iGameId;
    private Long iWorldId;
    public Long getiAccountType() {
        return iAccountType;
    }
    public Long getiGameId() {
        return iGameId;
    }
    public Long getiWorldId() {
        return iWorldId;
    }
    public void setiAccountType(Long iAccountType) {
        this.iAccountType = iAccountType;
    }
    public void setiGameId(Long iGameId) {
        this.iGameId = iGameId;
    }
    public void setiWorldId(Long iWorldId) {
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

    private Long iRoleId;
    public void setiRoleId(Long iRoleId){
        this.iRoleId=iRoleId;
    }
   public Long getiRoleId() {
        return iRoleId;
    }

    private String vRoleName;
    public void setvRoleName(String vRoleName){
        this.vRoleName=vRoleName;
    }
   public String getvRoleName() {
        return vRoleName;
    }

    private Long iRoleJob;
    public void setiRoleJob(Long iRoleJob){
        this.iRoleJob=iRoleJob;
    }
   public Long getiRoleJob() {
        return iRoleJob;
    }

    private Long iRoleGender;
    public void setiRoleGender(Long iRoleGender){
        this.iRoleGender=iRoleGender;
    }
   public Long getiRoleGender() {
        return iRoleGender;
    }

    private Long iRoleLevel;
    public void setiRoleLevel(Long iRoleLevel){
        this.iRoleLevel=iRoleLevel;
    }
   public Long getiRoleLevel() {
        return iRoleLevel;
    }

    private Long iRoleVipLevel;
    public void setiRoleVipLevel(Long iRoleVipLevel){
        this.iRoleVipLevel=iRoleVipLevel;
    }
   public Long getiRoleVipLevel() {
        return iRoleVipLevel;
    }

    private Long iRoleReputationLevel;
    public void setiRoleReputationLevel(Long iRoleReputationLevel){
        this.iRoleReputationLevel=iRoleReputationLevel;
    }
   public Long getiRoleReputationLevel() {
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

    private Long iRoleExperience;
    public void setiRoleExperience(Long iRoleExperience){
        this.iRoleExperience=iRoleExperience;
    }
   public Long getiRoleExperience() {
        return iRoleExperience;
    }

    private Long iRoleSword;
    public void setiRoleSword(Long iRoleSword){
        this.iRoleSword=iRoleSword;
    }
   public Long getiRoleSword() {
        return iRoleSword;
    }

    private Long iPartyId;
    public void setiPartyId(Long iPartyId){
        this.iPartyId=iPartyId;
    }
   public Long getiPartyId() {
        return iPartyId;
    }

    private String vPartyName;
    public void setvPartyName(String vPartyName){
        this.vPartyName=vPartyName;
    }
   public String getvPartyName() {
        return vPartyName;
    }

    private Long iPartyLevel;
    public void setiPartyLevel(Long iPartyLevel){
        this.iPartyLevel=iPartyLevel;
    }
   public Long getiPartyLevel() {
        return iPartyLevel;
    }

    private Long iRefreshParty;
    public void setiRefreshParty(Long iRefreshParty){
        this.iRefreshParty=iRefreshParty;
    }
   public Long getiRefreshParty() {
        return iRefreshParty;
    }

    private Long iRefreshType;
    public void setiRefreshType(Long iRefreshType){
        this.iRefreshType=iRefreshType;
    }
   public Long getiRefreshType() {
        return iRefreshType;
    }

    private Long iRefreshState;
    public void setiRefreshState(Long iRefreshState){
        this.iRefreshState=iRefreshState;
    }
   public Long getiRefreshState() {
        return iRefreshState;
    }

    private Long iRefreshStateId;
    public void setiRefreshStateId(Long iRefreshStateId){
        this.iRefreshStateId=iRefreshStateId;
    }
   public Long getiRefreshStateId() {
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
        this.iGameId = Long.valueOf(GameId);
        this.iAccountType = Long.valueOf(AccountType);
        this.iWorldId = Long.valueOf(WorldId);
        this.dtEventTime = Timestamp.valueOf(dtEventTime);
        this.iEventId = Long.valueOf(iEventId);
        this.vVersionId = String.valueOf(vVersionId);
        this.vUin = String.valueOf(vUin);
        this.iRoleId = Long.valueOf(iRoleId);
        this.vRoleName = String.valueOf(vRoleName);
        this.iRoleJob = Long.valueOf(iRoleJob);
        this.iRoleGender = Long.valueOf(iRoleGender);
        this.iRoleLevel = Long.valueOf(iRoleLevel);
        this.iRoleVipLevel = Long.valueOf(iRoleVipLevel);
        this.iRoleReputationLevel = Long.valueOf(iRoleReputationLevel);
        this.vRoleElse1 = String.valueOf(vRoleElse1);
        this.vRoleElse2 = String.valueOf(vRoleElse2);
        this.iRoleExperience = Long.valueOf(iRoleExperience);
        this.iRoleSword = Long.valueOf(iRoleSword);
        this.iPartyId = Long.valueOf(iPartyId);
        this.vPartyName = String.valueOf(vPartyName);
        this.iPartyLevel = Long.valueOf(iPartyLevel);
        this.iRefreshParty = Long.valueOf(iRefreshParty);
        this.iRefreshType = Long.valueOf(iRefreshType);
        this.iRefreshState = Long.valueOf(iRefreshState);
        this.iRefreshStateId = Long.valueOf(iRefreshStateId);
        this.jCostMoney = String.valueOf(jCostMoney);
        this.jCostItems = String.valueOf(jCostItems);
    }
}
