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
 * CircuitRemarks (US) contains general information about the network and
 * equipment used to support a specific frequency assignment or assignments.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircuitRemarks", propOrder = {
  "remark"
})
public class CircuitRemarks {

  /**
   * US:CircuitRemarks - Element Content (Required)
   * <p>
   * The Any additional data to be submitted by the applicant that cannot be
   * accommodated in any of the other data items in the Government Master File
   * (GMF).
   * <p>
   * Format is S40
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Remark", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString remark;

  /**
   * Get the Any additional data to be submitted by the applicant that cannot be
   * accommodated in any of the other data items in the Government Master File
   * (GMF).
   * <p>
   * @return the Remark value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRemark() {
    return remark;
  }

  /**
   * Set the Any additional data to be submitted by the applicant that cannot be
   * accommodated in any of the other data items in the Government Master File
   * (GMF).
   * <p>
   * @param value the Remark value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRemark(TString value) {
    this.remark = value;
  }

  /**
   * Determine if the Remark is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemark() {
    return (this.remark != null ? this.remark.isSetValue() : false);
  }

  /**
   * Set the Any additional data to be submitted by the applicant that cannot be
   * accommodated in any of the other data items in the Government Master File
   * (GMF).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CircuitRemarks object instance
   * @since 3.1.0
   */
  public CircuitRemarks withRemark(String value) {
    setRemark(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this CircuitRemarks instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CircuitRemarks {"
      + (remark != null ? " remark [" + remark + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CircuitRemarks} requires {@link TString Remark}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRemark();
  }

}
