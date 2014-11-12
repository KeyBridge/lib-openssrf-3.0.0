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
package us.gov.dod.standard.ssrf._3_0.common;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * SecurityClass (US) contains the security classification from one or more data
 * information sources.
 * <p>
 * Element of {@link Common}
 * <p>
 * Sub-Elements are {@link ClsDerived}, {@link Downgrade}
 * <p>
 * Example:
 * <pre>
 * &lt;Security Class&gt;
 *   &lt;ClsAuthority  cls="U"&gt;DOD Spectrum Data Admin&lt;/ClsAuthority &gt;
 *   &lt;ClsOrg  cls="U"&gt;DSO&lt;/ClsOrg &gt;
 *   &lt;ClsReason  cls="U"&gt;A G&lt;/ClsReason &gt;
 *   &lt;DeclsDate  cls="U"&gt;2014-12-31&lt;/DeclsDate &gt;
 *   &lt;DeclsEvent  cls="U"&gt;DECLASSIFY AFTER MISSILE LAUNCH&lt;/DeclsEvent &gt;
 *   &lt;DeclsType  cls="U"&gt;DE25X2&lt;/DeclsType &gt;
 *   &lt;SourceClsDate  cls="U"&gt;2011-10-19&lt;/SourceClsDate &gt;
 * &lt;/Security Class&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClass", propOrder = {
  "clsAuthority",
  "sourceClsDate",
  "clsOrg",
  "clsReason",
  "declsType",
  "declsDate",
  "declsEvent",
  "downgrade",
  "clsDerived"
})
public class SecurityClass {

  /**
   * US:ClsAuthority - Original Classification Authority (Optional)
   * <p>
   * The identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ClsAuthority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString clsAuthority;
  /**
   * US:SourceClsDate - Source Classification Date (Optional)
   * <p>
   * The date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceClsDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar sourceClsDate;
  /**
   * US:ClsOrg - Original Classification Authority Organizatio (Optional)
   * <p>
   * The organization of the original classification authority.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ClsOrg", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString clsOrg;
  /**
   * US:ClsReason - Reason for Classification (Optional)
   * <p>
   * The reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * Format is S15
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ClsReason", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString clsReason;
  /**
   * US:DeclsType - Declassification Instructions (Optional)
   * <p>
   * The declassification instructions of the dataset. Refer to the appropriate
   * classification authority(s) for more information about this field.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DeclsType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString declsType;
  /**
   * US:DeclsDate - Declassification Date (Optional)
   * <p>
   * The declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DeclsDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar declsDate;
  /**
   * US:DeclsEvent - Declassification Event (Optional)
   * <p>
   * The declassification event, when necessary based on the declassification
   * instructions.
   * <p>
   * Format is S200
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DeclsEvent", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS200.class)
  private TString declsEvent;
  /**
   * US:Downgrade (Optional)
   * <p>
   * Downgrade (US) contains the downgrade security classification from one or
   * more data information sources.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Downgrade")
  private List<Downgrade> downgrade;
  /**
   * US:ClsDerived (Optional)
   * <p>
   * ClsDerived (US) contains the derived security classification from one or
   * more data information sources.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ClsDerived")
  private List<ClsDerived> clsDerived;

  /**
   * Get the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @return the ClsAuthority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getClsAuthority() {
    return clsAuthority;
  }

  /**
   * Set the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @param value the ClsAuthority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setClsAuthority(TString value) {
    this.clsAuthority = value;
  }

  /**
   * Determine if the ClsAuthority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsAuthority() {
    return (this.clsAuthority != null ? this.clsAuthority.isSetValue() : false);
  }

  /**
   * Get the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @return the SourceClsDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getSourceClsDate() {
    return sourceClsDate;
  }

  /**
   * Set the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @param value the SourceClsDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setSourceClsDate(TCalendar value) {
    this.sourceClsDate = value;
  }

  /**
   * Determine if the SourceClsDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceClsDate() {
    return (this.sourceClsDate != null ? this.sourceClsDate.isSetValue() : false);
  }

  /**
   * Get the organization of the original classification authority.
   * <p>
   * @return the ClsOrg value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getClsOrg() {
    return clsOrg;
  }

  /**
   * Set the organization of the original classification authority.
   * <p>
   * @param value the ClsOrg value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setClsOrg(TString value) {
    this.clsOrg = value;
  }

  /**
   * Determine if the ClsOrg is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsOrg() {
    return (this.clsOrg != null ? this.clsOrg.isSetValue() : false);
  }

  /**
   * Get the reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * @return the ClsReason value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getClsReason() {
    return clsReason;
  }

  /**
   * Set the reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * @param value the ClsReason value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setClsReason(TString value) {
    this.clsReason = value;
  }

  /**
   * Determine if the ClsReason is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsReason() {
    return (this.clsReason != null ? this.clsReason.isSetValue() : false);
  }

  /**
   * Get the declassification instructions of the dataset. Refer to the
   * appropriate classification authority(s) for more information about this
   * field.
   * <p>
   * @return the DeclsType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDeclsType() {
    return declsType;
  }

  /**
   * Set the declassification instructions of the dataset. Refer to the
   * appropriate classification authority(s) for more information about this
   * field.
   * <p>
   * @param value the DeclsType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDeclsType(TString value) {
    this.declsType = value;
  }

  /**
   * Determine if the DeclsType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeclsType() {
    return (this.declsType != null ? this.declsType.isSetValue() : false);
  }

  /**
   * Get the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @return the DeclsDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getDeclsDate() {
    return declsDate;
  }

  /**
   * Set the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @param value the DeclsDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setDeclsDate(TCalendar value) {
    this.declsDate = value;
  }

  /**
   * Determine if the DeclsDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeclsDate() {
    return (this.declsDate != null ? this.declsDate.isSetValue() : false);
  }

  /**
   * Get the declassification event, when necessary based on the
   * declassification instructions.
   * <p>
   * @return the DeclsEvent value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDeclsEvent() {
    return declsEvent;
  }

  /**
   * Set the declassification event, when necessary based on the
   * declassification instructions.
   * <p>
   * @param value the DeclsEvent value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDeclsEvent(TString value) {
    this.declsEvent = value;
  }

  /**
   * Determine if the DeclsEvent is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeclsEvent() {
    return (this.declsEvent != null ? this.declsEvent.isSetValue() : false);
  }

  /**
   * Get the US:Downgrade
   * <p>
   * Complex element Downgrade (US) contains the downgrade security
   * classification from one or more data information sources.
   * <p>
   * @return a {@link Downgrade} instance
   * @since 3.1.0
   */
  public List<Downgrade> getDowngrade() {
    if (downgrade == null) {
      downgrade = new ArrayList<>();
    }
    return this.downgrade;
  }

