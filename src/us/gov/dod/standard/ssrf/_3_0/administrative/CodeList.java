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
package us.gov.dod.standard.ssrf._3_0.administrative;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Administrative;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;

/**
 * CodeList contains the actions necessary to create or delete a code entry in a
 * given Code List.
 * <p>
 * Element of {@link Administrative}
 * <p>
 * Sub-Element is {@link Code}
 * <p>
 * Example:
 * <pre>
 * &lt;CodeList&gt;
 *   &lt;Action cls="U"&gt;Add Code&lt;/Action&gt;
 *   &lt;CodeListCode cls="U"&gt;CAS&lt;/CodeListCode&gt;
 *   &lt;EffectiveDate cls="U"&gt;2011-12-25&lt;/EffectiveDate&gt;
 *   &lt;Code&gt;
 *     &lt;Value cls="U"&gt;Jerking&lt;/Value&gt;
 *     &lt;Description cls="U"&gt;Moving wildly in all directions&lt;/Description&gt;
 *   &lt;/Code&gt;
 * &lt;/CodeList&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeList", propOrder = {
  "action",
  "codeListCode",
  "effectiveDate",
  "description",
  "origin",
  "code"
})
public class CodeList {

  /**
   * Action - Action Required (Required)
   * <p>
   * The intended type of modification to the given code list.
   * <p>
   * Format is L:CAC
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Action", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString action;
  /**
   * CodeListCode - Code List 3-letter Code (Required)
   * <p>
   * The three-letter code of an existing Code List to be modified, or an unused
   * three-letter code in the case of the creation of a new Code List.
   * <p>
   * Format is US(3)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CodeListCode", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS3.class)
  private TString codeListCode;
  /**
   * EffectiveDate - Effective Date (Required)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * Description - New Code List Description (Optional)
   * <p>
   * The description of the intended contents of new code list, and the
   * element(s) where it will be used.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString description;
  /**
   * Origin - Originating Country/Body (Optional)
   * <p>
   * The country or organisation which is using the modified or new code.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Origin", required = false)
  private TString origin;
  /**
   * CodeListCode - Code List 3-letter Code (Required)
   * <p>
   * The three-letter code of an existing Code List to be modified, or an unused
   * three-letter code in the case of the creation of a new Code List.
   * <p>
   * Format is US(3)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Code")
  private List<Code> code;

  /**
   * Get the intended type of modification to the given code list.
   * <p>
   * @return the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAction() {
    return action;
  }

  /**
   * Set the intended type of modification to the given code list.
   * <p>
   * @param value the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAction(TString value) {
    this.action = value;
  }

  /**
   * Determine if the Action is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAction() {
    return (this.action != null ? this.action.isSetValue() : false);
  }

  /**
   * Get the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @return the CodeListCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCodeListCode() {
    return codeListCode;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param value the CodeListCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCodeListCode(TString value) {
    this.codeListCode = value;
  }

  /**
   * Determine if the CodeListCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeListCode() {
    return (this.codeListCode != null ? this.codeListCode.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective.
   * <p>
   * @return the EffectiveDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value the EffectiveDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the description of the intended contents of new code list, and the
   * element(s) where it will be used.
   * <p>
   * @return the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set the description of the intended contents of new code list, and the
   * element(s) where it will be used.
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
   * Get the country or organisation which is using the modified or new code.
   * <p>
   * @return the Origin value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOrigin() {
    return origin;
  }

  /**
   * Set the country or organisation which is using the modified or new code.
   * <p>
   * @param value the Origin value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOrigin(TString value) {
    this.origin = value;
  }

  /**
   * Determine if the Origin is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrigin() {
    return (this.origin != null ? this.origin.isSetValue() : false);
  }

  /**
   * Get the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @return a {@link Code} instance
   * @since 3.1.0
   */
  public List<Code> getCode() {
    if (code == null) {
      code = new ArrayList<>();
    }
    return this.code;
  }

  /**
   * Determine if the Code is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCode() {
    return ((this.code != null) && (!this.code.isEmpty()));
  }

  /**
   * Clear the Code field. This sets the field to null.
   */
  public void unsetCode() {
    this.code = null;
  }

  /**
   * Set the intended type of modification to the given code list.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withAction(String value) {
    setAction(new TString(value));
    return this;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withCodeListCode(String value) {
    setCodeListCode(new TString(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the description of the intended contents of new code list, and the
   * element(s) where it will be used.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the country or organisation which is using the modified or new code.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withOrigin(ListCAO value) {
    setOrigin(new TString(value.value()));
    return this;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param values One or more instances of type {@link Code...}
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withCode(Code... values) {
    if (values != null) {
      getCode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param values A collection of {@link Code} instances
   * @return The current CodeList object instance
   * @since 3.1.0
   */
  public CodeList withCode(Collection<Code> values) {
    if (values != null) {
      getCode().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this CodeList instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CodeList {"
      + (description != null ? " description [" + description + "]" : "")
      + (origin != null ? " origin [" + origin + "]" : "")
      + (action != null ? " action [" + action + "]" : "")
      + (code != null ? " code [" + code + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + (codeListCode != null ? " codeListCode [" + codeListCode + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CodeList} requires
   * {@link TString Action}, {@link TString CodeListCode}, {@link TCalendar EffectiveDate}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAction() && isSetCodeListCode() && isSetEffectiveDate();
  }

}
