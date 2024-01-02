/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
/**
 * An http:// URL pointing directly to the uploaded media file.
 */
public class Media {
  /**
   * ID of the media expressed as a 64-bit integer.
   */
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int value) {
    this.id = value;
  }

  /**
   * ID of the media expressed as a string.
   */
  private String idStr;

  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String value) {
    this.idStr = value;
  }

  /**
   * An http:// URL pointing directly to the uploaded media file.
   */
  private String mediaUrl;

  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String value) {
    this.mediaUrl = value;
  }

  /**
   * An https:// URL pointing directly to the uploaded media file, for embedding on https pages.
   */
  private String mediaUrlHttps;

  public String getMediaUrlHttps() {
    return mediaUrlHttps;
  }

  public void setMediaUrlHttps(String value) {
    this.mediaUrlHttps = value;
  }

  /**
   * Wrapped URL for the media link. This corresponds with the URL embedded directly into the raw Tweet text, and the values for the indices parameter.
   */
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String value) {
    this.url = value;
  }

  /**
   * URL of the media to display to clients.
   */
  private String displayUrl;

  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String value) {
    this.displayUrl = value;
  }

  /**
   * An expanded version of display_url. Links to the media display page.
   */
  private String expandedUrl;

  public String getExpandedUrl() {
    return expandedUrl;
  }

  public void setExpandedUrl(String value) {
    this.expandedUrl = value;
  }

  /**
   * For Tweets containing media that was originally associated with a different tweet, this ID points to the original Tweet.
   */
  private int sourceStatusId;

  public int getSourceStatusId() {
    return sourceStatusId;
  }

  public void setSourceStatusId(int value) {
    this.sourceStatusId = value;
  }

  /**
   * For Tweets containing media that was originally associated with a different tweet, this string-based ID points to the original Tweet.
   */
  private int sourceStatusIdStr;

  public int getSourceStatusIdStr() {
    return sourceStatusIdStr;
  }

  public void setSourceStatusIdStr(int value) {
    this.sourceStatusIdStr = value;
  }

  /**
   * Type of uploaded media.
   */
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String value) {
    this.type = value;
  }

  /**
   * An array of integers indicating the offsets within the Tweet text where the URL begins and ends. The first integer represents the location of the first character of the URL in the Tweet text. The second integer represents the location of the first non-URL character occurring after the URL (or the end of the string if the URL is the last part of the Tweet text).
   */
  private int[] indices;

  public int[] getIndices() {
    return indices;
  }

  public void setIndices(int[] value) {
    this.indices = value;
  }

  /**
   * An object showing available sizes for the media file.
   */
  private Size[] sizes;

  public Size[] getSizes() {
    return sizes;
  }

  public void setSizes(Size[] value) {
    this.sizes = value;
  }

}