  /**
   * Determine if the Downgrade is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDowngrade() {
    return ((this.downgrade != null) && (!this.downgrade.isEmpty()));
  }

  /**
   * Clear the Downgrade field. This sets the field to null.
   */
  public void unsetDowngrade() {
    this.downgrade = null;
  }

  /**
   * Get the US:ClsDerived
   * <p>
   * Complex element ClsDerived (US) contains the derived security
   * classification from one or more data information sources.
   * <p>
   * @return a {@link ClsDerived} instance
   * @since 3.1.0
   */
  public List<ClsDerived> getClsDerived() {
    if (clsDerived == null) {
      clsDerived = new ArrayList<>();
    }
    return this.clsDerived;
  }

  /**
   * Determine if the ClsDerived is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsDerived() {
    return ((this.clsDerived != null) && (!this.clsDerived.isEmpty()));
  }

  /**
   * Clear the ClsDerived field. This sets the field to null.
   */
  public void unsetClsDerived() {
    this.clsDerived = null;
  }

  /**
   * Set the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withClsAuthority(String value) {
    setClsAuthority(new TString(value));
    return this;
  }

  /**
   * Set the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withSourceClsDate(Calendar value) {
    setSourceClsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withSourceClsDate(Date value) {
    setSourceClsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the organization of the original classification authority.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withClsOrg(String value) {
    setClsOrg(new TString(value));
    return this;
  }

  /**
   * Set the reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withClsReason(String value) {
    setClsReason(new TString(value));
    return this;
  }

  /**
   * Set the declassification instructions of the dataset. Refer to the
   * appropriate classification authority(s) for more information about this
   * field.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withDeclsType(String value) {
    setDeclsType(new TString(value));
    return this;
  }

  /**
   * Set the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withDeclsDate(Calendar value) {
    setDeclsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withDeclsDate(Date value) {
    setDeclsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the declassification event, when necessary based on the
   * declassification instructions.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withDeclsEvent(String value) {
    setDeclsEvent(new TString(value));
    return this;
  }

  /**
   * Set the US:Downgrade
   * <p>
   * Complex element Downgrade (US) contains the downgrade security
   * classification from one or more data information sources.
   * <p>
   * @param values One or more instances of type {@link Downgrade...}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withDowngrade(Downgrade... values) {
    if (values != null) {
      getDowngrade().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:Downgrade
   * <p>
   * Complex element Downgrade (US) contains the downgrade security
   * classification from one or more data information sources.
   * <p>
   * @param values A collection of {@link Downgrade} instances
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withDowngrade(Collection<Downgrade> values) {
    if (values != null) {
      getDowngrade().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ClsDerived
   * <p>
   * Complex element ClsDerived (US) contains the derived security
   * classification from one or more data information sources.
   * <p>
   * @param values One or more instances of type {@link ClsDerived...}
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withClsDerived(ClsDerived... values) {
    if (values != null) {
      getClsDerived().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ClsDerived
   * <p>
   * Complex element ClsDerived (US) contains the derived security
   * classification from one or more data information sources.
   * <p>
   * @param values A collection of {@link ClsDerived} instances
   * @return The current SecurityClass object instance
   * @since 3.1.0
   */
  public SecurityClass withClsDerived(Collection<ClsDerived> values) {
    if (values != null) {
      getClsDerived().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this SecurityClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SecurityClass {"
      + (clsAuthority != null ? " clsAuthority [" + clsAuthority + "]" : "")
      + (clsReason != null ? " clsReason [" + clsReason + "]" : "")
      + (sourceClsDate != null ? " sourceClsDate [" + sourceClsDate + "]" : "")
      + (clsOrg != null ? " clsOrg [" + clsOrg + "]" : "")
      + (clsDerived != null ? " clsDerived [" + clsDerived + "]" : "")
      + (declsEvent != null ? " declsEvent [" + declsEvent + "]" : "")
      + (declsDate != null ? " declsDate [" + declsDate + "]" : "")
      + (downgrade != null ? " downgrade [" + downgrade + "]" : "")
      + (declsType != null ? " declsType [" + declsType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SecurityClass} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
