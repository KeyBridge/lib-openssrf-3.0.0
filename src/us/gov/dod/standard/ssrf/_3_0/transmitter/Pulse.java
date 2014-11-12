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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Pulse contains the pulse characteristics for equipments using a pulsed
 * emission. It includes the parameters of the pulse time cycle and the pulse
 * shape.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Pulse&gt;
 *   &lt;PRRMin cls="U"&gt;300&lt;/PRRMin&gt;
 *   &lt;PDMin cls="U"&gt;12&lt;/PDMin&gt;
 *   &lt;DutyCycleMax cls="U"&gt;50&lt;/DutyCycleMax&gt;
 *   &lt;AvgPowerMin cls="U"&gt;20&lt;/AvgPowerMin&gt;
 * &lt;/Pulse&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pulse", propOrder = {
  "prrMin",
  "prrMax",
  "pdMin",
  "pdMax",
  "dutyCycleMin",
  "dutyCycleMax",
  "avgPowerMin",
  "avgPowerMax",
  "compRatio",
  "compMethod",
  "riseTime",
  "fallTime",
  "justifyShortRiseTime",
  "radarProcessingGainMax",
  "numSubpulses"
})
public class Pulse {

  /**
   * PRRMin - Minimum or Nominal Pulse Repetition Rate (Optional)
   * <p>
   * The numeric value for the pulse repetition rate (PRR) of the equipment. For
   * equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR.
   * <p>
   * Format is UN(9,3) (pulses/sec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRRMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN9_3.class)
  private TDecimal prrMin;
  /**
   * PRRMax - Maximum Pulse Repetition Rate (Optional)
   * <p>
   * For equipment having a capability for continuously variable PRR over a wide
   * range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.
   * <p>
   * Format is UN(9,3) (pulses/sec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRRMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN9_3.class)
  private TDecimal prrMax;
  /**
   * PDMin - Minimum or Nominal Pulse Duration (Optional)
   * <p>
   * A numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMin;
  /**
   * PDMax - Maximum Pulse Duration (Optional)
   * <p>
   * For equipment having a capability for continuously variable PD over a wide
   * range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMax;
  /**
   * DutyCycleMin - Minimum/Nominal Duty Cycle Ratio (Optional)
   * <p>
   * As a percentage, the minimum or nominal ratio of the pulse duration to the
   * pulse period.
   * <p>
   * Format is UN(4,2) [0..100] (%)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DutyCycleMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal dutyCycleMin;
  /**
   * DutyCycleMax - Maximum Duty Cycle Ratio (Optional)
   * <p>
   * As a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin.
   * <p>
   * Format is UN(4,2) [0..100] (%)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DutyCycleMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal dutyCycleMax;
  /**
   * AvgPowerMin - Minimum/Nominal Average Power (Optional)
   * <p>
   * The minimum or nominal average power.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AvgPowerMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal avgPowerMin;
  /**
   * AvgPowerMax - Maximum Average Power (Optional)
   * <p>
   * the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AvgPowerMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal avgPowerMax;
  /**
   * CompRatio - Pulse Compression Ratio (Optional)
   * <p>
   * The ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points.
   * <p>
   * Format is UN(8,4)
   * <p>
   * Attribute group PulseComp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CompRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN8_4.class)
  private TDecimal compRatio;
  /**
   * CompMethod - Pulse Compression Method (Optional)
   * <p>
   * The method employed to reduce the period of the pulse.
   * <p>
   * Format is S40
   * <p>
   * Attribute group PulseComp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CompMethod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString compMethod;
  /**
   * JustifyShortRiseTime - Justification for Short Rise Time (Optional)
   * <p>
   * An operational justification for short pulse rise time. This is required if
   * the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses
   * FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds,
   * or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less
   * than 0.01 microseconds.
   * <p>
   * Format is Memo
   * <p>
   * Attribute group PulseForm (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RiseTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal riseTime;
  /**
   * FallTime - Fall Time (Optional)
   * <p>
   * The pulse fall time from 90 to 10 percent of the pulse.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group PulseForm (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FallTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal fallTime;
  /**
   * JustifyShortRiseTime - Justification for Short Rise Time (Optional)
   * <p>
   * An operational justification for short pulse rise time. This is required if
   * the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses
   * FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds,
   * or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less
   * than 0.01 microseconds.
   * <p>
   * Format is Memo
   * <p>
   * Attribute group PulseForm (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JustifyShortRiseTime", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString justifyShortRiseTime;
  /**
   * RadarProcessingGainMax - Maximum Radar Processing Gain (Optional)
   * <p>
   * The maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse".
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RadarProcessingGainMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal radarProcessingGainMax;
  /**
   * NumSubpulses - Number of Subpulses (Optional)
   * <p>
   * The total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".
   * <p>
   * Format is UN(10)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumSubpulses", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN10.class)
  private TInteger numSubpulses;

  /**
   * Get the numeric value for the pulse repetition rate (PRR) of the equipment.
   * For equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR.
   * <p>
   * @return the PRRMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPRRMin() {
    return prrMin;
  }

  /**
   * Set the numeric value for the pulse repetition rate (PRR) of the equipment.
   * For equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR.
   * <p>
   * @param value the PRRMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPRRMin(TDecimal value) {
    this.prrMin = value;
  }

  /**
   * Determine if the PRRMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRRMin() {
    return (this.prrMin != null ? this.prrMin.isSetValue() : false);
  }

  /**
   * Get for equipment having a capability for continuously variable PRR over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.
   * <p>
   * @return the PRRMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPRRMax() {
    return prrMax;
  }

  /**
   * Set for equipment having a capability for continuously variable PRR over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.
   * <p>
   * @param value the PRRMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPRRMax(TDecimal value) {
    this.prrMax = value;
  }

  /**
   * Determine if the PRRMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRRMax() {
    return (this.prrMax != null ? this.prrMax.isSetValue() : false);
  }

  /**
   * Get a numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD.
   * <p>
   * @return the PDMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPDMin() {
    return pdMin;
  }

  /**
   * Set a numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD.
   * <p>
   * @param value the PDMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPDMin(TDecimal value) {
    this.pdMin = value;
  }

  /**
   * Determine if the PDMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMin() {
    return (this.pdMin != null ? this.pdMin.isSetValue() : false);
  }

  /**
   * Get for equipment having a capability for continuously variable PD over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.
   * <p>
   * @return the PDMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPDMax() {
    return pdMax;
  }

  /**
   * Set for equipment having a capability for continuously variable PD over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.
   * <p>
   * @param value the PDMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPDMax(TDecimal value) {
    this.pdMax = value;
  }

  /**
   * Determine if the PDMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMax() {
    return (this.pdMax != null ? this.pdMax.isSetValue() : false);
  }

  /**
   * Get as a percentage, the minimum or nominal ratio of the pulse duration to
   * the pulse period.
   * <p>
   * @return the DutyCycleMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getDutyCycleMin() {
    return dutyCycleMin;
  }

  /**
   * Set as a percentage, the minimum or nominal ratio of the pulse duration to
   * the pulse period.
   * <p>
   * @param value the DutyCycleMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setDutyCycleMin(TDecimal value) {
    this.dutyCycleMin = value;
  }

  /**
   * Determine if the DutyCycleMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDutyCycleMin() {
    return (this.dutyCycleMin != null ? this.dutyCycleMin.isSetValue() : false);
  }

  /**
   * Get as a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin.
   * <p>
   * @return the DutyCycleMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getDutyCycleMax() {
    return dutyCycleMax;
  }

  /**
   * Set as a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin.
   * <p>
   * @param value the DutyCycleMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setDutyCycleMax(TDecimal value) {
    this.dutyCycleMax = value;
  }

  /**
   * Determine if the DutyCycleMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDutyCycleMax() {
    return (this.dutyCycleMax != null ? this.dutyCycleMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal average power.
   * <p>
   * @return the AvgPowerMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAvgPowerMin() {
    return avgPowerMin;
  }

  /**
   * Set the minimum or nominal average power.
   * <p>
   * @param value the AvgPowerMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAvgPowerMin(TDecimal value) {
    this.avgPowerMin = value;
  }

  /**
   * Determine if the AvgPowerMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvgPowerMin() {
    return (this.avgPowerMin != null ? this.avgPowerMin.isSetValue() : false);
  }

  /**
   * Get the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin.
   * <p>
   * @return the AvgPowerMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAvgPowerMax() {
    return avgPowerMax;
  }

  /**
   * Set the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin.
   * <p>
   * @param value the AvgPowerMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAvgPowerMax(TDecimal value) {
    this.avgPowerMax = value;
  }

  /**
   * Determine if the AvgPowerMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvgPowerMax() {
    return (this.avgPowerMax != null ? this.avgPowerMax.isSetValue() : false);
  }

  /**
   * Get the ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points.
   * <p>
   * @return the CompRatio value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getCompRatio() {
    return compRatio;
  }

  /**
   * Set the ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points.
   * <p>
   * @param value the CompRatio value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setCompRatio(TDecimal value) {
    this.compRatio = value;
  }

  /**
   * Determine if the CompRatio is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCompRatio() {
    return (this.compRatio != null ? this.compRatio.isSetValue() : false);
  }

  /**
   * Get the method employed to reduce the period of the pulse.
   * <p>
   * @return the CompMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCompMethod() {
    return compMethod;
  }

  /**
   * Set the method employed to reduce the period of the pulse.
   * <p>
   * @param value the CompMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCompMethod(TString value) {
    this.compMethod = value;
  }

  /**
   * Determine if the CompMethod is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCompMethod() {
    return (this.compMethod != null ? this.compMethod.isSetValue() : false);
  }

  /**
   * Get an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @return the RiseTime value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getRiseTime() {
    return riseTime;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @param value the RiseTime value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setRiseTime(TDecimal value) {
    this.riseTime = value;
  }

  /**
   * Determine if the RiseTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRiseTime() {
    return (this.riseTime != null ? this.riseTime.isSetValue() : false);
  }

  /**
   * Get the pulse fall time from 90 to 10 percent of the pulse.
   * <p>
   * @return the FallTime value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFallTime() {
    return fallTime;
  }

  /**
   * Set the pulse fall time from 90 to 10 percent of the pulse.
   * <p>
   * @param value the FallTime value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFallTime(TDecimal value) {
    this.fallTime = value;
  }

  /**
   * Determine if the FallTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFallTime() {
    return (this.fallTime != null ? this.fallTime.isSetValue() : false);
  }

  /**
   * Get an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @return the JustifyShortRiseTime value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getJustifyShortRiseTime() {
    return justifyShortRiseTime;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @param value the JustifyShortRiseTime value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setJustifyShortRiseTime(TString value) {
    this.justifyShortRiseTime = value;
  }

  /**
   * Determine if the JustifyShortRiseTime is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJustifyShortRiseTime() {
    return (this.justifyShortRiseTime != null ? this.justifyShortRiseTime.isSetValue() : false);
  }

  /**
   * Get the maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse".
   * <p>
   * @return the RadarProcessingGainMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getRadarProcessingGainMax() {
    return radarProcessingGainMax;
  }

  /**
   * Set the maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse".
   * <p>
   * @param value the RadarProcessingGainMax value in a {@link TDecimal} data
   *              type
   * @since 3.1.0
   */
  public void setRadarProcessingGainMax(TDecimal value) {
    this.radarProcessingGainMax = value;
  }

