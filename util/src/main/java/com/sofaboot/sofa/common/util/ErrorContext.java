package com.sofaboot.sofa.common.util;

import java.io.Serializable;

/**
 * @author kerry
 * @date 2019-5-22 12:04:15
 */
public class ErrorContext implements Serializable {

    private static final long serialVersionUID = 5435384052419317346L;

    private String errorReason;

    private String errorLocation;

    private Integer errorCode;

    /**
     * Gets get error code.
     *
     * @return the get error code
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets set error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets get error reason.
     *
     * @return the get error reason
     */
    public String getErrorReason() {
        return errorReason;
    }

    /**
     * Sets set error reason.
     *
     * @param errorReason the error reason
     */
    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * Gets get error location.
     *
     * @return the get error location
     */
    public String getErrorLocation() {
        return errorLocation;
    }

    /**
     * Sets set error location.
     *
     * @param errorLocation the error location
     */
    public void setErrorLocation(String errorLocation) {
        this.errorLocation = errorLocation;
    }

}
