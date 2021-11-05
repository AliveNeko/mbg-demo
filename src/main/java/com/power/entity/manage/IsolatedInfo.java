package com.power.entity.manage;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ISOLATED_INFO")
public class IsolatedInfo {
    @Id
    @Column(name = "RID")
    @GeneratedValue(generator = "JDBC")
    private Long rid;

    @Column(name = "ORG_ID")
    private Long orgId;

    @Column(name = "ISOLATED_NAME")
    private String isolatedName;

    @Column(name = "IF_INBOUND")
    private String ifInbound;

    @Column(name = "NATION")
    private String nation;

    @Column(name = "FLIGHT_NUM")
    private String flightNum;

    @Column(name = "CERTIFICATE_NUM")
    private String certificateNum;

    @Column(name = "CERTIFICATE_TYPE")
    private String certificateType;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "CARD_NUM")
    private String cardNum;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "INMATE_NAME")
    private String inmateName;

    @Column(name = "RIDGEPOLE")
    private String ridgepole;

    @Column(name = "FLOOR")
    private String floor;

    @Column(name = "ROOM_NUM")
    private String roomNum;

    @Column(name = "ISOLATED_START")
    private Date isolatedStart;

    @Column(name = "ISOLATED_END")
    private Date isolatedEnd;

    @Column(name = "PURPOSE_CODE")
    private String purposeCode;

    @Column(name = "PURPOSE_ADDR")
    private String purposeAddr;

    @Column(name = "INPUT_TYPE")
    private String inputType;

    @Column(name = "INPUT_ID")
    private Long inputId;

    @Column(name = "INPUT_NAME")
    private String inputName;

    @Column(name = "INPUT_ORGID")
    private Long inputOrgid;

    @Column(name = "INPUT_ORGNAME")
    private String inputOrgname;

    @Column(name = "INPUT_DATE")
    private Date inputDate;

    @Column(name = "UPDATE_ID")
    private Long updateId;

    @Column(name = "UPDATE_NAME")
    private String updateName;

    @Column(name = "UPDATE_ORGID")
    private Long updateOrgid;

    @Column(name = "UPDATE_ORGNAME")
    private String updateOrgname;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "AUDIT_ID")
    private Long auditId;

    @Column(name = "AUDIT_NAME")
    private String auditName;

    @Column(name = "AUDIT_ORGID")
    private Long auditOrgid;

    @Column(name = "AUDIT_ORGNAME")
    private String auditOrgname;

    @Column(name = "AUDIT_DATE")
    private Date auditDate;

    @Column(name = "ORG_CODE")
    private String orgCode;

    @Column(name = "ESTIMATED_DE_ISOLATION_DATE")
    private Date estimatedDeIsolationDate;

    @Column(name = "AUDIT_STATE")
    private String auditState;

    @Column(name = "ENTRY_TYPE")
    private String entryType;

    @Column(name = "SHIP")
    private String ship;

    @Column(name = "ENTRY_REMARKS")
    private String entryRemarks;

    @Column(name = "IF_ILLEGAL_ENTRY")
    private String ifIllegalEntry;

    @Column(name = "REMARKS")
    private String remarks;

    /**
     * @return RID
     */
    public Long getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Long rid) {
        this.rid = rid;
    }

    /**
     * @return ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * @return ISOLATED_NAME
     */
    public String getIsolatedName() {
        return isolatedName;
    }

    /**
     * @param isolatedName
     */
    public void setIsolatedName(String isolatedName) {
        this.isolatedName = isolatedName;
    }

    /**
     * @return IF_INBOUND
     */
    public String getIfInbound() {
        return ifInbound;
    }

    /**
     * @param ifInbound
     */
    public void setIfInbound(String ifInbound) {
        this.ifInbound = ifInbound;
    }

    /**
     * @return NATION
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * @return FLIGHT_NUM
     */
    public String getFlightNum() {
        return flightNum;
    }

    /**
     * @param flightNum
     */
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    /**
     * @return CERTIFICATE_NUM
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * @param certificateNum
     */
    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    /**
     * @return CERTIFICATE_TYPE
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * @param certificateType
     */
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * @return CARD_TYPE
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return CARD_NUM
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * @param cardNum
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return INMATE_NAME
     */
    public String getInmateName() {
        return inmateName;
    }

    /**
     * @param inmateName
     */
    public void setInmateName(String inmateName) {
        this.inmateName = inmateName;
    }

    /**
     * @return RIDGEPOLE
     */
    public String getRidgepole() {
        return ridgepole;
    }

    /**
     * @param ridgepole
     */
    public void setRidgepole(String ridgepole) {
        this.ridgepole = ridgepole;
    }

    /**
     * @return FLOOR
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return ROOM_NUM
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * @param roomNum
     */
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * @return ISOLATED_START
     */
    public Date getIsolatedStart() {
        return isolatedStart;
    }

    /**
     * @param isolatedStart
     */
    public void setIsolatedStart(Date isolatedStart) {
        this.isolatedStart = isolatedStart;
    }

    /**
     * @return ISOLATED_END
     */
    public Date getIsolatedEnd() {
        return isolatedEnd;
    }

    /**
     * @param isolatedEnd
     */
    public void setIsolatedEnd(Date isolatedEnd) {
        this.isolatedEnd = isolatedEnd;
    }

    /**
     * @return PURPOSE_CODE
     */
    public String getPurposeCode() {
        return purposeCode;
    }

    /**
     * @param purposeCode
     */
    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    /**
     * @return PURPOSE_ADDR
     */
    public String getPurposeAddr() {
        return purposeAddr;
    }

    /**
     * @param purposeAddr
     */
    public void setPurposeAddr(String purposeAddr) {
        this.purposeAddr = purposeAddr;
    }

    /**
     * @return INPUT_TYPE
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * @param inputType
     */
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * @return INPUT_ID
     */
    public Long getInputId() {
        return inputId;
    }

    /**
     * @param inputId
     */
    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    /**
     * @return INPUT_NAME
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * @param inputName
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * @return INPUT_ORGID
     */
    public Long getInputOrgid() {
        return inputOrgid;
    }

    /**
     * @param inputOrgid
     */
    public void setInputOrgid(Long inputOrgid) {
        this.inputOrgid = inputOrgid;
    }

    /**
     * @return INPUT_ORGNAME
     */
    public String getInputOrgname() {
        return inputOrgname;
    }

    /**
     * @param inputOrgname
     */
    public void setInputOrgname(String inputOrgname) {
        this.inputOrgname = inputOrgname;
    }

    /**
     * @return INPUT_DATE
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * @param inputDate
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * @return UPDATE_ID
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * @param updateId
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * @return UPDATE_NAME
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * @param updateName
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    /**
     * @return UPDATE_ORGID
     */
    public Long getUpdateOrgid() {
        return updateOrgid;
    }

    /**
     * @param updateOrgid
     */
    public void setUpdateOrgid(Long updateOrgid) {
        this.updateOrgid = updateOrgid;
    }

    /**
     * @return UPDATE_ORGNAME
     */
    public String getUpdateOrgname() {
        return updateOrgname;
    }

    /**
     * @param updateOrgname
     */
    public void setUpdateOrgname(String updateOrgname) {
        this.updateOrgname = updateOrgname;
    }

    /**
     * @return UPDATE_DATE
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return AUDIT_ID
     */
    public Long getAuditId() {
        return auditId;
    }

    /**
     * @param auditId
     */
    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    /**
     * @return AUDIT_NAME
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * @param auditName
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    /**
     * @return AUDIT_ORGID
     */
    public Long getAuditOrgid() {
        return auditOrgid;
    }

    /**
     * @param auditOrgid
     */
    public void setAuditOrgid(Long auditOrgid) {
        this.auditOrgid = auditOrgid;
    }

    /**
     * @return AUDIT_ORGNAME
     */
    public String getAuditOrgname() {
        return auditOrgname;
    }

    /**
     * @param auditOrgname
     */
    public void setAuditOrgname(String auditOrgname) {
        this.auditOrgname = auditOrgname;
    }

    /**
     * @return AUDIT_DATE
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * @param auditDate
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * @return ORG_CODE
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return ESTIMATED_DE_ISOLATION_DATE
     */
    public Date getEstimatedDeIsolationDate() {
        return estimatedDeIsolationDate;
    }

    /**
     * @param estimatedDeIsolationDate
     */
    public void setEstimatedDeIsolationDate(Date estimatedDeIsolationDate) {
        this.estimatedDeIsolationDate = estimatedDeIsolationDate;
    }

    /**
     * @return AUDIT_STATE
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * @param auditState
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    /**
     * @return ENTRY_TYPE
     */
    public String getEntryType() {
        return entryType;
    }

    /**
     * @param entryType
     */
    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    /**
     * @return SHIP
     */
    public String getShip() {
        return ship;
    }

    /**
     * @param ship
     */
    public void setShip(String ship) {
        this.ship = ship;
    }

    /**
     * @return ENTRY_REMARKS
     */
    public String getEntryRemarks() {
        return entryRemarks;
    }

    /**
     * @param entryRemarks
     */
    public void setEntryRemarks(String entryRemarks) {
        this.entryRemarks = entryRemarks;
    }

    /**
     * @return IF_ILLEGAL_ENTRY
     */
    public String getIfIllegalEntry() {
        return ifIllegalEntry;
    }

    /**
     * @param ifIllegalEntry
     */
    public void setIfIllegalEntry(String ifIllegalEntry) {
        this.ifIllegalEntry = ifIllegalEntry;
    }

    /**
     * @return REMARKS
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}