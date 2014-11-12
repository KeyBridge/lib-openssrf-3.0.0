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
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_0.AsgnFreqBase;

/**
 * FreqOld indicates a previously assigned single frequency or range of
 * frequencies.
 * <p>
 * Element of {@link Assigned}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqOld")
public class FreqOld
  extends AsgnFreqBase {

  /**
   * Get a string representation of this FreqOld instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqOld {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqOld} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
