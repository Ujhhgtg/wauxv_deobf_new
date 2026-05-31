package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᛸᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0968 implements InterfaceC0958 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Comparable f3507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f3508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f3509;

    public /* synthetic */ C0968(Comparable comparable, Object obj, int i) {
        this.f3506 = i;
        this.f3507 = comparable;
        this.f3508 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0968 m2572(Context context, Uri uri, InterfaceC2984 interfaceC2984) {
        return new C0968(uri, new C2136(ComponentCallbacks2C0027.m757(context).f591.m3406().m4580(), interfaceC2984, ComponentCallbacks2C0027.m757(context).f592, context.getContentResolver()), 2);
    }

    @Override // p000.InterfaceC0958
    public final void cancel() {
        int i = this.f3506;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1537() {
        switch (this.f3506) {
            case 0:
                ((C0348) this.f3508).getClass();
                return InputStream.class;
            case 1:
                switch (((C1224) this.f3508).f4430) {
                    case 7:
                        return ParcelFileDescriptor.class;
                    default:
                        return InputStream.class;
                }
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1949() {
        switch (this.f3506) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f3509).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f3509;
                if (obj != null) {
                    try {
                        switch (((C1224) this.f3508).f4430) {
                            case 7:
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
                InputStream inputStream = (InputStream) this.f3509;
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

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1950(EnumC2454 enumC2454, InterfaceC0957 interfaceC0957) throws Throwable {
        Object objOpen;
        switch (this.f3506) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM1600 = C0348.m1600((String) this.f3507);
                    this.f3509 = byteArrayInputStreamM1600;
                    interfaceC0957.mo1977(byteArrayInputStreamM1600);
                } catch (IllegalArgumentException e) {
                    interfaceC0957.mo1976(e);
                }
                break;
            case 1:
                try {
                    C1224 c1224 = (C1224) this.f3508;
                    File file = (File) this.f3507;
                    switch (c1224.f4430) {
                        case 7:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f3509 = objOpen;
                    interfaceC0957.mo1977(objOpen);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e2);
                    }
                    interfaceC0957.mo1976(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM2576 = m2576();
                    this.f3509 = inputStreamM2576;
                    interfaceC0957.mo1977(inputStreamM2576);
                } catch (FileNotFoundException e3) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e3);
                    }
                    interfaceC0957.mo1976(e3);
                    return;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1951() {
        switch (this.f3506) {
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InputStream m2576() throws Throwable {
        ?? r7;
        SecurityException e;
        Cursor cursorMo4987;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM2271;
        C2136 c2136 = (C2136) this.f3508;
        ContentResolver contentResolver = (ContentResolver) c2136.f7062;
        Uri uri = (Uri) this.f3507;
        ?? r6 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorMo4987 = ((InterfaceC2984) c2136.f7060).mo4987(uri);
                        if (cursorMo4987 != null) {
                            try {
                                if (cursorMo4987.moveToFirst()) {
                                    string = cursorMo4987.getString(0);
                                    cursorMo4987.close();
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                                }
                                if (cursorMo4987 != null) {
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
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        try {
                                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                            iM2271 = AbstractC0738.m2271((ArrayList) c2136.f7059, inputStreamOpenInputStream2, (C1893) c2136.f7061);
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Throwable th) {
                                            if (0 != 0) {
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
                                        iM2271 = -1;
                                    }
                                } else {
                                    iM2271 = -1;
                                }
                                if (iM2271 != -1) {
                                    return new C1257(inputStreamOpenInputStream, iM2271);
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
                                iM2271 = AbstractC0738.m2271((ArrayList) c2136.f7059, inputStreamOpenInputStream2, (C1893) c2136.f7061);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } else {
                                iM2271 = -1;
                            }
                            if (iM2271 != -1) {
                                return new C1257(inputStreamOpenInputStream, iM2271);
                            }
                            return inputStreamOpenInputStream;
                        }
                        if (cursorMo4987 != null) {
                            cursorMo4987.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        cursorMo4987 = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorMo4987 != null) {
                            cursorMo4987.close();
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
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iM2271 = AbstractC0738.m2271((ArrayList) c2136.f7059, inputStreamOpenInputStream2, (C1893) c2136.f7061);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iM2271 = -1;
                        }
                        if (iM2271 != -1) {
                            return new C1257(inputStreamOpenInputStream, iM2271);
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
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iM2271 = AbstractC0738.m2271((ArrayList) c2136.f7059, inputStreamOpenInputStream2, (C1893) c2136.f7061);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iM2271 = -1;
            }
            if (iM2271 != -1) {
                return new C1257(inputStreamOpenInputStream, iM2271);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r6 = r7;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    private final void m2573() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    private final void m2574() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    private final void m2575() {
    }
}
