package com.umeng.ccg;

import android.content.Context;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ActionInfo {
    String getModule(Context context);

    String[] getSupportAction(Context context);

    boolean getSwitchState(Context context, String str);

    void onCommand(Context context, String str, Object obj);
}
