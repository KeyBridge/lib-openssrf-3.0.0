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
package us.gov.dod.standard.ssrf._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Identifier
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", propOrder = {
  "level",
  "name"
})
public class Identifier {

  @XmlElement(name = "Level", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString level;

  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;

  /**
   * Get
   * <p>
   * @return the Level value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLevel() {
    return level;
  }

  /**
   * Set
   * <p>
   * @param value the Level value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLevel(TString value) {
    this.level = value;
  }

  /**
   * Determine if the Level is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLevel() {
    return (this.level != null ? this.level.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the Name value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getName() {
    return name;
  }

  /**
   * Set
   * <p>
   * @param value the Name value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Identifier object instance
   * @since 3.1.0
   */
  public Identifier withLevel(String value) {
    setLevel(new TString(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Identifier object instance
   * @since 3.1.0
   */
  public Identifier withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Identifier instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Identifier {"
      + (level != null ? " level [" + level + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Identifier} requires {@link TString Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetName();
  }

}
