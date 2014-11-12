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
package us.gov.dod.standard.ssrf._3_0.receiver;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Receiver;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCFO;

/**
 * RxMode and sub-elements define all the technical parameters for a mode of
 * operation of the Receiver.
 * <p>
 * Element of {@link Receiver}
 * <p>
 * Sub-Elements are
 * {@link Baseband}, {@link EmsClass}, {@link FreqConversion}, {@link RxModulation}, {@link RxSignalTuning}, {@link SpreadSpectrum}
 * <p>
 * Example:
 * <pre>
 * &lt;SensitivityLevel&gt;-92&lt;/SensitivityLevel&gt;
 * &lt;NoiseFigure&gt;9&lt;/NoiseFigure&gt;
 * &lt;NoiseTemp&gt;850&lt;/NoiseTemp&gt;
 * &lt;SensitivityCriteriaType&gt;SINAD&lt;/SensitivityCriteriaType&gt;
 *  &lt;SensitivityCriteriaText&gt;10 dB at 30 kHz BW&lt;/SensitivityCriteriaText&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxMode", propOrder = {
  "modeID",
  "description",
  "rxType",
  "necessaryBw",
  "tunability",
  "tuningMethod",
  "intermodPct",
  "intermodEffect",
  "sensitivityLevel",
  "noiseFigure",
  "noiseTemp",
  "sensitivityCriteriaType",
  "sensitivityCriteriaLevel",
  "sensitivityCriteriaText",
  "postDetectionFreqMin",
  "postDetectionFreqMax",
  "processingGain",
  "spuriousRejection",
  "imageRejection",
  "intermodRejection",
  "adjacentChannelSelectivity",
  "freqTolerance",
  "freqToleranceUnit",
  "modeName",
  "emsClass",
  "rxSignalTuning",
  "rxModulation",
  "baseband",
  "freqConversion",
  "spreadSpectrum"
})
public class RxMode {

  /**
   * ModeID - Mode Identifier (Required)
   * <p>
   * A short name for the mode; this name should be a meaningful identification
   * of the mode, but it can also be automatically generated. The Name MUST be
   * unique within the dataset and SHOULD NOT be modified during the lifetime of
   * the Dataset.
   * <p>
   * Format is S20
   * <p>
   * Attribute group ModeInfo (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * Description - Mode Description (Optional)
   * <p>
   * A description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * RxType - Receiver Type (Optional)
   * <p>
   * The type of receiver. If there is no suitable entry in the code list, use
   * Other and indicate the type in a Remark.
   * <p>
   * Format is L:CRT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString rxType;
  /**
   * NecessaryBw - Necessary Bandwidth (Optional)
   * <p>
   * The necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  /**
   * Tunability - Tunability (Optional)
   * <p>
   * The tuning capability.
   * <p>
   * Format is L:CTU
   * <p>
   * Attribute group Tunability (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Tunability", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString tunability;
  /**
   * TuningMethod - Tuning Method (Optional)
   * <p>
   * The device or process used to tune the equipment through the RF spectrum.
   * <p>
   * Format is L:CTN
   * <p>
   * Attribute group Tunability (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningMethod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString tuningMethod;

  @XmlElement(name = "IntermodPct", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal intermodPct;

  @XmlElement(name = "IntermodEffect", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intermodEffect;
  /**
   * SensitivityLevel - Sensitivity Level (Optional)
   * <p>
   * The minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * Format is SN(6,3) (dBm)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBM.class)
  private TDecimal sensitivityLevel;
  /**
   * NoiseFigure - Noise Figure (Optional)
   * <p>
   * The ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NoiseFigure", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal noiseFigure;
  /**
   * NoiseTemp - Noise Temperature (Optional)
   * <p>
   * The absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * Format is UN(7,1) (kelvins)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NoiseTemp", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_1.class)
  private TDecimal noiseTemp;
  /**
   * SensitivityCriteriaType - Type of Sensitivity Criteria (Optional)
   * <p>
   * The criteria used to determine the minimum RF signal power present at the
   * input terminals that ensures acceptable detection and demodulation of the
   * desired signal.
   * <p>
   * Format is L:CSE
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityCriteriaType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString sensitivityCriteriaType;
  /**
   * SensitivityCriteriaLevel - Sensitivity Criteria Level (Optional)
   * <p>
   * The value of the criteria; the meaning and unit of this value depends on
   * the Sensitivity Criteria Type selected.
   * <p>
   * Format is SN(16,15) (dBm)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityCriteriaLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSN16_15.class)
  private TDecimal sensitivityCriteriaLevel;
  /**
   * SensitivityCriteriaText - Sensitivity Criteria Description (Optional)
   * <p>
   * The value of the criteria when it cannot be expressed as a number.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityCriteriaText", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString sensitivityCriteriaText;
  /**
   * PostDetectionFreqMin - Minimum Post Detection Frequency (Optional)
   * <p>
   * The maximum post detection frequency at the baseband half-power point.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group PostDetection (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostDetectionFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal postDetectionFreqMin;
  /**
   * PostDetectionFreqMax - Maximum Post Detection Frequency (Optional)
   * <p>
   * The maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group PostDetection (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostDetectionFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal postDetectionFreqMax;
  /**
   * ProcessingGainMax - Maximum Processing Gain (Optional)
   * <p>
   * The maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ProcessingGain", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal processingGain;
  /**
   * SpuriousRejection - Rejection of Spurious Emissions (Optional)
   * <p>
   * The spurious receiver responses that arise when strong undesired signals
   * and the receiver local oscillator (LO) combine in the mixer to produce a
   * frequency on or near the intermediate frequency. The rejection is the ratio
   * in dB of a particular out-of-band frequency (outside the fundamental IF
   * bandwidth) signal level required to produce a specified output, to the
   * signal level required to produce the same output.
   * <p>
   * Format is UN(5,2) [0..150] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpuriousRejection", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal spuriousRejection;
  /**
   * ImageRejection - Rejection on Image Frequency (Optional)
   * <p>
   * The ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * Format is UN(5,2) [0..150] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ImageRejection", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal imageRejection;
  /**
   * IntermodRejection - Rejection of Intermodulation (Optional)
   * <p>
   * The rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * Format is UN(5,2) [0..200] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IntermodRejection", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal intermodRejection;
  /**
   * AdjacentChannelSelectivity - Adjacent Channel Selectivity (Optional)
   * <p>
   * The ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * Format is SN(6,3) (dBm)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AdjacentChannelSelectivity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal adjacentChannelSelectivity;
  /**
   * FreqTolerance - Frequency Tolerance (Required)
   * <p>
   * The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) =
   * Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in
   * FreqToleranceUnit.
   * <p>
   * Format is UN(18,6)
   * <p>
   * Attribute group FreqTolerance (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqTolerance")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN18_6.class)
  private TDecimal freqTolerance;
  /**
   * FreqToleranceUnit - Frequency Tolerance Unit (Required)
   * <p>
   * The units in which the Frequency Tolerance is expressed.
   * <p>
   * Format is L:CFO
   * <p>
   * Attribute group FreqTolerance (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqToleranceUnit")
  private TString freqToleranceUnit;
  /**
   * US:ModeName - Mode Name (Optional)
   * <p>
   * A short name for the mode.
   * <p>
   * Format is S40
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  /**
   * EmsClass (Optional)
   * <p>
   * EmsClass identifies the emission classification symbols that define the
   * baseband modulating characteristics of the emission designator. The
   * emission classification consists of the three required symbols and the two
   * optional symbols.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EmsClass", nillable = true)
  private List<EmsClass> emsClass;
  /**
   * RxSignalTuning (Optional)
   * <p>
   * RxSignalTuning indicates the tuning capabilities, the specific frequency or
   * range of frequencies within which the equipment may tune, and the tuning
   * increments of the equipment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxSignalTuning")
  private List<RxSignalTuning> rxSignalTuning;
  /**
   * RxModulation (Optional)
   * <p>
   * RxModulation contains the detailed characteristics of the modulation on the
   * receiver side.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxModulation")
  private List<RxModulation> rxModulation;
  /**
   * Baseband (Optional)
   * <p>
   * Baseband defines the parameters of the modulating or received signal.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Baseband")
  private List<Baseband> baseband;
  /**
   * FreqConversion (Optional)
   * <p>
   * FreqConversion contains the characteristics of a frequency conversion
   * stage: intermediate frequency (IF) and local oscillator (LO) parameters.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqConversion")
  private List<FreqConversion> freqConversion;
  /**
   * Spread Spectrum (Optional)
   * <p>
   * SpreadSpectrum contains characteristics of systems using spread spectrum
   * techniques.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpreadSpectrum")
  private SpreadSpectrum spreadSpectrum;
  /**
   * curves - Links to Curves (Optional)
   * <p>
   * The list of indices referring to Curves applicable to the data item.
   * <p>
   * Format is List of UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "curves")
  private List<BigInteger> curves;

  /**
   * Get a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated. The
   * Name MUST be unique within the dataset and SHOULD NOT be modified during
   * the lifetime of the Dataset.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated. The
   * Name MUST be unique within the dataset and SHOULD NOT be modified during
   * the lifetime of the Dataset.
   * <p>
   * @param value the ModeID value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @return the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the type of receiver. If there is no suitable entry in the code list,
   * use Other and indicate the type in a Remark.
   * <p>
   * @return the RxType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRxType() {
    return rxType;
  }

  /**
   * Set the type of receiver. If there is no suitable entry in the code list,
   * use Other and indicate the type in a Remark.
   * <p>
   * @param value the RxType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRxType(TString value) {
    this.rxType = value;
  }

  /**
   * Determine if the RxType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxType() {
    return (this.rxType != null ? this.rxType.isSetValue() : false);
  }

  /**
   * Get the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @return the NecessaryBw value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value the NecessaryBw value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setNecessaryBw(TDecimal value) {
    this.necessaryBw = value;
  }

  /**
   * Determine if the NecessaryBw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null ? this.necessaryBw.isSetValue() : false);
  }

  /**
   * Get the tuning capability.
   * <p>
   * @return the Tunability value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value the Tunability value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTunability(TString value) {
    this.tunability = value;
  }

  /**
   * Determine if the Tunability is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTunability() {
    return (this.tunability != null ? this.tunability.isSetValue() : false);
  }

  /**
   * Get the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @return the TuningMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value the TuningMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTuningMethod(TString value) {
    this.tuningMethod = value;
  }

  /**
   * Determine if the TuningMethod is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningMethod() {
    return (this.tuningMethod != null ? this.tuningMethod.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the IntermodPct value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getIntermodPct() {
    return intermodPct;
  }

  /**
   * Set
   * <p>
   * @param value the IntermodPct value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setIntermodPct(TDecimal value) {
    this.intermodPct = value;
  }

  /**
   * Determine if the IntermodPct is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodPct() {
    return (this.intermodPct != null ? this.intermodPct.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the IntermodEffect value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Set
   * <p>
   * @param value the IntermodEffect value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIntermodEffect(TString value) {
    this.intermodEffect = value;
  }

  /**
   * Determine if the IntermodEffect is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodEffect() {
    return (this.intermodEffect != null ? this.intermodEffect.isSetValue() : false);
  }

  /**
   * Get the minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * @return the SensitivityLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSensitivityLevel() {
    return sensitivityLevel;
  }

  /**
   * Set the minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * @param value the SensitivityLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSensitivityLevel(TDecimal value) {
    this.sensitivityLevel = value;
  }

  /**
   * Determine if the SensitivityLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityLevel() {
    return (this.sensitivityLevel != null ? this.sensitivityLevel.isSetValue() : false);
  }

  /**
   * Get the ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * @return the NoiseFigure value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getNoiseFigure() {
    return noiseFigure;
  }

  /**
   * Set the ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * @param value the NoiseFigure value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setNoiseFigure(TDecimal value) {
    this.noiseFigure = value;
  }

  /**
   * Determine if the NoiseFigure is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoiseFigure() {
    return (this.noiseFigure != null ? this.noiseFigure.isSetValue() : false);
  }

  /**
   * Get the absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * @return the NoiseTemp value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getNoiseTemp() {
    return noiseTemp;
  }

  /**
   * Set the absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * @param value the NoiseTemp value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setNoiseTemp(TDecimal value) {
    this.noiseTemp = value;
  }

  /**
   * Determine if the NoiseTemp is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoiseTemp() {
    return (this.noiseTemp != null ? this.noiseTemp.isSetValue() : false);
  }

  /**
   * Get the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @return the SensitivityCriteriaType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSensitivityCriteriaType() {
    return sensitivityCriteriaType;
  }

  /**
   * Set the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @param value the SensitivityCriteriaType value in a {@link TString} data
   *              type
   * @since 3.1.0
   */
  public void setSensitivityCriteriaType(TString value) {
    this.sensitivityCriteriaType = value;
  }

  /**
   * Determine if the SensitivityCriteriaType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityCriteriaType() {
    return (this.sensitivityCriteriaType != null ? this.sensitivityCriteriaType.isSetValue() : false);
  }

  /**
   * Get the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @return the SensitivityCriteriaLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSensitivityCriteriaLevel() {
    return sensitivityCriteriaLevel;
  }

  /**
   * Set the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @param value the SensitivityCriteriaLevel value in a {@link TDecimal} data
   *              type
   * @since 3.1.0
   */
  public void setSensitivityCriteriaLevel(TDecimal value) {
    this.sensitivityCriteriaLevel = value;
  }

  /**
   * Determine if the SensitivityCriteriaLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityCriteriaLevel() {
    return (this.sensitivityCriteriaLevel != null ? this.sensitivityCriteriaLevel.isSetValue() : false);
  }

  /**
   * Get the value of the criteria when it cannot be expressed as a number.
   * <p>
   * @return the SensitivityCriteriaText value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSensitivityCriteriaText() {
    return sensitivityCriteriaText;
  }

  /**
   * Set the value of the criteria when it cannot be expressed as a number.
   * <p>
   * @param value the SensitivityCriteriaText value in a {@link TString} data
   *              type
   * @since 3.1.0
   */
  public void setSensitivityCriteriaText(TString value) {
    this.sensitivityCriteriaText = value;
  }

  /**
   * Determine if the SensitivityCriteriaText is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityCriteriaText() {
    return (this.sensitivityCriteriaText != null ? this.sensitivityCriteriaText.isSetValue() : false);
  }

  /**
   * Get the maximum post detection frequency at the baseband half-power point.
   * <p>
   * @return the PostDetectionFreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPostDetectionFreqMin() {
    return postDetectionFreqMin;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * @param value the PostDetectionFreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPostDetectionFreqMin(TDecimal value) {
    this.postDetectionFreqMin = value;
  }

  /**
   * Determine if the PostDetectionFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPostDetectionFreqMin() {
    return (this.postDetectionFreqMin != null ? this.postDetectionFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @return the PostDetectionFreqMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPostDetectionFreqMax() {
    return postDetectionFreqMax;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @param value the PostDetectionFreqMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPostDetectionFreqMax(TDecimal value) {
    this.postDetectionFreqMax = value;
  }

  /**
   * Determine if the PostDetectionFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPostDetectionFreqMax() {
    return (this.postDetectionFreqMax != null ? this.postDetectionFreqMax.isSetValue() : false);
  }

  /**
   * Get the maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * @return the ProcessingGain value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getProcessingGain() {
    return processingGain;
  }

  /**
   * Set the maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * @param value the ProcessingGain value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setProcessingGain(TDecimal value) {
    this.processingGain = value;
  }

  /**
   * Determine if the ProcessingGain is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProcessingGain() {
    return (this.processingGain != null ? this.processingGain.isSetValue() : false);
  }

  /**
   * Get the spurious receiver responses that arise when strong undesired
   * signals and the receiver local oscillator (LO) combine in the mixer to
   * produce a frequency on or near the intermediate frequency. The rejection is
   * the ratio in dB of a particular out-of-band frequency (outside the
   * fundamental IF bandwidth) signal level required to produce a specified
   * output, to the signal level required to produce the same output.
   * <p>
   * @return the SpuriousRejection value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSpuriousRejection() {
    return spuriousRejection;
  }

  /**
   * Set the spurious receiver responses that arise when strong undesired
   * signals and the receiver local oscillator (LO) combine in the mixer to
   * produce a frequency on or near the intermediate frequency. The rejection is
   * the ratio in dB of a particular out-of-band frequency (outside the
   * fundamental IF bandwidth) signal level required to produce a specified
   * output, to the signal level required to produce the same output.
   * <p>
   * @param value the SpuriousRejection value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSpuriousRejection(TDecimal value) {
    this.spuriousRejection = value;
  }

  /**
   * Determine if the SpuriousRejection is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpuriousRejection() {
    return (this.spuriousRejection != null ? this.spuriousRejection.isSetValue() : false);
  }

  /**
   * Get the ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * @return the ImageRejection value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getImageRejection() {
    return imageRejection;
  }

  /**
   * Set the ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * @param value the ImageRejection value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setImageRejection(TDecimal value) {
    this.imageRejection = value;
  }

  /**
   * Determine if the ImageRejection is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetImageRejection() {
    return (this.imageRejection != null ? this.imageRejection.isSetValue() : false);
  }

  /**
   * Get the rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * @return the IntermodRejection value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getIntermodRejection() {
    return intermodRejection;
  }

  /**
   * Set the rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * @param value the IntermodRejection value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setIntermodRejection(TDecimal value) {
    this.intermodRejection = value;
  }

  /**
   * Determine if the IntermodRejection is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodRejection() {
    return (this.intermodRejection != null ? this.intermodRejection.isSetValue() : false);
  }

  /**
   * Get the ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * @return the AdjacentChannelSelectivity value in a {@link TDecimal} data
   *         type
   * @since 3.1.0
   */
  public TDecimal getAdjacentChannelSelectivity() {
    return adjacentChannelSelectivity;
  }

  /**
   * Set the ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * @param value the AdjacentChannelSelectivity value in a {@link TDecimal}
   *              data type
   * @since 3.1.0
   */
  public void setAdjacentChannelSelectivity(TDecimal value) {
    this.adjacentChannelSelectivity = value;
  }

  /**
   * Determine if the AdjacentChannelSelectivity is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdjacentChannelSelectivity() {
    return (this.adjacentChannelSelectivity != null ? this.adjacentChannelSelectivity.isSetValue() : false);
  }

  /**
   * Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @return the FreqTolerance value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value the FreqTolerance value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFreqTolerance(TDecimal value) {
    this.freqTolerance = value;
  }

  /**
   * Determine if the FreqTolerance is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqTolerance() {
    return (this.freqTolerance != null ? this.freqTolerance.isSetValue() : false);
  }

  /**
   * Get the units in which the Frequency Tolerance is expressed.
   * <p>
   * @return the FreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value the FreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFreqToleranceUnit(TString value) {
    this.freqToleranceUnit = value;
  }

  /**
   * Determine if the FreqToleranceUnit is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqToleranceUnit() {
    return (this.freqToleranceUnit != null ? this.freqToleranceUnit.isSetValue() : false);
  }

  /**
   * Get a short name for the mode.
   * <p>
   * @return the ModeName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value the ModeName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModeName(TString value) {
    this.modeName = value;
  }

  /**
   * Determine if the ModeName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeName() {
    return (this.modeName != null ? this.modeName.isSetValue() : false);
  }

  /**
   * Get the EmsClass
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols.
   * <p>
   * @return a {@link EmsClass} instance
   * @since 3.1.0
   */
  public List<EmsClass> getEmsClass() {
    if (emsClass == null) {
      emsClass = new ArrayList<>();
    }
    return this.emsClass;
  }

  /**
   * Determine if the EmsClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmsClass() {
    return ((this.emsClass != null) && (!this.emsClass.isEmpty()));
  }

  /**
   * Clear the EmsClass field. This sets the field to null.
   */
  public void unsetEmsClass() {
    this.emsClass = null;
  }

  /**
   * Get the RxSignalTuning
   * <p>
   * Complex element RxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @return a {@link RxSignalTuning} instance
   * @since 3.1.0
   */
  public List<RxSignalTuning> getRxSignalTuning() {
    if (rxSignalTuning == null) {
      rxSignalTuning = new ArrayList<>();
    }
    return this.rxSignalTuning;
  }

  /**
   * Determine if the RxSignalTuning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxSignalTuning() {
    return ((this.rxSignalTuning != null) && (!this.rxSignalTuning.isEmpty()));
  }

  /**
   * Clear the RxSignalTuning field. This sets the field to null.
   */
  public void unsetRxSignalTuning() {
    this.rxSignalTuning = null;
  }

  /**
   * Get the RxModulation
   * <p>
   * Complex element RxModulation contains the detailed characteristics of the
   * modulation on the receiver side.
   * <p>
   * @return a {@link RxModulation} instance
   * @since 3.1.0
   */
  public List<RxModulation> getRxModulation() {
    if (rxModulation == null) {
      rxModulation = new ArrayList<>();
    }
    return this.rxModulation;
  }

  /**
   * Determine if the RxModulation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxModulation() {
    return ((this.rxModulation != null) && (!this.rxModulation.isEmpty()));
  }

  /**
   * Clear the RxModulation field. This sets the field to null.
   */
  public void unsetRxModulation() {
    this.rxModulation = null;
  }

  /**
   * Get the Baseband
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @return a {@link Baseband} instance
   * @since 3.1.0
   */
  public List<Baseband> getBaseband() {
    if (baseband == null) {
      baseband = new ArrayList<>();
    }
    return this.baseband;
  }

  /**
   * Determine if the Baseband is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBaseband() {
    return ((this.baseband != null) && (!this.baseband.isEmpty()));
  }

  /**
   * Clear the Baseband field. This sets the field to null.
   */
  public void unsetBaseband() {
    this.baseband = null;
  }

  /**
   * Get the FreqConversion
   * <p>
   * Complex element FreqConversion contains the characteristics of a frequency
   * conversion stage: intermediate frequency (IF) and local oscillator (LO)
   * parameters.
   * <p>
   * @return a {@link FreqConversion} instance
   * @since 3.1.0
   */
  public List<FreqConversion> getFreqConversion() {
    if (freqConversion == null) {
      freqConversion = new ArrayList<>();
    }
    return this.freqConversion;
  }

  /**
   * Determine if the FreqConversion is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqConversion() {
    return ((this.freqConversion != null) && (!this.freqConversion.isEmpty()));
  }

  /**
   * Clear the FreqConversion field. This sets the field to null.
   */
  public void unsetFreqConversion() {
    this.freqConversion = null;
  }

  /**
   * Get the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   * <p>
   * @return a {@link SpreadSpectrum} instance
   * @since 3.1.0
   */
  public SpreadSpectrum getSpreadSpectrum() {
    return spreadSpectrum;
  }

  /**
   * Set the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   * <p>
   * @param value a {@link SpreadSpectrum} instance
   * @since 3.1.0
   */
  public void setSpreadSpectrum(SpreadSpectrum value) {
    this.spreadSpectrum = value;
  }

  /**
   * Determine if the SpreadSpectrum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpreadSpectrum() {
    return (this.spreadSpectrum != null);
  }

  /**
   * Get the list of indices referring to Curves applicable to the data item.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getCurves() {
    if (curves == null) {
      curves = new ArrayList<>();
    }
    return this.curves;
  }

  /**
   * Determine if the Curves is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurves() {
    return ((this.curves != null) && (!this.curves.isEmpty()));
  }

  /**
   * Clear the Curves field. This sets the field to null.
   */
  public void unsetCurves() {
    this.curves = null;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated. The
   * Name MUST be unique within the dataset and SHOULD NOT be modified during
   * the lifetime of the Dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the type of receiver. If there is no suitable entry in the code list,
   * use Other and indicate the type in a Remark.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withRxType(String value) {
    setRxType(new TString(value));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withTunability(String value) {
    setTunability(new TString(value));
    return this;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withTuningMethod(String value) {
    setTuningMethod(new TString(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withIntermodPct(Double value) {
    setIntermodPct(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withIntermodEffect(String value) {
    setIntermodEffect(new TString(value));
    return this;
  }

  /**
   * Set the minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSensitivityLevel(Double value) {
    setSensitivityLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withNoiseFigure(Double value) {
    setNoiseFigure(new TDecimal(value));
    return this;
  }

  /**
   * Set the absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withNoiseTemp(Double value) {
    setNoiseTemp(new TDecimal(value));
    return this;
  }

  /**
   * Set the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSensitivityCriteriaType(String value) {
    setSensitivityCriteriaType(new TString(value));
    return this;
  }

  /**
   * Set the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSensitivityCriteriaLevel(Double value) {
    setSensitivityCriteriaLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the value of the criteria when it cannot be expressed as a number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSensitivityCriteriaText(String value) {
    setSensitivityCriteriaText(new TString(value));
    return this;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withPostDetectionFreqMin(Double value) {
    setPostDetectionFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withPostDetectionFreqMax(Double value) {
    setPostDetectionFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withProcessingGain(Double value) {
    setProcessingGain(new TDecimal(value));
    return this;
  }

  /**
   * Set the spurious receiver responses that arise when strong undesired
   * signals and the receiver local oscillator (LO) combine in the mixer to
   * produce a frequency on or near the intermediate frequency. The rejection is
   * the ratio in dB of a particular out-of-band frequency (outside the
   * fundamental IF bandwidth) signal level required to produce a specified
   * output, to the signal level required to produce the same output.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSpuriousRejection(Double value) {
    setSpuriousRejection(new TDecimal(value));
    return this;
  }

  /**
   * Set the ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withImageRejection(Double value) {
    setImageRejection(new TDecimal(value));
    return this;
  }

  /**
   * Set the rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withIntermodRejection(Double value) {
    setIntermodRejection(new TDecimal(value));
    return this;
  }

  /**
   * Set the ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withAdjacentChannelSelectivity(Double value) {
    setAdjacentChannelSelectivity(new TDecimal(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withFreqTolerance(Double value) {
    setFreqTolerance(new TDecimal(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  /**
   * Set the EmsClass
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols.
   * <p>
   * @param values One or more instances of type {@link EmsClass...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withEmsClass(EmsClass... values) {
    if (values != null) {
      getEmsClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the EmsClass
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols.
   * <p>
   * @param values A collection of {@link EmsClass} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withEmsClass(Collection<EmsClass> values) {
    if (values != null) {
      getEmsClass().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxSignalTuning
   * <p>
   * Complex element RxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values One or more instances of type {@link RxSignalTuning...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withRxSignalTuning(RxSignalTuning... values) {
    if (values != null) {
      getRxSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxSignalTuning
   * <p>
   * Complex element RxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values A collection of {@link RxSignalTuning} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withRxSignalTuning(Collection<RxSignalTuning> values) {
    if (values != null) {
      getRxSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxModulation
   * <p>
   * Complex element RxModulation contains the detailed characteristics of the
   * modulation on the receiver side.
   * <p>
   * @param values One or more instances of type {@link RxModulation...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withRxModulation(RxModulation... values) {
    if (values != null) {
      getRxModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxModulation
   * <p>
   * Complex element RxModulation contains the detailed characteristics of the
   * modulation on the receiver side.
   * <p>
   * @param values A collection of {@link RxModulation} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withRxModulation(Collection<RxModulation> values) {
    if (values != null) {
      getRxModulation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Baseband
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @param values One or more instances of type {@link Baseband...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withBaseband(Baseband... values) {
    if (values != null) {
      getBaseband().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Baseband
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @param values A collection of {@link Baseband} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  /**
   * Set the FreqConversion
   * <p>
   * Complex element FreqConversion contains the characteristics of a frequency
   * conversion stage: intermediate frequency (IF) and local oscillator (LO)
   * parameters.
   * <p>
   * @param values One or more instances of type {@link FreqConversion...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withFreqConversion(FreqConversion... values) {
    if (values != null) {
      getFreqConversion().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the FreqConversion
   * <p>
   * Complex element FreqConversion contains the characteristics of a frequency
   * conversion stage: intermediate frequency (IF) and local oscillator (LO)
   * parameters.
   * <p>
   * @param values A collection of {@link FreqConversion} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withFreqConversion(Collection<FreqConversion> values) {
    if (values != null) {
      getFreqConversion().addAll(values);
    }
    return this;
  }

  /**
   * Set the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   * <p>
   * @param value An instances of type {@link SpreadSpectrum}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSpreadSpectrum(SpreadSpectrum value) {
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withCurves(BigInteger... values) {
    if (values != null) {
      getCurves().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link Curves} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withCurves(Collection<BigInteger> values) {
    if (values != null) {
      getCurves().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this RxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxMode {"
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (sensitivityCriteriaType != null ? " sensitivityCriteriaType [" + sensitivityCriteriaType + "]" : "")
      + (tuningMethod != null ? " tuningMethod [" + tuningMethod + "]" : "")
      + (intermodRejection != null ? " intermodRejection [" + intermodRejection + "]" : "")
      + (rxSignalTuning != null ? " rxSignalTuning [" + rxSignalTuning + "]" : "")
      + (freqTolerance != null ? " freqTolerance [" + freqTolerance + "]" : "")
      + (intermodPct != null ? " intermodPct [" + intermodPct + "]" : "")
      + (modeName != null ? " modeName [" + modeName + "]" : "")
      + (imageRejection != null ? " imageRejection [" + imageRejection + "]" : "")
      + (curves != null ? " curves [" + curves + "]" : "")
      + (sensitivityCriteriaText != null ? " sensitivityCriteriaText [" + sensitivityCriteriaText + "]" : "")
      + (baseband != null ? " baseband [" + baseband + "]" : "")
      + (processingGain != null ? " processingGain [" + processingGain + "]" : "")
      + (spreadSpectrum != null ? " spreadSpectrum [" + spreadSpectrum + "]" : "")
      + (intermodEffect != null ? " intermodEffect [" + intermodEffect + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (sensitivityCriteriaLevel != null ? " sensitivityCriteriaLevel [" + sensitivityCriteriaLevel + "]" : "")
      + (postDetectionFreqMax != null ? " postDetectionFreqMax [" + postDetectionFreqMax + "]" : "")
      + (freqToleranceUnit != null ? " freqToleranceUnit [" + freqToleranceUnit + "]" : "")
      + (rxModulation != null ? " rxModulation [" + rxModulation + "]" : "")
      + (rxType != null ? " rxType [" + rxType + "]" : "")
      + (freqConversion != null ? " freqConversion [" + freqConversion + "]" : "")
      + (spuriousRejection != null ? " spuriousRejection [" + spuriousRejection + "]" : "")
      + (noiseFigure != null ? " noiseFigure [" + noiseFigure + "]" : "")
      + (tunability != null ? " tunability [" + tunability + "]" : "")
      + (adjacentChannelSelectivity != null ? " adjacentChannelSelectivity [" + adjacentChannelSelectivity + "]" : "")
      + (emsClass != null ? " emsClass [" + emsClass + "]" : "")
      + (necessaryBw != null ? " necessaryBw [" + necessaryBw + "]" : "")
      + (postDetectionFreqMin != null ? " postDetectionFreqMin [" + postDetectionFreqMin + "]" : "")
      + (noiseTemp != null ? " noiseTemp [" + noiseTemp + "]" : "")
      + (sensitivityLevel != null ? " sensitivityLevel [" + sensitivityLevel + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxMode} requires {@link TString ModeID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetModeID();
  }

}
