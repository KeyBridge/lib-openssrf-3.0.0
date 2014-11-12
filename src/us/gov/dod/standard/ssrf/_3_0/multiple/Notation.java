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
package us.gov.dod.standard.ssrf._3_0.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Notation contains the electronic identification for a pulsed or non-pulsed
 * electromagnetic emission. It includes but is not limited to Communications
 * Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Sub-Elements are
 * {@link NotationTimeline}, {@link PotentialVictims}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;Notation&gt;
 *   &lt;Code cls="U"&gt;869812&lt;/Code&gt;
 *   &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
 *   &lt;Status cls="U"&gt;Active&lt;/Status&gt;
 *   &lt;NotationTimeline&gt;
 *     &lt;Code cls="U"&gt;869812&lt;/Code&gt;
 *     &lt;Status cls="U"&gt;Active&lt;/Status&gt;
 *     &lt;StatusChangeDateTime cls="U"&gt;2014-12-25T01:23:001Z&lt;/StatusChangeDateTime&gt;
 *     &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
 *   &lt;/NotationTimeline&gt;
 *   &lt;PotentialVictims&gt;
 *     &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
 *     &lt;VictimName cls="U"&gt;Target 478&lt;/VictimName&gt;
 *     &lt;VictimNotation cls="U"&gt;B000Z&lt;/VictimNotation&gt;
 *   &lt;/PotentialVictims&gt;
 *   &lt;UsingCountries&gt;
 *     &lt;CountryName cls="U"&gt;USA&lt;/CountryName&gt;
 *     &lt;Role cls="U"&gt;Source&lt;/Role&gt;
 *   &lt;/UsingCountries&gt;
 * &lt;/Notation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notation", propOrder = {
  "code",
  "type"
})
public class Notation {

  /**
   * US:Code - Notation Code (Required)
   * <p>
   * An alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * Format is US(20)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Code", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS20.class)
  private TString code;
  /**
   * US:Type - Notation Type (Optional)
   * <p>
   * The type of Notation.
   * <p>
   * Format is L:CEN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;

  /**
   * Get an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @return the Code value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCode() {
    return code;
  }

  /**
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @param value the Code value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCode(TString value) {
    this.code = value;
  }

  /**
   * Determine if the Code is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCode() {
    return (this.code != null ? this.code.isSetValue() : false);
  }

  /**
   * Get the type of Notation.
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of Notation.
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
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Notation object instance
   * @since 3.1.0
   */
  public Notation withCode(String value) {
    setCode(new TString(value));
    return this;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Notation object instance
   * @since 3.1.0
   */
  public Notation withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Notation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Notation {"
      + (code != null ? " code [" + code + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Notation} requires {@link TString Code}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCode() && isSetType();
  }

}
