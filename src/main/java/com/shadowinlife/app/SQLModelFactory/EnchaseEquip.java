package com.shadowinlife.app.SQLModelFactory;

import java.io.*;
import java.sql.*;

public class EnchaseEquip extends BaseBean implements Serializable {
    public EnchaseEquip() {
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

    private Integer iEnchageAction;
    public void setiEnchageAction(Integer iEnchageAction){
        this.iEnchageAction=iEnchageAction;
    }
   public Integer getiEnchageAction() {
        return iEnchageAction;
    }

    private Integer iEnchageEquipIdType;
    public void setiEnchageEquipIdType(Integer iEnchageEquipIdType){
        this.iEnchageEquipIdType=iEnchageEquipIdType;
    }
   public Integer getiEnchageEquipIdType() {
        return iEnchageEquipIdType;
    }

    private Integer iEnchageEquipIdID;
    public void setiEnchageEquipIdID(Integer iEnchageEquipIdID){
        this.iEnchageEquipIdID=iEnchageEquipIdID;
    }
   public Integer getiEnchageEquipIdID() {
        return iEnchageEquipIdID;
    }

    private String jEnchageEquipIdAtrr;
    public void setjEnchageEquipIdAtrr(String jEnchageEquipIdAtrr){
        this.jEnchageEquipIdAtrr=jEnchageEquipIdAtrr;
    }
   public String getjEnchageEquipIdAtrr() {
        return jEnchageEquipIdAtrr;
    }

    private String jCostItemAtrr;
    public void setjCostItemAtrr(String jCostItemAtrr){
        this.jCostItemAtrr=jCostItemAtrr;
    }
   public String getjCostItemAtrr() {
        return jCostItemAtrr;
    }

    private Boolean bResult;
    public void setbResult(Boolean bResult){
        this.bResult=bResult;
    }
   public Boolean getbResult() {
        return bResult;
    }

    public EnchaseEquip parseFromLogFile(String[] args, String GameId, String AccountType, String WorldId){
        return new EnchaseEquip(GameId, AccountType, WorldId, args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9],args[10],args[11],args[12],args[13],args[14],args[15],args[16],args[17],args[18],args[19]);
    }

    public EnchaseEquip(String GameId, String AccountType, String WorldId, String dtEventTime,String iEventId,String vVersionId,String vUin,String iRoleId,String vRoleName,String iRoleJob,String iRoleGender,String iRoleLevel,String iRoleVipLevel,String iRoleReputationLevel,String vRoleElse1,String vRoleElse2,String iEnchageAction,String iEnchageEquipIdType,String iEnchageEquipIdID,String jEnchageEquipIdAtrr,String jCostItemAtrr,String bResult){
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
        this.iEnchageAction = Integer.valueOf(iEnchageAction);
        this.iEnchageEquipIdType = Integer.valueOf(iEnchageEquipIdType);
        this.iEnchageEquipIdID = Integer.valueOf(iEnchageEquipIdID);
        this.jEnchageEquipIdAtrr = String.valueOf(jEnchageEquipIdAtrr);
        this.jCostItemAtrr = String.valueOf(jCostItemAtrr);
        this.bResult = Boolean.valueOf(bResult);
    }
}
