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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * RelatedSupportability refers to a SSRequest with which the current dataset
 * has a dependency.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Example:
 * <pre>
 * &lt;RelatedSupportability&gt;
 *   &lt;Type cls="U"&gt;Related&lt;/Type&gt;
 *   &lt;SSRequestRef cls="U"&gt;USA:NTIA:SR:123&lt;/SSRequestRef&gt;
 * &lt;/RelatedSupportability&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSupportability", propOrder = {
  "type",
  "ssRequestRef",
  "j12Number"
})
public class RelatedSupportability {

  /**
   * Type - Type (Required)
   * <p>
   * The type of dependency between the current dataset and the referred
   * application.
   * <p>
   * Format is L:CDD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  /**
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * A Serial reference to a superseded or related SSRequest application.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SSRequestRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial ssRequestRef;
  /**
   * US:J12Number - J/F 12 Number (Optional)
   * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * Format is S15
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "J12Number", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString j12Number;

  /**
   * Get the type of dependency between the current dataset and the referred
   * application.
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of dependency between the current dataset and the referred
   * application.
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
   * Get a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @return the SSRequestRef value in a {@link TString} data type
   * @since 3.1.0
   */
  public TSerial getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value the SSRequestRef value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSSRequestRef(TSerial value) {
    this.ssRequestRef = value;
  }

  /**
   * Determine if the SSRequestRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null ? this.ssRequestRef.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @return the J12Number value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getJ12Number() {
    return j12Number;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @param value the J12Number value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setJ12Number(TString value) {
    this.j12Number = value;
  }

  /**
   * Determine if the J12Number is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJ12Number() {
    return (this.j12Number != null ? this.j12Number.isSetValue() : false);
  }

  /**
   * Set the type of dependency between the current dataset and the referred
   * application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedSupportability object instance
   * @since 3.1.0
   */
  public RelatedSupportability withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedSupportability object instance
   * @since 3.1.0
   */
  public RelatedSupportability withSSRequestRef(TSerial value) {
    setSSRequestRef(value);
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedSupportability object instance
   * @since 3.1.0
   */
  public RelatedSupportability withJ12Number(String value) {
    setJ12Number(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this RelatedSupportability instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RelatedSupportability {"
      + (j12Number != null ? " j12Number [" + j12Number + "]" : "")
      + (ssRequestRef != null ? " ssRequestRef [" + ssRequestRef + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RelatedSupportability} requires {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * A Serial reference to a superseded or related SSRequest application.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private SSRequest ssRequest;

  /**
   * Get a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @return a {@link SSRequest} instance
   * @since 3.1.0
   */
  public SSRequest getSsRequest() {
    return ssRequest;
  }

  /**
   * Determine if the ssRequest field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSsRequest() {
    return this.ssRequest != null;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value An instances of type {@link SSRequest}
   * @return The current RelatedSupportability object instance
   * @since 3.1.0
   */
  public RelatedSupportability withSsRequest(SSRequest value) {
    this.ssRequest = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RelatedSupportability record.
   * <p>
   * This method builds the exported {@link #ssRequestRef} field with values
   * from the transient {@link #ssRequest} field. This method should typically
   * be called after the RelatedSupportability is configured and (optionally)
   * before exporting an SSRF message.
   * <p>
   * @return The current RelatedSupportability object instance
   */
  public RelatedSupportability build() {
    this.ssRequestRef = ssRequest != null ? ssRequest.getSerial() : null;
    return this;
  }

  /**
   * Update the SSRF data type references in this RelatedSupportability record
   * after loading from XML.
   * <p>
   * This method builds the transient {@link #ssRequest} with values from the
   * imported {@link #ssRequestRef} field. This method should typically be
   * called after the RelatedSupportability is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (ssRequestRef == null || !ssRequestRef.isSetValue()) {
      return;
    }
    for (SSRequest instance : root.getSSRequest()) {
      if (ssRequestRef.equals(instance.getSerial())) {
        ssRequest = instance;
        return;
      }
    }
  }//</editor-fold>

}
