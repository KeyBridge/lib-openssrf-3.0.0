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
package us.gov.dod.standard.ssrf._3_0.transmitter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_0.common.Remarks;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * SubcarrierFreq describes the secondary channel that
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link SubcarrierTone}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCarrierFreq", propOrder = {
  "value"
})
public class SubCarrierFreq {

  @XmlValue
  private BigDecimal value;
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
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "remarks")
  private List<BigInteger> remarks;
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
   * In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "availability")
  private String availability;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
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
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getRemarks() {
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
   * Get In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAvailability() {
    return availability;
  }

  /**
   * Set In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAvailability(String value) {
    this.availability = value;
  }

  /**
   * Determine if the Availability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvailability() {
    return (this.availability != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withValue(BigDecimal value) {
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withCls(ListCCL value) {
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withRemarks(BigInteger... values) {
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
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withRemarks(Collection<BigInteger> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withExtReferences(BigInteger... values) {
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
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withExtReferences(Collection<BigInteger> values) {
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
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withLegacyReleasability(String value) {
    return this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withQuality(String value) {
    return this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withRecommendedValue(String value) {
    return this;
  }

  /**
   * Set In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SubCarrierFreq object instance
   * @since 3.1.0
   */
  public SubCarrierFreq withAvailability(String value) {
    return this;
  }

  /**
   * Get a string representation of this SubCarrierFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SubCarrierFreq {"
      + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
      + (cls != null ? " cls [" + cls + "]" : "")
      + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
      + (quality != null ? " quality [" + quality + "]" : "")
      + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
      + (value != null ? " value [" + value + "]" : "")
      + (remarks != null ? " remarks [" + remarks + "]" : "")
      + (availability != null ? " availability [" + availability + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SubCarrierFreq} requires {@link ListCCL cls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCls();
  }

}
