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
package us.gov.dod.standard.ssrf._3_0.toa;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Variance indicates if the local allocation deviates from an upper level
 * allocation (e.g. a national allocation not aligned with the ITU RR).
 * <p>
 * Element of {@link Allocation}
 * <p>
 * Sub-Element is {@link Administration}
 * <p>
 * Example:
 * <pre>
 * &lt;Variance&gt;
 *   &lt;Type cls="U"&gt;Additional&lt;/Type&gt;
 *   &lt;AllocatedService cls="U"&gt;Aeronautical Mobile (Off Route) Service&lt;/
 *   AllocatedService&gt;
 *   &lt;Priority cls="U"&gt;Permitted&lt;/Priority&gt;
 * &lt;/Variance&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance", propOrder = {
  "type",
  "allocatedService",
  "priority",
  "administration"
})
public class Variance {

  /**
   * Type - Type (Required)
   * <p>
   * The type of variance.
   * <p>
   * Format is L:CAV
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  /**
   * AllocatedService - Allocated Service (Required)
   * <p>
   * A radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * Format is L:CSN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllocatedService", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString allocatedService;
  /**
   * Priority - Priority (Required)
   * <p>
   * If this service is a primary or secondary use of this band. ("Permitted"
   * SHOULD only be used if the priority is unknown.)
   * <p>
   * Format is L:CPS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;
  /**
   * Administration (Optional)
   * <p>
   * Administration contains the country for which this variance applies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Administration", nillable = true)
  private List<Administration> administration;

  /**
   * Get the type of variance.
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of variance.
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
   * Get a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @return the AllocatedService value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAllocatedService() {
    return allocatedService;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value the AllocatedService value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAllocatedService(TString value) {
    this.allocatedService = value;
  }

  /**
   * Determine if the AllocatedService is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocatedService() {
    return (this.allocatedService != null ? this.allocatedService.isSetValue() : false);
  }

  /**
   * Get if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @return the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get the Administration
   * <p>
   * Complex element Administration contains the country for which this variance
   * applies.
   * <p>
   * @return a {@link Administration} instance
   * @since 3.1.0
   */
  public List<Administration> getAdministration() {
    if (administration == null) {
      administration = new ArrayList<>();
    }
    return this.administration;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return ((this.administration != null) && (!this.administration.isEmpty()));
  }

  /**
   * Clear the Administration field. This sets the field to null.
   */
  public void unsetAdministration() {
    this.administration = null;
  }

  /**
   * Set the type of variance.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Variance object instance
   * @since 3.1.0
   */
  public Variance withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Variance object instance
   * @since 3.1.0
   */
  public Variance withAllocatedService(String value) {
    setAllocatedService(new TString(value));
    return this;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Variance object instance
   * @since 3.1.0
   */
  public Variance withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  /**
   * Set the Administration
   * <p>
   * Complex element Administration contains the country for which this variance
   * applies.
   * <p>
   * @param values One or more instances of type {@link Administration...}
   * @return The current Variance object instance
   * @since 3.1.0
   */
  public Variance withAdministration(Administration... values) {
    if (values != null) {
      getAdministration().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Administration
   * <p>
   * Complex element Administration contains the country for which this variance
   * applies.
   * <p>
   * @param values A collection of {@link Administration} instances
   * @return The current Variance object instance
   * @since 3.1.0
   */
  public Variance withAdministration(Collection<Administration> values) {
    if (values != null) {
      getAdministration().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Variance instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Variance {"
      + (priority != null ? " priority [" + priority + "]" : "")
      + (allocatedService != null ? " allocatedService [" + allocatedService + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (administration != null ? " administration [" + administration + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Variance} requires
   * {@link TString AllocatedService}, {@link TString Priority}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAllocatedService() && isSetPriority() && isSetType();
  }

}
