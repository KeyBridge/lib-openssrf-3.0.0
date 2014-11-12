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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Assignment;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * OffTheShelfEquipment (US) defines the function of readily available
 * equipment. It is often commercial equipment that provides a compatible
 * function to DoD or government equipment.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffTheShelfEquipment", propOrder = {
  "use"
})
public class OffTheShelfEquipment {

  @XmlElement(name = "Use", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS6.class)
  private TString use;

  /**
   * Get
   * <p>
   * @return the Use value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getUse() {
    return use;
  }

  /**
   * Set
   * <p>
   * @param value the Use value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setUse(TString value) {
    this.use = value;
  }

  /**
   * Determine if the Use is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUse() {
    return (this.use != null ? this.use.isSetValue() : false);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current OffTheShelfEquipment object instance
   * @since 3.1.0
   */
  public OffTheShelfEquipment withUse(String value) {
    setUse(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this OffTheShelfEquipment instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "OffTheShelfEquipment {"
      + (use != null ? " use [" + use + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link OffTheShelfEquipment} requires {@link TString Use}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetUse();
  }

}
