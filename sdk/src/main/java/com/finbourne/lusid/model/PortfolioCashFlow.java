/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3454
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Transaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The details for the cashflow for a given portfolio.
 */
@ApiModel(description = "The details for the cashflow for a given portfolio.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioCashFlow {
  public static final String SERIALIZED_NAME_GROUP_BY_ID = "groupById";
  @SerializedName(SERIALIZED_NAME_GROUP_BY_ID)
  private Integer groupById;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Integer sequenceNumber;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_SUB_HOLDING_KEYS = "subHoldingKeys";
  @SerializedName(SERIALIZED_NAME_SUB_HOLDING_KEYS)
  private Map<String, PerpetualProperty> subHoldingKeys = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MOVEMENT_NAME = "movementName";
  @SerializedName(SERIALIZED_NAME_MOVEMENT_NAME)
  private String movementName;

  public static final String SERIALIZED_NAME_CASHFLOW = "cashflow";
  @SerializedName(SERIALIZED_NAME_CASHFLOW)
  private CurrencyAndAmount cashflow;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private CurrencyAndAmount balance;

  public static final String SERIALIZED_NAME_FX_RATE = "fxRate";
  @SerializedName(SERIALIZED_NAME_FX_RATE)
  private Double fxRate;

  public static final String SERIALIZED_NAME_CASHFLOW_REPORTING_CURRENCY = "cashflowReportingCurrency";
  @SerializedName(SERIALIZED_NAME_CASHFLOW_REPORTING_CURRENCY)
  private CurrencyAndAmount cashflowReportingCurrency;

  public static final String SERIALIZED_NAME_BALANCE_REPORTING_CURRENCY = "balanceReportingCurrency";
  @SerializedName(SERIALIZED_NAME_BALANCE_REPORTING_CURRENCY)
  private CurrencyAndAmount balanceReportingCurrency;

  public static final String SERIALIZED_NAME_TRANSLATION_GAIN_LOSS = "translationGainLoss";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_GAIN_LOSS)
  private CurrencyAndAmount translationGainLoss;

  public static final String SERIALIZED_NAME_COST_BASIS_REPORTING_CURRENCY = "costBasisReportingCurrency";
  @SerializedName(SERIALIZED_NAME_COST_BASIS_REPORTING_CURRENCY)
  private CurrencyAndAmount costBasisReportingCurrency;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private Transaction transaction;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public PortfolioCashFlow groupById(Integer groupById) {
    this.groupById = groupById; 
    return this;
  }

   /**
   * The groupBy subHoldings and currency.
   * @return groupById
  **/
  @ApiModelProperty(required = true, value = "The groupBy subHoldings and currency.")
  public Integer getGroupById() {
    return groupById;
  }

  public void setGroupById(Integer groupById) {
    this.groupById = groupById;
  }


  public PortfolioCashFlow sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber; 
    return this;
  }

   /**
   * Sequence number determining the order of the cash flow records.
   * @return sequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Sequence number determining the order of the cash flow records.")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public PortfolioCashFlow effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate; 
    return this;
  }

   /**
   * Indicates the date when the cash-flow settles.
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "Indicates the date when the cash-flow settles.")
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public PortfolioCashFlow subHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys; 
    return this;
  }

  public PortfolioCashFlow putSubHoldingKeysItem(String key, PerpetualProperty subHoldingKeysItem) {
    if (this.subHoldingKeys == null) {
      this.subHoldingKeys = new HashMap<>();
    }
    this.subHoldingKeys.put(key, subHoldingKeysItem);
    return this;
  }

   /**
   * The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured when a transaction portfolio is created.
   * @return subHoldingKeys
  **/
  @ApiModelProperty(value = "The sub-holding properties which identify the holding. Each property will be from the 'Transaction' domain. These are configured when a transaction portfolio is created.")
  public Map<String, PerpetualProperty> getSubHoldingKeys() {
    return subHoldingKeys;
  }

  public void setSubHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
  }


  public PortfolioCashFlow type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * Indicates the record type (Closed, Open, Activity).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates the record type (Closed, Open, Activity).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public PortfolioCashFlow movementName(String movementName) {
    this.movementName = movementName; 
    return this;
  }

   /**
   * Indicates the specific movement of the transaction that generated this cash flow.
   * @return movementName
  **/
  @ApiModelProperty(required = true, value = "Indicates the specific movement of the transaction that generated this cash flow.")
  public String getMovementName() {
    return movementName;
  }

  public void setMovementName(String movementName) {
    this.movementName = movementName;
  }


  public PortfolioCashFlow cashflow(CurrencyAndAmount cashflow) {
    this.cashflow = cashflow; 
    return this;
  }

   /**
   * Get cashflow
   * @return cashflow
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getCashflow() {
    return cashflow;
  }

  public void setCashflow(CurrencyAndAmount cashflow) {
    this.cashflow = cashflow;
  }


  public PortfolioCashFlow balance(CurrencyAndAmount balance) {
    this.balance = balance; 
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getBalance() {
    return balance;
  }

  public void setBalance(CurrencyAndAmount balance) {
    this.balance = balance;
  }


  public PortfolioCashFlow fxRate(Double fxRate) {
    this.fxRate = fxRate; 
    return this;
  }

   /**
   * Exchange rate between the currency of this cash flow and the reporting currency.
   * @return fxRate
  **/
  @ApiModelProperty(required = true, value = "Exchange rate between the currency of this cash flow and the reporting currency.")
  public Double getFxRate() {
    return fxRate;
  }

  public void setFxRate(Double fxRate) {
    this.fxRate = fxRate;
  }


  public PortfolioCashFlow cashflowReportingCurrency(CurrencyAndAmount cashflowReportingCurrency) {
    this.cashflowReportingCurrency = cashflowReportingCurrency; 
    return this;
  }

   /**
   * Get cashflowReportingCurrency
   * @return cashflowReportingCurrency
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getCashflowReportingCurrency() {
    return cashflowReportingCurrency;
  }

  public void setCashflowReportingCurrency(CurrencyAndAmount cashflowReportingCurrency) {
    this.cashflowReportingCurrency = cashflowReportingCurrency;
  }


  public PortfolioCashFlow balanceReportingCurrency(CurrencyAndAmount balanceReportingCurrency) {
    this.balanceReportingCurrency = balanceReportingCurrency; 
    return this;
  }

   /**
   * Get balanceReportingCurrency
   * @return balanceReportingCurrency
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getBalanceReportingCurrency() {
    return balanceReportingCurrency;
  }

  public void setBalanceReportingCurrency(CurrencyAndAmount balanceReportingCurrency) {
    this.balanceReportingCurrency = balanceReportingCurrency;
  }


  public PortfolioCashFlow translationGainLoss(CurrencyAndAmount translationGainLoss) {
    this.translationGainLoss = translationGainLoss; 
    return this;
  }

   /**
   * Get translationGainLoss
   * @return translationGainLoss
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getTranslationGainLoss() {
    return translationGainLoss;
  }

  public void setTranslationGainLoss(CurrencyAndAmount translationGainLoss) {
    this.translationGainLoss = translationGainLoss;
  }


  public PortfolioCashFlow costBasisReportingCurrency(CurrencyAndAmount costBasisReportingCurrency) {
    this.costBasisReportingCurrency = costBasisReportingCurrency; 
    return this;
  }

   /**
   * Get costBasisReportingCurrency
   * @return costBasisReportingCurrency
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getCostBasisReportingCurrency() {
    return costBasisReportingCurrency;
  }

  public void setCostBasisReportingCurrency(CurrencyAndAmount costBasisReportingCurrency) {
    this.costBasisReportingCurrency = costBasisReportingCurrency;
  }


  public PortfolioCashFlow transaction(Transaction transaction) {
    this.transaction = transaction; 
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }


  public PortfolioCashFlow links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public PortfolioCashFlow addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioCashFlow {\n");
    sb.append("    groupById: ").append(toIndentedString(groupById)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    subHoldingKeys: ").append(toIndentedString(subHoldingKeys)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    movementName: ").append(toIndentedString(movementName)).append("\n");
    sb.append("    cashflow: ").append(toIndentedString(cashflow)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    fxRate: ").append(toIndentedString(fxRate)).append("\n");
    sb.append("    cashflowReportingCurrency: ").append(toIndentedString(cashflowReportingCurrency)).append("\n");
    sb.append("    balanceReportingCurrency: ").append(toIndentedString(balanceReportingCurrency)).append("\n");
    sb.append("    translationGainLoss: ").append(toIndentedString(translationGainLoss)).append("\n");
    sb.append("    costBasisReportingCurrency: ").append(toIndentedString(costBasisReportingCurrency)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
