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
package us.gov.dod.standard.ssrf._3_0.adapter.types;

import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * XML data type adapter for the SSRF S11 data type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/12/2014
 */
public class XmlAdapterS11 extends AXmlAdapterString {

  public XmlAdapterS11() {
    super(1, 11, false, null);
  }
}
