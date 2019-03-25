package com.example.jp.miwoktranslator;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mEnglishTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String englishtranslation, String miwoktranslation, int audioResourceId) {
        mMiwokTranslation = miwoktranslation;
        mEnglishTranslation = englishtranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String englishtranslation, String miwoktranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwoktranslation;
        mEnglishTranslation = englishtranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
