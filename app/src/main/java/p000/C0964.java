package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0964 implements InterfaceC0955 {

    public final /* synthetic */ int f3489;

    public final Comparable f3490;

    public final Object f3491;

    public Object f3492;

    public /* synthetic */ C0964(Comparable comparable, Object obj, int i) {
        this.f3489 = i;
        this.f3490 = comparable;
        this.f3491 = obj;
    }

    public static C0964 m2453(Context context, Uri uri, InterfaceC2925 interfaceC2925) {
        return new C0964(uri, new C2103(ComponentCallbacks2C0020.m614(context).f539.m3229().m4558(), interfaceC2925, ComponentCallbacks2C0020.m614(context).f540, context.getContentResolver()), 2);
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
        int i = this.f3489;
    }

    @Override // p000.InterfaceC0955
    public final Class mo1391() {
        switch (this.f3489) {
            case 0:
                ((C0373) this.f3491).getClass();
                return InputStream.class;
            case 1:
                switch (((C1227) this.f3491).f4447) {
                    case 6:
                        return ParcelFileDescriptor.class;
                    default:
                        return InputStream.class;
                }
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1855() {
        switch (this.f3489) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f3492).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f3492;
                if (obj != null) {
                    try {
                        switch (((C1227) this.f3491).f4447) {
                            case 6:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f3492;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) throws Throwable {
        Object objOpen;
        switch (this.f3489) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM1495 = C0373.m1495((String) this.f3490);
                    this.f3492 = byteArrayInputStreamM1495;
                    interfaceC0954.mo1883(byteArrayInputStreamM1495);
                } catch (IllegalArgumentException e) {
                    interfaceC0954.mo1882(e);
                }
                break;
            case 1:
                try {
                    C1227 c1227 = (C1227) this.f3491;
                    File file = (File) this.f3490;
                    switch (c1227.f4447) {
                        case 6:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f3492 = objOpen;
                    interfaceC0954.mo1883(objOpen);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e2);
                    }
                    interfaceC0954.mo1882(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM2457 = m2457();
                    this.f3492 = inputStreamM2457;
                    interfaceC0954.mo1883(inputStreamM2457);
                } catch (FileNotFoundException e3) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e3);
                    }
                    interfaceC0954.mo1882(e3);
                    return;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0955
    public final int mo1857() {
        switch (this.f3489) {
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[PHI: r7
      0x0033: PHI (r7v7 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v10 android.database.Cursor) binds: [B:26:0x0056, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #8 {all -> 0x002b, blocks: (B:6:0x001c, B:8:0x0022, B:23:0x0041, B:25:0x0047), top: B:83:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0047, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x002c: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    public InputStream m2457() throws Throwable {
        ?? r7;
        SecurityException e;
        Cursor cursorMo4925;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM3970;
        C2103 c2103 = (C2103) this.f3491;
        ContentResolver contentResolver = (ContentResolver) c2103.f6938;
        Uri uri = (Uri) this.f3490;
        ?? r6 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorMo4925 = ((InterfaceC2925) c2103.f6936).mo4925(uri);
                        if (cursorMo4925 != null) {
                            try {
                                if (cursorMo4925.moveToFirst()) {
                                    string = cursorMo4925.getString(0);
                                    cursorMo4925.close();
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                                }
                                if (true) {
                                }
                                string = null;
                                if (TextUtils.isEmpty(string)) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    file = new File(string);
                                    if (file.exists()) {
                                        inputStreamOpenInputStream = null;
                                    } else {
                                        inputStreamOpenInputStream = null;
                                    }
                                }
                                if (false) {
                                    try {
                                        try {
                                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                            iM3970 = AbstractC2201.m3970((ArrayList) c2103.f6935, inputStreamOpenInputStream2, (C1867) c2103.f6937);
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Throwable th) {
                                            if (false) {
                                                try {
                                                    r6.close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException | NullPointerException e3) {
                                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e3);
                                        }
                                        if (inputStreamOpenInputStream2 != null) {
                                            try {
                                                inputStreamOpenInputStream2.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        iM3970 = -1;
                                    }
                                } else {
                                    iM3970 = -1;
                                }
                                if (false) {
                                    return new C1255(inputStreamOpenInputStream, iM3970);
                                }
                                return inputStreamOpenInputStream;
                            }
                            if (TextUtils.isEmpty(string)) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists() || 0 >= file.length()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    Uri uriFromFile = Uri.fromFile(file);
                                    try {
                                        inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                    } catch (NullPointerException e4) {
                                        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
                                    }
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iM3970 = AbstractC2201.m3970((ArrayList) c2103.f6935, inputStreamOpenInputStream2, (C1867) c2103.f6937);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } else {
                                iM3970 = -1;
                            }
                            if (iM3970 != -1) {
                                return new C1255(inputStreamOpenInputStream, iM3970);
                            }
                            return inputStreamOpenInputStream;
                        }
                        if (false) {
                            cursorMo4925.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        cursorMo4925 = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (false) {
                            cursorMo4925.close();
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (false) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iM3970 = AbstractC2201.m3970((ArrayList) c2103.f6935, inputStreamOpenInputStream2, (C1867) c2103.f6937);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iM3970 = -1;
                        }
                        if (false) {
                            return new C1255(inputStreamOpenInputStream, iM3970);
                        }
                        return inputStreamOpenInputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
            } catch (SecurityException e6) {
                e = e6;
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (false) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iM3970 = AbstractC2201.m3970((ArrayList) c2103.f6935, inputStreamOpenInputStream2, (C1867) c2103.f6937);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iM3970 = -1;
            }
            if (false) {
                return new C1255(inputStreamOpenInputStream, iM3970);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r6 = r7;
        }
    }

    private final void m2454() {
    }

    private final void m2455() {
    }

    private final void m2456() {
    }
}
