/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_0;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_0.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_0.ssreply.CommentSource;
import us.gov.dod.standard.ssrf._3_0.ssreply.StageLocation;

/**
 * SSReply is the XML root for all parameters of a Host Nation Declaration of
 * Spectrum Supportability. It inherits attributes and sub-elements from element
 * Common.
 * <p>
 * Sub-Elements are
 * {@link CommentSource}, {@link Configuration}, {@link StageLocation}
 * <p>
 * Example:
 * <pre>
 * &lt;SSReply cls="U"&gt;
 *   &lt;Serial cls="U"&gt;FRA::HD:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2012-02-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;SSRequestRef cls="U"&gt;USA::SR:123&lt;/SSRequestRef&gt;
 *   &lt;ReplyingCountry cls="U"&gt;FRA&lt;/ReplyingCountry&gt;
 *   &lt;SupportabilityCode cls="U"&gt;Supported with Restrictions&lt;/SupportabilityCode&gt;
 *   &lt;EffectiveDate cls="U"&gt;2012-02-25&lt;/EffectiveDate&gt;
 *   &lt;CommentSource&gt;
 *     &lt;Source cls="U"&gt;CAA&lt;/Source&gt;
 *     &lt;Comment idx="1" cls="U"&gt;IAW frequency clearance agreement FR MoD/FR CAA.&lt;/
 *     Comment&gt;
 *   &lt;/CommentSource&gt;
 * &lt;/SSReply&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSReply", propOrder = {
  "ssRequestRef",
  "replyingCountry",
  "supportabilityCode",
  "dateReceivedByCountry",
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "approvalSPSNum",
  "erpNumber",
  "fasNumber",
  "iracNumber",
  "replyingAuthority",
  "commentSource",
  "stageLocation",
  "configuration"
})
public class SSReply extends Common<SSReply> {

  /**
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * The dataset identifier of the SSRequest being replied to.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SSRequestRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial ssRequestRef;
  /**
   * ReplyingCountry - Replying Country (Required)
   * <p>
   * The code of the country providing the reply.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReplyingCountry", required = true)
  private TString replyingCountry;
  /**
   * SupportabilityCode - Supportability Code (Required)
   * <p>
   * The overall result of the national analysis. - If replying "Supported with
   * Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations.
   * <p>
   * Format is L:CCD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SupportabilityCode", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString supportabilityCode;
  /**
   * DateReceivedByCountry - Date Request Received By Country (Optional)
   * <p>
   * The date the request was received by the Host Nation Administration.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DateReceivedByCountry", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateReceivedByCountry;
  /**
   * EffectiveDate - Effective Date (Required)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * US:ApprovalSPSNum - Approval SPS Number (Optional)
   * <p>
   * The Certification of Spectrum Support Spectrum Planning Subcommittee (SPS)
   * document identifier assigned by NTIA. This is not the same as the
   * application SPS number.
   * <p>
   * Format is S11
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ApprovalSPSNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS11.class)
  private TString approvalSPSNum;
  /**
   * US:ERPNumber - ERP Number (Optional)
   * <p>
   * The Emergency Readiness Plan (ERP) Number. Certification applications are
   * assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of the
   * Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP).
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ERPNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString erpNumber;
  /**
   * US:FASNumber - FAS Number (Optional)
   * <p>
   * The Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS) identifier assigned by NTIA.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FASNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString fasNumber;
  /**
   * US:IRACNumber - IRAC Number (Optional)
   * <p>
   * The Interdepartment Radio Advisory Committee (IRAC) document number of the
   * NTIA Certification of Spectrum Support document. This number is assigned by
   * NTIA.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IRACNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString iracNumber;
  /**
   * US:ReplyingAuthority - Replying Authority (Optional)
   * <p>
   * The name of the organization providing the reply.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReplyingAuthority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString replyingAuthority;
  /**
   * CommentSource (Optional)
   * <p>
   * CommentSource is used to provide comments to a SSRequest. It can also be
   * used to certify supportability.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CommentSource")
  private List<CommentSource> commentSource;
  /**
   * StageLocation (Optional)
   * <p>
   * StageLocation defines locations where the equipment or system is allowed or
   * forbidden from use.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StageLocation")
  private List<StageLocation> stageLocation;
  /**
   * Configuration (Optional)
   * <p>
   * Configuration identifies each operational configuration that is required in
   * a SSRequest, granted by a Host Nation in a SSReply, or authorised in a
   * frequency Assignment or Allotment dataset. It also identifies the
   * functional use of the assigned frequency at a particular transmitting
   * station. Finally, it may indicate if the receiver station is used primarily
   * as a repeater. A direct coupling between the station's receiver and the
   * station's transmitter allows the incoming signal to be retransmitted
   * exactly as received.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Configuration")
  private List<Configuration> configuration;

  /**
   * Get the dataset identifier of the SSRequest being replied to.
   * <p>
   * @return the SSRequestRef value in a {@link TString} data type
   * @since 3.1.0
   */
  public TSerial getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value the SSRequestRef value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSSRequestRef(TSerial value) {
    this.ssRequestRef = value;
  }

  /**
   * Determine if the SSRequestRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null ? this.ssRequestRef.isSetValue() : false);
  }

  /**
   * Get the code of the country providing the reply.
   * <p>
   * @return the ReplyingCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getReplyingCountry() {
    return replyingCountry;
  }

  /**
   * Set the code of the country providing the reply.
   * <p>
   * @param value the ReplyingCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setReplyingCountry(TString value) {
    this.replyingCountry = value;
  }

  /**
   * Determine if the ReplyingCountry is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReplyingCountry() {
    return (this.replyingCountry != null ? this.replyingCountry.isSetValue() : false);
  }

  /**
   * Get the overall result of the national analysis. - If replying "Supported
   * with Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations.
   * <p>
   * @return the SupportabilityCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSupportabilityCode() {
    return supportabilityCode;
  }

  /**
   * Set the overall result of the national analysis. - If replying "Supported
   * with Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations.
   * <p>
   * @param value the SupportabilityCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSupportabilityCode(TString value) {
    this.supportabilityCode = value;
  }

  /**
   * Determine if the SupportabilityCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSupportabilityCode() {
    return (this.supportabilityCode != null ? this.supportabilityCode.isSetValue() : false);
  }

  /**
   * Get the date the request was received by the Host Nation Administration.
   * <p>
   * @return the DateReceivedByCountry value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getDateReceivedByCountry() {
    return dateReceivedByCountry;
  }

  /**
   * Set the date the request was received by the Host Nation Administration.
   * <p>
   * @param value the DateReceivedByCountry value in a {@link TCalendar} data
   *              type
   * @since 3.1.0
   */
  public void setDateReceivedByCountry(TCalendar value) {
    this.dateReceivedByCountry = value;
  }

  /**
   * Determine if the DateReceivedByCountry is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateReceivedByCountry() {
    return (this.dateReceivedByCountry != null ? this.dateReceivedByCountry.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective.
   * <p>
   * @return the EffectiveDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value the EffectiveDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @return the ExpirationDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value the ExpirationDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value the ReviewDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the Certification of Spectrum Support Spectrum Planning Subcommittee
   * (SPS) document identifier assigned by NTIA. This is not the same as the
   * application SPS number.
   * <p>
   * @return the ApprovalSPSNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getApprovalSPSNum() {
    return approvalSPSNum;
  }

  /**
   * Set the Certification of Spectrum Support Spectrum Planning Subcommittee
   * (SPS) document identifier assigned by NTIA. This is not the same as the
   * application SPS number.
   * <p>
   * @param value the ApprovalSPSNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setApprovalSPSNum(TString value) {
    this.approvalSPSNum = value;
  }

  /**
   * Determine if the ApprovalSPSNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovalSPSNum() {
    return (this.approvalSPSNum != null ? this.approvalSPSNum.isSetValue() : false);
  }

  /**
   * Get the Emergency Readiness Plan (ERP) Number. Certification applications
   * are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of
   * the Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP).
   * <p>
   * @return the ERPNumber value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getERPNumber() {
    return erpNumber;
  }

  /**
   * Set the Emergency Readiness Plan (ERP) Number. Certification applications
   * are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of
   * the Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP).
   * <p>
   * @param value the ERPNumber value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setERPNumber(TString value) {
    this.erpNumber = value;
  }

  /**
   * Determine if the ERPNumber is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPNumber() {
    return (this.erpNumber != null ? this.erpNumber.isSetValue() : false);
  }

  /**
   * Get the Interdepartment Radio Advisory Committee (IRAC) Frequency
   * Assignment Subcommittee (FAS) identifier assigned by NTIA.
   * <p>
   * @return the FASNumber value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFASNumber() {
    return fasNumber;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) Frequency
   * Assignment Subcommittee (FAS) identifier assigned by NTIA.
   * <p>
   * @param value the FASNumber value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFASNumber(TString value) {
    this.fasNumber = value;
  }

  /**
   * Determine if the FASNumber is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFASNumber() {
    return (this.fasNumber != null ? this.fasNumber.isSetValue() : false);
  }

  /**
   * Get the Interdepartment Radio Advisory Committee (IRAC) document number of
   * the NTIA Certification of Spectrum Support document. This number is
   * assigned by NTIA.
   * <p>
   * @return the IRACNumber value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIRACNumber() {
    return iracNumber;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) document number of
   * the NTIA Certification of Spectrum Support document. This number is
   * assigned by NTIA.
   * <p>
   * @param value the IRACNumber value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIRACNumber(TString value) {
    this.iracNumber = value;
  }

  /**
   * Determine if the IRACNumber is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIRACNumber() {
    return (this.iracNumber != null ? this.iracNumber.isSetValue() : false);
  }

  /**
   * Get the name of the organization providing the reply.
   * <p>
   * @return the ReplyingAuthority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getReplyingAuthority() {
    return replyingAuthority;
  }

  /**
   * Set the name of the organization providing the reply.
   * <p>
   * @param value the ReplyingAuthority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setReplyingAuthority(TString value) {
    this.replyingAuthority = value;
  }

  /**
   * Determine if the ReplyingAuthority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReplyingAuthority() {
    return (this.replyingAuthority != null ? this.replyingAuthority.isSetValue() : false);
  }

  /**
   * Get the CommentSource
   * <p>
   * Complex element CommentSource is used to provide comments to a SSRequest.
   * It can also be used to certify supportability.
   * <p>
   * @return a {@link CommentSource} instance
   * @since 3.1.0
   */
  public List<CommentSource> getCommentSource() {
    if (commentSource == null) {
      commentSource = new ArrayList<CommentSource>();
    }
    return this.commentSource;
  }

  /**
   * Determine if the CommentSource is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCommentSource() {
    return ((this.commentSource != null) && (!this.commentSource.isEmpty()));
  }

  /**
   * Clear the CommentSource field. This sets the field to null.
   */
  public void unsetCommentSource() {
    this.commentSource = null;
  }

  /**
   * Get the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @return a {@link StageLocation} instance
   * @since 3.1.0
   */
  public List<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new ArrayList<StageLocation>();
    }
    return this.stageLocation;
  }

  /**
   * Determine if the StageLocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStageLocation() {
    return ((this.stageLocation != null) && (!this.stageLocation.isEmpty()));
  }

  /**
   * Clear the StageLocation field. This sets the field to null.
   */
  public void unsetStageLocation() {
    this.stageLocation = null;
  }

  /**
   * Get the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @return a {@link Configuration} instance
   * @since 3.1.0
   */
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<Configuration>();
    }
    return this.configuration;
  }

  /**
   * Determine if the Configuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  /**
   * Clear the Configuration field. This sets the field to null.
   */
  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withSSRequestRef(TSerial value) {
    setSSRequestRef(value);
    return this;
  }

  /**
   * Set the code of the country providing the reply.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withReplyingCountry(ListCAO value) {
    setReplyingCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the overall result of the national analysis. - If replying "Supported
   * with Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withSupportabilityCode(String value) {
    setSupportabilityCode(new TString(value));
    return this;
  }

  /**
   * Set the date the request was received by the Host Nation Administration.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withDateReceivedByCountry(Calendar value) {
    setDateReceivedByCountry(new TCalendar(value));
    return this;
  }

  /**
   * Set the date the request was received by the Host Nation Administration.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withDateReceivedByCountry(Date value) {
    setDateReceivedByCountry(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withExpirationDate(Date value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the Certification of Spectrum Support Spectrum Planning Subcommittee
   * (SPS) document identifier assigned by NTIA. This is not the same as the
   * application SPS number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withApprovalSPSNum(String value) {
    setApprovalSPSNum(new TString(value));
    return this;
  }

  /**
   * Set the Emergency Readiness Plan (ERP) Number. Certification applications
   * are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of
   * the Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withERPNumber(String value) {
    setERPNumber(new TString(value));
    return this;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) Frequency
   * Assignment Subcommittee (FAS) identifier assigned by NTIA.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withFASNumber(String value) {
    setFASNumber(new TString(value));
    return this;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) document number of
   * the NTIA Certification of Spectrum Support document. This number is
   * assigned by NTIA.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withIRACNumber(String value) {
    setIRACNumber(new TString(value));
    return this;
  }

  /**
   * Set the name of the organization providing the reply.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withReplyingAuthority(String value) {
    setReplyingAuthority(new TString(value));
    return this;
  }

  /**
   * Set the CommentSource
   * <p>
   * Complex element CommentSource is used to provide comments to a SSRequest.
   * It can also be used to certify supportability.
   * <p>
   * @param values One or more instances of type {@link CommentSource...}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withCommentSource(CommentSource... values) {
    if (values != null) {
      getCommentSource().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CommentSource
   * <p>
   * Complex element CommentSource is used to provide comments to a SSRequest.
   * It can also be used to certify supportability.
   * <p>
   * @param values A collection of {@link CommentSource} instances
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withCommentSource(Collection<CommentSource> values) {
    if (values != null) {
      getCommentSource().addAll(values);
    }
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values One or more instances of type {@link StageLocation...}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withStageLocation(StageLocation... values) {
    if (values != null) {
      getStageLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values A collection of {@link StageLocation} instances
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withStageLocation(Collection<StageLocation> values) {
    if (values != null) {
      getStageLocation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @param values One or more instances of type {@link Configuration...}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @param values A collection of {@link Configuration} instances
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this SSReply instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SSReply {"
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (replyingCountry != null ? " replyingCountry [" + replyingCountry + "]" : "")
      + (erpNumber != null ? " erpNumber [" + erpNumber + "]" : "")
      + (replyingAuthority != null ? " replyingAuthority [" + replyingAuthority + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (supportabilityCode != null ? " supportabilityCode [" + supportabilityCode + "]" : "")
      + (approvalSPSNum != null ? " approvalSPSNum [" + approvalSPSNum + "]" : "")
      + (stageLocation != null ? " stageLocation [" + stageLocation + "]" : "")
      + (ssRequestRef != null ? " ssRequestRef [" + ssRequestRef + "]" : "")
      + (iracNumber != null ? " iracNumber [" + iracNumber + "]" : "")
      + (dateReceivedByCountry != null ? " dateReceivedByCountry [" + dateReceivedByCountry + "]" : "")
      + (configuration != null ? " configuration [" + configuration + "]" : "")
      + (commentSource != null ? " commentSource [" + commentSource + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + (fasNumber != null ? " fasNumber [" + fasNumber + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSReply} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link TCalendar EffectiveDate}, {@link TString ReplyingCountry}, {@link TString SupportabilityCode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetEffectiveDate() && isSetReplyingCountry() && isSetSupportabilityCode();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * The dataset identifier of the SSRequest being replied to.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private SSRequest ssRequest;

  /**
   * Get the dataset identifier of the SSRequest being replied to.
   * <p>
   * @return a {@link SSRequest} instance
   * @since 3.1.0
   */
  public SSRequest getSsRequest() {
    return ssRequest;
  }

  /**
   * Determine if the ssRequest field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSsRequest() {
    return this.ssRequest != null;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value An instances of type {@link SSRequest}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withSsRequest(SSRequest value) {
    this.ssRequest = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this SSReply record.
   * <p>
   * This method builds the exported {@link #ssRequestRef} field with values
   * from the transient {@link #ssRequest} field. This method should typically
   * be called after the SSReply is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @return The current SSReply object instance
   */
  @Override
  public SSReply prepare() {
    super.prepare();
    this.ssRequestRef = ssRequest != null ? ssRequest.getSerial() : null;
    return this;
  }

  /**
   * Update the SSRF data type references in this SSReply record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #ssRequest} with values from the
   * imported {@link #ssRequestRef} field. This method should typically be
   * called after the SSReply is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (ssRequestRef == null || !ssRequestRef.isSetValue()) {
      return;
    }
    for (SSRequest instance : root.getSSRequest()) {
      if (ssRequestRef.equals(instance.getSerial())) {
        ssRequest = instance;
        return;
      }
    }
  }//</editor-fold>

}