  /**
   * Determine if the RadarProcessingGainMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRadarProcessingGainMax() {
    return (this.radarProcessingGainMax != null ? this.radarProcessingGainMax.isSetValue() : false);
  }

  /**
   * Get the total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".
   * <p>
   * @return the NumSubpulses value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getNumSubpulses() {
    return numSubpulses;
  }

  /**
   * Set the total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".
   * <p>
   * @param value the NumSubpulses value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setNumSubpulses(TInteger value) {
    this.numSubpulses = value;
  }

  /**
   * Determine if the NumSubpulses is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSubpulses() {
    return (this.numSubpulses != null ? this.numSubpulses.isSetValue() : false);
  }

  /**
   * Set the numeric value for the pulse repetition rate (PRR) of the equipment.
   * For equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPRRMin(Double value) {
    setPRRMin(new TDecimal(value));
    return this;
  }

  /**
   * Set for equipment having a capability for continuously variable PRR over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPRRMax(Double value) {
    setPRRMax(new TDecimal(value));
    return this;
  }

  /**
   * Set a numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPDMin(Double value) {
    setPDMin(new TDecimal(value));
    return this;
  }

  /**
   * Set for equipment having a capability for continuously variable PD over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPDMax(Double value) {
    setPDMax(new TDecimal(value));
    return this;
  }

  /**
   * Set as a percentage, the minimum or nominal ratio of the pulse duration to
   * the pulse period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withDutyCycleMin(Double value) {
    setDutyCycleMin(new TDecimal(value));
    return this;
  }

  /**
   * Set as a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withDutyCycleMax(Double value) {
    setDutyCycleMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal average power.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withAvgPowerMin(Double value) {
    setAvgPowerMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withAvgPowerMax(Double value) {
    setAvgPowerMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withCompRatio(Double value) {
    setCompRatio(new TDecimal(value));
    return this;
  }

  /**
   * Set the method employed to reduce the period of the pulse.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withCompMethod(String value) {
    setCompMethod(new TString(value));
    return this;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withRiseTime(Double value) {
    setRiseTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the pulse fall time from 90 to 10 percent of the pulse.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withFallTime(Double value) {
    setFallTime(new TDecimal(value));
    return this;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withJustifyShortRiseTime(String value) {
    setJustifyShortRiseTime(new TString(value));
    return this;
  }

  /**
   * Set the maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse".
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withRadarProcessingGainMax(Double value) {
    setRadarProcessingGainMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withNumSubpulses(Integer value) {
    setNumSubpulses(new TInteger(value));
    return this;
  }

  /**
   * Get a string representation of this Pulse instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Pulse {"
      + (justifyShortRiseTime != null ? " justifyShortRiseTime [" + justifyShortRiseTime + "]" : "")
      + (avgPowerMax != null ? " avgPowerMax [" + avgPowerMax + "]" : "")
      + (avgPowerMin != null ? " avgPowerMin [" + avgPowerMin + "]" : "")
      + (dutyCycleMax != null ? " dutyCycleMax [" + dutyCycleMax + "]" : "")
      + (compRatio != null ? " compRatio [" + compRatio + "]" : "")
      + (prrMax != null ? " prrMax [" + prrMax + "]" : "")
      + (dutyCycleMin != null ? " dutyCycleMin [" + dutyCycleMin + "]" : "")
      + (pdMin != null ? " pdMin [" + pdMin + "]" : "")
      + (fallTime != null ? " fallTime [" + fallTime + "]" : "")
      + (prrMin != null ? " prrMin [" + prrMin + "]" : "")
      + (compMethod != null ? " compMethod [" + compMethod + "]" : "")
      + (numSubpulses != null ? " numSubpulses [" + numSubpulses + "]" : "")
      + (pdMax != null ? " pdMax [" + pdMax + "]" : "")
      + (riseTime != null ? " riseTime [" + riseTime + "]" : "")
      + (radarProcessingGainMax != null ? " radarProcessingGainMax [" + radarProcessingGainMax + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Pulse} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
