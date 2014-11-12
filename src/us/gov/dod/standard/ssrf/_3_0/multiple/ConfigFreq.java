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
package us.gov.dod.standard.ssrf._3_0.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * ConfigFreq indicates the set of frequencies that a configuration uses, which
 * may be a subset of the frequencies that the linked components (Transmitter,
 * Receiver, Antenna) are capable of.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Example:
 * <pre>
 * &lt;ConfigFreq&gt;
 *   &lt;FreqMax  cls="U"&gt;3126&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;3000&lt;/FreqMin &gt;
 *   &lt;idx cls="U"&gt;23&lt;/idx&gt;
 *   &lt;InBand  cls="U"&gt;Yes&lt;/InBand &gt;
 *   &lt;Priority  cls="U"&gt;Primary&lt;/Priority &gt;
 *   &lt;ChannelSpacing cls="U"&gt;25&lt;/ChannelSpacing&gt;
 *   &lt;Duration cls="U"&gt;.001&lt;/Duration&gt;
 *   &lt;FreqUse cls="U"&gt;TRANSMIT&lt;/FreqUse&gt;
 *   &lt;Period cls="U"&gt;23.6&lt;/Period&gt;
 *   &lt;PulseWidth cls="U"&gt;347&lt;/PulseWidth&gt;
 * &lt;/ConfigFreq&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigFreq", propOrder = {
  "freqMin",
  "freqMax",
  "inBand",
  "priority"
})
public class ConfigFreq {

  /**
   * FreqMin - Nominal or Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * InBand - In Band Indicator (Optional)
   * <p>
   * "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InBand", required = false)
  private TString inBand;
  /**
   * Priority - Priority (Optional)
   * <p>
   * If this spectrum use is Primary, Secondary or Permitted, as defined by the
   * system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * Format is L:CPS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;

  /**
   * Get the nominal frequency or minimum value of the frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @return the InBand value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getInBand() {
    return inBand;
  }

  /**
   * Set "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @param value the InBand value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setInBand(TString value) {
    this.inBand = value;
  }

  /**
   * Determine if the InBand is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInBand() {
    return (this.inBand != null ? this.inBand.isSetValue() : false);
  }

  /**
   * Get if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * @return the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * @param value the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   * @since 3.1.0
   */
  public ConfigFreq withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   * @since 3.1.0
   */
  public ConfigFreq withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ConfigFreq object instance
   * @since 3.1.0
   */
  public ConfigFreq withInBand(ListCBO value) {
    setInBand(new TString(value.value()));
    return this;
  }

  /**
   * Set if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ConfigFreq object instance
   * @since 3.1.0
   */
  public ConfigFreq withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this ConfigFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ConfigFreq {"
      + (inBand != null ? " inBand [" + inBand + "]" : "")
      + (priority != null ? " priority [" + priority + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ConfigFreq} requires {@link TDecimal FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

}
