package com.example.android.miwok;

/**
 * Created by tachagon on 16/8/2560.
 */

public class Word {

    // Word in primary language
    private String mDefaultTranslation;

    // Word in Mowok language
    private String mMiwokTranslation;

    /**
     * Constructs a new word
     *
     * @param defaultTranslation for word in primary language
     * @param miwokTranslation   for word in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    /**
     * Sets the primary word
     *
     * @param defaultTranslation for word in primary language
     */
    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    /**
     * Sets the Miwok word
     *
     * @param miwokTranslation for word in Miwok language
     */
    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
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

}
