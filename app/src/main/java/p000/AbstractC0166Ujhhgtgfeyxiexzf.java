package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ能不能要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0166Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0529Ujhhgtgfeyxiexzf f1350Ujhhgtgfeyxiexzf;

    static {
        String property;
        int i = AbstractC2075feyxiexzfUjhhgtg.f6819Ujhhgtgfeyxiexzf;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC1119feyxiexzfUjhhgtg.m2590feyxiexzfUjhhgtg(new C3640Ujhhgtgfeyxiexzf(new C2399Ujhhgtgfeyxiexzf(2, Arrays.asList(new C3021feyxiexzfUjhhgtg()).iterator()))).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((C3021feyxiexzfUjhhgtg) next).getClass();
                    do {
                        ((C3021feyxiexzfUjhhgtg) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C3021feyxiexzfUjhhgtg) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f1350Ujhhgtgfeyxiexzf = new C0529Ujhhgtgfeyxiexzf(AbstractC0531Ujhhgtgfeyxiexzf.m1828Ujhhgtgfeyxiexzf(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
