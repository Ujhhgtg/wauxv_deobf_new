package p000;

import android.content.Context;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.DownloadFileException;
import java.io.File;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᤝᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2141 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C2141 f7086 = new C2141();

    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0134, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m3953(Type type, Response response) throws DownloadFileException, ConvertException {
        InterfaceC0508 interfaceC0508Source;
        if (type == String.class && response.isSuccessful()) {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                return responseBodyBody.string();
            }
        } else if (type == C0539.class && response.isSuccessful()) {
            ResponseBody responseBodyBody2 = response.body();
            if (responseBodyBody2 != null) {
                return responseBodyBody2.byteString();
            }
        } else if ((type instanceof GenericArrayType) && ((GenericArrayType) type).getGenericComponentType() == Byte.TYPE && response.isSuccessful()) {
            ResponseBody responseBodyBody3 = response.body();
            if (responseBodyBody3 != null) {
                return responseBodyBody3.bytes();
            }
        } else {
            if (type != File.class || !response.isSuccessful()) {
                if (type == Response.class) {
                    return response;
                }
                throw new ConvertException(response, "An exception occurred while converting the NetConverter.DEFAULT", null, null, 12, null);
            }
            C2204 c2204 = (C2204) response.request().tag(C2204.class);
            String absolutePath = c2204 != null ? c2204.f7169 : null;
            if (absolutePath == null) {
                Context context = AbstractC2140.f7078;
                if (context == null) {
                    context = null;
                }
                absolutePath = context.getFilesDir().getAbsolutePath();
            }
            File file = new File(absolutePath);
            if (file.isDirectory()) {
                C2206 c2206 = (C2206) response.request().tag(C2206.class);
                String strM4845 = c2206 != null ? c2206.f7174 : null;
                if (strM4845 == null) {
                    strM4845 = null;
                }
                if (strM4845 == null || AbstractC2841.m4836(strM4845)) {
                    strM4845 = null;
                }
                if (strM4845 == null) {
                    String strHeader$default = Response.header$default(response, "Content-Disposition", null, 2, null);
                    if (strHeader$default != null) {
                        CharSequence charSequenceSubSequence = "";
                        String strM4844 = AbstractC2841.m4844(strHeader$default, "filename=", "");
                        if (AbstractC2841.m4836(strM4844)) {
                            strM4844 = null;
                        }
                        if (strM4844 != null) {
                            strM4845 = strM4844;
                        } else {
                            String strM4846 = AbstractC2841.m4844(strHeader$default, "filename*=", "");
                            char[] charArray = "UTF-8''".toCharArray();
                            char[] cArrCopyOf = Arrays.copyOf(charArray, 7);
                            int length = strM4846.length();
                            for (int i = 0; i < length; i++) {
                                char cCharAt = strM4846.charAt(i);
                                int length2 = 7;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= 7) {
                                        i2 = -1;
                                        break;
                                    }
                                    if (cCharAt == cArrCopyOf[i2]) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (!(i2 >= 0)) {
                                    charSequenceSubSequence = strM4846.subSequence(i, strM4846.length());
                                    break;
                                }
                            }
                            strM4845 = charSequenceSubSequence.toString();
                            if (AbstractC2841.m4836(strM4845)) {
                                strM4845 = null;
                            }
                            if (strM4845 == null) {
                                strM4845 = AbstractC2841.m4845((String) AbstractC0744.m2197(response.request().url().pathSegments()), "?");
                                if (AbstractC2841.m4836(strM4845)) {
                                    strM4845 = "unknown_" + System.currentTimeMillis();
                                } else if (response.request().tag(AbstractC2207.class) != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } else {
                        strM4845 = AbstractC2841.m4845((String) AbstractC0744.m2197(response.request().url().pathSegments()), "?");
                        if (AbstractC2841.m4836(strM4845)) {
                            strM4845 = "unknown_" + System.currentTimeMillis();
                        } else if (response.request().tag(AbstractC2207.class) != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                file = new File(absolutePath, strM4845);
            } else {
                char c = File.separatorChar;
                int iM4838 = AbstractC2841.m4838(absolutePath, c, 0, 6);
                if (iM4838 != -1) {
                    absolutePath.substring(0, iM4838);
                }
                int iM4839 = AbstractC2841.m4838(absolutePath, c, 0, 6);
                if (iM4839 != -1) {
                    absolutePath.substring(iM4839 + 1, absolutePath.length());
                }
            }
            try {
                if (file.exists()) {
                    if (response.request().tag(AbstractC2205.class) != null) {
                        throw new ClassCastException();
                    }
                    if (response.request().tag(AbstractC2203.class) != null) {
                        throw new ClassCastException();
                    }
                }
                if (response.request().tag(AbstractC2209.class) != null) {
                    throw new ClassCastException();
                }
                ResponseBody responseBodyBody4 = response.body();
                if (responseBodyBody4 != null && (interfaceC0508Source = responseBodyBody4.source()) != null) {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    C2476 c2476 = new C2476(AbstractC2207.m4117(file));
                    try {
                        c2476.mo1769(interfaceC0508Source);
                        Util.closeQuietly(interfaceC0508Source);
                        c2476.close();
                        if (response.request().tag(AbstractC2209.class) == null) {
                            return file;
                        }
                        throw new ClassCastException();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1458.m3154(c2476, th);
                            throw th2;
                        }
                    }
                }
            } catch (SocketException e) {
                if (response.request().tag(AbstractC2209.class) != null) {
                    throw new ClassCastException();
                }
                CancellationException cancellationException = new CancellationException(e.toString());
                cancellationException.initCause(e);
                throw cancellationException;
            } catch (Exception e2) {
                throw new DownloadFileException(response, null, e2, null, 10, null);
            }
        }
        return null;
    }
}
