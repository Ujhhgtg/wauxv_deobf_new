package com.alibaba.fastjson2.schema;

import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ValidateResult {
    final Object[] args;
    final ValidateResult cause;
    final String format;
    String message;
    private final boolean success;

    public ValidateResult(ValidateResult validateResult, String str, Object... objArr) {
        this.success = false;
        this.format = str;
        this.args = objArr;
        this.cause = validateResult;
        if (objArr.length == 0) {
            this.message = str;
        }
    }

    public String getMessage() {
        String str;
        String string = this.message;
        if (string == null && (str = this.format) != null) {
            Object[] objArr = this.args;
            if (objArr.length > 0) {
                string = String.format(str, objArr);
                if (this.cause != null) {
                    StringBuilder sbM2788 = AbstractC1194.m2788(string, "; ");
                    sbM2788.append(this.cause.getMessage());
                    string = sbM2788.toString();
                }
                this.message = string;
            }
        }
        return string;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public ValidateResult(boolean z, String str, Object... objArr) {
        this.success = z;
        this.format = str;
        this.args = objArr;
        this.cause = null;
        if (objArr.length == 0) {
            this.message = str;
        }
    }
}
