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
 * Users can be anyone or anything. They tweet, follow, create lists, have a home_timeline, can be mentioned, and can be looked up in bulk.
 */
public class User {
  /**
   * Indicates that the user has an account with "contributor mode" enabled, allowing for Tweets issued by the user to be co-authored by another account. Rarely true.
   */
  private boolean contributorsEnabled;

  public boolean getContributorsEnabled() {
    return contributorsEnabled;
  }

  public void setContributorsEnabled(boolean value) {
    this.contributorsEnabled = value;
  }

  /**
   * The UTC datetime that the user account was created on Twitter
   */
  private String createdAt;

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String value) {
    this.createdAt = value;
  }

  /**
   * When true, indicates that the user has not altered the theme or background of their user profile.
   */
  private boolean defaultProfile;

  public boolean getDefaultProfile() {
    return defaultProfile;
  }

  public void setDefaultProfile(boolean value) {
    this.defaultProfile = value;
  }

  /**
   * When true, indicates that the user has not uploaded their own avatar and a default egg avatar is used instead.
   */
  private boolean defaultProfileImage;

  public boolean getDefaultProfileImage() {
    return defaultProfileImage;
  }

  public void setDefaultProfileImage(boolean value) {
    this.defaultProfileImage = value;
  }

  /**
   * Nullable. The user-defined UTF-8 string describing their account.
   */
  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String value) {
    this.description = value;
  }

  /**
   * The number of tweets this user has favorited in the account's lifetime. British spelling used in the field name for historical reasons.
   */
  private int favouritesCount;

  public int getFavouritesCount() {
    return favouritesCount;
  }

  public void setFavouritesCount(int value) {
    this.favouritesCount = value;
  }

  /**
   * Nullable. Perspectival. When true, indicates that the authenticating user has issued a follow request to this protected user account.
   */
  private boolean followRequestSent;

  public boolean getFollowRequestSent() {
    return followRequestSent;
  }

  public void setFollowRequestSent(boolean value) {
    this.followRequestSent = value;
  }

  /**
   * The number of followers this account currently has. Under certain conditions of duress, this field will temporarily indicate "0".
   */
  private int followersCount;

  public int getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(int value) {
    this.followersCount = value;
  }

  /**
   * Nullable. Perspectival. Deprecated. When true, indicates that the authenticating user is following this user. Some false negatives are possible when set to "false", but these false negatives are increasingly being represented as "null" instead.
   */
  private boolean following;

  public boolean getFollowing() {
    return following;
  }

  public void setFollowing(boolean value) {
    this.following = value;
  }

  /**
   * The number of users this account is following (AKA their "followings"). Under certain conditions of duress, this field will temporarily indicate "0".
   */
  private int friendsCount;

  public int getFriendsCount() {
    return friendsCount;
  }

  public void setFriendsCount(int value) {
    this.friendsCount = value;
  }

  /**
   * When true, indicates that the user has enabled the possibility of geotagging their Tweets. This field must be true for the current user to attach geographic data when using POST statuses / update.
   */
  private boolean geoEnabled;

  public boolean getGeoEnabled() {
    return geoEnabled;
  }

  public void setGeoEnabled(boolean value) {
    this.geoEnabled = value;
  }

  /**
   * The integer representation of the unique identifier for this User. This number is greater than 53 bits and some programming languages may have difficulty/silent defects in interpreting it. Using a signed 64 bit integer for storing this identifier is safe. Use id_str for fetching the identifier to stay on the safe side.
   */
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int value) {
    this.id = value;
  }

  /**
   * The string representation of the unique identifier for this User. Implementations should use this rather than the large, possibly un-consumable integer in id.
   */
  private String idStr;

  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String value) {
    this.idStr = value;
  }

  /**
   * When true, indicates that the user is a participant in Twitter's translator community.
   */
  private boolean isTranslator;

  public boolean getIsTranslator() {
    return isTranslator;
  }

  public void setIsTranslator(boolean value) {
    this.isTranslator = value;
  }

  /**
   * The BCP 47 code for the user's self-declared user interface language. May or may not have anything to do with the content of their Tweets.
   */
  private String lang;

  public String getLang() {
    return lang;
  }

  public void setLang(String value) {
    this.lang = value;
  }

  /**
   * The number of public lists that this user is a member of.
   */
  private int listedCount;

  public int getListedCount() {
    return listedCount;
  }

  public void setListedCount(int value) {
    this.listedCount = value;
  }

  /**
   * Nullable. The user-defined location for this account's profile. Not necessarily a location nor parseable. This field will occasionally be fuzzily interpreted by the Search service.
   */
  private String location;

  public String getLocation() {
    return location;
  }

  public void setLocation(String value) {
    this.location = value;
  }

  /**
   * The name of the user, as they've defined it. Not necessarily a person's name. Typically capped at 20 characters, but subject to change.
   */
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  /**
   * The name of the user, as they've defined it. Not necessarily a person's name. TypicalNullable. Deprecated. May incorrectly report "false" at times. Indicates whether the authenticated user has chosen to receive this user's tweets by SMS.y capped at 20 characters, but subject to change.
   */
  private boolean notifications;

  public boolean getNotifications() {
    return notifications;
  }

  public void setNotifications(boolean value) {
    this.notifications = value;
  }

  /**
   * The hexadecimal color chosen by the user for their background.
   */
  private String profileBackgroundColor;

  public String getProfileBackgroundColor() {
    return profileBackgroundColor;
  }

  public void setProfileBackgroundColor(String value) {
    this.profileBackgroundColor = value;
  }

  /**
   * A HTTP-based URL pointing to the background image the user has uploaded for their profile.
   */
  private String profileBackgroundImageUrl;

  public String getProfileBackgroundImageUrl() {
    return profileBackgroundImageUrl;
  }

  public void setProfileBackgroundImageUrl(String value) {
    this.profileBackgroundImageUrl = value;
  }

  /**
   * A HTTPS-based URL pointing to the background image the user has uploaded for their profile.
   */
  private String profileBackgroundImageUrl_https;

  public String getProfileBackgroundImageUrl_https() {
    return profileBackgroundImageUrl_https;
  }

  public void setProfileBackgroundImageUrl_https(String value) {
    this.profileBackgroundImageUrl_https = value;
  }

  /**
   * When true, indicates that the user's profile_background_image_url should be tiled when displayed.
   */
  private boolean profileBackgroundTile;

  public boolean getProfileBackgroundTile() {
    return profileBackgroundTile;
  }

  public void setProfileBackgroundTile(boolean value) {
    this.profileBackgroundTile = value;
  }

  /**
   * A HTTP-based URL pointing to the user's avatar image.
   */
  private String profileImageUrl;

  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  public void setProfileImageUrl(String value) {
    this.profileImageUrl = value;
  }

  /**
   * A HTTPS-based URL pointing to the user's avatar image.
   */
  private String profileImageUrlHttps;

  public String getProfileImageUrlHttps() {
    return profileImageUrlHttps;
  }

  public void setProfileImageUrlHttps(String value) {
    this.profileImageUrlHttps = value;
  }

  /**
   * The hexadecimal color the user has chosen to display links with in their Twitter UI.
   */
  private String profileLinkColor;

  public String getProfileLinkColor() {
    return profileLinkColor;
  }

  public void setProfileLinkColor(String value) {
    this.profileLinkColor = value;
  }

  /**
   * The hexadecimal color the user has chosen to display sidebar borders with in their Twitter UI.
   */
  private String profileSidebarBorderColor;

  public String getProfileSidebarBorderColor() {
    return profileSidebarBorderColor;
  }

  public void setProfileSidebarBorderColor(String value) {
    this.profileSidebarBorderColor = value;
  }

  /**
   * The hexadecimal color the user has chosen to display sidebar backgrounds with in their Twitter UI.
   */
  private String profileSidebarFillColor;

  public String getProfileSidebarFillColor() {
    return profileSidebarFillColor;
  }

  public void setProfileSidebarFillColor(String value) {
    this.profileSidebarFillColor = value;
  }

  /**
   * The hexadecimal color the user has chosen to display text with in their Twitter UI.
   */
  private String profileTextColor;

  public String getProfileTextColor() {
    return profileTextColor;
  }

  public void setProfileTextColor(String value) {
    this.profileTextColor = value;
  }

  /**
   * When true, indicates the user wants their uploaded background image to be used.
   */
  private boolean profileUseBackgroundImage;

  public boolean getProfileUseBackgroundImage() {
    return profileUseBackgroundImage;
  }

  public void setProfileUseBackgroundImage(boolean value) {
    this.profileUseBackgroundImage = value;
  }

  /**
   * When true, indicates that this user has chosen to protect their Tweets.
   */
  private boolean protected;

  public boolean getProtected() {
    return protected;
  }

  public void setProtected(boolean value) {
    this.protected = value;
  }

  /**
   * The screen name, handle, or alias that this user identifies themselves with. screen_names are unique but subject to change. Use id_str as a user identifier whenever possible. Typically a maximum of 15 characters long, but some historical accounts may exist with longer names.
   */
  private String screenName;

  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String value) {
    this.screenName = value;
  }

  /**
   * Indicates that the user would like to see media inline. Somewhat disused.
   */
  private boolean showAllInlineMedia;

  public boolean getShowAllInlineMedia() {
    return showAllInlineMedia;
  }

  public void setShowAllInlineMedia(boolean value) {
    this.showAllInlineMedia = value;
  }

  /**
   * The number of tweets (including retweets) issued by the user.
   */
  private int statusCount;

  public int getStatusCount() {
    return statusCount;
  }

  public void setStatusCount(int value) {
    this.statusCount = value;
  }

  /**
   * Nullable. A string describing the Time Zone this user declares themselves within.
   */
  private String timeZone;

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String value) {
    this.timeZone = value;
  }

  /**
   * Nullable. A URL provided by the user in association with their profile.
   */
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String value) {
    this.url = value;
  }

  /**
   * Nullable. The offset from GMT/UTC in seconds.
   */
  private int utcOffset;

  public int getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(int value) {
    this.utcOffset = value;
  }

  /**
   * When true, indicates that the user has a verified account.
   */
  private boolean verified;

  public boolean getVerified() {
    return verified;
  }

  public void setVerified(boolean value) {
    this.verified = value;
  }

  /**
   * When present, indicates a textual representation of the two-letter country codes this user is withheld from.
   */
  private String withheldInCountries;

  public String getWithheldInCountries() {
    return withheldInCountries;
  }

  public void setWithheldInCountries(String value) {
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
   * Entities which have been parsed out of the url or description fields defined by the user.
   */
  private UserEntities userEntities;

  public UserEntities getUserEntities() {
    return userEntities;
  }

  public void setUserEntities(UserEntities value) {
    this.userEntities = value;
  }

}