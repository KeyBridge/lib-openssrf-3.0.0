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
package us.gov.dod.standard.ssrf._3_0.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * AntPatternPoint contains a single point of the antenna radiation pattern,
 * defined by a direction and gain.
 * <p>
 * Element of {@link AntPattern}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntPatternPoint", propOrder = {
  "dir",
  "gain"
})
public class AntPatternPoint {

  /**
   * Dir - Antenna Radiation Pattern Direction (Required)
   * <p>
   * The direction in degrees in reference to the pointing angle of the antenna
   * set to zero.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Dir", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal dir;
  /**
   * Gain - Antenna Radiation Pattern Gain (Required)
   * <p>
   * The amount of gain for the direction relative to the main beam gain.
   * <p>
   * Format is SN(5,2) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Gain", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSN5_2.class)
  private TDecimal gain;

  /**
   * Get the direction in degrees in reference to the pointing angle of the
   * antenna set to zero.
   * <p>
   * @return the Dir value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getDir() {
    return dir;
  }

  /**
   * Set the direction in degrees in reference to the pointing angle of the
   * antenna set to zero.
   * <p>
   * @param value the Dir value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setDir(TDecimal value) {
    this.dir = value;
  }

  /**
   * Determine if the Dir is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDir() {
    return (this.dir != null ? this.dir.isSetValue() : false);
  }

  /**
   * Get the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @return the Gain value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getGain() {
    return gain;
  }

  /**
   * Set the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @param value the Gain value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setGain(TDecimal value) {
    this.gain = value;
  }

  /**
   * Determine if the Gain is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGain() {
    return (this.gain != null ? this.gain.isSetValue() : false);
  }

  /**
   * Set the direction in degrees in reference to the pointing angle of the
   * antenna set to zero.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntPatternPoint object instance
   * @since 3.1.0
   */
  public AntPatternPoint withDir(Double value) {
    setDir(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntPatternPoint object instance
   * @since 3.1.0
   */
  public AntPatternPoint withGain(Double value) {
    setGain(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this AntPatternPoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntPatternPoint {"
      + (dir != null ? " dir [" + dir + "]" : "")
      + (gain != null ? " gain [" + gain + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntPatternPoint} requires
   * {@link TDecimal Dir}, {@link TDecimal Gain}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDir() && isSetGain();
  }

}
