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
package us.gov.dod.standard.ssrf._3_0;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.contact.Address;
import us.gov.dod.standard.ssrf._3_0.contact.EMail;
import us.gov.dod.standard.ssrf._3_0.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * Contact is the XML root for all parameters of a Contact.
 * <p>
 * Sub-Elements are {@link Address}, {@link Email}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Contact cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:AF:CN:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2004-05-20T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;FirstName cls="U"&gt;John&lt;/FirstName&gt;
 *   &lt;LastName cls="U"&gt;Doe&lt;/LastName&gt;
 *   &lt;TelephoneFax&gt;
 *     &lt;Number cls="U"&gt;(123)456.789&lt;/Number&gt;
 *   &lt;/TelephoneFax&gt;
 * &lt;/Contact&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "titleRank",
  "firstName",
  "lastName",
  "address",
  "telephoneFax",
  "eMail"
})
public class Contact extends Common<Contact> {

  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * TitleRank - Title or Rank (Optional)
   * <p>
   * The contact title or rank e.g., Ms, Col, etc.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TitleRank", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString titleRank;
  /**
   * FirstName - First Name (Optional)
   * <p>
   * The first name of the contact individual.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FirstName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString firstName;
  /**
   * LastName - Last Name (Optional)
   * <p>
   * The last name of the contact individual.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString lastName;
  /**
   * Address (Optional)
   * <p>
   * Address contains the address of a Contact, Organisation or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Address")
  private List<Address> address;
  /**
   * TelephoneFax (Optional)
   * <p>
   * TelephoneFax reflects the telephone and/or telefax number(s) of the
   * Contact, Organisation or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TelephoneFax")
  private List<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of the Contact or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EMail")
  private List<EMail> eMail;

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
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @return the ExpirationDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value the ExpirationDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value the ReviewDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @return the TitleRank value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTitleRank() {
    return titleRank;
  }

  /**
   * Set the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @param value the TitleRank value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTitleRank(TString value) {
    this.titleRank = value;
  }

  /**
   * Determine if the TitleRank is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitleRank() {
    return (this.titleRank != null ? this.titleRank.isSetValue() : false);
  }

  /**
   * Get the first name of the contact individual.
   * <p>
   * @return the FirstName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFirstName() {
    return firstName;
  }

  /**
   * Set the first name of the contact individual.
   * <p>
   * @param value the FirstName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFirstName(TString value) {
    this.firstName = value;
  }

  /**
   * Determine if the FirstName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFirstName() {
    return (this.firstName != null ? this.firstName.isSetValue() : false);
  }

  /**
   * Get the last name of the contact individual.
   * <p>
   * @return the LastName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLastName() {
    return lastName;
  }

  /**
   * Set the last name of the contact individual.
   * <p>
   * @param value the LastName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLastName(TString value) {
    this.lastName = value;
  }

  /**
   * Determine if the LastName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastName() {
    return (this.lastName != null ? this.lastName.isSetValue() : false);
  }

  /**
   * Get the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @return a {@link Address} instance
   * @since 3.1.0
   */
  public List<Address> getAddress() {
    if (address == null) {
      address = new ArrayList<>();
    }
    return this.address;
  }

  /**
   * Determine if the Address is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAddress() {
    return ((this.address != null) && (!this.address.isEmpty()));
  }

  /**
   * Clear the Address field. This sets the field to null.
   */
  public void unsetAddress() {
    this.address = null;
  }

  /**
   * Get the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @return a {@link TelephoneFax} instance
   * @since 3.1.0
   */
  public List<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new ArrayList<>();
    }
    return this.telephoneFax;
  }

  /**
   * Determine if the TelephoneFax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTelephoneFax() {
    return ((this.telephoneFax != null) && (!this.telephoneFax.isEmpty()));
  }

  /**
   * Clear the TelephoneFax field. This sets the field to null.
   */
  public void unsetTelephoneFax() {
    this.telephoneFax = null;
  }

  /**
   * Get the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @return a {@link EMail} instance
   * @since 3.1.0
   */
  public List<EMail> getEMail() {
    if (eMail == null) {
      eMail = new ArrayList<>();
    }
    return this.eMail;
  }

  /**
   * Determine if the EMail is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEMail() {
    return ((this.eMail != null) && (!this.eMail.isEmpty()));
  }

  /**
   * Clear the EMail field. This sets the field to null.
   */
  public void unsetEMail() {
    this.eMail = null;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withExpirationDate(Date value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withTitleRank(String value) {
    setTitleRank(new TString(value));
    return this;
  }

  /**
   * Set the first name of the contact individual.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withFirstName(String value) {
    setFirstName(new TString(value));
    return this;
  }

  /**
   * Set the last name of the contact individual.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withLastName(String value) {
    setLastName(new TString(value));
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param values One or more instances of type {@link Address...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withAddress(Address... values) {
    if (values != null) {
      getAddress().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param values A collection of {@link Address} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withAddress(Collection<Address> values) {
    if (values != null) {
      getAddress().addAll(values);
    }
    return this;
  }

  /**
   * Set the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @param values One or more instances of type {@link TelephoneFax...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @param values A collection of {@link TelephoneFax} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values One or more instances of type {@link EMail...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values A collection of {@link EMail} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEMail(Collection<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Contact instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Contact {"
      + (titleRank != null ? " titleRank [" + titleRank + "]" : "")
      + (lastName != null ? " lastName [" + lastName + "]" : "")
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (address != null ? " address [" + address + "]" : "")
      + (eMail != null ? " eMail [" + eMail + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (telephoneFax != null ? " telephoneFax [" + telephoneFax + "]" : "")
      + (firstName != null ? " firstName [" + firstName + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Contact} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
