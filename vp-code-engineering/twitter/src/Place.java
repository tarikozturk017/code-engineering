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
 * Places are specific, named locations with corresponding geo coordinates. They can be attached to Tweets by specifying a place_id when tweeting. Tweets associated with places are not necessarily issued from that location but could also potentially be about that location. Places can be searched for. Tweets can also be found by place_id.
 */
public class Place {
  /**
   * Name of the country containing this place.
   */
  private String country;

  public String getCountry() {
    return country;
  }

  public void setCountry(String value) {
    this.country = value;
  }

  /**
   * Shortened country code representing the country containing this place.
   */
  private String countryCode;

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String value) {
    this.countryCode = value;
  }

  /**
   * Full human-readable representation of the place's name.
   */
  private String fullName;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String value) {
    this.fullName = value;
  }

  /**
   * ID representing this place. Note that this is represented as a string, not an integer.
   */
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String value) {
    this.id = value;
  }

  /**
   * Short human-readable representation of the place's name.
   */
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  /**
   * The type of location represented by this place.
   */
  private String placeType;

  public String getPlaceType() {
    return placeType;
  }

  public void setPlaceType(String value) {
    this.placeType = value;
  }

  /**
   * URL representing the location of additional place metadata for this place.
   */
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String value) {
    this.url = value;
  }

  /**
   * A bounding box of coordinates which encloses this place.
   */
  private BoundingBox boundingBox;

  public BoundingBox getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(BoundingBox value) {
    this.boundingBox = value;
  }

  /**
   * Contains a hash of variant information about the place.
   */
  private Attributes attributes;

  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes value) {
    this.attributes = value;
  }

}