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
public class Hashtag {
  /**
   * An array of integers indicating the offsets within the Tweet text where the hashtag begins and ends. The first integer represents the location of the # character in the Tweet text string. The second integer represents the location of the first character after the hashtag. Therefore the difference between the two numbers will be the length of the hashtag name plus one (for the '#' character).
   */
  private int[] indices;

  public int[] getIndices() {
    return indices;
  }

  public void setIndices(int[] value) {
    this.indices = value;
  }

  /**
   * Name of the hashtag, minus the leading '#' character.
   */
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String value) {
    this.text = value;
  }

}