package com.jgybzx.domain.actualCombat;

import java.util.Date;

public class ActualCombat {

    private String packingListId;
    private String seller;
    private String buyer;
    private String invoiceNo;
    private Date invoiceDate;
    private String marks;
    private String descriptions;
    private String exportIds;
    private String exportNos;
    private Long state;
    private String createBy;
    private String createDept;
    private Date createTime;
    private String companyId;
    private String companyName;
    public String getPackingListId() {
        return packingListId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.packing_list_id
     *
     * @param packingListId the value for co_packing_list.packing_list_id
     *
     * @mbg.generated
     */
    public void setPackingListId(String packingListId) {
        this.packingListId = packingListId == null ? null : packingListId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.seller
     *
     * @return the value of co_packing_list.seller
     *
     * @mbg.generated
     */
    public String getSeller() {
        return seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.seller
     *
     * @param seller the value for co_packing_list.seller
     *
     * @mbg.generated
     */
    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.buyer
     *
     * @return the value of co_packing_list.buyer
     *
     * @mbg.generated
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.buyer
     *
     * @param buyer the value for co_packing_list.buyer
     *
     * @mbg.generated
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.invoice_no
     *
     * @return the value of co_packing_list.invoice_no
     *
     * @mbg.generated
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.invoice_no
     *
     * @param invoiceNo the value for co_packing_list.invoice_no
     *
     * @mbg.generated
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.invoice_date
     *
     * @return the value of co_packing_list.invoice_date
     *
     * @mbg.generated
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.invoice_date
     *
     * @param invoiceDate the value for co_packing_list.invoice_date
     *
     * @mbg.generated
     */
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.marks
     *
     * @return the value of co_packing_list.marks
     *
     * @mbg.generated
     */
    public String getMarks() {
        return marks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.marks
     *
     * @param marks the value for co_packing_list.marks
     *
     * @mbg.generated
     */
    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.descriptions
     *
     * @return the value of co_packing_list.descriptions
     *
     * @mbg.generated
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.descriptions
     *
     * @param descriptions the value for co_packing_list.descriptions
     *
     * @mbg.generated
     */
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.export_ids
     *
     * @return the value of co_packing_list.export_ids
     *
     * @mbg.generated
     */
    public String getExportIds() {
        return exportIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.export_ids
     *
     * @param exportIds the value for co_packing_list.export_ids
     *
     * @mbg.generated
     */
    public void setExportIds(String exportIds) {
        this.exportIds = exportIds == null ? null : exportIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.export_nos
     *
     * @return the value of co_packing_list.export_nos
     *
     * @mbg.generated
     */
    public String getExportNos() {
        return exportNos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.export_nos
     *
     * @param exportNos the value for co_packing_list.export_nos
     *
     * @mbg.generated
     */
    public void setExportNos(String exportNos) {
        this.exportNos = exportNos == null ? null : exportNos.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.state
     *
     * @return the value of co_packing_list.state
     *
     * @mbg.generated
     */
    public Long getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.state
     *
     * @param state the value for co_packing_list.state
     *
     * @mbg.generated
     */
    public void setState(Long state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.create_by
     *
     * @return the value of co_packing_list.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.create_by
     *
     * @param createBy the value for co_packing_list.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.create_dept
     *
     * @return the value of co_packing_list.create_dept
     *
     * @mbg.generated
     */
    public String getCreateDept() {
        return createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.create_dept
     *
     * @param createDept the value for co_packing_list.create_dept
     *
     * @mbg.generated
     */
    public void setCreateDept(String createDept) {
        this.createDept = createDept == null ? null : createDept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.create_time
     *
     * @return the value of co_packing_list.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.create_time
     *
     * @param createTime the value for co_packing_list.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.company_id
     *
     * @return the value of co_packing_list.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.company_id
     *
     * @param companyId the value for co_packing_list.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_packing_list.company_name
     *
     * @return the value of co_packing_list.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_packing_list.company_name
     *
     * @param companyName the value for co_packing_list.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }
}