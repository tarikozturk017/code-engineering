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
 * Tweets are the basic atomic building block of all things Twitter. Tweets, also known more generically as "status updates". Tweets can be embedded, replied to, favorited, unfavorited and deleted.
 */
public class TweetRequest {
  /**
   * The text of your status update, typically up to 140 characters. URL encode as necessary. t.co link wrapping may affect character counts.
   * 
   * There are some special commands in this field to be aware of. For instance, preceding a message with "D" or "M" and following it with a screen name can create a direct message to that user if the relationship allows for it.
   */
  private String status;

  public String getStatus() {
    return status;
  }

  public void setStatus(String value) {
    this.status = value;
  }

  /**
   * The ID of an existing status that the update is in reply to.
   * 
   * Note: This parameter will be ignored unless the author of the tweet this parameter references is mentioned within the status text. Therefore, you must include @username, where username is the author of the referenced tweet, within the update.
   */
  private String inReplyToStatusId;

  public String getInReplyToStatusId() {
    return inReplyToStatusId;
  }

  public void setInReplyToStatusId(String value) {
    this.inReplyToStatusId = value;
  }

  /**
   * If you upload Tweet media that might be considered sensitive content such as nudity, violence, or medical procedures, you should set this value to true. See Media setting and best practices for more context. Defaults to false.
   * 
   * Example Values: true
   */
  private boolean possiblySensitive;

  public boolean getPossiblySensitive() {
    return possiblySensitive;
  }

  public void setPossiblySensitive(boolean value) {
    this.possiblySensitive = value;
  }

  /**
   * The latitude of the location this tweet refers to. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding long parameter.
   * 
   * Example Values: 37.7821120598956
   */
  private float lat;

  public float getLat() {
    return lat;
  }

  public void setLat(float value) {
    this.lat = value;
  }

  /**
   * The longitude of the location this tweet refers to. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if geo_enabled is disabled, or if there not a corresponding lat parameter.
   * 
   * Example Values: -122.400612831116
   */
  private float longitude;

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float value) {
    this.longitude = value;
  }

  /**
   * A place in the world.
   * 
   * Example Values: df51dec6f4ee2b2c
   */
  private String placeId;

  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String value) {
    this.placeId = value;
  }

  /**
   * Whether or not to put a pin on the exact coordinates a tweet has been sent from.
   * 
   * Example Values: true
   */
  private boolean displayCoordinates;

  public boolean getDisplayCoordinates() {
    return displayCoordinates;
  }

  public void setDisplayCoordinates(boolean value) {
    this.displayCoordinates = value;
  }

  /**
   * When set to either true, t or 1, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.
   * 
   * Example Values: true
   */
  private boolean trimUser;

  public boolean getTrimUser() {
    return trimUser;
  }

  public void setTrimUser(boolean value) {
    this.trimUser = value;
  }

  /**
   * A list of media ids to associate with the Tweet. You may associated up to 4 media to a Tweet. See Uploading Media for further details on uploading media.
   * 
   * Example Values: 471592142565957632
   */
  private long mediaIds;

  public long getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(long value) {
    this.mediaIds = value;
  }

}