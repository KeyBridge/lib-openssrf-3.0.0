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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * AsgnAllotOwner (US) contains the serial of the owning, or originating,
 * organisation.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnAllotOwner", propOrder = {
  "description",
  "ownerType"
})
public class AsgnAllotOwner {

  @XmlElement(name = "Description ", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS18.class)
  private TString description;
  @XmlElement(name = "OwnerType ", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString ownerType;

  /**
   * Get the name of an individual or organization related to the frequency
   * assignment.
   * <p>
   * @return the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set the name of an individual or organization related to the frequency
   * assignment.
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
   * Get the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @return the OwnerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOwnerType() {
    return ownerType;
  }

  /**
   * Set the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @param value the OwnerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOwnerType(TString value) {
    this.ownerType = value;
  }

  /**
   * Determine if the OwnerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerType() {
    return (this.ownerType != null ? this.ownerType.isSetValue() : false);
  }

  /**
   * Set the name of an individual or organization related to the frequency
   * assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AsgnAllotOwner object instance
   * @since 3.1.0
   */
  public AsgnAllotOwner withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AsgnAllotOwner object instance
   * @since 3.1.0
   */
  public AsgnAllotOwner withOwnerType(String value) {
    setOwnerType(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this AsgnAllotOwner instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AsgnAllotOwner {"
      + (description != null ? " description [" + description + "]" : "")
      + (ownerType != null ? " ownerType [" + ownerType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnAllotOwner} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }
}
