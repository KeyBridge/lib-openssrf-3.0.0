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
package us.gov.dod.standard.ssrf._3_0.ssrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.SSRequest;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Time indicates when the equipment or system will be used.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
  "period",
  "usageDescription"
})
public class Time {

  /**
   * Period - Period (Optional)
   * <p>
   * The period of usage.
   * <p>
   * Format is L:CTI
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Period", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString period;
  @XmlElement(name = "UsageDescription ", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString usageDescription;

  /**
   * Get the period of usage.
   * <p>
   * @return the Period value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPeriod() {
    return period;
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value the Period value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPeriod(TString value) {
    this.period = value;
  }

  /**
   * Determine if the Period is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPeriod() {
    return (this.period != null ? this.period.isSetValue() : false);
  }

  /**
   * Get a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @return the UsageDescription value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getUsageDescription() {
    return usageDescription;
  }

  /**
   * Set a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @param value the UsageDescription value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setUsageDescription(TString value) {
    this.usageDescription = value;
  }

  /**
   * Determine if the UsageDescription is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageDescription() {
    return (this.usageDescription != null ? this.usageDescription.isSetValue() : false);
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Time object instance
   * @since 3.1.0
   */
  public Time withPeriod(String value) {
    setPeriod(new TString(value));
    return this;
  }

  /**
   * Set a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Time object instance
   * @since 3.1.0
   */
  public Time withUsageDescription(String value) {
    setUsageDescription(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Time instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Time {"
      + (period != null ? " period [" + period + "]" : "")
      + (usageDescription != null ? " usageDescription [" + usageDescription + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Time} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
