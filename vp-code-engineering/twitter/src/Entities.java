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
 * Entities provide metadata and additional contextual information about content posted on Twitter. Entities are never divorced from the content they describe. In API v1.1, entities are returned wherever Tweets are found in the API. Entities are instrumental in resolving URLs.
 */
public class Entities {
  /**
   * An array of hashtags extracted from the Tweet text.
   */
  private Hashtag[] hashtags;

  public Hashtag[] getHashtags() {
    return hashtags;
  }

  public void setHashtags(Hashtag[] value) {
    this.hashtags = value;
  }

  /**
   * Represents URLs included in the text of a Tweet or within textual fields of a user object.
   */
  private URLS urls;

  public URLS getUrls() {
    return urls;
  }

  public void setUrls(URLS value) {
    this.urls = value;
  }

  /**
   * Represents other Twitter users mentioned in the text of the Tweet.
   */
  private UserMention[] userMentions;

  public UserMention[] getUserMentions() {
    return userMentions;
  }

  public void setUserMentions(UserMention[] value) {
    this.userMentions = value;
  }

  private Media[] medias;

  public Media[] getMedias() {
    return medias;
  }

  public void setMedias(Media[] value) {
    this.medias = value;
  }

  /**
   * An array of financial symbols starting with the dollar sign extracted from the Tweet text.
   */
  private Symbol[] symbols;

  public Symbol[] getSymbols() {
    return symbols;
  }

  public void setSymbols(Symbol[] value) {
    this.symbols = value;
  }

}