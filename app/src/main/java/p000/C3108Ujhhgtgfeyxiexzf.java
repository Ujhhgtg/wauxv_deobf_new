package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳ能不能ᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3108Ujhhgtgfeyxiexzf implements InterfaceC3078Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9653Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Comparable f9654Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f9655Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f9656Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3108Ujhhgtgfeyxiexzf(Comparable comparable, Object obj, int i) {
        this.f9653Ujhhgtgfeyxiexzf = i;
        this.f9654Ujhhgtgfeyxiexzf = comparable;
        this.f9655Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C3108Ujhhgtgfeyxiexzf m4633Ujhhgtgfeyxiexzf(Context context, Uri uri, InterfaceC1988feyxiexzfUjhhgtg interfaceC1988feyxiexzfUjhhgtg) {
        return new C3108Ujhhgtgfeyxiexzf(uri, new C0416Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context).f605Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().m2470Ujhhgtgfeyxiexzf(), interfaceC1988feyxiexzfUjhhgtg, Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context).f606Ujhhgtgfeyxiexzf, context.getContentResolver()), 2);
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    public final void cancel() {
        int i = this.f9653Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1381Ujhhgtgfeyxiexzf() {
        switch (this.f9653Ujhhgtgfeyxiexzf) {
            case 0:
                ((C2466feyxiexzfUjhhgtg) this.f9655Ujhhgtgfeyxiexzf).getClass();
                return InputStream.class;
            case 1:
                switch (((C3339feyxiexzfUjhhgtg) this.f9655Ujhhgtgfeyxiexzf).f10440Ujhhgtgfeyxiexzf) {
                    case 7:
                        return ParcelFileDescriptor.class;
                    default:
                        return InputStream.class;
                }
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1382Ujhhgtgfeyxiexzf() {
        switch (this.f9653Ujhhgtgfeyxiexzf) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f9656Ujhhgtgfeyxiexzf).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f9656Ujhhgtgfeyxiexzf;
                if (obj != null) {
                    try {
                        switch (((C3339feyxiexzfUjhhgtg) this.f9655Ujhhgtgfeyxiexzf).f10440Ujhhgtgfeyxiexzf) {
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
                InputStream inputStream = (InputStream) this.f9656Ujhhgtgfeyxiexzf;
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

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1383Ujhhgtgfeyxiexzf(EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf interfaceC3077Ujhhgtgfeyxiexzf) throws Throwable {
        Object objOpen;
        switch (this.f9653Ujhhgtgfeyxiexzf) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM3697Ujhhgtgfeyxiexzf = C2466feyxiexzfUjhhgtg.m3697Ujhhgtgfeyxiexzf((String) this.f9654Ujhhgtgfeyxiexzf);
                    this.f9656Ujhhgtgfeyxiexzf = byteArrayInputStreamM3697Ujhhgtgfeyxiexzf;
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(byteArrayInputStreamM3697Ujhhgtgfeyxiexzf);
                } catch (IllegalArgumentException e) {
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e);
                }
                break;
            case 1:
                try {
                    C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg = (C3339feyxiexzfUjhhgtg) this.f9655Ujhhgtgfeyxiexzf;
                    File file = (File) this.f9654Ujhhgtgfeyxiexzf;
                    switch (c3339feyxiexzfUjhhgtg.f10440Ujhhgtgfeyxiexzf) {
                        case 7:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f9656Ujhhgtgfeyxiexzf = objOpen;
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(objOpen);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e2);
                    }
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM4637Ujhhgtgfeyxiexzf = m4637Ujhhgtgfeyxiexzf();
                    this.f9656Ujhhgtgfeyxiexzf = inputStreamM4637Ujhhgtgfeyxiexzf;
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(inputStreamM4637Ujhhgtgfeyxiexzf);
                } catch (FileNotFoundException e3) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e3);
                    }
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e3);
                    return;
                }
                break;
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1384Ujhhgtgfeyxiexzf() {
        switch (this.f9653Ujhhgtgfeyxiexzf) {
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public InputStream m4637Ujhhgtgfeyxiexzf() throws Throwable {
        ?? r7;
        SecurityException e;
        Cursor cursorMo3342Ujhhgtgfeyxiexzf;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM2736Ujhhgtgfeyxiexzf;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = (C0416Ujhhgtgfeyxiexzf) this.f9655Ujhhgtgfeyxiexzf;
        ContentResolver contentResolver = (ContentResolver) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
        Uri uri = (Uri) this.f9654Ujhhgtgfeyxiexzf;
        ?? r6 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorMo3342Ujhhgtgfeyxiexzf = ((InterfaceC1988feyxiexzfUjhhgtg) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf).mo3342Ujhhgtgfeyxiexzf(uri);
                        if (cursorMo3342Ujhhgtgfeyxiexzf != null) {
                            try {
                                if (cursorMo3342Ujhhgtgfeyxiexzf.moveToFirst()) {
                                    string = cursorMo3342Ujhhgtgfeyxiexzf.getString(0);
                                    cursorMo3342Ujhhgtgfeyxiexzf.close();
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                                }
                                if (cursorMo3342Ujhhgtgfeyxiexzf != null) {
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
                                            iM2736Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2736Ujhhgtgfeyxiexzf((ArrayList) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf, inputStreamOpenInputStream2, (C0271Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf);
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
                                        iM2736Ujhhgtgfeyxiexzf = -1;
                                    }
                                } else {
                                    iM2736Ujhhgtgfeyxiexzf = -1;
                                }
                                if (iM2736Ujhhgtgfeyxiexzf != -1) {
                                    return new C3501feyxiexzfUjhhgtg(inputStreamOpenInputStream, iM2736Ujhhgtgfeyxiexzf);
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
                                iM2736Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2736Ujhhgtgfeyxiexzf((ArrayList) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf, inputStreamOpenInputStream2, (C0271Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } else {
                                iM2736Ujhhgtgfeyxiexzf = -1;
                            }
                            if (iM2736Ujhhgtgfeyxiexzf != -1) {
                                return new C3501feyxiexzfUjhhgtg(inputStreamOpenInputStream, iM2736Ujhhgtgfeyxiexzf);
                            }
                            return inputStreamOpenInputStream;
                        }
                        if (cursorMo3342Ujhhgtgfeyxiexzf != null) {
                            cursorMo3342Ujhhgtgfeyxiexzf.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        cursorMo3342Ujhhgtgfeyxiexzf = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorMo3342Ujhhgtgfeyxiexzf != null) {
                            cursorMo3342Ujhhgtgfeyxiexzf.close();
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
                            iM2736Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2736Ujhhgtgfeyxiexzf((ArrayList) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf, inputStreamOpenInputStream2, (C0271Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iM2736Ujhhgtgfeyxiexzf = -1;
                        }
                        if (iM2736Ujhhgtgfeyxiexzf != -1) {
                            return new C3501feyxiexzfUjhhgtg(inputStreamOpenInputStream, iM2736Ujhhgtgfeyxiexzf);
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
                iM2736Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2736Ujhhgtgfeyxiexzf((ArrayList) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf, inputStreamOpenInputStream2, (C0271Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iM2736Ujhhgtgfeyxiexzf = -1;
            }
            if (iM2736Ujhhgtgfeyxiexzf != -1) {
                return new C3501feyxiexzfUjhhgtg(inputStreamOpenInputStream, iM2736Ujhhgtgfeyxiexzf);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r6 = r7;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    private final void m4634Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    private final void m4635Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    private final void m4636Ujhhgtgfeyxiexzf() {
    }
}
