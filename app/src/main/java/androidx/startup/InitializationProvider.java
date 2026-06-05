package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import p000.AbstractC1252feyxiexzfUjhhgtg;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2870Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new C2870Ujhhgtgfeyxiexzf("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3591Ujhhgtgfeyxiexzf(context);
        Context context2 = (Context) c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
        try {
            try {
                AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("Startup");
                c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf.m3599Ujhhgtgfeyxiexzf(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new C2870Ujhhgtgfeyxiexzf(e);
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
