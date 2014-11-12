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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.transmitter.TxMode;

/**
 * Baseband defines the parameters of the modulating or received signal.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Baseband&gt;
 *   &lt;ModFreqMin cls="U"&gt;0.0003&lt;/ModFreqMin&gt;
 *   &lt;ModFreqMax cls="U"&gt;0.0034&lt;/ModFreqMax&gt;
 *   &lt;SignalType cls="U"&gt;FM Clear Voice&lt;/SignalType&gt;
 * &lt;/Baseband&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baseband", propOrder = {
  "modFreqMin",
  "modFreqMax",
  "signalType"
})
public class Baseband {

  /**
   * ModFreqMin - Minimum Modulating Frequency (Optional)
   * <p>
   * The minimum modulating frequency measured: - for a transmitter, on the low
   * side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal modFreqMin;
  /**
   * ModFreqMax - Maximum Modulating Frequency (Optional)
   * <p>
   * The maximum modulating frequency: - for a transmitter, measured on the high
   * side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal modFreqMax;
  /**
   * SignalType - Signal Type (Optional)
   * <p>
   * The type of modulation.
   * <p>
   * Format is L:CMO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SignalType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString signalType;

  /**
   * Get the minimum modulating frequency measured: - for a transmitter, on the
   * low side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * @return the ModFreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getModFreqMin() {
    return modFreqMin;
  }

  /**
   * Set the minimum modulating frequency measured: - for a transmitter, on the
   * low side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * @param value the ModFreqMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setModFreqMin(TDecimal value) {
    this.modFreqMin = value;
  }

  /**
   * Determine if the ModFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModFreqMin() {
    return (this.modFreqMin != null ? this.modFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum modulating frequency: - for a transmitter, measured on the
   * high side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * @return the ModFreqMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getModFreqMax() {
    return modFreqMax;
  }

  /**
   * Set the maximum modulating frequency: - for a transmitter, measured on the
   * high side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * @param value the ModFreqMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setModFreqMax(TDecimal value) {
    this.modFreqMax = value;
  }

  /**
   * Determine if the ModFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModFreqMax() {
    return (this.modFreqMax != null ? this.modFreqMax.isSetValue() : false);
  }

  /**
   * Get the type of modulation.
   * <p>
   * @return the SignalType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSignalType() {
    return signalType;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value the SignalType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSignalType(TString value) {
    this.signalType = value;
  }

  /**
   * Determine if the SignalType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalType() {
    return (this.signalType != null ? this.signalType.isSetValue() : false);
  }

  /**
   * Set the minimum modulating frequency measured: - for a transmitter, on the
   * low side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withModFreqMin(Double value) {
    setModFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum modulating frequency: - for a transmitter, measured on the
   * high side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withModFreqMax(Double value) {
    setModFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withSignalType(String value) {
    setSignalType(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Baseband instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Baseband {"
      + (modFreqMax != null ? " modFreqMax [" + modFreqMax + "]" : "")
      + (modFreqMin != null ? " modFreqMin [" + modFreqMin + "]" : "")
      + (signalType != null ? " signalType [" + signalType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Baseband} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
