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
package us.gov.dod.standard.ssrf._3_0.location;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Location;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Ellipse on the horizontal plane, defined by its semi-major and semi-minor
 * axis, and by the orientation (azimuth) of the semi-major axis. This element
 * SHALL NOT be used to describe a satellite orbit.
 * <p>
 * Element of {@link Location}
 * <p>
 * Example:
 * <pre>
 * &lt;Ellipse&gt;
 *   &lt;AltitudeMax  cls="U"&gt;20000&lt;/AltitudeMax &gt;
 *   &lt;AltitudeMin  cls="U"&gt;3896.45&lt;/AltitudeMin &gt;
 *   &lt;Azimuth  cls="U"&gt;357.8&lt;/Azimuth &gt;
 *   &lt;Excluded  cls="U"&gt;No&lt;/Excluded &gt;
 *   &lt;idx cls="U"&gt;23&lt;/idx&gt;
 *   &lt;Lat  cls="U"&gt;394217.12N&lt;/Lat &gt;
 *   &lt;Lon  cls="U"&gt;792823.5W&lt;/Lon &gt;
 *   &lt;SemiMajorAxis  cls="U"&gt;87.87&lt;/SemiMajorAxis &gt;
 *   &lt;SemiMinorAxis  cls="U"&gt;67.89&lt;/SemiMinorAxis &gt;
 * &lt;/Ellipse&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ellipse", propOrder = {
  "excluded",
  "lon",
  "lat",
  "semiMajorAxis",
  "semiMinorAxis",
  "azimuth",
  "altitudeMin",
  "altitudeMax"
})
public class Ellipse {

