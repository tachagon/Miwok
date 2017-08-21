package com.example.android.miwok;

/**
 * Created by tachagon on 16/8/2560.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    // Word in primary language
    private String mDefaultTranslation;

    // Word in Mowok language
    private String mMiwokTranslation;

    // Image Resource
    private int mImageResourceID = Word.NO_IMAGE_PROVIDED;

    // Audio Resource
    private int mAudioResourceID;

    /**
     * Constructs a new word
     *
     * @param defaultTranslation for word in primary language
     * @param miwokTranslation   for word in Miwok language
     * @param audioResourceID    for audio resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceID = audioResourceID;
    }

    /**
     * Constructs a new word with Image
     *
     * @param defaultTranslation for word in primary language
     * @param miwokTranslation   for word in Miwok language
     * @param imageResourceID    for image resource ID
     * @param audioResourceID    for audio resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceID = imageResourceID;
        this.mAudioResourceID = audioResourceID;
    }

    /**
     * Gets the primary word
     *
     * @return primary word
     */
    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    /**
     * Gets the Miwok word
     *
     * @return Miwok word
     */
    public String getMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    /**
     * Gets image resource ID
     *
     * @return Image resource ID
     */
    public int getImageResourceID() {
        return this.mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return this.mImageResourceID != Word.NO_IMAGE_PROVIDED;
    }

    /**
     * Gets audio resource ID
     *
     * @return Audio resource ID
     */
    public int getAudioResourceID() {
        return this.mAudioResourceID;
    }

    /**
     * @return the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
