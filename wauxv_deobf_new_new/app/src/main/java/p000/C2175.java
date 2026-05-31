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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᤝᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2175 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C2175 f7210 = new C2175();

    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0134, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m4137(Type type, Response response) throws DownloadFileException, ConvertException {
        InterfaceC0485 interfaceC0485Source;
        if (type == String.class && response.isSuccessful()) {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                return responseBodyBody.string();
            }
        } else if (type == C0516.class && response.isSuccessful()) {
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
            C2237 c2237 = (C2237) response.request().tag(C2237.class);
            String absolutePath = c2237 != null ? c2237.f7299 : null;
            if (absolutePath == null) {
                Context context = AbstractC2174.f7202;
                if (context == null) {
                    context = null;
                }
                absolutePath = context.getFilesDir().getAbsolutePath();
            }
            File file = new File(absolutePath);
            if (file.isDirectory()) {
                C2238 c2238 = (C2238) response.request().tag(C2238.class);
                String strM4879 = c2238 != null ? c2238.f7300 : null;
                if (strM4879 == null) {
                    strM4879 = null;
                }
                if (strM4879 == null || AbstractC2901.m4869(strM4879)) {
                    strM4879 = null;
                }
                if (strM4879 == null) {
                    String strHeader$default = Response.header$default(response, "Content-Disposition", null, 2, null);
                    if (strHeader$default != null) {
                        CharSequence charSequenceSubSequence = "";
                        String strM4877 = AbstractC2901.m4877(strHeader$default, "filename=", "");
                        if (AbstractC2901.m4869(strM4877)) {
                            strM4877 = null;
                        }
                        if (strM4877 != null) {
                            strM4879 = strM4877;
                        } else {
                            String strM4878 = AbstractC2901.m4877(strHeader$default, "filename*=", "");
                            char[] charArray = "UTF-8''".toCharArray();
                            char[] cArrCopyOf = Arrays.copyOf(charArray, charArray.length);
                            int length = strM4878.length();
                            for (int i = 0; i < length; i++) {
                                char cCharAt = strM4878.charAt(i);
                                int length2 = cArrCopyOf.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length2) {
                                        i2 = -1;
                                        break;
                                    }
                                    if (cCharAt == cArrCopyOf[i2]) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (!(i2 >= 0)) {
                                    charSequenceSubSequence = strM4878.subSequence(i, strM4878.length());
                                    break;
                                }
                            }
                            strM4879 = charSequenceSubSequence.toString();
                            if (AbstractC2901.m4869(strM4879)) {
                                strM4879 = null;
                            }
                            if (strM4879 == null) {
                                strM4879 = AbstractC2901.m4879((String) AbstractC0739.m2296(response.request().url().pathSegments()), "?");
                                if (AbstractC2901.m4869(strM4879)) {
                                    strM4879 = "unknown_" + System.currentTimeMillis();
                                } else if (response.request().tag(C1787.class) != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } else {
                        strM4879 = AbstractC2901.m4879((String) AbstractC0739.m2296(response.request().url().pathSegments()), "?");
                        if (AbstractC2901.m4869(strM4879)) {
                            strM4879 = "unknown_" + System.currentTimeMillis();
                        } else if (response.request().tag(C1787.class) != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                file = new File(absolutePath, strM4879);
            } else {
                char c = File.separatorChar;
                int iM4871 = AbstractC2901.m4871(absolutePath, c, 0, 6);
                if (iM4871 != -1) {
                    absolutePath.substring(0, iM4871);
                }
                int iM4872 = AbstractC2901.m4871(absolutePath, c, 0, 6);
                if (iM4872 != -1) {
                    absolutePath.substring(iM4872 + 1, absolutePath.length());
                }
            }
            try {
                if (file.exists()) {
                    if (response.request().tag(AbstractC2727.class) != null) {
                        throw new ClassCastException();
                    }
                    if (response.request().tag(AbstractC2236.class) != null) {
                        throw new ClassCastException();
                    }
                }
                if (response.request().tag(AbstractC2240.class) != null) {
                    throw new ClassCastException();
                }
                ResponseBody responseBodyBody4 = response.body();
                if (responseBodyBody4 != null && (interfaceC0485Source = responseBodyBody4.source()) != null) {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    C2530 c2530 = new C2530(AbstractC1467.m3290(file));
                    try {
                        c2530.mo1863(interfaceC0485Source);
                        Util.closeQuietly(interfaceC0485Source);
                        c2530.close();
                        if (response.request().tag(AbstractC2240.class) == null) {
                            return file;
                        }
                        throw new ClassCastException();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3528.m5090(c2530, th);
                            throw th2;
                        }
                    }
                }
            } catch (SocketException e) {
                if (response.request().tag(AbstractC2240.class) != null) {
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
