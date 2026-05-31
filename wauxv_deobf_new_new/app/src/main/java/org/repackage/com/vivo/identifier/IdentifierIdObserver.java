package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class IdentifierIdObserver extends ContentObserver {
    private static final String a = "VMS_SDK_Observer";
    private String b;
    private int c;
    private IdentifierIdClient d;

    public IdentifierIdObserver(IdentifierIdClient identifierIdClient, int i, String str) {
        super(null);
        this.d = identifierIdClient;
        this.c = i;
        this.b = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        IdentifierIdClient identifierIdClient = this.d;
        if (identifierIdClient != null) {
            identifierIdClient.a(this.c, this.b);
        } else {
            Log.e(a, "mIdentifierIdClient is null");
        }
    }
}