  /**
   * Excluded - Shape is Excluded (Optional)
   * <p>
   * "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  /**
   * Lon - Longitude (Required)
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the Point or center of the Ellipse. If the seconds are not known, use
   * 00, except in the case of navigation aid systems, geostationary satellites,
   * and microwave facilities where seconds are required. Use leading zeros as
   * appropriate for degrees, minutes, or seconds. Degrees longitude require
   * three digits. Seconds may have a decimal point followed by up to two
   * decimals. enter E or W immediately following the seconds. The format is:
   * dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * Attribute group Coord (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Lon", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString lon;
  /**
   * Lat - Latitude (Required)
   * <p>
   * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
   * of the Point or center of the Ellipse. Same remarks for seconds and leading
   * zeros. enter N or S immediately following the seconds. The format is:
   * ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * Format is pattern (S10) (deg)
   * <p>
   * Attribute group Coord (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Lat", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  /**
   * SemiMajorAxis - Semi Major Axis (Required)
   * <p>
   * The length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * Format is UN(9,4) [0..10000] (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SemiMajorAxis", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal semiMajorAxis;
  /**
   * SemiMinorAxis - Semi Minor Axis (Required)
   * <p>
   * The length of the semi-minor axis of the ellipse.
   * <p>
   * Format is UN(9,4) [0..10000] (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SemiMinorAxis", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal semiMinorAxis;
  /**
   * Azimuth - Azimuth of the Major Axis (Required)
   * <p>
   * The angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Azimuth", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azimuth;
  /**
   * AltitudeMin - Minimum Altitude Above Ground Level (Optional)
   * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group Altitude (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AltitudeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMin;
  /**
   * AltitudeMax - Maximum Altitude Above Ground Level (Optional)
   * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group Altitude (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AltitudeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  /**
   * idx - Index (Required)
   * <p>
   * A unique integer index for the current ellipse within the geometric shape.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @return the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  /**
   * Determine if the Excluded is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExcluded() {
    return (this.excluded != null ? this.excluded.isSetValue() : false);
  }

  /**
   * Get the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @return the Lon value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLon() {
    return lon;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @param value the Lon value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLon(TString value) {
    this.lon = value;
  }

  /**
   * Determine if the Lon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLon() {
    return (this.lon != null ? this.lon.isSetValue() : false);
  }

  /**
   * Get the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @return the Lat value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLat() {
    return lat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value the Lat value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLat(TString value) {
    this.lat = value;
  }

  /**
   * Determine if the Lat is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLat() {
    return (this.lat != null ? this.lat.isSetValue() : false);
  }

  /**
   * Get the length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * @return the SemiMajorAxis value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSemiMajorAxis() {
    return semiMajorAxis;
  }

  /**
   * Set the length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * @param value the SemiMajorAxis value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSemiMajorAxis(TDecimal value) {
    this.semiMajorAxis = value;
  }

  /**
   * Determine if the SemiMajorAxis is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSemiMajorAxis() {
    return (this.semiMajorAxis != null);
  }

  /**
   * Get the length of the semi-minor axis of the ellipse.
   * <p>
   * @return the SemiMinorAxis value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSemiMinorAxis() {
    return semiMinorAxis;
  }

  /**
   * Set the length of the semi-minor axis of the ellipse.
   * <p>
   * @param value the SemiMinorAxis value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSemiMinorAxis(TDecimal value) {
    this.semiMinorAxis = value;
  }

  /**
   * Determine if the SemiMinorAxis is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSemiMinorAxis() {
    return (this.semiMinorAxis != null);
  }

  /**
   * Get the angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * @return the Azimuth value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAzimuth() {
    return azimuth;
  }

  /**
   * Set the angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * @param value the Azimuth value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAzimuth(TDecimal value) {
    this.azimuth = value;
  }

  /**
   * Determine if the Azimuth is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzimuth() {
    return (this.azimuth != null ? this.azimuth.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @return the AltitudeMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @param value the AltitudeMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAltitudeMin(TDecimal value) {
    this.altitudeMin = value;
  }

  /**
   * Determine if the AltitudeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAltitudeMin() {
    return (this.altitudeMin != null ? this.altitudeMin.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * @return the AltitudeMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * @param value the AltitudeMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAltitudeMax(TDecimal value) {
    this.altitudeMax = value;
  }

  /**
   * Determine if the AltitudeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAltitudeMax() {
    return (this.altitudeMax != null ? this.altitudeMax.isSetValue() : false);
  }

  /**
   * Get a unique integer index for the current ellipse within the geometric
   * shape.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique integer index for the current ellipse within the geometric
   * shape.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withLon(String value) {
    setLon(new TString(value));
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  /**
   * Set the length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * @param value An instances of type {@link TDecimal}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withSemiMajorAxis(TDecimal value) {
    return this;
  }

  /**
   * Set the length of the semi-minor axis of the ellipse.
   * <p>
   * @param value An instances of type {@link TDecimal}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withSemiMinorAxis(TDecimal value) {
    return this;
  }

  /**
   * Set the angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withAzimuth(Double value) {
    setAzimuth(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withAltitudeMin(Double value) {
    setAltitudeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set a unique integer index for the current ellipse within the geometric
   * shape.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Ellipse object instance
   * @since 3.1.0
   */
  public Ellipse withIdx(BigInteger value) {
    return this;
  }

  /**
   * Get a string representation of this Ellipse instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Ellipse {"
      + (semiMinorAxis != null ? " semiMinorAxis [" + semiMinorAxis + "]" : "")
      + (altitudeMax != null ? " altitudeMax [" + altitudeMax + "]" : "")
      + (lon != null ? " lon [" + lon + "]" : "")
      + (idx != null ? " idx [" + idx + "]" : "")
      + (excluded != null ? " excluded [" + excluded + "]" : "")
      + (semiMajorAxis != null ? " semiMajorAxis [" + semiMajorAxis + "]" : "")
      + (azimuth != null ? " azimuth [" + azimuth + "]" : "")
      + (altitudeMin != null ? " altitudeMin [" + altitudeMin + "]" : "")
      + (lat != null ? " lat [" + lat + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Ellipse} requires
   * {@link TDecimal Azimuth}, {@link TString Lat}, {@link TString Lon}, {@link TDecimal SemiMajorAxis}, {@link TDecimal SemiMinorAxis}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAzimuth() && isSetLat() && isSetLon() && isSetSemiMajorAxis() && isSetSemiMinorAxis() && isSetIdx();
  }

}
