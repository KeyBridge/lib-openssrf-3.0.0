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
package us.gov.dod.standard.ssrf._3_0.allotment;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * AllotFreq defines a frequency or range of frequencies belonging to the
 * Allotment.
 * <p>
 * Element of {@link Allotment}
 * <p>
 * Sub-Element is
 * <p>
 * Example: See {@link Allotment}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllotFreq", propOrder = {
  "freqMin",
  "freqMax",
  "pairedFreqMin",
  "tuningStep",
  "locationRestriction"
})
public class AllotFreq {

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
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pairedFreqMin;
  /**
   * TuningStep - Tuning Step (Optional)
   * <p>
   * The tuning increment.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  /**
   * LocationRestriction (Optional)
   * <p>
   * LocationRestriction indicates a Location where the Allotment usage is
   * forbidden.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRestriction", nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TSerial> locationRestrictionRef;

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
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @return the PairedFreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPairedFreqMin() {
    return pairedFreqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value the PairedFreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPairedFreqMin(TDecimal value) {
    this.pairedFreqMin = value;
  }

  /**
   * Determine if the PairedFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedFreqMin() {
    return (this.pairedFreqMin != null ? this.pairedFreqMin.isSetValue() : false);
  }

  /**
   * Get the tuning increment.
   * <p>
   * @return the TuningStep value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment.
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
   * Get the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @return a {@link TString} instance
   * @since 3.1.0
   */
  public List<TSerial> getLocationRestrictionRef() {
    if (locationRestrictionRef == null) {
      locationRestrictionRef = new ArrayList<>();
    }
    return this.locationRestrictionRef;
  }

  /**
   * Determine if the LocationRestriction is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRestrictionRef() {
    return ((this.locationRestrictionRef != null) && (!this.locationRestrictionRef.isEmpty()));
  }

  /**
   * Clear the LocationRestriction field. This sets the field to null.
   */
  public void unsetLocationRestriction() {
    this.locationRestrictionRef = null;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withPairedFreqMin(Double value) {
    setPairedFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @param values One or more instances of type {@link LocationRestriction...}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withLocationRestrictionRef(TSerial... values) {
    if (values != null) {
      getLocationRestrictionRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withLocationRestrictionRef(Collection<TSerial> values) {
    if (values != null) {
      getLocationRestrictionRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AllotFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AllotFreq {"
      + (pairedFreqMin != null ? " pairedFreqMin [" + pairedFreqMin + "]" : "")
      + (locationRestrictionRef != null ? " locationRestriction [" + locationRestrictionRef + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AllotFreq} requires {@link TDecimal FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  @XmlTransient
  private List<Location> locationRestriction;

  /**
   * Get
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public List<Location> getLocationRestriction() {
    if (locationRestriction == null) {
      locationRestriction = new ArrayList<>();
    }
    return locationRestriction;
  }

  /**
   * Determine if the locationRestrictionRef field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRestriction() {
    return this.locationRestrictionRef != null && !this.locationRestrictionRef.isEmpty();
  }

  /**
   * Set
   * <p>
   * @param values An instances of type {@link Location}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withLocationRestriction(Location... values) {
    return withLocationRestriction(Arrays.asList(values));
  }

  /**
   * Set
   * <p>
   * @param values An instances of type {@link Location}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withLocationRestriction(Collection<Location> values) {
    getLocationRestriction().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this AllotFreq record.
   * <p>
   * This method builds the exported {@link #locationRestrictionRef} field with
   * values from the transient {@link #locationRestrictionRef} field. This
   * method should typically be called after the AllotFreq is configured and
   * (optionally) before exporting an SSRF message.
   * <p>
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq build() {
    this.locationRestrictionRef = new ArrayList<>();
    for (Location instance : getLocationRestriction()) {
      this.locationRestrictionRef.add(instance.getSerial());
    }
    return this;
  }

  /**
   * Update the SSRF data type references in this AllotFreq record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #locationRestrictionRef} with
   * values from the imported {@link #locationRestrictionRef} field. This method
   * should typically be called after the AllotFreq is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (locationRestrictionRef == null || locationRestrictionRef.isEmpty()) {
      return;
    }
    locationRestriction = new ArrayList<>();
    for (Location instance : root.getLocation()) {
      if (locationRestrictionRef.contains(instance.getSerial())) {
        locationRestriction.add(instance);
      }
    }
  }//</editor-fold>

}
