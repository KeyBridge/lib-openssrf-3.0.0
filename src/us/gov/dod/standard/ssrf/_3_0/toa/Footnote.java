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
package us.gov.dod.standard.ssrf._3_0.toa;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.TOA;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Footnote contains the text and identifier of a Footnote, FCC Rule Part
 * Number, Band User (e.g., "Military", "Civil Support Team"). or Band
 * Application (e.g., "Wind Profiler").
 * <p>
 * Element of {@link TOA}
 * <p>
 * Example:
 * <pre>
 * &lt; Footnote cls="U" idx="007"&gt;
 *        &lt;NoteType&gt;Band Application&lt;/NoteType&gt;
 *        &lt;Identifier&gt;&lt;/Identifier&gt;
 *        &lt;Text&gt;Sprocket 77&lt;/Text&gt;
 * &lt;/Footnote &gt;
 * &lt; Footnote cls="U" idx="117"&gt;
 *        &lt;NoteType&gt;Footnote-National&lt;/NoteType&gt;
 *        &lt;Identifier&gt;US251&lt;/Identifier&gt;
 *        &lt;Text&gt;The band 12.75-13.25 GHz is also allocated to the space research (deep space) (space-to-Earth) service for reception only at Goldstone, CA (35° 20' N, 116° 53' W).
 *        &lt;/Text&gt;
 * &lt;/Footnote &gt;
 * &lt; Footnote cls="U" idx="572"&gt;
 *        &lt;NoteType&gt;Footnote-ITU&lt;/NoteType&gt;
 *        &lt;Identifier&gt;5.54&lt;/Identifier&gt;
 *        &lt;Text&gt;Administrations conducting scientific research using frequencies below 9 kHz are urged to advise other administrations that may be concerned in order that such research may be afforded all practicable protection from harmful interference.
 *        &lt;/Text&gt;
 * &lt;/Footnote &gt;
 * &lt; Footnote cls="U" idx="4545"&gt;
 *        &lt;NoteType&gt;FCC Part&lt;/NoteType&gt;
 *        &lt;Identifier&gt;(90)&lt;/Identifier&gt;
 *        &lt;Text&gt;Private Land Mobile&lt;/Text&gt;
 *    &lt;/Footnote &gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Footnote", propOrder = {
  "identifier",
  "text"
})
public class Footnote {

  /**
   * Identifier - Name (Required)
   * <p>
   * An identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Identifier", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString identifier;
  /**
   * Text - Footnote Text (Required)
   * <p>
   * The textual specification of the footnote, band user or band application.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Text", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString text;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each Footnote used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get an identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * @return the Identifier value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Set an identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
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
   * Get the textual specification of the footnote, band user or band
   * application.
   * <p>
   * @return the Text value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getText() {
    return text;
  }

  /**
   * Set the textual specification of the footnote, band user or band
   * application.
   * <p>
   * @param value the Text value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setText(TString value) {
    this.text = value;
  }

  /**
   * Determine if the Text is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetText() {
    return (this.text != null ? this.text.isSetValue() : false);
  }

  /**
   * Get a unique index for each Footnote used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Footnote used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
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
   * Set an identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Footnote object instance
   * @since 3.1.0
   */
  public Footnote withIdentifier(String value) {
    setIdentifier(new TString(value));
    return this;
  }

  /**
   * Set the textual specification of the footnote, band user or band
   * application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Footnote object instance
   * @since 3.1.0
   */
  public Footnote withText(String value) {
    setText(new TString(value));
    return this;
  }

  /**
   * Set a unique index for each Footnote used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Footnote object instance
   * @since 3.1.0
   */
  public Footnote withIdx(BigInteger value) {
    return this;
  }

  /**
   * Get a string representation of this Footnote instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Footnote {"
      + (text != null ? " text [" + text + "]" : "")
      + (idx != null ? " idx [" + idx + "]" : "")
      + (identifier != null ? " identifier [" + identifier + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Footnote} requires
   * {@link TString Identifier}, {@link TString Text}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetIdentifier() && isSetText() && isSetIdx();
  }

}
