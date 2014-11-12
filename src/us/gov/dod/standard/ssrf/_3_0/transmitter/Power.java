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
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Power identifies the transmitter RF power at the transmitter antenna port.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Power&gt;
 *   &lt;PowerMin cls="U"&gt;-3&lt;/PowerMin&gt;
 *   &lt;PowerMax cls="U"&gt;31.8&lt;/PowerMax&gt;
 *   &lt;PowerType cls="U"&gt;PEP&lt;/PowerType&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 * &lt;/Power&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Power", propOrder = {
  "powerMin",
  "powerMax",
  "powerType",
  "calculated"
})
public class Power {

  /**
   * PowerMin - Minimum or Nominal Power (Optional)
   * <p>
   * The nominal transmitter power, or the minimum power in case of a range of
   * values.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerMin;
  /**
   * PowerMax - Maximum Power (Optional)
   * <p>
   * The maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerMax;
  /**
   * PowerType - Power Type (Optional)
   * <p>
   * The power type code for carrier, mean, or peak envelope power emitted. The
   * power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * Format is L:CPT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString powerType;
  /**
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * "Yes" if the power value(s) have been calculated, or "No" if they have been
   * measured.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;

  /**
   * Get the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @return the PowerMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPowerMin() {
    return powerMin;
  }

  /**
   * Set the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @param value the PowerMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPowerMin(TDecimal value) {
    this.powerMin = value;
  }

  /**
   * Determine if the PowerMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerMin() {
    return (this.powerMin != null ? this.powerMin.isSetValue() : false);
  }

  /**
   * Get the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @return the PowerMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPowerMax() {
    return powerMax;
  }

  /**
   * Set the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @param value the PowerMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPowerMax(TDecimal value) {
    this.powerMax = value;
  }

  /**
   * Determine if the PowerMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerMax() {
    return (this.powerMax != null ? this.powerMax.isSetValue() : false);
  }

  /**
   * Get the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @return the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  /**
   * Determine if the PowerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerType() {
    return (this.powerType != null ? this.powerType.isSetValue() : false);
  }

  /**
   * Get "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @return the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Set the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withPowerMin(Double value) {
    setPowerMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withPowerMax(Double value) {
    setPowerMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withPowerType(String value) {
    setPowerType(new TString(value));
    return this;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Power instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Power {"
      + (powerMax != null ? " powerMax [" + powerMax + "]" : "")
      + (powerMin != null ? " powerMin [" + powerMin + "]" : "")
      + (powerType != null ? " powerType [" + powerType + "]" : "")
      + (calculated != null ? " calculated [" + calculated + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Power} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
