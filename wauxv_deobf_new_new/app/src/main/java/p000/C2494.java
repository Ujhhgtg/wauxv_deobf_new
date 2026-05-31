package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲇᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2494 implements InterfaceC0958 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String[] f7902 = {"_data"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f7903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2027 f7904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2027 f7905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Uri f7906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f7907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f7908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2336 f7909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Class f7910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public volatile boolean f7911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public volatile InterfaceC0958 f7912;

    public C2494(Context context, InterfaceC2027 interfaceC2027, InterfaceC2027 interfaceC2028, Uri uri, int i, int i2, C2336 c2336, Class cls) {
        this.f7903 = context.getApplicationContext();
        this.f7904 = interfaceC2027;
        this.f7905 = interfaceC2028;
        this.f7906 = uri;
        this.f7907 = i;
        this.f7908 = i2;
        this.f7909 = c2336;
        this.f7910 = cls;
    }

    @Override // p000.InterfaceC0958
    public final void cancel() {
        this.f7911 = true;
        InterfaceC0958 interfaceC0958 = this.f7912;
        if (interfaceC0958 != null) {
            interfaceC0958.cancel();
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1537() {
        return this.f7910;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1949() {
        InterfaceC0958 interfaceC0958 = this.f7912;
        if (interfaceC0958 != null) {
            interfaceC0958.mo1949();
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1950(EnumC2454 enumC2454, InterfaceC0957 interfaceC0957) throws Throwable {
        try {
            InterfaceC0958 interfaceC0958M4445 = m4445();
            if (interfaceC0958M4445 == null) {
                interfaceC0957.mo1976(new IllegalArgumentException("Failed to build fetcher for: " + this.f7906));
            } else {
                this.f7912 = interfaceC0958M4445;
                if (this.f7911) {
                    cancel();
                } else {
                    interfaceC0958M4445.mo1950(enumC2454, interfaceC0957);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0957.mo1976(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0958 m4445() throws Throwable {
        C2026 c2026Mo1541;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f7903;
        C2336 c2336 = this.f7909;
        int i = this.f7908;
        int i2 = this.f7907;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f7906;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f7902, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c2026Mo1541 = this.f7904.mo1541(file, i2, i, c2336);
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
            int i3 = Build.VERSION.SDK_INT;
            InterfaceC2027 interfaceC2027 = this.f7905;
            Uri requireOriginal = this.f7906;
            if (i3 >= 30) {
                c2026Mo1541 = interfaceC2027.mo1541(requireOriginal, i2, i, c2336);
            } else {
                if (AbstractC2236.m4235(requireOriginal)) {
                    Iterator<String> it = requireOriginal.getPathSegments().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String next = it.next();
                            if (next != null && next.startsWith("picker")) {
                                c2026Mo1541 = interfaceC2027.mo1541(requireOriginal, i2, i, c2336);
                            }
                        }
                    }
                }
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                c2026Mo1541 = interfaceC2027.mo1541(requireOriginal, i2, i, c2336);
            }
        }
        if (c2026Mo1541 != null) {
            return c2026Mo1541.f6762;
        }
        return null;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1951() {
        return 1;
    }
}
