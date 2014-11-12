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
 * DocketNum (US) contains the docket number from a prior data repository.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocketNum", propOrder = {
  "docketNum"
})
public class DocketNum {

  /**
   * US:DocketNum - Element Content (Required)
   * <p>
   * The reference number assigned by the Interdepartment Radio Advisory
   * Committee (IRAC) to frequency applications submitted to the Frequency
   * Assignment Subcommittee (FAS).
   * <p>
   * Format is S12
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DocketNum", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString docketNum;

  /**
   * Get the reference number assigned by the Interdepartment Radio Advisory
   * Committee (IRAC) to frequency applications submitted to the Frequency
   * Assignment Subcommittee (FAS).
   * <p>
   * @return the DocketNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDocketNum() {
    return docketNum;
  }

  /**
   * Set the reference number assigned by the Interdepartment Radio Advisory
   * Committee (IRAC) to frequency applications submitted to the Frequency
   * Assignment Subcommittee (FAS).
   * <p>
   * @param value the DocketNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDocketNum(TString value) {
    this.docketNum = value;
  }

  /**
   * Determine if the DocketNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDocketNum() {
    return (this.docketNum != null ? this.docketNum.isSetValue() : false);
  }

  /**
   * Set the reference number assigned by the Interdepartment Radio Advisory
   * Committee (IRAC) to frequency applications submitted to the Frequency
   * Assignment Subcommittee (FAS).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DocketNum object instance
   * @since 3.1.0
   */
  public DocketNum withDocketNum(String value) {
    setDocketNum(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this DocketNum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DocketNum {"
      + (docketNum != null ? " docketNum [" + docketNum + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DocketNum} requires {@link TString DocketNum}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDocketNum();
  }

}
