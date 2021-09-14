/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3487
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
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
 * CreateTransactionPortfolioRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransactionPortfolioRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_BASE_CURRENCY = "baseCurrency";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY)
  private String baseCurrency;

  public static final String SERIALIZED_NAME_CORPORATE_ACTION_SOURCE_ID = "corporateActionSourceId";
  @SerializedName(SERIALIZED_NAME_CORPORATE_ACTION_SOURCE_ID)
  private ResourceId corporateActionSourceId;

  /**
   * Determines the accounting treatment given to the transaction portfolio&#39;s tax lots. The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst
   */
  @JsonAdapter(AccountingMethodEnum.Adapter.class)
  public enum AccountingMethodEnum {
    DEFAULT("Default"),
    
    AVERAGECOST("AverageCost"),
    
    FIRSTINFIRSTOUT("FirstInFirstOut"),
    
    LASTINFIRSTOUT("LastInFirstOut"),
    
    HIGHESTCOSTFIRST("HighestCostFirst"),
    
    LOWESTCOSTFIRST("LowestCostFirst");

    private String value;

    AccountingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountingMethodEnum fromValue(String value) {
      for (AccountingMethodEnum b : AccountingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountingMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNTING_METHOD = "accountingMethod";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_METHOD)
  private AccountingMethodEnum accountingMethod;

  public static final String SERIALIZED_NAME_SUB_HOLDING_KEYS = "subHoldingKeys";
  @SerializedName(SERIALIZED_NAME_SUB_HOLDING_KEYS)
  private List<String> subHoldingKeys = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties = null;


  public CreateTransactionPortfolioRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The name of the transaction portfolio.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The name of the transaction portfolio.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateTransactionPortfolioRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * A description for the transaction portfolio.
   * @return description
  **/
  @ApiModelProperty(value = "A description for the transaction portfolio.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateTransactionPortfolioRequest code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * The code of the transaction portfolio. Together with the scope this uniquely identifies the transaction portfolio.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The code of the transaction portfolio. Together with the scope this uniquely identifies the transaction portfolio.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public CreateTransactionPortfolioRequest created(OffsetDateTime created) {
    this.created = created; 
    return this;
  }

   /**
   * The effective datetime at which to create the transaction portfolio. No transactions can be added to the transaction portfolio before this date. Defaults to the current LUSID system datetime if not specified.
   * @return created
  **/
  @ApiModelProperty(value = "The effective datetime at which to create the transaction portfolio. No transactions can be added to the transaction portfolio before this date. Defaults to the current LUSID system datetime if not specified.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CreateTransactionPortfolioRequest baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency; 
    return this;
  }

   /**
   * The base currency of the transaction portfolio in ISO 4217 currency code format.
   * @return baseCurrency
  **/
  @ApiModelProperty(required = true, value = "The base currency of the transaction portfolio in ISO 4217 currency code format.")
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  public CreateTransactionPortfolioRequest corporateActionSourceId(ResourceId corporateActionSourceId) {
    this.corporateActionSourceId = corporateActionSourceId; 
    return this;
  }

   /**
   * Get corporateActionSourceId
   * @return corporateActionSourceId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getCorporateActionSourceId() {
    return corporateActionSourceId;
  }

  public void setCorporateActionSourceId(ResourceId corporateActionSourceId) {
    this.corporateActionSourceId = corporateActionSourceId;
  }


  public CreateTransactionPortfolioRequest accountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod; 
    return this;
  }

   /**
   * Determines the accounting treatment given to the transaction portfolio&#39;s tax lots. The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst
   * @return accountingMethod
  **/
  @ApiModelProperty(value = "Determines the accounting treatment given to the transaction portfolio's tax lots. The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst")
  public AccountingMethodEnum getAccountingMethod() {
    return accountingMethod;
  }

  public void setAccountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod;
  }


  public CreateTransactionPortfolioRequest subHoldingKeys(List<String> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys; 
    return this;
  }

  public CreateTransactionPortfolioRequest addSubHoldingKeysItem(String subHoldingKeysItem) {
   
    if (this.subHoldingKeys == null) {
      this.subHoldingKeys = new ArrayList<>();
    }
    this.subHoldingKeys.add(subHoldingKeysItem);
    return this;
  }

   /**
   * A set of unique transaction properties to group the transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. Note that sub-holding keys cannot currently be added after the transaction portfolio has been created; see https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information.
   * @return subHoldingKeys
  **/
  @ApiModelProperty(value = "A set of unique transaction properties to group the transaction portfolio's holdings by, perhaps for strategy tagging. Each property must be from the 'Transaction' domain and identified by a key in the format {domain}/{scope}/{code}, for example 'Transaction/strategies/quantsignal'. Note that sub-holding keys cannot currently be added after the transaction portfolio has been created; see https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information.")
  public List<String> getSubHoldingKeys() {
    return subHoldingKeys;
  }

  public void setSubHoldingKeys(List<String> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
  }


  public CreateTransactionPortfolioRequest properties(Map<String, Property> properties) {
    this.properties = properties; 
    return this;
  }

  public CreateTransactionPortfolioRequest putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of unique portfolio properties to add custom data to the transaction portfolio. Each property must be from the &#39;Portfolio&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. Note these properties must be pre-defined.
   * @return properties
  **/
  @ApiModelProperty(value = "A set of unique portfolio properties to add custom data to the transaction portfolio. Each property must be from the 'Portfolio' domain and identified by a key in the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'. Note these properties must be pre-defined.")
  public Map<String, Property> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
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
    sb.append("class CreateTransactionPortfolioRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    corporateActionSourceId: ").append(toIndentedString(corporateActionSourceId)).append("\n");
    sb.append("    accountingMethod: ").append(toIndentedString(accountingMethod)).append("\n");
    sb.append("    subHoldingKeys: ").append(toIndentedString(subHoldingKeys)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
