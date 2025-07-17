package com.example.ussdfilefolder.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "call_detail_records")
public class CallDetailRecord {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "record_date", nullable = false)
    private Timestamp recordDate;

    @Column(name = "l_spc")
    private Integer lSpc;

    @Column(name = "l_ssn")
    private Integer lSsn;

    @Column(name = "l_ri")
    private Integer lRi;

    @Column(name = "l_gt_i")
    private Integer lGtI;

    @Column(name = "l_gt_digits")
    private String lGtDigits;

    @Column(name = "r_spc")
    private Integer rSpc;

    @Column(name = "r_ssn")
    private Integer rSsn;

    @Column(name = "r_ri")
    private Integer rRi;

    @Column(name = "r_gt_i")
    private Integer rGtI;

    @Column(name = "r_gt_digits")
    private String rGtDigits;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "or_nature")
    private Integer orNature;

    @Column(name = "or_plan")
    private Integer orPlan;

    @Column(name = "or_digits")
    private String orDigits;

    @Column(name = "de_nature")
    private Integer deNature;

    @Column(name = "de_plan")
    private Integer dePlan;

    @Column(name = "de_digits")
    private String deDigits;

    @Column(name = "isdn_nature")
    private Integer isdnNature;

    @Column(name = "isdn_plan")
    private Integer isdnPlan;

    @Column(name = "msisdn")
    private String msisdn;

    @Column(name = "vlr_nature")
    private Integer vlrNature;

    @Column(name = "vlr_plan")
    private Integer vlrPlan;

    @Column(name = "vlr_digits")
    private String vlrDigits;

    @Column(name = "imsi")
    private String imsi;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "tstamp", nullable = false)
    private Timestamp tstamp;

    @Column(name = "local_dialog_id")
    private Long localDialogId;

    @Column(name = "remote_dialog_id")
    private Long remoteDialogId;

    @Column(name = "dialog_duration")
    private Long dialogDuration;

    @Column(name = "ussd_string")
    private String ussdString;

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Timestamp getRecordDate() { return recordDate; }
    public void setRecordDate(Timestamp recordDate) { this.recordDate = recordDate; }

    public Integer getLSpc() { return lSpc; }
    public void setLSpc(Integer lSpc) { this.lSpc = lSpc; }

    public Integer getLSsn() { return lSsn; }
    public void setLSsn(Integer lSsn) { this.lSsn = lSsn; }

    public Integer getLRi() { return lRi; }
    public void setLRi(Integer lRi) { this.lRi = lRi; }

    public Integer getLGtI() { return lGtI; }
    public void setLGtI(Integer lGtI) { this.lGtI = lGtI; }

    public String getLGtDigits() { return lGtDigits; }
    public void setLGtDigits(String lGtDigits) { this.lGtDigits = lGtDigits; }

    public Integer getRSpc() { return rSpc; }
    public void setRSpc(Integer rSpc) { this.rSpc = rSpc; }

    public Integer getRSsn() { return rSsn; }
    public void setRSsn(Integer rSsn) { this.rSsn = rSsn; }

    public Integer getRRi() { return rRi; }
    public void setRRi(Integer rRi) { this.rRi = rRi; }

    public Integer getRGtI() { return rGtI; }
    public void setRGtI(Integer rGtI) { this.rGtI = rGtI; }

    public String getRGtDigits() { return rGtDigits; }
    public void setRGtDigits(String rGtDigits) { this.rGtDigits = rGtDigits; }

    public String getServiceCode() { return serviceCode; }
    public void setServiceCode(String serviceCode) { this.serviceCode = serviceCode; }

    public Integer getOrNature() { return orNature; }
    public void setOrNature(Integer orNature) { this.orNature = orNature; }

    public Integer getOrPlan() { return orPlan; }
    public void setOrPlan(Integer orPlan) { this.orPlan = orPlan; }

    public String getOrDigits() { return orDigits; }
    public void setOrDigits(String orDigits) { this.orDigits = orDigits; }

    public Integer getDeNature() { return deNature; }
    public void setDeNature(Integer deNature) { this.deNature = deNature; }

    public Integer getDePlan() { return dePlan; }
    public void setDePlan(Integer dePlan) { this.dePlan = dePlan; }

    public String getDeDigits() { return deDigits; }
    public void setDeDigits(String deDigits) { this.deDigits = deDigits; }

    public Integer getIsdnNature() { return isdnNature; }
    public void setIsdnNature(Integer isdnNature) { this.isdnNature = isdnNature; }

    public Integer getIsdnPlan() { return isdnPlan; }
    public void setIsdnPlan(Integer isdnPlan) { this.isdnPlan = isdnPlan; }

    public String getMsisdn() { return msisdn; }
    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

    public Integer getVlrNature() { return vlrNature; }
    public void setVlrNature(Integer vlrNature) { this.vlrNature = vlrNature; }

    public Integer getVlrPlan() { return vlrPlan; }
    public void setVlrPlan(Integer vlrPlan) { this.vlrPlan = vlrPlan; }

    public String getVlrDigits() { return vlrDigits; }
    public void setVlrDigits(String vlrDigits) { this.vlrDigits = vlrDigits; }

    public String getImsi() { return imsi; }
    public void setImsi(String imsi) { this.imsi = imsi; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Timestamp getTstamp() { return tstamp; }
    public void setTstamp(Timestamp tstamp) { this.tstamp = tstamp; }

    public Long getLocalDialogId() { return localDialogId; }
    public void setLocalDialogId(Long localDialogId) { this.localDialogId = localDialogId; }

    public Long getRemoteDialogId() { return remoteDialogId; }
    public void setRemoteDialogId(Long remoteDialogId) { this.remoteDialogId = remoteDialogId; }

    public Long getDialogDuration() { return dialogDuration; }
    public void setDialogDuration(Long dialogDuration) { this.dialogDuration = dialogDuration; }

    public String getUssdString() { return ussdString; }
    public void setUssdString(String ussdString) { this.ussdString = ussdString; }
}
