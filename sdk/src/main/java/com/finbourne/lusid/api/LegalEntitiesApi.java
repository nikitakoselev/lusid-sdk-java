/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | 
 *
 * The version of the OpenAPI document: 0.11.4437
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.AccessMetadataValue;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LegalEntity;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfLegalEntity;
import com.finbourne.lusid.model.ResourceListOfAccessMetadataValueOf;
import com.finbourne.lusid.model.SetLegalEntityIdentifiersRequest;
import com.finbourne.lusid.model.SetLegalEntityPropertiesRequest;
import com.finbourne.lusid.model.UpsertLegalEntityAccessMetadataRequest;
import com.finbourne.lusid.model.UpsertLegalEntityRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LegalEntitiesApi {
    private ApiClient localVarApiClient;
    public LegalEntitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LegalEntitiesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteLegalEntity
     * @param idTypeScope The scope of the legal entity identifier type. (required)
     * @param idTypeCode The code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with defined              identifier type uniquely identifies the legal entity to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting legal entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLegalEntityCall(String idTypeScope, String idTypeCode, String code, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteLegalEntityValidateBeforeCall(String idTypeScope, String idTypeCode, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deleteLegalEntity(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deleteLegalEntity(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteLegalEntity(Async)");
        }
        

        okhttp3.Call localVarCall = deleteLegalEntityCall(idTypeScope, idTypeCode, code, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteLegalEntity: Delete Legal Entity
     * Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param idTypeScope The scope of the legal entity identifier type. (required)
     * @param idTypeCode The code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with defined              identifier type uniquely identifies the legal entity to delete. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting legal entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteLegalEntity(String idTypeScope, String idTypeCode, String code) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteLegalEntityWithHttpInfo(idTypeScope, idTypeCode, code);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteLegalEntity: Delete Legal Entity
     * Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param idTypeScope The scope of the legal entity identifier type. (required)
     * @param idTypeCode The code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with defined              identifier type uniquely identifies the legal entity to delete. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting legal entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteLegalEntityWithHttpInfo(String idTypeScope, String idTypeCode, String code) throws ApiException {
        okhttp3.Call localVarCall = deleteLegalEntityValidateBeforeCall(idTypeScope, idTypeCode, code, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteLegalEntity: Delete Legal Entity (asynchronously)
     * Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param idTypeScope The scope of the legal entity identifier type. (required)
     * @param idTypeCode The code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with defined              identifier type uniquely identifies the legal entity to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting legal entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLegalEntityAsync(String idTypeScope, String idTypeCode, String code, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteLegalEntityValidateBeforeCall(idTypeScope, idTypeCode, code, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteLegalEntityAccessMetadata
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLegalEntityAccessMetadataCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (effectiveUntil != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveUntil", effectiveUntil));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteLegalEntityAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deleteLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deleteLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling deleteLegalEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = deleteLegalEntityAccessMetadataCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry
     * Deletes the Legal Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteLegalEntityAccessMetadata(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteLegalEntityAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry
     * Deletes the Legal Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteLegalEntityAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = deleteLegalEntityAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry (asynchronously)
     * Deletes the Legal Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLegalEntityAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteLegalEntityAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteLegalEntityIdentifiers
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CreditAgency/Identifier\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLegalEntityIdentifiersCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteLegalEntityIdentifiersValidateBeforeCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deleteLegalEntityIdentifiers(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deleteLegalEntityIdentifiers(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteLegalEntityIdentifiers(Async)");
        }
        
        // verify the required parameter 'propertyKeys' is set
        if (propertyKeys == null) {
            throw new ApiException("Missing the required parameter 'propertyKeys' when calling deleteLegalEntityIdentifiers(Async)");
        }
        

        okhttp3.Call localVarCall = deleteLegalEntityIdentifiersCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers
     * Delete identifiers that belong to the given property keys of the legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CreditAgency/Identifier\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteLegalEntityIdentifiers(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteLegalEntityIdentifiersWithHttpInfo(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers
     * Delete identifiers that belong to the given property keys of the legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CreditAgency/Identifier\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteLegalEntityIdentifiersWithHttpInfo(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deleteLegalEntityIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers (asynchronously)
     * Delete identifiers that belong to the given property keys of the legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CreditAgency/Identifier\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLegalEntityIdentifiersAsync(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteLegalEntityIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllLegalEntityAccessMetadata
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Legal Entity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllLegalEntityAccessMetadataCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllLegalEntityAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getAllLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getAllLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getAllLegalEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = getAllLegalEntityAccessMetadataCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity
     * Pass the Scope and Code of the Legal Entity identifier along with the Legal Entity code parameter to retrieve the associated Access Metadata
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Legal Entity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, List<AccessMetadataValue>> getAllLegalEntityAccessMetadata(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = getAllLegalEntityAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity
     * Pass the Scope and Code of the Legal Entity identifier along with the Legal Entity code parameter to retrieve the associated Access Metadata
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return ApiResponse&lt;Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Legal Entity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, List<AccessMetadataValue>>> getAllLegalEntityAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getAllLegalEntityAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity (asynchronously)
     * Pass the Scope and Code of the Legal Entity identifier along with the Legal Entity code parameter to retrieve the associated Access Metadata
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Legal Entity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllLegalEntityAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getAllLegalEntityAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLegalEntity
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLegalEntityCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLegalEntityValidateBeforeCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getLegalEntity(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getLegalEntity(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getLegalEntity(Async)");
        }
        

        okhttp3.Call localVarCall = getLegalEntityCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetLegalEntity: Get Legal Entity
     * Retrieve the definition of a legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified. (optional)
     * @return LegalEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public LegalEntity getLegalEntity(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<LegalEntity> localVarResp = getLegalEntityWithHttpInfo(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetLegalEntity: Get Legal Entity
     * Retrieve the definition of a legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified. (optional)
     * @return ApiResponse&lt;LegalEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LegalEntity> getLegalEntityWithHttpInfo(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getLegalEntityValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetLegalEntity: Get Legal Entity (asynchronously)
     * Retrieve the definition of a legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLegalEntityAsync(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, final ApiCallback<LegalEntity> _callback) throws ApiException {
        okhttp3.Call localVarCall = getLegalEntityValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLegalEntityAccessMetadataByKey
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Legal Entity access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLegalEntityAccessMetadataByKeyCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLegalEntityAccessMetadataByKeyValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getLegalEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getLegalEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getLegalEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling getLegalEntityAccessMetadataByKey(Async)");
        }
        

        okhttp3.Call localVarCall = getLegalEntityAccessMetadataByKeyCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity
     * Get a specific Legal Entity Access Metadata by specifying the corresponding identifier parts and Legal Entity code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return List&lt;AccessMetadataValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Legal Entity access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<AccessMetadataValue> getLegalEntityAccessMetadataByKey(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<List<AccessMetadataValue>> localVarResp = getLegalEntityAccessMetadataByKeyWithHttpInfo(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity
     * Get a specific Legal Entity Access Metadata by specifying the corresponding identifier parts and Legal Entity code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return ApiResponse&lt;List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Legal Entity access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AccessMetadataValue>> getLegalEntityAccessMetadataByKeyWithHttpInfo(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getLegalEntityAccessMetadataByKeyValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity (asynchronously)
     * Get a specific Legal Entity Access Metadata by specifying the corresponding identifier parts and Legal Entity code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Legal Entity access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLegalEntityAccessMetadataByKeyAsync(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback<List<AccessMetadataValue>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getLegalEntityAccessMetadataByKeyValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listLegalEntities
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for each legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Legal Entities with specified identifier type </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listLegalEntitiesCall(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listLegalEntitiesValidateBeforeCall(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling listLegalEntities(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling listLegalEntities(Async)");
        }
        

        okhttp3.Call localVarCall = listLegalEntitiesCall(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] ListLegalEntities: List Legal Entities
     * List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for each legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @return PagedResourceListOfLegalEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Legal Entities with specified identifier type </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfLegalEntity listLegalEntities(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<PagedResourceListOfLegalEntity> localVarResp = listLegalEntitiesWithHttpInfo(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ListLegalEntities: List Legal Entities
     * List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for each legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @return ApiResponse&lt;PagedResourceListOfLegalEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Legal Entities with specified identifier type </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfLegalEntity> listLegalEntitiesWithHttpInfo(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = listLegalEntitiesValidateBeforeCall(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfLegalEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ListLegalEntities: List Legal Entities (asynchronously)
     * List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for each legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Legal Entities with specified identifier type </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listLegalEntitiesAsync(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, final ApiCallback<PagedResourceListOfLegalEntity> _callback) throws ApiException {
        okhttp3.Call localVarCall = listLegalEntitiesValidateBeforeCall(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfLegalEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setLegalEntityIdentifiers
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityIdentifiersRequest Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated identifiers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setLegalEntityIdentifiersCall(String idTypeScope, String idTypeCode, String code, SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setLegalEntityIdentifiersRequest;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setLegalEntityIdentifiersValidateBeforeCall(String idTypeScope, String idTypeCode, String code, SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling setLegalEntityIdentifiers(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling setLegalEntityIdentifiers(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling setLegalEntityIdentifiers(Async)");
        }
        
        // verify the required parameter 'setLegalEntityIdentifiersRequest' is set
        if (setLegalEntityIdentifiersRequest == null) {
            throw new ApiException("Missing the required parameter 'setLegalEntityIdentifiersRequest' when calling setLegalEntityIdentifiers(Async)");
        }
        

        okhttp3.Call localVarCall = setLegalEntityIdentifiersCall(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers
     * Set identifiers of the Legal Entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityIdentifiersRequest Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed. (required)
     * @return LegalEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated identifiers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public LegalEntity setLegalEntityIdentifiers(String idTypeScope, String idTypeCode, String code, SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest) throws ApiException {
        ApiResponse<LegalEntity> localVarResp = setLegalEntityIdentifiersWithHttpInfo(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers
     * Set identifiers of the Legal Entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityIdentifiersRequest Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed. (required)
     * @return ApiResponse&lt;LegalEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated identifiers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LegalEntity> setLegalEntityIdentifiersWithHttpInfo(String idTypeScope, String idTypeCode, String code, SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest) throws ApiException {
        okhttp3.Call localVarCall = setLegalEntityIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest, null);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers (asynchronously)
     * Set identifiers of the Legal Entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityIdentifiersRequest Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated identifiers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setLegalEntityIdentifiersAsync(String idTypeScope, String idTypeCode, String code, SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest, final ApiCallback<LegalEntity> _callback) throws ApiException {
        okhttp3.Call localVarCall = setLegalEntityIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest, _callback);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setLegalEntityProperties
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityPropertiesRequest Request containing properties to set for the legal entity. Properties not specified in request will not be changed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setLegalEntityPropertiesCall(String idTypeScope, String idTypeCode, String code, SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setLegalEntityPropertiesRequest;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setLegalEntityPropertiesValidateBeforeCall(String idTypeScope, String idTypeCode, String code, SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling setLegalEntityProperties(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling setLegalEntityProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling setLegalEntityProperties(Async)");
        }
        
        // verify the required parameter 'setLegalEntityPropertiesRequest' is set
        if (setLegalEntityPropertiesRequest == null) {
            throw new ApiException("Missing the required parameter 'setLegalEntityPropertiesRequest' when calling setLegalEntityProperties(Async)");
        }
        

        okhttp3.Call localVarCall = setLegalEntityPropertiesCall(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] SetLegalEntityProperties: Set Legal Entity Properties
     * Set properties of the legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityPropertiesRequest Request containing properties to set for the legal entity. Properties not specified in request will not be changed. (required)
     * @return LegalEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public LegalEntity setLegalEntityProperties(String idTypeScope, String idTypeCode, String code, SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest) throws ApiException {
        ApiResponse<LegalEntity> localVarResp = setLegalEntityPropertiesWithHttpInfo(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] SetLegalEntityProperties: Set Legal Entity Properties
     * Set properties of the legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityPropertiesRequest Request containing properties to set for the legal entity. Properties not specified in request will not be changed. (required)
     * @return ApiResponse&lt;LegalEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LegalEntity> setLegalEntityPropertiesWithHttpInfo(String idTypeScope, String idTypeCode, String code, SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest) throws ApiException {
        okhttp3.Call localVarCall = setLegalEntityPropertiesValidateBeforeCall(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest, null);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] SetLegalEntityProperties: Set Legal Entity Properties (asynchronously)
     * Set properties of the legal entity.
     * @param idTypeScope Scope of the legal entity identifier type. (required)
     * @param idTypeCode Code of the legal entity identifier type. (required)
     * @param code Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. (required)
     * @param setLegalEntityPropertiesRequest Request containing properties to set for the legal entity. Properties not specified in request will not be changed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Legal Entity with updated properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setLegalEntityPropertiesAsync(String idTypeScope, String idTypeCode, String code, SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest, final ApiCallback<LegalEntity> _callback) throws ApiException {
        okhttp3.Call localVarCall = setLegalEntityPropertiesValidateBeforeCall(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest, _callback);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertLegalEntity
     * @param upsertLegalEntityRequest Request to create or update a legal entity. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertLegalEntityCall(UpsertLegalEntityRequest upsertLegalEntityRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertLegalEntityRequest;

        // create path and map variables
        String localVarPath = "/api/legalentities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertLegalEntityValidateBeforeCall(UpsertLegalEntityRequest upsertLegalEntityRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'upsertLegalEntityRequest' is set
        if (upsertLegalEntityRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertLegalEntityRequest' when calling upsertLegalEntity(Async)");
        }
        

        okhttp3.Call localVarCall = upsertLegalEntityCall(upsertLegalEntityRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertLegalEntity: Upsert Legal Entity
     * Create or update a legal entity
     * @param upsertLegalEntityRequest Request to create or update a legal entity. (required)
     * @return LegalEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public LegalEntity upsertLegalEntity(UpsertLegalEntityRequest upsertLegalEntityRequest) throws ApiException {
        ApiResponse<LegalEntity> localVarResp = upsertLegalEntityWithHttpInfo(upsertLegalEntityRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertLegalEntity: Upsert Legal Entity
     * Create or update a legal entity
     * @param upsertLegalEntityRequest Request to create or update a legal entity. (required)
     * @return ApiResponse&lt;LegalEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LegalEntity> upsertLegalEntityWithHttpInfo(UpsertLegalEntityRequest upsertLegalEntityRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertLegalEntityValidateBeforeCall(upsertLegalEntityRequest, null);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertLegalEntity: Upsert Legal Entity (asynchronously)
     * Create or update a legal entity
     * @param upsertLegalEntityRequest Request to create or update a legal entity. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated legal entity </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertLegalEntityAsync(UpsertLegalEntityRequest upsertLegalEntityRequest, final ApiCallback<LegalEntity> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertLegalEntityValidateBeforeCall(upsertLegalEntityRequest, _callback);
        Type localVarReturnType = new TypeToken<LegalEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertLegalEntityAccessMetadata
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertLegalEntityAccessMetadataRequest The Legal Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertLegalEntityAccessMetadataCall(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertLegalEntityAccessMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (effectiveUntil != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveUntil", effectiveUntil));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4437");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertLegalEntityAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling upsertLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling upsertLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling upsertLegalEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'upsertLegalEntityAccessMetadataRequest' is set
        if (upsertLegalEntityAccessMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertLegalEntityAccessMetadataRequest' when calling upsertLegalEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = upsertLegalEntityAccessMetadataCall(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Legal Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Legal Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertLegalEntityAccessMetadataRequest The Legal Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @return ResourceListOfAccessMetadataValueOf
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfAccessMetadataValueOf upsertLegalEntityAccessMetadata(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<ResourceListOfAccessMetadataValueOf> localVarResp = upsertLegalEntityAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Legal Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Legal Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertLegalEntityAccessMetadataRequest The Legal Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @return ApiResponse&lt;ResourceListOfAccessMetadataValueOf&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfAccessMetadataValueOf> upsertLegalEntityAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = upsertLegalEntityAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessMetadataValueOf>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. (asynchronously)
     * Update or insert one Legal Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Legal Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the Legal Entity identifier. (required)
     * @param idTypeCode Code of the Legal Entity identifier. (required)
     * @param code Code of the Legal Entity under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertLegalEntityAccessMetadataRequest The Legal Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertLegalEntityAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<ResourceListOfAccessMetadataValueOf> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertLegalEntityAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessMetadataValueOf>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
