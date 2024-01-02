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
public class URLS {
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
   * An array of integers indicating the offsets within the Tweet text where the URL begins and ends. The first integer represents the location of the first character of the URL in the Tweet text. The second integer represents the location of the first non-URL character occurring after the URL (or the end of the string if the URL is the last part of the Tweet text).
   * Example:
   */
  private int[] indices;

  public int[] getIndices() {
    return indices;
  }

  public void setIndices(int[] value) {
    this.indices = value;
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

}