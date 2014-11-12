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
package us.gov.dod.standard.ssrf._3_0.assignment;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Tuning indicates the specific frequency or range of frequencies, tuning
 * increment, and number of frequencies, required for an assignment.
 * <p>
 * Element of {@link Link}
 * <p>
 * Sub-Element is {@link RequestedFreq}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tuning", propOrder = {
  "tuningStep",
  "numFreq",
  "priority",
  "exclusive",
  "freqSep",
  "freqSepType",
  "requestedFreq"
})
public class Tuning {

  /**
   * TuningStep - Tuning Step (Required)
   * <p>
   * The tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningStep", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  /**
   * NumFreq - Number of Frequencies (Required)
   * <p>
   * The number of frequencies required.
   * <p>
   * Format is UN(4)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumFreq", required = true)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numFreq;
  /**
   * Priority - Priority (Optional)
   * <p>
   * A number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * Format is UN(1)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN1.class)
  private TInteger priority;
  /**
   * Exclusive - Exclusive Assignment (Optional)
   * <p>
   * Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Exclusive", required = false)
  private TString exclusive;
  /**
   * FreqSep - Frequency Separation (Optional)
   * <p>
   * The required minimum or exact frequency separation.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqSep (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqSep")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqSep;
  /**
   * FreqSepType - Frequency Separation Type (Optional)
   * <p>
   * If the stated frequency separation is an exact or minimum value.
   * <p>
   * Format is L:CDS
   * <p>
   * Attribute group FreqSep (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqSepType")
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString freqSepType;
  /**
   * RequestedFreq (Optional)
   * <p>
   * RequestedFreq indicates a single frequency or a range of frequencies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RequestedFreq")
  private List<AsgnFreqBase> requestedFreq;

  /**
   * Get the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @return the TuningStep value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @param value the TuningStep value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningStep() {
    return (this.tuningStep != null ? this.tuningStep.isSetValue() : false);
  }

  /**
   * Get the number of frequencies required.
   * <p>
   * @return the NumFreq value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getNumFreq() {
    return numFreq;
  }

  /**
   * Set the number of frequencies required.
   * <p>
   * @param value the NumFreq value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setNumFreq(TInteger value) {
    this.numFreq = value;
  }

  /**
   * Determine if the NumFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumFreq() {
    return (this.numFreq != null ? this.numFreq.isSetValue() : false);
  }

  /**
   * Get a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @return the Priority value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getPriority() {
    return priority;
  }

  /**
   * Set a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @param value the Priority value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setPriority(TInteger value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @return the Exclusive value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getExclusive() {
    return exclusive;
  }

  /**
   * Set Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @param value the Exclusive value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setExclusive(TString value) {
    this.exclusive = value;
  }

  /**
   * Determine if the Exclusive is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExclusive() {
    return (this.exclusive != null ? this.exclusive.isSetValue() : false);
  }

  /**
   * Get the required minimum or exact frequency separation.
   * <p>
   * @return the FreqSep value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFreqSep() {
    return freqSep;
  }

  /**
   * Set the required minimum or exact frequency separation.
   * <p>
   * @param value the FreqSep value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFreqSep(TDecimal value) {
    this.freqSep = value;
  }

  /**
   * Determine if the FreqSep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqSep() {
    return (this.freqSep != null ? this.freqSep.isSetValue() : false);
  }

  /**
   * Get if the stated frequency separation is an exact or minimum value.
   * <p>
   * @return the FreqSepType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqSepType() {
    return freqSepType;
  }

  /**
   * Set if the stated frequency separation is an exact or minimum value.
   * <p>
   * @param value the FreqSepType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFreqSepType(TString value) {
    this.freqSepType = value;
  }

  /**
   * Determine if the FreqSepType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqSepType() {
    return (this.freqSepType != null ? this.freqSepType.isSetValue() : false);
  }

  /**
   * Get the RequestedFreq
   * <p>
   * Complex element RequestedFreq indicates a single frequency or a range of
   * frequencies.
   * <p>
   * @return a {@link AsgnFreqBase} instance
   * @since 3.1.0
   */
  public List<AsgnFreqBase> getRequestedFreq() {
    if (requestedFreq == null) {
      requestedFreq = new ArrayList<AsgnFreqBase>();
    }
    return this.requestedFreq;
  }

  /**
   * Determine if the RequestedFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequestedFreq() {
    return ((this.requestedFreq != null) && (!this.requestedFreq.isEmpty()));
  }

  /**
   * Clear the RequestedFreq field. This sets the field to null.
   */
  public void unsetRequestedFreq() {
    this.requestedFreq = null;
  }

  /**
   * Set the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of frequencies required.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withNumFreq(Integer value) {
    setNumFreq(new TInteger(value));
    return this;
  }

  /**
   * Set a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withPriority(Integer value) {
    setPriority(new TInteger(value));
    return this;
  }

  /**
   * Set Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withExclusive(ListCBO value) {
    setExclusive(new TString(value.value()));
    return this;
  }

  /**
   * Set the required minimum or exact frequency separation.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqSep(Double value) {
    setFreqSep(new TDecimal(value));
    return this;
  }

  /**
   * Set if the stated frequency separation is an exact or minimum value.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqSepType(String value) {
    setFreqSepType(new TString(value));
    return this;
  }

  /**
   * Set the RequestedFreq
   * <p>
   * Complex element RequestedFreq indicates a single frequency or a range of
   * frequencies.
   * <p>
   * @param values One or more instances of type {@link AsgnFreqBase...}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withRequestedFreq(AsgnFreqBase... values) {
    if (values != null) {
      getRequestedFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RequestedFreq
   * <p>
   * Complex element RequestedFreq indicates a single frequency or a range of
   * frequencies.
   * <p>
   * @param values A collection of {@link RequestedFreq} instances
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withRequestedFreq(Collection<AsgnFreqBase> values) {
    if (values != null) {
      getRequestedFreq().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Tuning instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Tuning {"
      + (freqSep != null ? " freqSep [" + freqSep + "]" : "")
      + (freqSepType != null ? " freqSepType [" + freqSepType + "]" : "")
      + (exclusive != null ? " exclusive [" + exclusive + "]" : "")
      + (priority != null ? " priority [" + priority + "]" : "")
      + (requestedFreq != null ? " requestedFreq [" + requestedFreq + "]" : "")
      + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
      + (numFreq != null ? " numFreq [" + numFreq + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Tuning} requires
   * {@link TInteger NumFreq}, {@link TDecimal TuningStep}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNumFreq() && isSetTuningStep();
  }

}
