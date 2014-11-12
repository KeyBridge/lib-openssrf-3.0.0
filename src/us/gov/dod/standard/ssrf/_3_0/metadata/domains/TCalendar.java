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
package us.gov.dod.standard.ssrf._3_0.metadata.domains;

import us.gov.dod.standard.ssrf._3_0.metadata.IMetadataType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import us.gov.dod.standard.ssrf._3_0.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * A Calendar instance with SSRF Standard Metadata Attributes. This corresponds
 * to the "xs:date" and "xs:dateTime" types.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCalendar")
public class TCalendar extends AMetadata<TCalendar> implements IMetadataType, Comparable<TCalendar> {

  /**
   * UTC. The default time zone.
   */
  private static final TimeZone TIMEZONE = TimeZone.getTimeZone("UTC");
  /**
   * "yyyy-MM-dd'T'HH:mm:ss.SSSZ". The default DATETIME pattern.
   */
  private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  protected Calendar value;

  public TCalendar(Calendar value) {
    setValue(value);
  }

  public TCalendar(Date value) {
    setValue(value);
  }

  /**
   * Zero argument constructor.
   */
  public TCalendar() {
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  @Override
  public Calendar getValue() {
    return (value != null ? (Calendar) value.clone() : null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Calendar value) {
    this.value = (value != null ? (Calendar) value.clone() : null);
    this.value.setTimeZone(TIMEZONE);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Date value) {
    if (value != null) {
      this.value = Calendar.getInstance(TIMEZONE);
      this.value.setTime(value);
    } else {
      this.value = null;
    }
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TCalendar} requires {@link ListCCL cls} and {@link Calendar value}
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

  /**
   * Get the configured value.
   * <p>
   * @return the value.
   */
  @Override
  public String toString() {
    if (value != null) {
      SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
      sdf.setCalendar(value);
      return sdf.format(value.getTime());
    }
    return null;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the Calendar value.
   * <p>
   * @return a unique hash code from the Calendar value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the Calendar value.
   * <p>
   * @param obj the other object to compare
   * @return TRUE if the Calendar values match exactly
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((TCalendar) obj).getValue());
  }

  /**
   * Comparison and sorting is in REVERSE chronological order (Newest to Oldest)
   * <p>
   * @param o the other object to compare
   * @return the reverse chronological order
   */
  @Override
  public int compareTo(TCalendar o) {
    if (o == null) {
      return 1;
    }
    if (this.value == null) {
      return -1;
    }
    return -1 * this.value.compareTo(o.getValue());
  }//</editor-fold>
}
