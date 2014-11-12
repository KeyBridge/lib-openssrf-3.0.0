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
package us.gov.dod.standard.ssrf._3_0.ssreply;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.SSReply;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * CommentSource is used to provide comments to a SSRequest. It can also be used
 * to certify supportability.
 * <p>
 * Element of {@link SSReply}
 * <p>
 * Sub-Element is {@link Comment}
 * <p>
 * Example:
 * <pre>
 * &lt;Comment Source&gt;
 *   &lt;Author  cls="U"&gt;Barry Commenter&lt;/Author &gt;
 *   &lt;Date  cls="U"&gt;2014-01-01&lt;/Date &gt;
 *   &lt;JobTitle  cls="U"&gt;Big Kahuna&lt;/JobTitle &gt;
 *    &lt;Source cls=”U”&gt;NTIA Redbook page 235&lt;/Source&gt;
 *   &lt;Comment cls="U" idx="1"&gt;Assignments will be granted on case-by-case basis.&lt;/Comment&gt;
 * &lt;/Comment Source&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentSource", propOrder = {
  "source",
  "author",
  "jobTitle",
  "date",
  "comment"
})
public class CommentSource {

  /**
   * Source - Comment Source (Optional)
   * <p>
   * The name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Source", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString source;
  /**
   * Author - Comment Author (Optional)
   * <p>
   * The title (e.g., Ms., Dr.) and name of the individual that is the source of
   * the comment.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Author", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString author;
  /**
   * JobTitle - Author Job Title (Optional)
   * <p>
   * The title or position of the comment author.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JobTitle", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString jobTitle;
  /**
   * Date - Comment Date (Optional)
   * <p>
   * The date the comment was provided.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Date", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  /**
   * Comment (Optional)
   * <p>
   * Comment contains the comment provided by the Host Nation or Administration
   * regarding an equipment supportability.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Comment", nillable = true)
  private List<Comment> comment;

  /**
   * Get the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * @return the Source value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSource() {
    return source;
  }

  /**
   * Set the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * @param value the Source value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSource(TString value) {
    this.source = value;
  }

  /**
   * Determine if the Source is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSource() {
    return (this.source != null ? this.source.isSetValue() : false);
  }

  /**
   * Get the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
   * <p>
   * @return the Author value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAuthor() {
    return author;
  }

  /**
   * Set the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
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
   * Get the title or position of the comment author.
   * <p>
   * @return the JobTitle value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getJobTitle() {
    return jobTitle;
  }

  /**
   * Set the title or position of the comment author.
   * <p>
   * @param value the JobTitle value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setJobTitle(TString value) {
    this.jobTitle = value;
  }

  /**
   * Determine if the JobTitle is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJobTitle() {
    return (this.jobTitle != null ? this.jobTitle.isSetValue() : false);
  }

  /**
   * Get the date the comment was provided.
   * <p>
   * @return the Date value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Set the date the comment was provided.
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
   * Get the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @return a {@link Comment} instance
   * @since 3.1.0
   */
  public List<Comment> getComment() {
    if (comment == null) {
      comment = new ArrayList<>();
    }
    return this.comment;
  }

  /**
   * Determine if the Comment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetComment() {
    return ((this.comment != null) && (!this.comment.isEmpty()));
  }

  /**
   * Clear the Comment field. This sets the field to null.
   */
  public void unsetComment() {
    this.comment = null;
  }

  /**
   * Set the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withSource(String value) {
    setSource(new TString(value));
    return this;
  }

  /**
   * Set the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withAuthor(String value) {
    setAuthor(new TString(value));
    return this;
  }

  /**
   * Set the title or position of the comment author.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withJobTitle(String value) {
    setJobTitle(new TString(value));
    return this;
  }

  /**
   * Set the date the comment was provided.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date the comment was provided.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withDate(Date value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @param values One or more instances of type {@link Comment...}
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withComment(Comment... values) {
    if (values != null) {
      getComment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @param values A collection of {@link Comment} instances
   * @return The current CommentSource object instance
   * @since 3.1.0
   */
  public CommentSource withComment(Collection<Comment> values) {
    if (values != null) {
      getComment().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this CommentSource instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CommentSource {"
      + (author != null ? " author [" + author + "]" : "")
      + (source != null ? " source [" + source + "]" : "")
      + (comment != null ? " comment [" + comment + "]" : "")
      + (date != null ? " date [" + date + "]" : "")
      + (jobTitle != null ? " jobTitle [" + jobTitle + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CommentSource} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
