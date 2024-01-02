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
public class Tweet {
  /**
   * UTC time when this Tweet was created.
   */
  private String createdAt;

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String value) {
    this.createdAt = value;
  }

  /**
   * Indicates approximately how many times this Tweet has been "favorited" by Twitter users.
   */
  private int favoriteCount;

  public int getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(int value) {
    this.favoriteCount = value;
  }

  /**
   * Nullable. Perspectival. Indicates whether this Tweet has been favorited by the authenticating user.
   */
  private boolean favorited;

  public boolean getFavorited() {
    return favorited;
  }

  public void setFavorited(boolean value) {
    this.favorited = value;
  }

  /**
   * Indicates the maximum value of the filterLevel parameter which may be used and still stream this Tweet. So a value of medium will be streamed on none, low, and medium streams.
   */
  private String filterLevel;

  public String getFilterLevel() {
    return filterLevel;
  }

  public void setFilterLevel(String value) {
    this.filterLevel = value;
  }

  /**
   * Deprecated. Nullable. Use the "coordinates" field instead.
   */
  private String geo;

  public String getGeo() {
    return geo;
  }

  public void setGeo(String value) {
    this.geo = value;
  }

  /**
   * The integer representation of the unique identifier for this Tweet. This number is greater than 53 bits and some programming languages may have difficulty/silent defects in interpreting it. Using a signed 64 bit integer for storing this identifier is safe. Use idStr for fetching the identifier to stay on the safe side. See Twitter IDs, JSON and Snowflake.
   */
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int value) {
    this.id = value;
  }

  /**
   * The string representation of the unique identifier for this Tweet. Implementations should use this rather than the large integer in id.
   */
  private String idStr;

  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String value) {
    this.idStr = value;
  }

  /**
   * Nullable. If the represented Tweet is a reply, this field will contain the screen name of the original Tweet's author.
   */
  private String inReplyToScreenName;

  public String getInReplyToScreenName() {
    return inReplyToScreenName;
  }

  public void setInReplyToScreenName(String value) {
    this.inReplyToScreenName = value;
  }

  /**
   * Nullable. If the represented Tweet is a reply, this field will contain the integer representation of the original Tweet's ID.
   */
  private int inReplyToStatusId;

  public int getInReplyToStatusId() {
    return inReplyToStatusId;
  }

  public void setInReplyToStatusId(int value) {
    this.inReplyToStatusId = value;
  }

  /**
   * Nullable. If the represented Tweet is a reply, this field will contain the string representation of the original Tweet's ID.
   */
  private String inReplyToStatusIdStr;

  public String getInReplyToStatusIdStr() {
    return inReplyToStatusIdStr;
  }

  public void setInReplyToStatusIdStr(String value) {
    this.inReplyToStatusIdStr = value;
  }

  /**
   * Nullable. If the represented Tweet is a reply, this field will contain the integer representation of the original Tweet's author ID. This will not necessarily always be the user directly mentioned in the Tweet.
   */
  private int inReplyToUserId;

  public int getInReplyToUserId() {
    return inReplyToUserId;
  }

  public void setInReplyToUserId(int value) {
    this.inReplyToUserId = value;
  }

  /**
   * Nullable. If the represented Tweet is a reply, this field will contain the string representation of the original Tweet's author ID. This will not necessarily always be the user directly mentioned in the Tweet.
   */
  private String inReplyToUserIdStr;

  public String getInReplyToUserIdStr() {
    return inReplyToUserIdStr;
  }

  public void setInReplyToUserIdStr(String value) {
    this.inReplyToUserIdStr = value;
  }

  /**
   * When present, indicates a BCP 47 language identifier corresponding to the machine-detected language of the Tweet text, or "und" if no language could be detected.
   */
  private String lang;

  public String getLang() {
    return lang;
  }

  public void setLang(String value) {
    this.lang = value;
  }

  /**
   * Number of times this Tweet has been retweeted. This field is no longer capped at 99 and will not turn into a String for "100+"
   */
  private int retweetCount;

  public int getRetweetCount() {
    return retweetCount;
  }

  public void setRetweetCount(int value) {
    this.retweetCount = value;
  }

  /**
   * Perspectival. Indicates whether this Tweet has been retweeted by the authenticating user.
   */
  private boolean retweeted;

  public boolean getRetweeted() {
    return retweeted;
  }

  public void setRetweeted(boolean value) {
    this.retweeted = value;
  }

  /**
   * Utility used to post the Tweet, as an HTML-formatted string. Tweets from the Twitter website have a source value of web.
   */
  private String source;

  public String getSource() {
    return source;
  }

  public void setSource(String value) {
    this.source = value;
  }

  /**
   * The actual UTF-8 text of the status update. See twitter-text for details on what is currently considered valid characters.
   */
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String value) {
    this.text = value;
  }

  /**
   * Indicates whether the value of the text parameter was truncated, for example, as a result of a retweet exceeding the 140 character Tweet length. Truncated text will end in ellipsis, like this ... Since Twitter now rejects long Tweets vs truncating them, the large majority of Tweets will have this set to false.
   * Note that while native retweets may have their toplevel text property shortened, the original text will be available under the retweetedStatus object and the truncated parameter will be set to the value of the original status (in most cases, false).
   */
  private boolean truncated;

  public boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(boolean value) {
    this.truncated = value;
  }

  /**
   * This field only surfaces when a tweet contains a link. The meaning of the field doesn't pertain to the tweet content itself, but instead it is an indicator that the URL contained in the tweet may contain content or media identified as sensitive content.
   */
  private boolean possiblySensitive;

  public boolean getPossiblySensitive() {
    return possiblySensitive;
  }

  public void setPossiblySensitive(boolean value) {
    this.possiblySensitive = value;
  }

  /**
   * When present and set to "true", it indicates that this piece of content has been withheld due to a DMCA complaint.
   */
  private boolean withheldCopyright;

  public boolean getWithheldCopyright() {
    return withheldCopyright;
  }

  public void setWithheldCopyright(boolean value) {
    this.withheldCopyright = value;
  }

  /**
   * When present, indicates a list of uppercase two-letter country codes this content is withheld from. Twitter supports the following non-country values for this field:
   * "XX" - Content is withheld in all countries
   * "XY" - Content is withheld due to a DMCA request.
   */
  private String[] withheldInCountries;

  public String[] getWithheldInCountries() {
    return withheldInCountries;
  }

  public void setWithheldInCountries(String[] value) {
    this.withheldInCountries = value;
  }

  /**
   * When present, indicates whether the content being withheld is the "status" or a "user".
   */
  private String withheldScope;

  public String getWithheldScope() {
    return withheldScope;
  }

  public void setWithheldScope(String value) {
    this.withheldScope = value;
  }

  /**
   * Entities which have been parsed out of the text of the Tweet.
   */
  private Entities entities;

  public Entities getEntities() {
    return entities;
  }

  public void setEntities(Entities value) {
    this.entities = value;
  }

  /**
   * The user who posted this Tweet. Perspectival attributes embedded within this object are unreliable.
   */
  private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User value) {
    this.user = value;
  }

  /**
   * Represents the geographic location of this Tweet as reported by the user or client application.
   */
  private Coordinates coordinates;

  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates value) {
    this.coordinates = value;
  }

  /**
   * When present, indicates that the tweet is associated (but not necessarily originating from) a Place.
   */
  private Place[] places;

  public Place[] getPlaces() {
    return places;
  }

  public void setPlaces(Place[] value) {
    this.places = value;
  }

  /**
   * An collection of brief user objects (usually only one) indicating users who contributed to the authorship of the tweet, on behalf of the official tweet author.
   */
  private Contributor[] contributors;

  public Contributor[] getContributors() {
    return contributors;
  }

  public void setContributors(Contributor[] value) {
    this.contributors = value;
  }

}