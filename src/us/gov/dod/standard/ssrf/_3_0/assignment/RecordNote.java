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
package us.gov.dod.standard.ssrf._3_0.assignment;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * RecordNote (US) contains a reference to a formal host nation "note" and
 * specific comments.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNote", propOrder = {
  "noteRef",
  "comments"
})
public class RecordNote {

  /**
   * US:NoteRef - Note Reference (Required)
   * <p>
   * A reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NoteRef", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial noteRef;
  /**
   * US:Comments - Comments (Optional)
   * <p>
   * The Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Comments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString comments;

  /**
   * Get a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @return the NoteRef value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getNote()} instead.
   */
  @Deprecated
  public TSerial getNoteRef() {
    return noteRef;
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @param value the NoteRef value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setNote(Note)} instead.
   */
  @Deprecated
  public void setNoteRef(TSerial value) {
    this.noteRef = value;
  }

  /**
   * Determine if the NoteRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoteRef() {
    return (this.noteRef != null ? this.noteRef.isSetValue() : false);
  }

  /**
   * Get the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @return the Comments value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getComments() {
    return comments;
  }

  /**
   * Set the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @param value the Comments value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setComments(TString value) {
    this.comments = value;
  }

  /**
   * Determine if the Comments is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetComments() {
    return (this.comments != null ? this.comments.isSetValue() : false);
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RecordNote object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withNote(Note)} instead.
   */
  @Deprecated
  public RecordNote withNoteRef(TSerial value) {
    setNoteRef(value);
    return this;
  }

  /**
   * Set the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RecordNote object instance
   * @since 3.1.0
   */
  public RecordNote withComments(String value) {
    setComments(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this RecordNote instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RecordNote {"
      + (noteRef != null ? " noteRef [" + noteRef + "]" : "")
      + (comments != null ? " comments [" + comments + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RecordNote} requires {@link TString NoteRef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNoteRef();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:NoteRef - Note Reference (Required)
   * <p>
   * A reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Note note;

  /**
   * Get a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @return a {@link Note} instance
   * @since 3.1.0
   */
  public Note getNote() {
    return note;
  }

  /**
   * Determine if the note field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNote() {
    return this.note != null;
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @param value An instances of type {@link Note}
   * @return The current RecordNote object instance
   * @since 3.1.0
   */
  public RecordNote withNote(Note value) {
    this.note = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RecordNote record.
   * <p>
   * This method builds the exported {@link #noteRef} field with values from the
   * transient {@link #note} field. This method should typically be called after
   * the RecordNote is configured and (optionally) before exporting an SSRF
   * message.
   * <p>
   * @return The current RecordNote object instance
   */
  public RecordNote build() {
    this.noteRef = note != null ? note.getSerial() : null;
    return this;
  }

  /**
   * Update the SSRF data type references in this RecordNote record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #note} with values from the
   * imported {@link #noteRef} field. This method should typically be called
   * after the RecordNote is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (noteRef == null || !noteRef.isSetValue()) {
      return;
    }
    for (Note instance : root.getNote()) {
      if (noteRef.equals(instance.getSerial())) {
        note = instance;
        return;
      }
    }
  }//</editor-fold>

}
