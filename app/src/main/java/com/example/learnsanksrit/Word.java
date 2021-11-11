package com.example.learnsanksrit;

public class Word {

    private String mDefaultTranslation;

    private String mSanskritTranslation;


    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String sanskritTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mSanskritTranslation=sanskritTranslation;
    }

    public Word(String defaultTranslation, String sanskritTranslation,int imageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mSanskritTranslation=sanskritTranslation;
        mImageResourceId=imageResourceId;
    }


    public String getsanskritTranslation() {
        return mSanskritTranslation;
    }

    public String getdefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
