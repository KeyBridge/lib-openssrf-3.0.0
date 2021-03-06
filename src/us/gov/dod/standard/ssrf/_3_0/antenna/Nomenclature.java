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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Nomenclature identifies either the standard military, government,
 * nomenclature or the commercial model number of an equipment. Each device or
 * group of devices may have several types of nomenclatures, e.g. both a
 * military nomenclature and a commercial model number.
 * <p>
 * Element of
 * {@link Antenna}, {@link ForceElement}, {@link RFSystem}, {@link Receiver}, {@link SSRequest}, {@link Satellite}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link Manufacturer}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomenclature", propOrder = {
  "type",
  "level",
  "name",
  "manufacturer"
})
public class Nomenclature {

  /**
   * Type - Type (Optional)
   * <p>
   * The type of nomenclature (commercial, military, etc).
   * <p>
   * Format is L:CTO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  /**
   * Level - Level (Optional)
   * <p>
   * The level of nomenclature (primary, nickname, etc).
   * <p>
   * Format is L:CNU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Level", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString level;
  /**
   * Name - Name (Required)
   * <p>
   * The standard military nomenclature. If the unit does not have a military
   * nomenclature, enter the manufacturer model number, or a short description.
   * <p>
   * Format is S100
   * <p>
   * Divergence from SMADEF: When exchanging data with NATO Antennas must
   * contain at least one Nomenclature
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * Manufacturer (Optional)
   * <p>
   * Manufacturer contains the manufacturer name of the equipment listed in the
   * corresponding data entry in data element Nomenclature. Additionally the
   * country in which the equipment is manufactured may be included.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Manufacturer")
  private List<Manufacturer> manufacturer;

  /**
   * Get the type of nomenclature (commercial, military, etc).
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc).
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get the level of nomenclature (primary, nickname, etc).
   * <p>
   * @return the Level value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLevel() {
    return level;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
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
   * Get the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description.
   * <p>
   * @return the Name value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description.
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
   * Get the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @return a {@link Manufacturer} instance
   * @since 3.1.0
   */
  public List<Manufacturer> getManufacturer() {
    if (manufacturer == null) {
      manufacturer = new ArrayList<>();
    }
    return this.manufacturer;
  }

  /**
   * Determine if the Manufacturer is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetManufacturer() {
    return ((this.manufacturer != null) && (!this.manufacturer.isEmpty()));
  }

  /**
   * Clear the Manufacturer field. This sets the field to null.
   */
  public void unsetManufacturer() {
    this.manufacturer = null;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withLevel(String value) {
    setLevel(new TString(value));
    return this;
  }

  /**
   * Set the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @param values One or more instances of type {@link Manufacturer...}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withManufacturer(Manufacturer... values) {
    if (values != null) {
      getManufacturer().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @param values A collection of {@link Manufacturer} instances
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withManufacturer(Collection<Manufacturer> values) {
    if (values != null) {
      getManufacturer().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Nomenclature instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Nomenclature {"
      + (level != null ? " level [" + level + "]" : "")
      + (manufacturer != null ? " manufacturer [" + manufacturer + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Nomenclature} requires {@link TString Name}.
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
