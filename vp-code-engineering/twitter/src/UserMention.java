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
public class UserMention {
  /**
   * ID of the mentioned user, as an integer.
   */
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int value) {
    this.id = value;
  }

  /**
   * If of the mentioned user, as a string.
   */
  private String id_str;

  public String getId_str() {
    return id_str;
  }

  public void setId_str(String value) {
    this.id_str = value;
  }

  /**
   * Screen name of the referenced user.
   */
  private String screenName;

  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String value) {
    this.screenName = value;
  }

  /**
   * Display name of the referenced user.
   */
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  /**
   * An array of integers representing the offsets within the Tweet text where the user reference begins and ends. The first integer represents the location of the '@' character of the user mention. The second integer represents the location of the first non-screenname character following the user mention.
   */
  private int[] indices;

  public int[] getIndices() {
    return indices;
  }

  public void setIndices(int[] value) {
    this.indices = value;
  }

}