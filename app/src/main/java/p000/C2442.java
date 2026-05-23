package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲇᛸᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2442 implements InterfaceC0955 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String[] f7758 = {"_data"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f7759;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC1996 f7760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC1996 f7761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Uri f7762;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f7763;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f7764;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2303 f7765;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Class f7766;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public volatile boolean f7767;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public volatile InterfaceC0955 f7768;

    public C2442(Context context, InterfaceC1996 interfaceC1996, InterfaceC1996 interfaceC1997, Uri uri, int i, int i2, C2303 c2303, Class cls) {
        this.f7759 = context.getApplicationContext();
        this.f7760 = interfaceC1996;
        this.f7761 = interfaceC1997;
        this.f7762 = uri;
        this.f7763 = i;
        this.f7764 = i2;
        this.f7765 = c2303;
        this.f7766 = cls;
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
        this.f7767 = true;
        InterfaceC0955 interfaceC0955 = this.f7768;
        if (interfaceC0955 != null) {
            interfaceC0955.cancel();
        }
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1391() {
        return this.f7766;
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1855() {
        InterfaceC0955 interfaceC0955 = this.f7768;
        if (interfaceC0955 != null) {
            interfaceC0955.mo1855();
        }
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) throws Throwable {
        try {
            InterfaceC0955 interfaceC0955M4424 = m4424();
            if (interfaceC0955M4424 == null) {
                interfaceC0954.mo1882(new IllegalArgumentException("Failed to build fetcher for: " + this.f7762));
            } else {
                this.f7768 = interfaceC0955M4424;
                if (this.f7767) {
                    cancel();
                } else {
                    interfaceC0955M4424.mo1856(enumC2401, interfaceC0954);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0954.mo1882(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0955 m4424() throws Throwable {
        C1995 c1995Mo1395;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f7759;
        C2303 c2303 = this.f7765;
        int i = this.f7764;
        int i2 = this.f7763;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f7762;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f7758, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c1995Mo1395 = this.f7760.mo1395(file, i2, i, c2303);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f7762;
            boolean zM2477 = AbstractC0968.m2477(requireOriginal);
            InterfaceC1996 interfaceC1996 = this.f7761;
            if (zM2477 && requireOriginal.getPathSegments().contains("picker")) {
                c1995Mo1395 = interfaceC1996.mo1395(requireOriginal, i2, i, c2303);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                c1995Mo1395 = interfaceC1996.mo1395(requireOriginal, i2, i, c2303);
            }
        }
        if (c1995Mo1395 != null) {
            return c1995Mo1395.f6657;
        }
        return null;
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1857() {
        return 1;
    }
}
