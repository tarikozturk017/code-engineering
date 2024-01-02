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
public class Coordinates {
  /**
   * The longitude and latitude of the Tweet's location, as an collection in the form of [longitude, latitude].
   */
  private float[] coordinates;

  public float[] getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(float[] value) {
    this.coordinates = value;
  }

  /**
   * The type of data encoded in the coordinates property. This will be "Point" for Tweet coordinates fields.
   */
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String value) {
    this.type = value;
  }

}