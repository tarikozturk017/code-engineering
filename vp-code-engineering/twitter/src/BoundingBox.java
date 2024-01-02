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
 * A bounding box of coordinates which encloses this place.
 */
public class BoundingBox {
  /**
   * A series of longitude and latitude points, defining a box which will contain the Place entity this bounding box is related to. Each point is an array in the form of [longitude, latitude]. Points are grouped into an array per bounding box. Bounding box arrays are wrapped in one additional array to be compatible with the polygon notation.
   */
  private float[][] coordinates;

  public float[][] getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(float[][] value) {
    this.coordinates = value;
  }

  /**
   * The type of data encoded in the coordinates property. This will be "Polygon" for bounding boxes.
   */
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String value) {
    this.type = value;
  }

}