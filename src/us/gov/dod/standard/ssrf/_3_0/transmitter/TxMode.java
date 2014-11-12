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

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Transmitter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCFO;
import us.gov.dod.standard.ssrf._3_0.receiver.Baseband;
import us.gov.dod.standard.ssrf._3_0.receiver.EmsClass;
import us.gov.dod.standard.ssrf._3_0.receiver.SpreadSpectrum;

/**
 * TxMode and its sub-elements define all the technical parameters for a mode of
 * operation of the Transmitter.
 * <p>
 * Element of {@link Transmitter}
 * <p>
 * Sub-Elements are
 * {@link Baseband}, {@link EmsClass}, {@link ObservedMOPAnalysis}, {@link ObservedPulseAnalysis}, {@link ObservedRFAnalysis}, {@link Power}, {@link Pulse}, {@link SpreadSpectrum}, {@link SubcarrierFreq}, {@link TxModulation}, {@link TxSignalTuning}
 * <p>
 * Example:
 * <pre>
 * &lt;TxMode&gt;
 *   &lt;BurstDuration  cls="U"&gt;.001&lt;/BurstDuration &gt;
 *   &lt;BurstNumPulses  cls="U"&gt;458&lt;/BurstNumPulses &gt;
 *   &lt;BurstOffTime  cls="U"&gt;.13&lt;/BurstOffTime &gt;
 *   &lt;BurstRate  cls="U"&gt;5984&lt;/BurstRate &gt;
 *   &lt;ChannelDwell cls="U"&gt;.2387&lt;/ChannelDwell&gt;
 *   &lt;curves cls="U"&gt;34&lt;/curves&gt;
 *   &lt;Description  cls="U"&gt;Targets 893 and 569&lt;/Description &gt;
 *   &lt;FreqTolerance  cls="U"&gt;.0001&lt;/FreqTolerance &gt;
 *   &lt;FreqToleranceUnit cls="U"&gt;ppm&lt;/FreqToleranceUnit&gt;
 *   &lt;IntermodulationEffect cls="U"&gt;Friendly receivers performance degraded by 12 percent&lt;/IntermodulationEffect&gt;
 *   &lt;IntermodulationPct  cls="U"&gt;17&lt;/IntermodulationPct &gt;
 *   &lt;ModeID  cls="U"&gt;Narrowband Pulse&lt;/ModeID &gt;
 *   &lt;NecessaryBw  cls="U"&gt;3123.67&lt;/NecessaryBw &gt;
 *   &lt;NumSideTones  cls="U"&gt;16&lt;/NumSideTones &gt;
 *   &lt;NumSubCarriers  cls="U"&gt;16&lt;/NumSubCarriers &gt;
 *   &lt;OccBw cls="U"&gt;3363.67&lt;/OccBw&gt;
 *   &lt;OccBwCalculated cls="U"&gt;Yes&lt;/OccBwCalculated&gt;
 *   &lt;OtherHarmonicLevel  cls="U"&gt;106&lt;/OtherHarmonicLevel &gt;
 *   &lt;RadarType  cls="U"&gt;FM Pulse&lt;/RadarType &gt;
 *   &lt;SecondHarmonicLevel  cls="U"&gt;89&lt;/SecondHarmonicLevel &gt;
 *   &lt;SpuriousLevel  cls="U"&gt;90&lt;/SpuriousLevel &gt;
 *   &lt;ThirdHarmonicLevel  cls="U"&gt;93&lt;/ThirdHarmonicLevel &gt;
 *   &lt;Tunability  cls="U"&gt;Fixed+Stepped&lt;/Tunability &gt;
 *   &lt;TuningMethod  cls="U"&gt;Synthesizer Microprocessor Controlled&lt;/TuningMethod &gt;
 *   &lt;GpsNBL1Level  cls="U"&gt;46.95&lt;/GpsNBL1Level &gt;
 *   &lt;GpsNBL2Level  cls="U"&gt;66.98&lt;/GpsNBL2Level &gt;
 *   &lt;GpsWBL1Level  cls="U"&gt;12.89&lt;/GpsWBL1Level &gt;
 *   &lt;GpsWBL2Level  cls="U"&gt;16.975&lt;/GpsWBL2Level &gt;
 *   &lt;JitterCapable cls="U"&gt;Yes&lt;/JitterCapable&gt;
 *   &lt;ModeName  cls="U"&gt;Broadband Sweep Jamming&lt;/ModeName &gt;
 *   &lt;ModulationType  cls="U"&gt;Pulse&lt;/ModulationType &gt;
 * &lt;/TxMode&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxMode", propOrder = {
  "modeID",
  "description",
  "necessaryBw",
  "tunability",
  "tuningMethod",
  "numSubCarriers",
  "numSideTones",
  "intermodPct",
  "intermodEffect",
  "burstRate",
  "burstDuration",
  "burstNumPulses",
  "burstOffTime",
  "occBw",
  "occBwCalculated",
  "secondHarmonicLevel",
  "thirdHarmonicLevel",
  "otherHarmonicLevel",
  "spuriousLevel",
  "freqTolerance",
  "freqToleranceUnit",
  "radarType",
  "gpsNBL1Level",
  "gpsNBL2Level",
  "gpsWBL1Level",
  "gpsWBL2Level",
  "modulationType",
  "modeName",
  "emsClass",
  "power",
  "txSignalTuning",
  "txModulation",
  "baseband",
  "pulse",
  "subCarrierFreq",
  "subCarrierTone",
  "spreadSpectrum"
})
public class TxMode {

  /**
   * ModeID - Mode Identifier (Required)
   * <p>
   * The unique identifier of a TxMode of the transmitter in this configuration.
   * This mode is from the transmitter specified in the Serial field of the
   * parent TxRef element.
   * <p>
   * Format is S20
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
  /**
   * NumSubCarriers - Number of Subcarriers (Optional)
   * <p>
   * The number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumSubCarriers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSubCarriers;
  /**
   * NumSideTones - Number of Side Tones (Optional)
   * <p>
   * The number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumSideTones", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSideTones;

  @XmlElement(name = "IntermodPct", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal intermodPct;

  @XmlElement(name = "IntermodEffect", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intermodEffect;
  /**
   * BurstRate - Burst Rate (Optional)
   * <p>
   * The number of pulse bursts per second.
   * <p>
   * Format is UN(12,3)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN12_3.class)
  private TDecimal burstRate;
  /**
   * BurstDuration - Burst Duration (Optional)
   * <p>
   * The pulse burst duration.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstDuration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstDuration;
  /**
   * BurstNumPulses - Number of Pulses in Burst (Optional)
   * <p>
   * The number of pulses in a single pulse burst.
   * <p>
   * Format is UN(8)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstNumPulses", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger burstNumPulses;
  /**
   * BurstOffTime - Burst Off-Time (Optional)
   * <p>
   * The pulse burst off time in microseconds (duration of time between the end
   * of one pulse burst to the start of the next pulse burst).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstOffTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstOffTime;
  /**
   * OccBw - Occupied Bandwidth (Optional)
   * <p>
   * The minimum bandwidth utilized to process 99.5% of the emission spectra.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group OccupiedBw (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OccBw")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal occBw;
  /**
   * OccBwCalculated - Calculated Occupied Bandwidth Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement.
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group OccupiedBw (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OccBwCalculated", required = false)
  private TString occBwCalculated;
  /**
   * SecondHarmonicLevel - Second Harmonic Level (Optional)
   * <p>
   * The out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SecondHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal secondHarmonicLevel;
  /**
   * ThirdHarmonicLevel - Third Harmonic Level (Optional)
   * <p>
   * The out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ThirdHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal thirdHarmonicLevel;
  /**
   * OtherHarmonicLevel - Other Harmonic Level (Optional)
   * <p>
   * The greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OtherHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal otherHarmonicLevel;
  /**
   * SpuriousLevel - Spurious Emissions Level (Optional)
   * <p>
   * The maximum of all emission levels which occur outside the bandwidth of the
   * fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpuriousLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal spuriousLevel;
  /**
   * FreqTolerance - Frequency Tolerance (Optional)
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
   * FreqToleranceUnit - Frequency Tolerance Unit (Optional)
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
   * RadarType - Radar Modulation Type (Optional)
   * <p>
   * The type of radar.
   * <p>
   * Format is L:CRA
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RadarType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString radarType;
  /**
   * US:GpsNBL1Level - GPS NBL1 Level (Optional)
   * <p>
   * The narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * Format is SN(5,3) (dBW)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsNBL1Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL1Level;
  /**
   * US:GpsNBL2Level - GPS NBL2 Level (Optional)
   * <p>
   * The narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * Format is SN(5,3) (dBW)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsNBL2Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL2Level;
  /**
   * US:GpsWBL1Level - GpsWBL1Level (Optional)
   * <p>
   * The wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * Format is SN(9,6) (dBW/Hz)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsWBL1Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL1Level;
  /**
   * US:GpsWBL2Level - GpsWBL1Level (Optional)
   * <p>
   * The wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * Format is SN(9,6) (dBW/Hz)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsWBL2Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL2Level;
  /**
   * US:ModulationType - Modulation Type (Optional)
   * <p>
   * The type of modulation.
   * <p>
   * Format is L:UMD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModulationType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString modulationType;
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
   * PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Power")
  private List<Power> power;
  /**
   * TxSignalTuning (Optional)
   * <p>
   * TxSignalTuning indicates the tuning capabilities, the specific frequency or
   * range of frequencies within which the equipment may tune, and the tuning
   * increments of the equipment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxSignalTuning")
  private List<TxSignalTuning> txSignalTuning;
  /**
   * TxModulation (Optional)
   * <p>
   * TxModulation contains the detailed characteristics of the modulation on the
   * transmitter side.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxModulation")
  private List<TxModulation> txModulation;
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
   * BurstNumPulses - Number of Pulses in Burst (Optional)
   * <p>
   * The number of pulses in a single pulse burst.
   * <p>
   * Format is UN(8)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Pulse")
  private List<Pulse> pulse;
  /**
   * SubcarrierFreq (Optional)
   * <p>
   * SubcarrierFreq describes the secondary channel that
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SubCarrierFreq", nillable = true)
  private List<SubCarrierFreq> subCarrierFreq;

  @XmlElement(name = "SubCarrierTone", nillable = true)
  private List<SubCarrierTone> subCarrierTone;
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
   * Get the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
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
   * Get the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @return the NumSubCarriers value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value the NumSubCarriers value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setNumSubCarriers(TInteger value) {
    this.numSubCarriers = value;
  }

  /**
   * Determine if the NumSubCarriers is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSubCarriers() {
    return (this.numSubCarriers != null ? this.numSubCarriers.isSetValue() : false);
  }

  /**
   * Get the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @return the NumSideTones value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getNumSideTones() {
    return numSideTones;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value the NumSideTones value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setNumSideTones(TInteger value) {
    this.numSideTones = value;
  }

  /**
   * Determine if the NumSideTones is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSideTones() {
    return (this.numSideTones != null ? this.numSideTones.isSetValue() : false);
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
   * Get the number of pulse bursts per second.
   * <p>
   * @return the BurstRate value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getBurstRate() {
    return burstRate;
  }

  /**
   * Set the number of pulse bursts per second.
   * <p>
   * @param value the BurstRate value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setBurstRate(TDecimal value) {
    this.burstRate = value;
  }

  /**
   * Determine if the BurstRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstRate() {
    return (this.burstRate != null ? this.burstRate.isSetValue() : false);
  }

  /**
   * Get the pulse burst duration.
   * <p>
   * @return the BurstDuration value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getBurstDuration() {
    return burstDuration;
  }

  /**
   * Set the pulse burst duration.
   * <p>
   * @param value the BurstDuration value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setBurstDuration(TDecimal value) {
    this.burstDuration = value;
  }

  /**
   * Determine if the BurstDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstDuration() {
    return (this.burstDuration != null ? this.burstDuration.isSetValue() : false);
  }

  /**
   * Get the number of pulses in a single pulse burst.
   * <p>
   * @return the BurstNumPulses value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getBurstNumPulses() {
    return burstNumPulses;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param value the BurstNumPulses value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setBurstNumPulses(TInteger value) {
    this.burstNumPulses = value;
  }

  /**
   * Determine if the BurstNumPulses is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstNumPulses() {
    return (this.burstNumPulses != null ? this.burstNumPulses.isSetValue() : false);
  }

  /**
   * Get the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @return the BurstOffTime value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getBurstOffTime() {
    return burstOffTime;
  }

  /**
   * Set the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @param value the BurstOffTime value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setBurstOffTime(TDecimal value) {
    this.burstOffTime = value;
  }

  /**
   * Determine if the BurstOffTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstOffTime() {
    return (this.burstOffTime != null ? this.burstOffTime.isSetValue() : false);
  }

  /**
   * Get the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @return the OccBw value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getOccBw() {
    return occBw;
  }

  /**
   * Set the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @param value the OccBw value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setOccBw(TDecimal value) {
    this.occBw = value;
  }

  /**
   * Determine if the OccBw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOccBw() {
    return (this.occBw != null ? this.occBw.isSetValue() : false);
  }

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @return the OccBwCalculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOccBwCalculated() {
    return occBwCalculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @param value the OccBwCalculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOccBwCalculated(TString value) {
    this.occBwCalculated = value;
  }

  /**
   * Determine if the OccBwCalculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOccBwCalculated() {
    return (this.occBwCalculated != null ? this.occBwCalculated.isSetValue() : false);
  }

  /**
   * Get the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * @return the SecondHarmonicLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSecondHarmonicLevel() {
    return secondHarmonicLevel;
  }

  /**
   * Set the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * @param value the SecondHarmonicLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSecondHarmonicLevel(TDecimal value) {
    this.secondHarmonicLevel = value;
  }

  /**
   * Determine if the SecondHarmonicLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecondHarmonicLevel() {
    return (this.secondHarmonicLevel != null ? this.secondHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @return the ThirdHarmonicLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getThirdHarmonicLevel() {
    return thirdHarmonicLevel;
  }

  /**
   * Set the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @param value the ThirdHarmonicLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setThirdHarmonicLevel(TDecimal value) {
    this.thirdHarmonicLevel = value;
  }

  /**
   * Determine if the ThirdHarmonicLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetThirdHarmonicLevel() {
    return (this.thirdHarmonicLevel != null ? this.thirdHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * @return the OtherHarmonicLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getOtherHarmonicLevel() {
    return otherHarmonicLevel;
  }

  /**
   * Set the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * @param value the OtherHarmonicLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setOtherHarmonicLevel(TDecimal value) {
    this.otherHarmonicLevel = value;
  }

  /**
   * Determine if the OtherHarmonicLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOtherHarmonicLevel() {
    return (this.otherHarmonicLevel != null ? this.otherHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * @return the SpuriousLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSpuriousLevel() {
    return spuriousLevel;
  }

  /**
   * Set the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * @param value the SpuriousLevel value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSpuriousLevel(TDecimal value) {
    this.spuriousLevel = value;
  }

  /**
   * Determine if the SpuriousLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpuriousLevel() {
    return (this.spuriousLevel != null ? this.spuriousLevel.isSetValue() : false);
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
   * Get the type of radar.
   * <p>
   * @return the RadarType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRadarType() {
    return radarType;
  }

  /**
   * Set the type of radar.
   * <p>
   * @param value the RadarType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRadarType(TString value) {
    this.radarType = value;
  }

  /**
   * Determine if the RadarType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRadarType() {
    return (this.radarType != null ? this.radarType.isSetValue() : false);
  }

  /**
   * Get the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @return the GpsNBL1Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getGpsNBL1Level() {
    return gpsNBL1Level;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value the GpsNBL1Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setGpsNBL1Level(TDecimal value) {
    this.gpsNBL1Level = value;
  }

  /**
   * Determine if the GpsNBL1Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsNBL1Level() {
    return (this.gpsNBL1Level != null ? this.gpsNBL1Level.isSetValue() : false);
  }

  /**
   * Get the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @return the GpsNBL2Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getGpsNBL2Level() {
    return gpsNBL2Level;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value the GpsNBL2Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setGpsNBL2Level(TDecimal value) {
    this.gpsNBL2Level = value;
  }

  /**
   * Determine if the GpsNBL2Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsNBL2Level() {
    return (this.gpsNBL2Level != null ? this.gpsNBL2Level.isSetValue() : false);
  }

  /**
   * Get the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @return the GpsWBL1Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getGpsWBL1Level() {
    return gpsWBL1Level;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value the GpsWBL1Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setGpsWBL1Level(TDecimal value) {
    this.gpsWBL1Level = value;
  }

  /**
   * Determine if the GpsWBL1Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsWBL1Level() {
    return (this.gpsWBL1Level != null ? this.gpsWBL1Level.isSetValue() : false);
  }

  /**
   * Get the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @return the GpsWBL2Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getGpsWBL2Level() {
    return gpsWBL2Level;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value the GpsWBL2Level value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setGpsWBL2Level(TDecimal value) {
    this.gpsWBL2Level = value;
  }

  /**
   * Determine if the GpsWBL2Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsWBL2Level() {
    return (this.gpsWBL2Level != null ? this.gpsWBL2Level.isSetValue() : false);
  }

  /**
   * Get the type of modulation.
   * <p>
   * @return the ModulationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModulationType() {
    return modulationType;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value the ModulationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModulationType(TString value) {
    this.modulationType = value;
  }

  /**
   * Determine if the ModulationType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModulationType() {
    return (this.modulationType != null ? this.modulationType.isSetValue() : false);
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
      emsClass = new ArrayList<EmsClass>();
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
   * Get the power limit of this transmitter mode when in this configuration.
   * <p>
   * @return a {@link Power} instance
   * @since 3.1.0
   */
  public List<Power> getPower() {
    if (power == null) {
      power = new ArrayList<>();
    }
    return this.power;
  }

  /**
   * Determine if the Power is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPower() {
    return ((this.power != null) && (!this.power.isEmpty()));
  }

  /**
   * Clear the Power field. This sets the field to null.
   */
  public void unsetPower() {
    this.power = null;
  }

  /**
   * Get the TxSignalTuning
   * <p>
   * Complex element TxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @return a {@link TxSignalTuning} instance
   * @since 3.1.0
   */
  public List<TxSignalTuning> getTxSignalTuning() {
    if (txSignalTuning == null) {
      txSignalTuning = new ArrayList<>();
    }
    return this.txSignalTuning;
  }

  /**
   * Determine if the TxSignalTuning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxSignalTuning() {
    return ((this.txSignalTuning != null) && (!this.txSignalTuning.isEmpty()));
  }

  /**
   * Clear the TxSignalTuning field. This sets the field to null.
   */
  public void unsetTxSignalTuning() {
    this.txSignalTuning = null;
  }

  /**
   * Get the TxModulation
   * <p>
   * Complex element TxModulation contains the detailed characteristics of the
   * modulation on the transmitter side.
   * <p>
   * @return a {@link TxModulation} instance
   * @since 3.1.0
   */
  public List<TxModulation> getTxModulation() {
    if (txModulation == null) {
      txModulation = new ArrayList<>();
    }
    return this.txModulation;
  }

  /**
   * Determine if the TxModulation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxModulation() {
    return ((this.txModulation != null) && (!this.txModulation.isEmpty()));
  }

  /**
   * Clear the TxModulation field. This sets the field to null.
   */
  public void unsetTxModulation() {
    this.txModulation = null;
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
      baseband = new ArrayList<Baseband>();
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
   * Get the number of pulses in a single pulse burst.
   * <p>
   * @return a {@link Pulse} instance
   * @since 3.1.0
   */
  public List<Pulse> getPulse() {
    if (pulse == null) {
      pulse = new ArrayList<>();
    }
    return this.pulse;
  }

  /**
   * Determine if the Pulse is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulse() {
    return ((this.pulse != null) && (!this.pulse.isEmpty()));
  }

  /**
   * Clear the Pulse field. This sets the field to null.
   */
  public void unsetPulse() {
    this.pulse = null;
  }

  /**
   * Get the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @return a {@link SubCarrierFreq} instance
   * @since 3.1.0
   */
  public List<SubCarrierFreq> getSubCarrierFreq() {
    if (subCarrierFreq == null) {
      subCarrierFreq = new ArrayList<>();
    }
    return this.subCarrierFreq;
  }

  /**
   * Determine if the SubCarrierFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSubCarrierFreq() {
    return ((this.subCarrierFreq != null) && (!this.subCarrierFreq.isEmpty()));
  }

  /**
   * Clear the SubCarrierFreq field. This sets the field to null.
   */
  public void unsetSubCarrierFreq() {
    this.subCarrierFreq = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link SubCarrierTone} instance
   * @since 3.1.0
   */
  public List<SubCarrierTone> getSubCarrierTone() {
    if (subCarrierTone == null) {
      subCarrierTone = new ArrayList<>();
    }
    return this.subCarrierTone;
  }

  /**
   * Determine if the SubCarrierTone is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSubCarrierTone() {
    return ((this.subCarrierTone != null) && (!this.subCarrierTone.isEmpty()));
  }

  /**
   * Clear the SubCarrierTone field. This sets the field to null.
   */
  public void unsetSubCarrierTone() {
    this.subCarrierTone = null;
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
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTunability(String value) {
    setTunability(new TString(value));
    return this;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTuningMethod(String value) {
    setTuningMethod(new TString(value));
    return this;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withNumSubCarriers(Integer value) {
    setNumSubCarriers(new TInteger(value));
    return this;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withNumSideTones(Integer value) {
    setNumSideTones(new TInteger(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withIntermodPct(Double value) {
    setIntermodPct(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withIntermodEffect(String value) {
    setIntermodEffect(new TString(value));
    return this;
  }

  /**
   * Set the number of pulse bursts per second.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withBurstRate(Double value) {
    setBurstRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the pulse burst duration.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withBurstDuration(Double value) {
    setBurstDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withBurstNumPulses(Integer value) {
    setBurstNumPulses(new TInteger(value));
    return this;
  }

  /**
   * Set the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withBurstOffTime(Double value) {
    setBurstOffTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withOccBw(Double value) {
    setOccBw(new TDecimal(value));
    return this;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withOccBwCalculated(ListCBO value) {
    setOccBwCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Set the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSecondHarmonicLevel(Double value) {
    setSecondHarmonicLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withThirdHarmonicLevel(Double value) {
    setThirdHarmonicLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withOtherHarmonicLevel(Double value) {
    setOtherHarmonicLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSpuriousLevel(Double value) {
    setSpuriousLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withFreqTolerance(Double value) {
    setFreqTolerance(new TDecimal(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of radar.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withRadarType(String value) {
    setRadarType(new TString(value));
    return this;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withGpsNBL1Level(Double value) {
    setGpsNBL1Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withGpsNBL2Level(Double value) {
    setGpsNBL2Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withGpsWBL1Level(Double value) {
    setGpsWBL1Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withGpsWBL2Level(Double value) {
    setGpsWBL2Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withModulationType(String value) {
    setModulationType(new TString(value));
    return this;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withModeName(String value) {
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
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withEmsClass(EmsClass... values) {
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
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withEmsClass(Collection<EmsClass> values) {
    if (values != null) {
      getEmsClass().addAll(values);
    }
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param values One or more instances of type {@link Power...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withPower(Power... values) {
    if (values != null) {
      getPower().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param values A collection of {@link Power} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withPower(Collection<Power> values) {
    if (values != null) {
      getPower().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxSignalTuning
   * <p>
   * Complex element TxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values One or more instances of type {@link TxSignalTuning...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTxSignalTuning(TxSignalTuning... values) {
    if (values != null) {
      getTxSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TxSignalTuning
   * <p>
   * Complex element TxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values A collection of {@link TxSignalTuning} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTxSignalTuning(Collection<TxSignalTuning> values) {
    if (values != null) {
      getTxSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxModulation
   * <p>
   * Complex element TxModulation contains the detailed characteristics of the
   * modulation on the transmitter side.
   * <p>
   * @param values One or more instances of type {@link TxModulation...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTxModulation(TxModulation... values) {
    if (values != null) {
      getTxModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TxModulation
   * <p>
   * Complex element TxModulation contains the detailed characteristics of the
   * modulation on the transmitter side.
   * <p>
   * @param values A collection of {@link TxModulation} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTxModulation(Collection<TxModulation> values) {
    if (values != null) {
      getTxModulation().addAll(values);
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
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withBaseband(Baseband... values) {
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
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param values One or more instances of type {@link Pulse...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withPulse(Pulse... values) {
    if (values != null) {
      getPulse().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param values A collection of {@link Pulse} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withPulse(Collection<Pulse> values) {
    if (values != null) {
      getPulse().addAll(values);
    }
    return this;
  }

  /**
   * Set the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @param values One or more instances of type {@link SubCarrierFreq...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubCarrierFreq(SubCarrierFreq... values) {
    if (values != null) {
      getSubCarrierFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @param values A collection of {@link SubCarrierFreq} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubCarrierFreq(Collection<SubCarrierFreq> values) {
    if (values != null) {
      getSubCarrierFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SubCarrierTone...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubCarrierTone(SubCarrierTone... values) {
    if (values != null) {
      getSubCarrierTone().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SubCarrierTone} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubCarrierTone(Collection<SubCarrierTone> values) {
    if (values != null) {
      getSubCarrierTone().addAll(values);
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
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSpreadSpectrum(SpreadSpectrum value) {
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withCurves(BigInteger... values) {
    if (values != null) {
      getCurves().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link Curves} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withCurves(Collection<BigInteger> values) {
    if (values != null) {
      getCurves().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this TxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxMode {"
      + (modulationType != null ? " modulationType [" + modulationType + "]" : "")
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (burstDuration != null ? " burstDuration [" + burstDuration + "]" : "")
      + (gpsWBL1Level != null ? " gpsWBL1Level [" + gpsWBL1Level + "]" : "")
      + (tuningMethod != null ? " tuningMethod [" + tuningMethod + "]" : "")
      + (subCarrierTone != null ? " subCarrierTone [" + subCarrierTone + "]" : "")
      + (freqTolerance != null ? " freqTolerance [" + freqTolerance + "]" : "")
      + (burstNumPulses != null ? " burstNumPulses [" + burstNumPulses + "]" : "")
      + (burstOffTime != null ? " burstOffTime [" + burstOffTime + "]" : "")
      + (occBw != null ? " occBw [" + occBw + "]" : "")
      + (intermodPct != null ? " intermodPct [" + intermodPct + "]" : "")
      + (occBwCalculated != null ? " occBwCalculated [" + occBwCalculated + "]" : "")
      + (pulse != null ? " pulse [" + pulse + "]" : "")
      + (modeName != null ? " modeName [" + modeName + "]" : "")
      + (curves != null ? " curves [" + curves + "]" : "")
      + (baseband != null ? " baseband [" + baseband + "]" : "")
      + (gpsNBL2Level != null ? " gpsNBL2Level [" + gpsNBL2Level + "]" : "")
      + (spuriousLevel != null ? " spuriousLevel [" + spuriousLevel + "]" : "")
      + (spreadSpectrum != null ? " spreadSpectrum [" + spreadSpectrum + "]" : "")
      + (intermodEffect != null ? " intermodEffect [" + intermodEffect + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (numSubCarriers != null ? " numSubCarriers [" + numSubCarriers + "]" : "")
      + (gpsNBL1Level != null ? " gpsNBL1Level [" + gpsNBL1Level + "]" : "")
      + (power != null ? " power [" + power + "]" : "")
      + (freqToleranceUnit != null ? " freqToleranceUnit [" + freqToleranceUnit + "]" : "")
      + (thirdHarmonicLevel != null ? " thirdHarmonicLevel [" + thirdHarmonicLevel + "]" : "")
      + (secondHarmonicLevel != null ? " secondHarmonicLevel [" + secondHarmonicLevel + "]" : "")
      + (gpsWBL2Level != null ? " gpsWBL2Level [" + gpsWBL2Level + "]" : "")
      + (subCarrierFreq != null ? " subCarrierFreq [" + subCarrierFreq + "]" : "")
      + (burstRate != null ? " burstRate [" + burstRate + "]" : "")
      + (tunability != null ? " tunability [" + tunability + "]" : "")
      + (txSignalTuning != null ? " txSignalTuning [" + txSignalTuning + "]" : "")
      + (emsClass != null ? " emsClass [" + emsClass + "]" : "")
      + (numSideTones != null ? " numSideTones [" + numSideTones + "]" : "")
      + (necessaryBw != null ? " necessaryBw [" + necessaryBw + "]" : "")
      + (txModulation != null ? " txModulation [" + txModulation + "]" : "")
      + (otherHarmonicLevel != null ? " otherHarmonicLevel [" + otherHarmonicLevel + "]" : "")
      + (radarType != null ? " radarType [" + radarType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxMode} requires {@link TString ModeID}.
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
