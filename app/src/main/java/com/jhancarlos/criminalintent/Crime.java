package com.jhancarlos.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private int mSeverity;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
        mSeverity = 2;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public int getSeverity() {
        return mSeverity;
    }

    public void setSeverity(int severity) {
        mSeverity = severity;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
