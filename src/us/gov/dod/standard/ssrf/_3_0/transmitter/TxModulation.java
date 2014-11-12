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
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCSI;
import us.gov.dod.standard.ssrf._3_0.receiver.RxModulation;

/**
 * TxModulation contains the detailed characteristics of the modulation on the
 * transmitter side.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;TxModulation&gt;
 *   &lt;DigitalModType&gt;ASK/OOK&lt;/DigitalModType&gt;
 *   &lt;MaxBitRate&gt;27000000&lt;/MaxBitRate&gt;
 *   &lt;MaxDevRatio&gt;3&lt;/MaxDevRatio&gt;
 * &lt;/TxModulation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModulation", propOrder = {
  "maxDevRatio",
  "amIdx",
  "amrmsIdx",
  "fmPeakFreqDev",
  "fmrmsFreqDev",
  "fmDeviationCode",
  "fmPeakModulationIdx",
  "carrierSuppression",
  "sidebandSuppression",
  "sidebandSuppressed"
})
public class TxModulation
  extends RxModulation {

  /**
   * MaxDevRatio - Maximum Deviation Ratio (Optional)
   * <p>
   * The deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * Format is UN(5,3)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxDevRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal maxDevRatio;
  /**
   * AMIdx - Amplitude Modulation Index (Optional)
   * <p>
   * The amplitude modulation index, which is a unitless value for an amplitude
   * modulation signal derived by dividing the peak modulating voltage by the
   * peak carrier voltage. The modulation index should always be %gt; 0 and %lt;
   * 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If %gt; 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group AM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AMIdx", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal amIdx;
  /**
   * AMRMSIdx - RMS Amplitude Modulation Index (Optional)
   * <p>
   * The RMS modulation index when analog or phase modulation is used and the
   * baseband consists of FDM channels or multiple subcarrier signals. The RMS
   * Amplitude Modulation Index is a unitless value for an amplitude modulation
   * signal derived by dividing the RMS peak modulating voltage by the RMS peak
   * carrier voltage.
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group AM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AMRMSIdx", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal amrmsIdx;
  /**
   * FMPeakFreqDev - Peak Frequency Deviation (Optional)
   * <p>
   * The peak frequency deviation when analog modulation is employed.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMPeakFreqDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal fmPeakFreqDev;
  /**
   * FMRmsFreqDev - RMS Frequency Deviation (Optional)
   * <p>
   * The Root Means Square (RMS) frequency deviation when frequency modulation
   * (FM) is employed and the base band consists of frequency-division
   * multiplexed (FDM) channels or multiple subcarrier signals.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMRMSFreqDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal fmrmsFreqDev;
  /**
   * FMDeviationCode - Peak Frequency Deviation (Optional)
   * <p>
   * The code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * Format is L:CFM
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMDeviationCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString fmDeviationCode;
  /**
   * FMPeakModulationIdx - FM Peak Modulation Index (Optional)
   * <p>
   * The peak modulation index (deviation ratio) when using analog frequency or
   * phase modulation.
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMPeakModulationIdx", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal fmPeakModulationIdx;
  /**
   * CarrierSuppression - Level of Carrier Suppression (Optional)
   * <p>
   * The amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * Format is UN(6,3) (dB)
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CarrierSuppression", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal carrierSuppression;
  /**
   * SidebandSuppression - Level of Sideband Suppression (Optional)
   * <p>
   * The amount that one or both of the sidebands of a signal are reduced prior
   * to transmission. “One or both" is determined by evaluation of the emission
   * designator.
   * <p>
   * Format is UN(6,3) (dB)
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SidebandSuppression", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal sidebandSuppression;
  /**
   * SidebandSuppressed - Sideband Suppressed (Optional)
   * <p>
   * The sideband that is suppressed in a single sideband signal.
   * <p>
   * Format is L:CSI
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SidebandSuppressed", required = false)
  private TString sidebandSuppressed;

  /**
   * Get the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @return the MaxDevRatio value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getMaxDevRatio() {
    return maxDevRatio;
  }

  /**
   * Set the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @param value the MaxDevRatio value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setMaxDevRatio(TDecimal value) {
    this.maxDevRatio = value;
  }

  /**
   * Determine if the MaxDevRatio is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxDevRatio() {
    return (this.maxDevRatio != null ? this.maxDevRatio.isSetValue() : false);
  }

  /**
   * Get the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @return the AMIdx value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAMIdx() {
    return amIdx;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @param value the AMIdx value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAMIdx(TDecimal value) {
    this.amIdx = value;
  }

  /**
   * Determine if the AMIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAMIdx() {
    return (this.amIdx != null ? this.amIdx.isSetValue() : false);
  }

  /**
   * Get the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage.
   * <p>
   * @return the AMRMSIdx value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAMRMSIdx() {
    return amrmsIdx;
  }

  /**
   * Set the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage.
   * <p>
   * @param value the AMRMSIdx value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAMRMSIdx(TDecimal value) {
    this.amrmsIdx = value;
  }

  /**
   * Determine if the AMRMSIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAMRMSIdx() {
    return (this.amrmsIdx != null ? this.amrmsIdx.isSetValue() : false);
  }

  /**
   * Get the peak frequency deviation when analog modulation is employed.
   * <p>
   * @return the FMPeakFreqDev value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFMPeakFreqDev() {
    return fmPeakFreqDev;
  }

  /**
   * Set the peak frequency deviation when analog modulation is employed.
   * <p>
   * @param value the FMPeakFreqDev value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFMPeakFreqDev(TDecimal value) {
    this.fmPeakFreqDev = value;
  }

  /**
   * Determine if the FMPeakFreqDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMPeakFreqDev() {
    return (this.fmPeakFreqDev != null ? this.fmPeakFreqDev.isSetValue() : false);
  }

  /**
   * Get the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals.
   * <p>
   * @return the FMRMSFreqDev value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFMRMSFreqDev() {
    return fmrmsFreqDev;
  }

  /**
   * Set the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals.
   * <p>
   * @param value the FMRMSFreqDev value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFMRMSFreqDev(TDecimal value) {
    this.fmrmsFreqDev = value;
  }

  /**
   * Determine if the FMRMSFreqDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMRMSFreqDev() {
    return (this.fmrmsFreqDev != null ? this.fmrmsFreqDev.isSetValue() : false);
  }

  /**
   * Get the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @return the FMDeviationCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFMDeviationCode() {
    return fmDeviationCode;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value the FMDeviationCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFMDeviationCode(TString value) {
    this.fmDeviationCode = value;
  }

  /**
   * Determine if the FMDeviationCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMDeviationCode() {
    return (this.fmDeviationCode != null ? this.fmDeviationCode.isSetValue() : false);
  }

  /**
   * Get the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation.
   * <p>
   * @return the FMPeakModulationIdx value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getFMPeakModulationIdx() {
    return fmPeakModulationIdx;
  }

  /**
   * Set the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation.
   * <p>
   * @param value the FMPeakModulationIdx value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setFMPeakModulationIdx(TDecimal value) {
    this.fmPeakModulationIdx = value;
  }

  /**
   * Determine if the FMPeakModulationIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMPeakModulationIdx() {
    return (this.fmPeakModulationIdx != null ? this.fmPeakModulationIdx.isSetValue() : false);
  }

  /**
   * Get the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @return the CarrierSuppression value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getCarrierSuppression() {
    return carrierSuppression;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value the CarrierSuppression value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setCarrierSuppression(TDecimal value) {
    this.carrierSuppression = value;
  }

  /**
   * Determine if the CarrierSuppression is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCarrierSuppression() {
    return (this.carrierSuppression != null ? this.carrierSuppression.isSetValue() : false);
  }

  /**
   * Get the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @return the SidebandSuppression value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSidebandSuppression() {
    return sidebandSuppression;
  }

  /**
   * Set the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @param value the SidebandSuppression value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSidebandSuppression(TDecimal value) {
    this.sidebandSuppression = value;
  }

  /**
   * Determine if the SidebandSuppression is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSidebandSuppression() {
    return (this.sidebandSuppression != null ? this.sidebandSuppression.isSetValue() : false);
  }

  /**
   * Get the sideband that is suppressed in a single sideband signal.
   * <p>
   * @return the SidebandSuppressed value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSidebandSuppressed() {
    return sidebandSuppressed;
  }

  /**
   * Set the sideband that is suppressed in a single sideband signal.
   * <p>
   * @param value the SidebandSuppressed value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSidebandSuppressed(TString value) {
    this.sidebandSuppressed = value;
  }

  /**
   * Determine if the SidebandSuppressed is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSidebandSuppressed() {
    return (this.sidebandSuppressed != null ? this.sidebandSuppressed.isSetValue() : false);
  }

  /**
   * Set the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withMaxDevRatio(Double value) {
    setMaxDevRatio(new TDecimal(value));
    return this;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withAMIdx(Double value) {
    setAMIdx(new TDecimal(value));
    return this;
  }

  /**
   * Set the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withAMRMSIdx(Double value) {
    setAMRMSIdx(new TDecimal(value));
    return this;
  }

  /**
   * Set the peak frequency deviation when analog modulation is employed.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withFMPeakFreqDev(Double value) {
    setFMPeakFreqDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withFMRMSFreqDev(Double value) {
    setFMRMSFreqDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withFMDeviationCode(String value) {
    setFMDeviationCode(new TString(value));
    return this;
  }

  /**
   * Set the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withFMPeakModulationIdx(Double value) {
    setFMPeakModulationIdx(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withCarrierSuppression(Double value) {
    setCarrierSuppression(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withSidebandSuppression(Double value) {
    setSidebandSuppression(new TDecimal(value));
    return this;
  }

  /**
   * Set the sideband that is suppressed in a single sideband signal.
   * <p>
   * @param value An instances of type {@link ListCSI}
   * @return The current TxModulation object instance
   * @since 3.1.0
   */
  public TxModulation withSidebandSuppressed(ListCSI value) {
    setSidebandSuppressed(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this TxModulation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxModulation {"
      + (fmPeakModulationIdx != null ? " fmPeakModulationIdx [" + fmPeakModulationIdx + "]" : "")
      + (carrierSuppression != null ? " carrierSuppression [" + carrierSuppression + "]" : "")
      + (fmrmsFreqDev != null ? " fmrmsFreqDev [" + fmrmsFreqDev + "]" : "")
      + (sidebandSuppressed != null ? " sidebandSuppressed [" + sidebandSuppressed + "]" : "")
      + (amIdx != null ? " amIdx [" + amIdx + "]" : "")
      + (fmDeviationCode != null ? " fmDeviationCode [" + fmDeviationCode + "]" : "")
      + (fmPeakFreqDev != null ? " fmPeakFreqDev [" + fmPeakFreqDev + "]" : "")
      + (amrmsIdx != null ? " amrmsIdx [" + amrmsIdx + "]" : "")
      + (maxDevRatio != null ? " maxDevRatio [" + maxDevRatio + "]" : "")
      + (sidebandSuppression != null ? " sidebandSuppression [" + sidebandSuppression + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxModulation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
