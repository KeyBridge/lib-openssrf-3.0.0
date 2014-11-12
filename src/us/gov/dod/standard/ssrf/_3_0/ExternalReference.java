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

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCSG;

/**
 * ExternalReference contains bibliographic or any other references applicable
 * to the dataset except those placed in Derivative Classification Authority
 * (Data element ClsDerived).
 * <p>
 * Example:
 * <pre>
 * &lt;ExternalReference cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:AF:EX:123&lt;/Serial&gt;
 *   &lt;Type cls="U"&gt;Document&lt;/Type&gt;
 *   &lt;Title cls="U"&gt;plan 5027&lt;/Title&gt;
 *   &lt;Organisation cls="U"&gt;PACOM&lt;/Organisation&gt;
 *   &lt;Date cls="U"&gt;2000-04-27&lt;/Date&gt;
 *   &lt;ResourceLocator cls="U"&gt;USA-AF-EX-123.PDF&lt;/ResourceLocator&gt;
 * &lt;/ExternalReference&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReference", propOrder = {
  "type",
  "date",
  "identifier",
  "alternateIdentifier",
  "title",
  "author",
  "organisation",
  "documentCls",
  "resourceLocator",
  "isAttached",
  "isClassified",
  "referencedStage"
})
public class ExternalReference extends Common<ExternalReference> {

  /**
   * Type - Type of Reference (Optional)
   * <p>
   * The type of information referenced by this external reference.
   * <p>
   * Format is L:CRE
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString type;
  /**
   * Date - Date of Reference (Optional)
   * <p>
   * The publication date of the external reference
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Date", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  /**
   * AlternateIdentifier - Alternate Identifier (Optional)
   * <p>
   * Any alternate identifier for the document as needed.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Identifier", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString identifier;
  /**
   * AlternateIdentifier - Alternate Identifier (Optional)
   * <p>
   * Any alternate identifier for the document as needed.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AlternateIdentifier", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString alternateIdentifier;
  /**
   * Title - Full Title (Optional)
   * <p>
   * The full title of the document.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString title;
  /**
   * Author - Author of the Reference (Optional)
   * <p>
   * The name of the author of the reference, if it cannot be covered by a
   * ContactRef.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Author", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString author;
  /**
   * Organisation - Organisation that published the Reference (Optional)
   * <p>
   * The name of the Organisation that published the Reference, if it cannot be
   * covered by a OrganisationRef
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Organisation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString organisation;
  /**
   * DocumentCls - Document Classification (Optional)
   * <p>
   * The classification level of the Reference.
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DocumentCls", required = false)
  private TString documentCls;
  /**
   * ResourceLocator - Attached File Name or URL (Optional)
   * <p>
   * Either the file name (including the extension) of the reference document
   * when it is attached to the dataset, or an URL (Uniform Resource Locator) to
   * find the document.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ResourceLocator", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString resourceLocator;
  /**
   * US:IsAttached - Is Attached (Required)
   * <p>
   * If the document, file or other "external" information is stored in
   * attachment to this message.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IsAttached", required = true)
  private TString isAttached;
  /**
   * US:IsClassified - Is Classified (Optional)
   * <p>
   * If the referenced information contains any classified data.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IsClassified", required = false)
  private TString isClassified;
  /**
   * US:ReferencedStage - Referenced Stage (Optional)
   * <p>
   * The spectrum certification stage associated with this information.
   * <p>
   * Format is L:CSG
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReferencedStage", required = false)
  private TString referencedStage;

  /**
   * Get the type of information referenced by this external reference.
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of information referenced by this external reference.
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
   * Get the publication date of the external reference
   * <p>
   * @return the Date value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Set the publication date of the external reference
   * <p>
   * @param value the Date value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setDate(TCalendar value) {
    this.date = value;
  }

  /**
   * Determine if the Date is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDate() {
    return (this.date != null ? this.date.isSetValue() : false);
  }

  /**
   * Get any alternate identifier for the document as needed.
   * <p>
   * @return the Identifier value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Set any alternate identifier for the document as needed.
   * <p>
   * @param value the Identifier value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIdentifier(TString value) {
    this.identifier = value;
  }

  /**
   * Determine if the Identifier is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdentifier() {
    return (this.identifier != null ? this.identifier.isSetValue() : false);
  }

  /**
   * Get any alternate identifier for the document as needed.
   * <p>
   * @return the AlternateIdentifier value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAlternateIdentifier() {
    return alternateIdentifier;
  }

  /**
   * Set any alternate identifier for the document as needed.
   * <p>
   * @param value the AlternateIdentifier value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAlternateIdentifier(TString value) {
    this.alternateIdentifier = value;
  }

  /**
   * Determine if the AlternateIdentifier is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAlternateIdentifier() {
    return (this.alternateIdentifier != null ? this.alternateIdentifier.isSetValue() : false);
  }

  /**
   * Get the full title of the document.
   * <p>
   * @return the Title value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set the full title of the document.
   * <p>
   * @param value the Title value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the name of the author of the reference, if it cannot be covered by a
   * ContactRef.
   * <p>
   * @return the Author value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAuthor() {
    return author;
  }

  /**
   * Set the name of the author of the reference, if it cannot be covered by a
   * ContactRef.
   * <p>
   * @param value the Author value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAuthor(TString value) {
    this.author = value;
  }

  /**
   * Determine if the Author is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAuthor() {
    return (this.author != null ? this.author.isSetValue() : false);
  }

  /**
   * Get the name of the Organisation that published the Reference, if it cannot
   * be covered by a OrganisationRef
   * <p>
   * @return the Organisation value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOrganisation() {
    return organisation;
  }

  /**
   * Set the name of the Organisation that published the Reference, if it cannot
   * be covered by a OrganisationRef
   * <p>
   * @param value the Organisation value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOrganisation(TString value) {
    this.organisation = value;
  }

  /**
   * Determine if the Organisation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrganisation() {
    return (this.organisation != null ? this.organisation.isSetValue() : false);
  }

  /**
   * Get the classification level of the Reference.
   * <p>
   * @return the DocumentCls value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDocumentCls() {
    return documentCls;
  }

  /**
   * Set the classification level of the Reference.
   * <p>
   * @param value the DocumentCls value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDocumentCls(TString value) {
    this.documentCls = value;
  }

  /**
   * Determine if the DocumentCls is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDocumentCls() {
    return (this.documentCls != null ? this.documentCls.isSetValue() : false);
  }

  /**
   * Get either the file name (including the extension) of the reference
   * document when it is attached to the dataset, or an URL (Uniform Resource
   * Locator) to find the document.
   * <p>
   * @return the ResourceLocator value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getResourceLocator() {
    return resourceLocator;
  }

  /**
   * Set either the file name (including the extension) of the reference
   * document when it is attached to the dataset, or an URL (Uniform Resource
   * Locator) to find the document.
   * <p>
   * @param value the ResourceLocator value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setResourceLocator(TString value) {
    this.resourceLocator = value;
  }

  /**
   * Determine if the ResourceLocator is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetResourceLocator() {
    return (this.resourceLocator != null ? this.resourceLocator.isSetValue() : false);
  }

  /**
   * Get if the document, file or other "external" information is stored in
   * attachment to this message.
   * <p>
   * @return the IsAttached value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIsAttached() {
    return isAttached;
  }

  /**
   * Set if the document, file or other "external" information is stored in
   * attachment to this message.
   * <p>
   * @param value the IsAttached value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIsAttached(TString value) {
    this.isAttached = value;
  }

  /**
   * Determine if the IsAttached is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIsAttached() {
    return (this.isAttached != null ? this.isAttached.isSetValue() : false);
  }

  /**
   * Get if the referenced information contains any classified data.
   * <p>
   * @return the IsClassified value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIsClassified() {
    return isClassified;
  }

  /**
   * Set if the referenced information contains any classified data.
   * <p>
   * @param value the IsClassified value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIsClassified(TString value) {
    this.isClassified = value;
  }

  /**
   * Determine if the IsClassified is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIsClassified() {
    return (this.isClassified != null ? this.isClassified.isSetValue() : false);
  }

  /**
   * Get the spectrum certification stage associated with this information.
   * <p>
   * @return the ReferencedStage value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getReferencedStage() {
    return referencedStage;
  }

  /**
   * Set the spectrum certification stage associated with this information.
   * <p>
   * @param value the ReferencedStage value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setReferencedStage(TString value) {
    this.referencedStage = value;
  }

  /**
   * Determine if the ReferencedStage is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReferencedStage() {
    return (this.referencedStage != null ? this.referencedStage.isSetValue() : false);
  }

  /**
   * Set the type of information referenced by this external reference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set the publication date of the external reference
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the publication date of the external reference
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withDate(Date value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set any alternate identifier for the document as needed.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withIdentifier(String value) {
    setIdentifier(new TString(value));
    return this;
  }

  /**
   * Set any alternate identifier for the document as needed.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withAlternateIdentifier(String value) {
    setAlternateIdentifier(new TString(value));
    return this;
  }

  /**
   * Set the full title of the document.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the name of the author of the reference, if it cannot be covered by a
   * ContactRef.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withAuthor(String value) {
    setAuthor(new TString(value));
    return this;
  }

  /**
   * Set the name of the Organisation that published the Reference, if it cannot
   * be covered by a OrganisationRef
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withOrganisation(String value) {
    setOrganisation(new TString(value));
    return this;
  }

  /**
   * Set the classification level of the Reference.
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withDocumentCls(ListCCL value) {
    setDocumentCls(new TString(value.value()));
    return this;
  }

  /**
   * Set either the file name (including the extension) of the reference
   * document when it is attached to the dataset, or an URL (Uniform Resource
   * Locator) to find the document.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withResourceLocator(String value) {
    setResourceLocator(new TString(value));
    return this;
  }

  /**
   * Set if the document, file or other "external" information is stored in
   * attachment to this message.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withIsAttached(ListCBO value) {
    setIsAttached(new TString(value.value()));
    return this;
  }

  /**
   * Set if the referenced information contains any classified data.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withIsClassified(ListCBO value) {
    setIsClassified(new TString(value.value()));
    return this;
  }

  /**
   * Set the spectrum certification stage associated with this information.
   * <p>
   * @param value An instances of type {@link ListCSG}
   * @return The current ExternalReference object instance
   * @since 3.1.0
   */
  public ExternalReference withReferencedStage(ListCSG value) {
    setReferencedStage(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this ExternalReference instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ExternalReference {"
      + (author != null ? " author [" + author + "]" : "")
      + (title != null ? " title [" + title + "]" : "")
      + (documentCls != null ? " documentCls [" + documentCls + "]" : "")
      + (referencedStage != null ? " referencedStage [" + referencedStage + "]" : "")
      + (isAttached != null ? " isAttached [" + isAttached + "]" : "")
      + (organisation != null ? " organisation [" + organisation + "]" : "")
      + (isClassified != null ? " isClassified [" + isClassified + "]" : "")
      + (resourceLocator != null ? " resourceLocator [" + resourceLocator + "]" : "")
      + (alternateIdentifier != null ? " alternateIdentifier [" + alternateIdentifier + "]" : "")
      + (date != null ? " date [" + date + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (identifier != null ? " identifier [" + identifier + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ExternalReference} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString IsAttached}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetIsAttached();
  }

}
