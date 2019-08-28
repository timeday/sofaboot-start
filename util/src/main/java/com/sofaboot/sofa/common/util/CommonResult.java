package com.sofaboot.sofa.common.util;

import java.io.Serializable;

public abstract class CommonResult implements Serializable {
    private static final long serialVersionUID = -897223858421062970L;
    protected boolean success = false;
    protected ErrorContext errorContext;

    public CommonResult() {
    }

    public ErrorContext getErrorContext() {
        return this.errorContext;
    }

    public Integer getTopErrorCode() {
        return this.errorContext != null && this.errorContext.getErrorCode() != null ? this.errorContext.getErrorCode(): null;
    }

    public String getTopErrorReason() {
        return this.errorContext != null && this.errorContext.getErrorReason() != null ? this.errorContext.getErrorReason() : null;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setErrorContext(ErrorContext errorContext) {
        this.errorContext = errorContext;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
