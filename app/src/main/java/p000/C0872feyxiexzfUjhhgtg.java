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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴᛳᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0872feyxiexzfUjhhgtg implements InterfaceC3078Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String[] f3389Ujhhgtgfeyxiexzf = {"_data"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Context f3390Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC0285Ujhhgtgfeyxiexzf f3391Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC0285Ujhhgtgfeyxiexzf f3392Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Uri f3393Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f3394Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f3395Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C1471feyxiexzfUjhhgtg f3396Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Class f3397Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public volatile boolean f3398Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public volatile InterfaceC3078Ujhhgtgfeyxiexzf f3399Ujhhgtgfeyxiexzf;

    public C0872feyxiexzfUjhhgtg(Context context, InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf, InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf2, Uri uri, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg, Class cls) {
        this.f3390Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f3391Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf;
        this.f3392Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf2;
        this.f3393Ujhhgtgfeyxiexzf = uri;
        this.f3394Ujhhgtgfeyxiexzf = i;
        this.f3395Ujhhgtgfeyxiexzf = i2;
        this.f3396Ujhhgtgfeyxiexzf = c1471feyxiexzfUjhhgtg;
        this.f3397Ujhhgtgfeyxiexzf = cls;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    public final void cancel() {
        this.f3398Ujhhgtgfeyxiexzf = true;
        InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf = this.f3399Ujhhgtgfeyxiexzf;
        if (interfaceC3078Ujhhgtgfeyxiexzf != null) {
            interfaceC3078Ujhhgtgfeyxiexzf.cancel();
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1381Ujhhgtgfeyxiexzf() {
        return this.f3397Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1382Ujhhgtgfeyxiexzf() {
        InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf = this.f3399Ujhhgtgfeyxiexzf;
        if (interfaceC3078Ujhhgtgfeyxiexzf != null) {
            interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1383Ujhhgtgfeyxiexzf(EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf interfaceC3077Ujhhgtgfeyxiexzf) throws Throwable {
        try {
            InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078UjhhgtgfeyxiexzfM2321Ujhhgtgfeyxiexzf = m2321Ujhhgtgfeyxiexzf();
            if (interfaceC3078UjhhgtgfeyxiexzfM2321Ujhhgtgfeyxiexzf == null) {
                interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(new IllegalArgumentException("Failed to build fetcher for: " + this.f3393Ujhhgtgfeyxiexzf));
            } else {
                this.f3399Ujhhgtgfeyxiexzf = interfaceC3078UjhhgtgfeyxiexzfM2321Ujhhgtgfeyxiexzf;
                if (this.f3398Ujhhgtgfeyxiexzf) {
                    cancel();
                } else {
                    interfaceC3078UjhhgtgfeyxiexzfM2321Ujhhgtgfeyxiexzf.mo1383Ujhhgtgfeyxiexzf(enumC0836feyxiexzfUjhhgtg, interfaceC3077Ujhhgtgfeyxiexzf);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3078Ujhhgtgfeyxiexzf m2321Ujhhgtgfeyxiexzf() throws Throwable {
        C0286Ujhhgtgfeyxiexzf c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f3390Ujhhgtgfeyxiexzf;
        C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg = this.f3396Ujhhgtgfeyxiexzf;
        int i = this.f3395Ujhhgtgfeyxiexzf;
        int i2 = this.f3394Ujhhgtgfeyxiexzf;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f3393Ujhhgtgfeyxiexzf;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f3389Ujhhgtgfeyxiexzf, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf = this.f3391Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(file, i2, i, c1471feyxiexzfUjhhgtg);
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
            InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf = this.f3392Ujhhgtgfeyxiexzf;
            Uri requireOriginal = this.f3393Ujhhgtgfeyxiexzf;
            if (i3 >= 30) {
                c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(requireOriginal, i2, i, c1471feyxiexzfUjhhgtg);
            } else {
                if (AbstractC3593Ujhhgtgfeyxiexzf.m5161feyxiexzfUjhhgtg(requireOriginal)) {
                    Iterator<String> it = requireOriginal.getPathSegments().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String next = it.next();
                            if (next != null && next.startsWith("picker")) {
                                c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(requireOriginal, i2, i, c1471feyxiexzfUjhhgtg);
                            }
                        }
                    }
                }
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(requireOriginal, i2, i, c1471feyxiexzfUjhhgtg);
            }
        }
        if (c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf != null) {
            return c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1384Ujhhgtgfeyxiexzf() {
        return 1;
    }
}
