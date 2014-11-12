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
package us.gov.dod.standard.ssrf._3_0.antenna;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Antenna;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAU;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCRD;

/**
 * AntMode contains the technical characteristics of one antenna mode.
 * <p>
 * Element of {@link Antenna}
 * <p>
 * Sub-Elements are
 * {@link AntEfficiency}, {@link AntFreqs}, {@link AntGain}, {@link AntPattern}, {@link ObservedLobeAnalysis}, {@link ObservedPolarisationAnalysis}, {@link ObservedScanAnalysis}, {@link VSWR}
 * <p>
 * Example:
 * <pre>
 * &lt;AntMode&gt;
 *   &lt;ModeID cls="U"&gt;SURVEILLANCE&lt;/ModeID&gt;
 *   &lt;MotionType cls="U"&gt;Rotating&lt;/MotionType&gt;
 *   &lt;PolarisationType cls="U"&gt;Vertical linear&lt;/PolarisationType&gt;
 *   &lt;RotationRateMin cls="U"&gt;30&lt;/RotationRateMin&gt;
 *   &lt;other_AntMode_elements/&gt;
 *   &lt;/AntMode&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntMode", propOrder = {
  "modeID",
  "description",
  "modeUse",
  "motionType",
  "sectBlanking",
  "polarisationType",
  "polarisationAngle",
  "horzScanSpeed",
  "horzScanRate",
  "horzScanType",
  "horzScanSector",
  "vertScanSpeed",
  "vertScanRate",
  "vertScanType",
  "vertScanAngleMin",
  "vertScanAngleMax",
  "rotationDirection",
  "rotationRateMin",
  "rotationRateMax",
  "horzBwMin",
  "horzBwMax",
  "vertBwMin",
  "vertBwMax",
  "beamType",
  "maxPower",
  "portIsolation",
  "modeName",
  "antGain",
  "antFreqs",
  "antPattern",
  "antEfficiency",
  "vswr"
})
public class AntMode {

  /**
   * ModeID - Mode Identifier (Required)
   * <p>
   * A short name for the mode; this name should be a meaningful identification
   * of the mode, but it can also be automatically generated in some systems.
   * The Name MUST be unique within the dataset and SHOULD NOT be modified
   * during the entire lifetime of the dataset.
   * <p>
   * Format is S20
   * <p>
   * Attribute group ModeInfo (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * Description - Mode Description (Optional)
   * <p>
   * A description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * In Data Item ModeUse, indicate if the mode is used for transmit, receive,
   * or both transmit and receive.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeUse", required = false)
  private TString modeUse;
  /**
   * MotionType - Antenna Motion Type (Optional)
   * <p>
   * The general category for the movement of a scanning or tracking antenna.
   * <p>
   * Format is L:CAD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MotionType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString motionType;
  /**
   * SectBlanking - Sector Blanking (Optional)
   * <p>
   * "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SectBlanking", required = false)
  private TString sectBlanking;
  /**
   * PolarisationType - Type of Polarisation (Required)
   * <p>
   * The principal orientation of the electric field of the electromagnetic wave
   * for an antenna.
   * <p>
   * Format is L:CPO
   * <p>
   * Attribute group Pol (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PolarisationType")
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString polarisationType;
  /**
   * PolarisationAngle - Polarisation Angle (Optional)
   * <p>
   * The angle of the electric field vector measured counter-clockwise from the
   * equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Pol (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PolarisationAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal polarisationAngle;
  /**
   * HorzScanSpeed - Horizontal Scan Speed (Optional)
   * <p>
   * The number of degrees per second the antenna is capable of scanning. It is
   * not necessarily the "Sector Scanned" figure times the degrees per second.
   * If a significant portion of time is spent vertically scanning in between
   * horizontal sweeps, the horizontal scan rate will be lower than if the
   * antenna were horizontally scanning all the time.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group HorzScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanSpeed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal horzScanSpeed;
  /**
   * HorzScanRate - Horizontal Scan Rate (Optional)
   * <p>
   * The number of complete scans the antenna is capable of making each minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group HorzScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanRate", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger horzScanRate;
  /**
   * HorzScanType - Horizontal Scan Type (Optional)
   * <p>
   * The antenna horizontal scanning capability.
   * <p>
   * Format is L:CAS
   * <p>
   * Attribute group HorzScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString horzScanType;
  /**
   * HorzScanSector - Horizontal Scan Sector (Optional)
   * <p>
   * The maximum horizontal sector the antenna can scan (enter 360 for a full
   * rotation).
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group HorzScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanSector", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzScanSector;
  /**
   * VertScanSpeed - Vertical Scan Speed (Optional)
   * <p>
   * The number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group VertScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanSpeed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal vertScanSpeed;
  /**
   * VertScanRate - Vertical Scan Rate (Optional)
   * <p>
   * The number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group VertScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanRate", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger vertScanRate;
  /**
   * VertScanType - Vertical Scan Type (Optional)
   * <p>
   * The antenna vertical scanning capability.
   * <p>
   * Format is L:CAS
   * <p>
   * Attribute group VertScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString vertScanType;
  /**
   * VertScanAngleMin - Vertical Scan Minimum Angle (Optional)
   * <p>
   * The minimum limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanAngleMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMin;
  /**
   * VertScanAngleMax - Vertical Scan Maximum Angle (Optional)
   * <p>
   * The maximum limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanAngleMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMax;
  /**
   * RotationDirection - Rotation Direction (Optional)
   * <p>
   * The antenna direction of rotation or motion.
   * <p>
   * Format is L:CRD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RotationDirection", required = false)
  private TString rotationDirection;
  /**
   * RotationRateMin - Minimum or Nominal Rotation Rate (Required)
   * <p>
   * The nominal or minimum antenna rotation rate.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RotationRateMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_2.class)
  private TDecimal rotationRateMin;
  /**
   * RotationRateMax - Maximum Rotation Rate (Optional)
   * <p>
   * If applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RotationRateMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_2.class)
  private TDecimal rotationRateMax;
  /**
   * HorzBwMin - Minimum or Nominal Horizontal Beamwidth (Optional)
   * <p>
   * The minimum or nominal horizontal beamwidth.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMin;
  /**
   * HorzBwMax - Maximum Horizontal Beamwidth (Optional)
   * <p>
   * The maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMax;
  /**
   * VertBwMin - Minimum or Nominal Vertical Beamwidth (Optional)
   * <p>
   * The minimum or nominal vertical beamwidth.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMin;
  /**
   * VertBwMax - Maximum Vertical Beamwidth (Optional)
   * <p>
   * The maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMax;
  /**
   * BeamType - Beam Type (Optional)
   * <p>
   * One of the codes describing the shape or type of the antenna main beam.
   * <p>
   * Format is L:CBD
   * <p>
   * Attribute group Beamwidth (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BeamType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString beamType;
  /**
   * MaxPower - Maximum Allowed Power (Optional)
   * <p>
   * The maximum level of input power.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxPower", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal maxPower;
  /**
   * PortIsolation - Port Isolation (Optional)
   * <p>
   * The power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PortIsolation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal portIsolation;

  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  /**
   * AntGain (Optional)
   * <p>
   * AntGain indicates the antenna gain, in decibels with reference to an
   * isotropic source (dBi), in the direction of maximum radiation.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntGain")
  private List<AntGain> antGain;
  /**
   * AntFreqs (Optional)
   * <p>
   * AntFreqs contains the antenna's designed tuning range, or the discrete
   * operating frequency.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntFreqs")
  private List<AntFreqs> antFreqs;
  /**
   * AntPattern (Optional)
   * <p>
   * AntPattern contains an antenna pattern diagram on a specific plane. General
   * pattern cuts can be defined by a spherical coordinate system with the
   * electrical boresite of the antenna oriented in the direction of the Z-axis.
   * At different values of phi, pattern cuts can be taken with theta as the
   * dependent variable. These will be great circle cuts through the main-beam
   * peak.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntPattern")
  private List<AntPattern> antPattern;
  /**
   * AntEfficiency (Optional)
   * <p>
   * AntEfficiency describes the antenna efficiency at various frequencies
   * within the frequency range of the antenna.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntEfficiency")
  private List<AntEfficiency> antEfficiency;
  /**
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VSWR")
  private List<VSWR> vswr;

  /**
   * Get a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   * <p>
   * @param value the ModeID value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @return the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
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
   * Get In Data Item ModeUse, indicate if the mode is used for transmit,
   * receive, or both transmit and receive.
   * <p>
   * @return the ModeUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeUse() {
    return modeUse;
  }

  /**
   * Set In Data Item ModeUse, indicate if the mode is used for transmit,
   * receive, or both transmit and receive.
   * <p>
   * @param value the ModeUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModeUse(TString value) {
    this.modeUse = value;
  }

  /**
   * Determine if the ModeUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeUse() {
    return (this.modeUse != null ? this.modeUse.isSetValue() : false);
  }

  /**
   * Get the general category for the movement of a scanning or tracking
   * antenna.
   * <p>
   * @return the MotionType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMotionType() {
    return motionType;
  }

  /**
   * Set the general category for the movement of a scanning or tracking
   * antenna.
   * <p>
   * @param value the MotionType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMotionType(TString value) {
    this.motionType = value;
  }

  /**
   * Determine if the MotionType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMotionType() {
    return (this.motionType != null ? this.motionType.isSetValue() : false);
  }

  /**
   * Get "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * @return the SectBlanking value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Set "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * @param value the SectBlanking value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSectBlanking(TString value) {
    this.sectBlanking = value;
  }

  /**
   * Determine if the SectBlanking is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSectBlanking() {
    return (this.sectBlanking != null ? this.sectBlanking.isSetValue() : false);
  }

  /**
   * Get the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @return the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @param value the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPolarisationType(TString value) {
    this.polarisationType = value;
  }

  /**
   * Determine if the PolarisationType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationType() {
    return (this.polarisationType != null ? this.polarisationType.isSetValue() : false);
  }

  /**
   * Get the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * @return the PolarisationAngle value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPolarisationAngle() {
    return polarisationAngle;
  }

  /**
   * Set the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * @param value the PolarisationAngle value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPolarisationAngle(TDecimal value) {
    this.polarisationAngle = value;
  }

  /**
   * Determine if the PolarisationAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationAngle() {
    return (this.polarisationAngle != null ? this.polarisationAngle.isSetValue() : false);
  }

  /**
   * Get the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time.
   * <p>
   * @return the HorzScanSpeed value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getHorzScanSpeed() {
    return horzScanSpeed;
  }

  /**
   * Set the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time.
   * <p>
   * @param value the HorzScanSpeed value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setHorzScanSpeed(TDecimal value) {
    this.horzScanSpeed = value;
  }

  /**
   * Determine if the HorzScanSpeed is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanSpeed() {
    return (this.horzScanSpeed != null ? this.horzScanSpeed.isSetValue() : false);
  }

  /**
   * Get the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @return the HorzScanRate value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getHorzScanRate() {
    return horzScanRate;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @param value the HorzScanRate value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setHorzScanRate(TInteger value) {
    this.horzScanRate = value;
  }

  /**
   * Determine if the HorzScanRate is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanRate() {
    return (this.horzScanRate != null ? this.horzScanRate.isSetValue() : false);
  }

  /**
   * Get the antenna horizontal scanning capability.
   * <p>
   * @return the HorzScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getHorzScanType() {
    return horzScanType;
  }

  /**
   * Set the antenna horizontal scanning capability.
   * <p>
   * @param value the HorzScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setHorzScanType(TString value) {
    this.horzScanType = value;
  }

  /**
   * Determine if the HorzScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanType() {
    return (this.horzScanType != null ? this.horzScanType.isSetValue() : false);
  }

  /**
   * Get the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   * <p>
   * @return the HorzScanSector value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getHorzScanSector() {
    return horzScanSector;
  }

  /**
   * Set the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   * <p>
   * @param value the HorzScanSector value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setHorzScanSector(TDecimal value) {
    this.horzScanSector = value;
  }

  /**
   * Determine if the HorzScanSector is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanSector() {
    return (this.horzScanSector != null ? this.horzScanSector.isSetValue() : false);
  }

  /**
   * Get the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * @return the VertScanSpeed value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getVertScanSpeed() {
    return vertScanSpeed;
  }

  /**
   * Set the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * @param value the VertScanSpeed value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setVertScanSpeed(TDecimal value) {
    this.vertScanSpeed = value;
  }

  /**
   * Determine if the VertScanSpeed is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanSpeed() {
    return (this.vertScanSpeed != null ? this.vertScanSpeed.isSetValue() : false);
  }

  /**
   * Get the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * @return the VertScanRate value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getVertScanRate() {
    return vertScanRate;
  }

  /**
   * Set the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * @param value the VertScanRate value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setVertScanRate(TInteger value) {
    this.vertScanRate = value;
  }

  /**
   * Determine if the VertScanRate is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanRate() {
    return (this.vertScanRate != null ? this.vertScanRate.isSetValue() : false);
  }

  /**
   * Get the antenna vertical scanning capability.
   * <p>
   * @return the VertScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getVertScanType() {
    return vertScanType;
  }

  /**
   * Set the antenna vertical scanning capability.
   * <p>
   * @param value the VertScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setVertScanType(TString value) {
    this.vertScanType = value;
  }

  /**
   * Determine if the VertScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanType() {
    return (this.vertScanType != null ? this.vertScanType.isSetValue() : false);
  }

  /**
   * Get the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * @return the VertScanAngleMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getVertScanAngleMin() {
    return vertScanAngleMin;
  }

  /**
   * Set the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * @param value the VertScanAngleMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setVertScanAngleMin(TDecimal value) {
    this.vertScanAngleMin = value;
  }

  /**
   * Determine if the VertScanAngleMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanAngleMin() {
    return (this.vertScanAngleMin != null ? this.vertScanAngleMin.isSetValue() : false);
  }

  /**
   * Get the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @return the VertScanAngleMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getVertScanAngleMax() {
    return vertScanAngleMax;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @param value the VertScanAngleMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setVertScanAngleMax(TDecimal value) {
    this.vertScanAngleMax = value;
  }

  /**
   * Determine if the VertScanAngleMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanAngleMax() {
    return (this.vertScanAngleMax != null ? this.vertScanAngleMax.isSetValue() : false);
  }

  /**
   * Get the antenna direction of rotation or motion.
   * <p>
   * @return the RotationDirection value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRotationDirection() {
    return rotationDirection;
  }

  /**
   * Set the antenna direction of rotation or motion.
   * <p>
   * @param value the RotationDirection value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRotationDirection(TString value) {
    this.rotationDirection = value;
  }

  /**
   * Determine if the RotationDirection is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationDirection() {
    return (this.rotationDirection != null ? this.rotationDirection.isSetValue() : false);
  }

  /**
   * Get the nominal or minimum antenna rotation rate.
   * <p>
   * @return the RotationRateMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getRotationRateMin() {
    return rotationRateMin;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   * <p>
   * @param value the RotationRateMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setRotationRateMin(TDecimal value) {
    this.rotationRateMin = value;
  }

  /**
   * Determine if the RotationRateMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationRateMin() {
    return (this.rotationRateMin != null ? this.rotationRateMin.isSetValue() : false);
  }

  /**
   * Get if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * @return the RotationRateMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getRotationRateMax() {
    return rotationRateMax;
  }

  /**
   * Set if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * @param value the RotationRateMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setRotationRateMax(TDecimal value) {
    this.rotationRateMax = value;
  }

  /**
   * Determine if the RotationRateMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationRateMax() {
    return (this.rotationRateMax != null ? this.rotationRateMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal horizontal beamwidth.
   * <p>
   * @return the HorzBwMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Set the minimum or nominal horizontal beamwidth.
   * <p>
   * @param value the HorzBwMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setHorzBwMin(TDecimal value) {
    this.horzBwMin = value;
  }

  /**
   * Determine if the HorzBwMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMin() {
    return (this.horzBwMin != null ? this.horzBwMin.isSetValue() : false);
  }

  /**
   * Get the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * @return the HorzBwMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Set the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * @param value the HorzBwMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setHorzBwMax(TDecimal value) {
    this.horzBwMax = value;
  }

  /**
   * Determine if the HorzBwMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMax() {
    return (this.horzBwMax != null ? this.horzBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal vertical beamwidth.
   * <p>
   * @return the VertBwMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Set the minimum or nominal vertical beamwidth.
   * <p>
   * @param value the VertBwMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setVertBwMin(TDecimal value) {
    this.vertBwMin = value;
  }

  /**
   * Determine if the VertBwMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMin() {
    return (this.vertBwMin != null ? this.vertBwMin.isSetValue() : false);
  }

  /**
   * Get the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * @return the VertBwMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Set the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * @param value the VertBwMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setVertBwMax(TDecimal value) {
    this.vertBwMax = value;
  }

  /**
   * Determine if the VertBwMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMax() {
    return (this.vertBwMax != null ? this.vertBwMax.isSetValue() : false);
  }

  /**
   * Get one of the codes describing the shape or type of the antenna main beam.
   * <p>
   * @return the BeamType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getBeamType() {
    return beamType;
  }

  /**
   * Set one of the codes describing the shape or type of the antenna main beam.
   * <p>
   * @param value the BeamType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setBeamType(TString value) {
    this.beamType = value;
  }

  /**
   * Determine if the BeamType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBeamType() {
    return (this.beamType != null ? this.beamType.isSetValue() : false);
  }

  /**
   * Get the maximum level of input power.
   * <p>
   * @return the MaxPower value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getMaxPower() {
    return maxPower;
  }

  /**
   * Set the maximum level of input power.
   * <p>
   * @param value the MaxPower value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setMaxPower(TDecimal value) {
    this.maxPower = value;
  }

  /**
   * Determine if the MaxPower is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxPower() {
    return (this.maxPower != null ? this.maxPower.isSetValue() : false);
  }

  /**
   * Get the power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * @return the PortIsolation value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPortIsolation() {
    return portIsolation;
  }

  /**
   * Set the power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * @param value the PortIsolation value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPortIsolation(TDecimal value) {
    this.portIsolation = value;
  }

  /**
   * Determine if the PortIsolation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPortIsolation() {
    return (this.portIsolation != null ? this.portIsolation.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the ModeName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Set
   * <p>
   * @param value the ModeName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModeName(TString value) {
    this.modeName = value;
  }

  /**
   * Determine if the ModeName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeName() {
    return (this.modeName != null ? this.modeName.isSetValue() : false);
  }

  /**
   * Get the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation.
   * <p>
   * @return a {@link AntGain} instance
   * @since 3.1.0
   */
  public List<AntGain> getAntGain() {
    if (antGain == null) {
      antGain = new ArrayList<>();
    }
    return this.antGain;
  }

  /**
   * Determine if the AntGain is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntGain() {
    return ((this.antGain != null) && (!this.antGain.isEmpty()));
  }

  /**
   * Clear the AntGain field. This sets the field to null.
   */
  public void unsetAntGain() {
    this.antGain = null;
  }

  /**
   * Get the AntFreqs
   * <p>
   * Complex element AntFreqs contains the antenna's designed tuning range, or
   * the discrete operating frequency.
   * <p>
   * @return a {@link AntFreqs} instance
   * @since 3.1.0
   */
  public List<AntFreqs> getAntFreqs() {
    if (antFreqs == null) {
      antFreqs = new ArrayList<>();
    }
    return this.antFreqs;
  }

  /**
   * Determine if the AntFreqs is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntFreqs() {
    return ((this.antFreqs != null) && (!this.antFreqs.isEmpty()));
  }

  /**
   * Clear the AntFreqs field. This sets the field to null.
   */
  public void unsetAntFreqs() {
    this.antFreqs = null;
  }

  /**
   * Get the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @return a {@link AntPattern} instance
   * @since 3.1.0
   */
  public List<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new ArrayList<>();
    }
    return this.antPattern;
  }

  /**
   * Determine if the AntPattern is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntPattern() {
    return ((this.antPattern != null) && (!this.antPattern.isEmpty()));
  }

  /**
   * Clear the AntPattern field. This sets the field to null.
   */
  public void unsetAntPattern() {
    this.antPattern = null;
  }

  /**
   * Get the AntEfficiency
   * <p>
   * Complex element AntEfficiency describes the antenna efficiency at various
   * frequencies within the frequency range of the antenna.
   * <p>
   * @return a {@link AntEfficiency} instance
   * @since 3.1.0
   */
  public List<AntEfficiency> getAntEfficiency() {
    if (antEfficiency == null) {
      antEfficiency = new ArrayList<>();
    }
    return this.antEfficiency;
  }

  /**
   * Determine if the AntEfficiency is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntEfficiency() {
    return ((this.antEfficiency != null) && (!this.antEfficiency.isEmpty()));
  }

  /**
   * Clear the AntEfficiency field. This sets the field to null.
   */
  public void unsetAntEfficiency() {
    this.antEfficiency = null;
  }

  /**
   * Get the VSWR
   * <p>
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * @return a {@link VSWR} instance
   * @since 3.1.0
   */
  public List<VSWR> getVSWR() {
    if (vswr == null) {
      vswr = new ArrayList<>();
    }
    return this.vswr;
  }

  /**
   * Determine if the VSWR is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVSWR() {
    return ((this.vswr != null) && (!this.vswr.isEmpty()));
  }

  /**
   * Clear the VSWR field. This sets the field to null.
   */
  public void unsetVSWR() {
    this.vswr = null;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set In Data Item ModeUse, indicate if the mode is used for transmit,
   * receive, or both transmit and receive.
   * <p>
   * @param value An instances of type {@link ListCAU}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withModeUse(ListCAU value) {
    setModeUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the general category for the movement of a scanning or tracking
   * antenna.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withMotionType(String value) {
    setMotionType(new TString(value));
    return this;
  }

  /**
   * Set "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withSectBlanking(ListCBO value) {
    setSectBlanking(new TString(value.value()));
    return this;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withPolarisationType(String value) {
    setPolarisationType(new TString(value));
    return this;
  }

  /**
   * Set the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withPolarisationAngle(Double value) {
    setPolarisationAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzScanSpeed(Double value) {
    setHorzScanSpeed(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzScanRate(Integer value) {
    setHorzScanRate(new TInteger(value));
    return this;
  }

  /**
   * Set the antenna horizontal scanning capability.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzScanType(String value) {
    setHorzScanType(new TString(value));
    return this;
  }

  /**
   * Set the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzScanSector(Double value) {
    setHorzScanSector(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertScanSpeed(Double value) {
    setVertScanSpeed(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertScanRate(Integer value) {
    setVertScanRate(new TInteger(value));
    return this;
  }

  /**
   * Set the antenna vertical scanning capability.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertScanType(String value) {
    setVertScanType(new TString(value));
    return this;
  }

  /**
   * Set the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertScanAngleMin(Double value) {
    setVertScanAngleMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertScanAngleMax(Double value) {
    setVertScanAngleMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the antenna direction of rotation or motion.
   * <p>
   * @param value An instances of type {@link ListCRD}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withRotationDirection(ListCRD value) {
    setRotationDirection(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withRotationRateMin(Double value) {
    setRotationRateMin(new TDecimal(value));
    return this;
  }

  /**
   * Set if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withRotationRateMax(Double value) {
    setRotationRateMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal horizontal beamwidth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzBwMin(Double value) {
    setHorzBwMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzBwMax(Double value) {
    setHorzBwMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal vertical beamwidth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertBwMin(Double value) {
    setVertBwMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertBwMax(Double value) {
    setVertBwMax(new TDecimal(value));
    return this;
  }

  /**
   * Set one of the codes describing the shape or type of the antenna main beam.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withBeamType(String value) {
    setBeamType(new TString(value));
    return this;
  }

  /**
   * Set the maximum level of input power.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withMaxPower(Double value) {
    setMaxPower(new TDecimal(value));
    return this;
  }

  /**
   * Set the power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withPortIsolation(Double value) {
    setPortIsolation(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  /**
   * Set the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation.
   * <p>
   * @param values One or more instances of type {@link AntGain...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntGain(AntGain... values) {
    if (values != null) {
      getAntGain().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation.
   * <p>
   * @param values A collection of {@link AntGain} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntGain(Collection<AntGain> values) {
    if (values != null) {
      getAntGain().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntFreqs
   * <p>
   * Complex element AntFreqs contains the antenna's designed tuning range, or
   * the discrete operating frequency.
   * <p>
   * @param values One or more instances of type {@link AntFreqs...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntFreqs(AntFreqs... values) {
    if (values != null) {
      getAntFreqs().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntFreqs
   * <p>
   * Complex element AntFreqs contains the antenna's designed tuning range, or
   * the discrete operating frequency.
   * <p>
   * @param values A collection of {@link AntFreqs} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntFreqs(Collection<AntFreqs> values) {
    if (values != null) {
      getAntFreqs().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @param values One or more instances of type {@link AntPattern...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntPattern(AntPattern... values) {
    if (values != null) {
      getAntPattern().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @param values A collection of {@link AntPattern} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntPattern(Collection<AntPattern> values) {
    if (values != null) {
      getAntPattern().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntEfficiency
   * <p>
   * Complex element AntEfficiency describes the antenna efficiency at various
   * frequencies within the frequency range of the antenna.
   * <p>
   * @param values One or more instances of type {@link AntEfficiency...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntEfficiency(AntEfficiency... values) {
    if (values != null) {
      getAntEfficiency().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntEfficiency
   * <p>
   * Complex element AntEfficiency describes the antenna efficiency at various
   * frequencies within the frequency range of the antenna.
   * <p>
   * @param values A collection of {@link AntEfficiency} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntEfficiency(Collection<AntEfficiency> values) {
    if (values != null) {
      getAntEfficiency().addAll(values);
    }
    return this;
  }

  /**
   * Set the VSWR
   * <p>
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * @param values One or more instances of type {@link VSWR...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVSWR(VSWR... values) {
    if (values != null) {
      getVSWR().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the VSWR
   * <p>
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * @param values A collection of {@link VSWR} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVSWR(Collection<VSWR> values) {
    if (values != null) {
      getVSWR().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AntMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntMode {"
      + (polarisationType != null ? " polarisationType [" + polarisationType + "]" : "")
      + (horzBwMin != null ? " horzBwMin [" + horzBwMin + "]" : "")
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (vertScanType != null ? " vertScanType [" + vertScanType + "]" : "")
      + (modeName != null ? " modeName [" + modeName + "]" : "")
      + (vertScanAngleMin != null ? " vertScanAngleMin [" + vertScanAngleMin + "]" : "")
      + (vertScanAngleMax != null ? " vertScanAngleMax [" + vertScanAngleMax + "]" : "")
      + (horzScanType != null ? " horzScanType [" + horzScanType + "]" : "")
      + (horzScanRate != null ? " horzScanRate [" + horzScanRate + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (rotationRateMax != null ? " rotationRateMax [" + rotationRateMax + "]" : "")
      + (beamType != null ? " beamType [" + beamType + "]" : "")
      + (antEfficiency != null ? " antEfficiency [" + antEfficiency + "]" : "")
      + (antPattern != null ? " antPattern [" + antPattern + "]" : "")
      + (horzScanSpeed != null ? " horzScanSpeed [" + horzScanSpeed + "]" : "")
      + (vertScanSpeed != null ? " vertScanSpeed [" + vertScanSpeed + "]" : "")
      + (portIsolation != null ? " portIsolation [" + portIsolation + "]" : "")
      + (sectBlanking != null ? " sectBlanking [" + sectBlanking + "]" : "")
      + (vertScanRate != null ? " vertScanRate [" + vertScanRate + "]" : "")
      + (polarisationAngle != null ? " polarisationAngle [" + polarisationAngle + "]" : "")
      + (motionType != null ? " motionType [" + motionType + "]" : "")
      + (rotationRateMin != null ? " rotationRateMin [" + rotationRateMin + "]" : "")
      + (maxPower != null ? " maxPower [" + maxPower + "]" : "")
      + (horzBwMax != null ? " horzBwMax [" + horzBwMax + "]" : "")
      + (vertBwMax != null ? " vertBwMax [" + vertBwMax + "]" : "")
      + (antFreqs != null ? " antFreqs [" + antFreqs + "]" : "")
      + (horzScanSector != null ? " horzScanSector [" + horzScanSector + "]" : "")
      + (vertBwMin != null ? " vertBwMin [" + vertBwMin + "]" : "")
      + (antGain != null ? " antGain [" + antGain + "]" : "")
      + (modeUse != null ? " modeUse [" + modeUse + "]" : "")
      + (vswr != null ? " vswr [" + vswr + "]" : "")
      + (rotationDirection != null ? " rotationDirection [" + rotationDirection + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntMode} requires {@link TString ModeID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetModeID();
  }

}
