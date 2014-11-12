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

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_0.common.CaseNum;
import us.gov.dod.standard.ssrf._3_0.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_0.common.Remarks;
import us.gov.dod.standard.ssrf._3_0.common.SecurityClass;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCY;

/**
 * Common is the parent complex element for all Datasets.
 * <p>
 * Sub-Elements are
 * {@link CaseNum}, {@link ExtReferenceRef}, {@link Remarks}, {@link SecurityClass}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", propOrder = {
  "serial",
  "entryDateTime",
  "entryBy",
  "owner",
  "lastChangeDateTime",
  "lastChangeBy",
  "state",
  "securityClass",
  "caseNum",
  "extReferenceRef",
  "remarks"
})
@XmlSeeAlso({
  Receiver.class,
  Organisation.class,
  Role.class,
  Satellite.class,
  ChannelPlan.class,
  Administrative.class,
  Antenna.class,
  Allotment.class,
  JRFL.class,
  Location.class,
  ExternalReference.class,
  Note.class,
  IntfReport.class,
  RFSystem.class,
  FEDeployment.class,
  SSRequest.class,
  ForceElement.class,
  SSReply.class,
  Transmitter.class,
  Assignment.class,
  Contact.class,
  TOA.class
})
@SuppressWarnings("unchecked")
public abstract class Common<T> implements Comparable<T> {

  /**
   * Serial - Serial (Required)
   * <p>
   * A unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial serial;
  /**
   * EntryDateTime - Entry Date/Time (Required)
   * <p>
   * The date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EntryDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar entryDateTime;
  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EntryBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial entryBy;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Owner", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial owner;
  /**
   * LastChangeDateTime - Latest Modification Date/Time (Optional)
   * <p>
   * The date and UTC Time the dataset was last modified.
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastChangeDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar lastChangeDateTime;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastChangeBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial lastChangeBy;
  /**
   * State - Dataset Status (Optional)
   * <p>
   * The state of the dataset.
   * <p>
   * Format is L:CSU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "State", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString state;
  /**
   * US:SecurityClass (Optional)
   * <p>
   * SecurityClass (US) contains the security classification from one or more
   * data information sources.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SecurityClass")
  private SecurityClass securityClass;
  /**
   * CaseNum (Optional)
   * <p>
   * CaseNum provides the capability to store multiple identifiers for a
   * Dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CaseNum")
  private List<CaseNum> caseNum;
  /**
   * ExtReferenceRef (Optional)
   * <p>
   * ExtReferenceRef refers to an external reference defined in a dataset
   * ExternalReference.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  private List<ExtReferenceRef> extReferenceRef;
  /**
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Remarks", nillable = true)
  private List<Remarks> remarks;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  /**
   * releasability - Releasability Markings (Optional)
   * <p>
   * A list of country codes for which the current data item is releasable. For
   * NATO, if this element is omitted, there is no releasability restriction for
   * the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * Format is List of L:CCY
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "releasability")
  private List<ListCCY> releasability;
  /**
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "remarks")
  private List<BigInteger> attributeRemarks;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of Conmmon/ExtReferenceRef idx values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "extReferences")
  private List<BigInteger> extReferences;
  /**
   * US:legacyReleasability - Legacy Releasability (Optional)
   * <p>
   * One or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "legacyReleasability")
  private String legacyReleasability;
  /**
   * US:quality - Data Quality (Optional)
   * <p>
   * One or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "quality")
  private String quality;
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "recommendedValue")
  private String recommendedValue;

  /**
   * Abstract constructor for the Common class type.
   * <p>
   * This constructor sets the minimum mandatory fields {@link #serial} with a
   * programmatically generated {@link TSerial} instance and
   * {@link #entryDateTime} with the current DATETIME.
   */
  @SuppressWarnings("unchecked")
  public Common() {
    this.serial = TSerial.getInstance((Class<? extends Common<?>>) this.getClass());
    this.entryDateTime = new TCalendar(Calendar.getInstance());
  }

  /**
   * Get a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @since 3.1.0
   */
  public TSerial getSerial() {
    return serial;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSerial(TSerial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @return the EntryDateTime value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value the EntryDateTime value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setEntryDateTime(TCalendar value) {
    this.entryDateTime = value;
  }

  /**
   * Determine if the EntryDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryDateTime() {
    return (this.entryDateTime != null ? this.entryDateTime.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return the EntryBy value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getEntryByRole()} instead.
   */
  @Deprecated
  public TSerial getEntryBy() {
    return entryBy;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value the EntryBy value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setEntryByRole(Role)} instead.
   */
  @Deprecated
  public void setEntryBy(TSerial value) {
    this.entryBy = value;
  }

  /**
   * Determine if the EntryBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryBy() {
    return (this.entryBy != null ? this.entryBy.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return the Owner value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getOwnerRole()} instead.
   */
  @Deprecated
  public TSerial getOwner() {
    return owner;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value the Owner value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setOwnerRole(Role)} instead.
   */
  @Deprecated
  public void setOwner(TSerial value) {
    this.owner = value;
  }

  /**
   * Determine if the Owner is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwner() {
    return (this.owner != null ? this.owner.isSetValue() : false);
  }

  /**
   * Get the date and UTC Time the dataset was last modified.
   * <p>
   * @return the LastChangeDateTime value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value the LastChangeDateTime value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setLastChangeDateTime(TCalendar value) {
    this.lastChangeDateTime = value;
  }

  /**
   * Determine if the LastChangeDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeDateTime() {
    return (this.lastChangeDateTime != null ? this.lastChangeDateTime.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return the LastChangeBy value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLastChangeByRole()} instead.
   */
  @Deprecated
  public TSerial getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value the LastChangeBy value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLastChangeByRole(Role)} instead.
   */
  @Deprecated
  public void setLastChangeBy(TSerial value) {
    this.lastChangeBy = value;
  }

  /**
   * Determine if the LastChangeBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeBy() {
    return (this.lastChangeBy != null ? this.lastChangeBy.isSetValue() : false);
  }

  /**
   * Get the state of the dataset.
   * <p>
   * @return the State value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getState() {
    return state;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value the State value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setState(TString value) {
    this.state = value;
  }

  /**
   * Determine if the State is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetState() {
    return (this.state != null ? this.state.isSetValue() : false);
  }

  /**
   * Get the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @return a {@link SecurityClass} instance
   * @since 3.1.0
   */
  public SecurityClass getSecurityClass() {
    return securityClass;
  }

  /**
   * Set the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @param value a {@link SecurityClass} instance
   * @since 3.1.0
   */
  public void setSecurityClass(SecurityClass value) {
    this.securityClass = value;
  }

  /**
   * Determine if the SecurityClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecurityClass() {
    return (this.securityClass != null);
  }

  /**
   * Get the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @return a {@link CaseNum} instance
   * @since 3.1.0
   */
  public List<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new ArrayList<>();
    }
    return this.caseNum;
  }

  /**
   * Determine if the CaseNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCaseNum() {
    return ((this.caseNum != null) && (!this.caseNum.isEmpty()));
  }

  /**
   * Clear the CaseNum field. This sets the field to null.
   */
  public void unsetCaseNum() {
    this.caseNum = null;
  }

  /**
   * Get the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @return a {@link ExtReferenceRef} instance
   * @since 3.1.0
   */
  public List<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new ArrayList<>();
    }
    return this.extReferenceRef;
  }

  /**
   * Determine if the ExtReferenceRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferenceRef() {
    return ((this.extReferenceRef != null) && (!this.extReferenceRef.isEmpty()));
  }

  /**
   * Clear the ExtReferenceRef field. This sets the field to null.
   */
  public void unsetExtReferenceRef() {
    this.extReferenceRef = null;
  }

  /**
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a {@link Remarks} instance
   * @since 3.1.0
   */
  public List<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

  /**
   * Determine if the Remarks is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  /**
   * Clear the Remarks field. This sets the field to null.
   */
  public void unsetRemarks() {
    this.remarks = null;
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link ListCCL} instance
   * @since 3.1.0
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link ListCCL} instance
   * @since 3.1.0
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  /**
   * Determine if the Cls is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @return a {@link ListCCY} instance
   * @since 3.1.0
   */
  public List<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new ArrayList<>();
    }
    return this.releasability;
  }

  /**
   * Determine if the Releasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReleasability() {
    return ((this.releasability != null) && (!this.releasability.isEmpty()));
  }

  /**
   * Clear the Releasability field. This sets the field to null.
   */
  public void unsetReleasability() {
    this.releasability = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getAttributeRemarks() {
    if (attributeRemarks == null) {
      attributeRemarks = new ArrayList<>();
    }
    return this.attributeRemarks;
  }

  /**
   * Determine if the AttributeRemarks is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAttributeRemarks() {
    return ((this.attributeRemarks != null) && (!this.attributeRemarks.isEmpty()));
  }

  /**
   * Clear the AttributeRemarks field. This sets the field to null.
   */
  public void unsetAttributeRemarks() {
    this.attributeRemarks = null;
  }

  /**
   * Get a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new ArrayList<>();
    }
    return this.extReferences;
  }

  /**
   * Determine if the ExtReferences is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferences() {
    return ((this.extReferences != null) && (!this.extReferences.isEmpty()));
  }

  /**
   * Clear the ExtReferences field. This sets the field to null.
   */
  public void unsetExtReferences() {
    this.extReferences = null;
  }

  /**
   * Get one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLegacyReleasability(String value) {
    this.legacyReleasability = value;
  }

  /**
   * Determine if the LegacyReleasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyReleasability() {
    return (this.legacyReleasability != null);
  }

  /**
   * Get one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setQuality(String value) {
    this.quality = value;
  }

  /**
   * Determine if the Quality is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetQuality() {
    return (this.quality != null);
  }

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRecommendedValue(String value) {
    this.recommendedValue = value;
  }

  /**
   * Determine if the RecommendedValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRecommendedValue() {
    return (this.recommendedValue != null);
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withSerial(TSerial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withEntryDateTime(Calendar value) {
    setEntryDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withEntryDateTime(Date value) {
    setEntryDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withEntryByRole(Role)} instead.
   */
  @Deprecated
  public Common withEntryBy(TSerial value) {
    setEntryBy(value);
    return this;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withOwnerRole(Role)} instead.
   */
  @Deprecated
  public Common withOwner(TSerial value) {
    setOwner(value);
    return this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withLastChangeDateTime(Calendar value) {
    setLastChangeDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withLastChangeDateTime(Date value) {
    setLastChangeDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLastChangeByRole(Role)} instead.
   */
  @Deprecated
  public Common withLastChangeBy(TSerial value) {
    setLastChangeBy(value);
    return this;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withState(String value) {
    setState(new TString(value));
    return this;
  }

  /**
   * Set the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @param value An instances of type {@link SecurityClass}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withSecurityClass(SecurityClass value) {
    return this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @param values One or more instances of type {@link CaseNum...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withCaseNum(CaseNum... values) {
    if (values != null) {
      getCaseNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @param values A collection of {@link CaseNum} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withCaseNum(Collection<CaseNum> values) {
    if (values != null) {
      getCaseNum().addAll(values);
    }
    return this;
  }

  /**
   * Set the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @param values One or more instances of type {@link ExtReferenceRef...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withExtReferenceRef(ExtReferenceRef... values) {
    if (values != null) {
      getExtReferenceRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @param values A collection of {@link ExtReferenceRef} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withExtReferenceRef(Collection<ExtReferenceRef> values) {
    if (values != null) {
      getExtReferenceRef().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withCls(ListCCL value) {
    return this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values One or more instances of type {@link ListCCY...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withReleasability(ListCCY... values) {
    if (values != null) {
      getReleasability().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values A collection of {@link Releasability} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withReleasability(Collection<ListCCY> values) {
    if (values != null) {
      getReleasability().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withAttributeRemarks(BigInteger... values) {
    if (values != null) {
      getAttributeRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AttributeRemarks} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withAttributeRemarks(Collection<BigInteger> values) {
    if (values != null) {
      getAttributeRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link ExtReferences} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withExtReferences(Collection<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return this;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withLegacyReleasability(String value) {
    return this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withQuality(String value) {
    return this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public Common withRecommendedValue(String value) {
    return this;
  }

  /**
   * Get a string representation of this Common instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Common {"
      + (cls != null ? " cls [" + cls + "]" : "")
      + (entryDateTime != null ? " entryDateTime [" + entryDateTime + "]" : "")
      + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
      + (state != null ? " state [" + state + "]" : "")
      + (remarks != null ? " remarks [" + remarks + "]" : "")
      + (releasability != null ? " releasability [" + releasability + "]" : "")
      + (lastChangeBy != null ? " lastChangeBy [" + lastChangeBy + "]" : "")
      + (caseNum != null ? " caseNum [" + caseNum + "]" : "")
      + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
      + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
      + (quality != null ? " quality [" + quality + "]" : "")
      + (owner != null ? " owner [" + owner + "]" : "")
      + (extReferenceRef != null ? " extReferenceRef [" + extReferenceRef + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + (entryBy != null ? " entryBy [" + entryBy + "]" : "")
      + (lastChangeDateTime != null ? " lastChangeDateTime [" + lastChangeDateTime + "]" : "")
      + (attributeRemarks != null ? " attributeRemarks [" + attributeRemarks + "]" : "")
      + (securityClass != null ? " securityClass [" + securityClass + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Common} requires
   * {@link TCalendar EntryDateTime}, {@link TString Serial}, {@link ListCCL cls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEntryDateTime() && isSetSerial() && isSetCls();
  }
  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role entryByRole;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role ownerRole;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role lastChangeByRole;

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getEntryByRole() {
    return entryByRole;
  }

  /**
   * Determine if the entryByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryByRole() {
    return this.entryByRole != null;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEntryByRole(Role value) {
    this.entryByRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getOwnerRole() {
    return ownerRole;
  }

  /**
   * Determine if the ownerRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerRole() {
    return this.ownerRole != null;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withOwnerRole(Role value) {
    this.ownerRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getLastChangeByRole() {
    return lastChangeByRole;
  }

  /**
   * Determine if the lastChangeByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeByRole() {
    return this.lastChangeByRole != null;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastChangeByRole(Role value) {
    this.lastChangeByRole = value;
    return (T) this;
  }

  /**
   * Update the SSRF data type references in this Common record.
   * <p>
   * This method builds Common exported fields with values from their respective
   * transient object instance fields.:<br/> {@link #entryBy} from
   * {@link #entryByRole} <br/> {@link #owner} from {@link #ownerRole} <br/>
   * {@link #lastChangeBy} from {@link #lastChangeByRole} <br/>
   * {@link #lastReviewBy} from {@link #lastReviewByRole} <br/>
   * {@link #modAllowedBy} from {@link #modAllowedByRole}
   * <p>
   * This method should typically be called after the Common is configured and
   * (optionally) before exporting an SSRF message.
   */
  public T prepare() {
    this.entryBy = entryByRole != null ? entryByRole.getSerial() : null;
    this.owner = ownerRole != null ? ownerRole.getSerial() : null;
    this.lastChangeBy = lastChangeByRole != null ? lastChangeByRole.getSerial() : null;
    return (T) this;
  }

  /**
   * Update the SSRF data type references in this Common record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #entryByRole} with values from the
   * imported {@link #entryBy} field. This method should typically be called
   * after the Common is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (entryBy != null && entryBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (entryBy.equals(instance.getSerial())) {
          entryByRole = instance;
          return;
        }
      }
    }
    if (owner != null && owner.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (owner.equals(instance.getSerial())) {
          ownerRole = instance;
          return;
        }
      }
    }
    if (lastChangeBy != null && lastChangeBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (lastChangeBy.equals(instance.getSerial())) {
          lastChangeByRole = instance;
          return;
        }
      }
    }
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the object serial number.
   * <p>
   * @return A unique hash code for this object instance.
   */
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 67 * hash + Objects.hashCode(this.serial);
    return hash;
  }

  /**
   * Equality is based upon the object serial number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are of the same class and their serial numbers
   *         match
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.serial, ((Common<?>) obj).getSerial());
  }

  /**
   * Comparison is based alphabetically by class type, reverse chronologically
   * by entry date/time, then finally by alphabetically by the (semi-random)
   * serial number.
   * <p>
   * @param o the other object instance to sort
   * @return alphabetical sort order
   */
  @Override
  public int compareTo(Object o) {
    if (o == null) {
      return 1;
    }
    if (this.getClass().equals(o.getClass())) {
      if (this.getEntryDateTime().equals(((Common<T>) o).getEntryDateTime())) {
        /**
         * If the classes are equal and have the same time stamp then sort by
         * serial number. Note that this is semi-random.
         */
        return this.serial.compareTo(((Common<T>) o).getSerial());
      }
      /**
       * Sort reverse chronologically.
       */
      return this.getEntryDateTime().compareTo(((Common<T>) o).getEntryDateTime());
    }
    /**
     * Sort based upon the class name.
     */
    return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
  }//</editor-fold>
}
