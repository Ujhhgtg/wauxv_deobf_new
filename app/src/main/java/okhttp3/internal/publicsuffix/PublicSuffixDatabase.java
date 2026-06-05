package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p000.AbstractC1152feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1318feyxiexzfUjhhgtg;
import p000.AbstractC2856feyxiexzfUjhhgtg;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C0524Ujhhgtgfeyxiexzf;
import p000.C0789feyxiexzfUjhhgtg;
import p000.C1744Ujhhgtgfeyxiexzf;
import p000.C2399Ujhhgtgfeyxiexzf;
import p000.C2402Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3240feyxiexzfUjhhgtg;
import p000.C3312feyxiexzfUjhhgtg;
import p000.InterfaceC1117feyxiexzfUjhhgtg;
import p000.InterfaceC3236feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = Collections.singletonList("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int iAnd;
            boolean z;
            int iAnd2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        iAnd = Util.and(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i5 + i10], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                return new String(bArr, i5, i7, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String strBinarySearch;
        String strBinarySearch2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get(i).getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                bArr2 = null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i2);
            if (strBinarySearch != null) {
                break;
            }
            i2++;
        }
        if (size <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strBinarySearch2 = null;
                break;
            }
            bArr3[i3] = WILDCARD_LABEL;
            Companion companion2 = Companion;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                bArr4 = null;
            }
            strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i3);
            if (strBinarySearch2 != null) {
                break;
            }
            i3++;
        }
        if (strBinarySearch2 != null) {
            int i4 = size - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i5);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
            }
        }
        if (str != null) {
            return AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf("!".concat(str), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listM2637Ujhhgtgfeyxiexzf = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        List<String> listM2637Ujhhgtgfeyxiexzf2 = strBinarySearch != null ? AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(strBinarySearch, new char[]{'.'}) : listM2637Ujhhgtgfeyxiexzf;
        if (strBinarySearch2 != null) {
            listM2637Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(strBinarySearch2, new char[]{'.'});
        }
        return listM2637Ujhhgtgfeyxiexzf2.size() > listM2637Ujhhgtgfeyxiexzf.size() ? listM2637Ujhhgtgfeyxiexzf2 : listM2637Ujhhgtgfeyxiexzf;
    }

    private final void readTheList() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
                C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = new C0789feyxiexzfUjhhgtg(new C0524Ujhhgtgfeyxiexzf(new C2402Ujhhgtgfeyxiexzf(resourceAsStream, 1, new C1744Ujhhgtgfeyxiexzf())));
                try {
                    long j = c0789feyxiexzfUjhhgtg.readInt();
                    c0789feyxiexzfUjhhgtg.mo2118feyxiexzfUjhhgtg(j);
                    byte[] bArrM3863feyxiexzfUjhhgtg = c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf.m3863feyxiexzfUjhhgtg(j);
                    long j2 = c0789feyxiexzfUjhhgtg.readInt();
                    c0789feyxiexzfUjhhgtg.mo2118feyxiexzfUjhhgtg(j2);
                    byte[] bArrM3863feyxiexzfUjhhgtg2 = c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf.m3863feyxiexzfUjhhgtg(j2);
                    c0789feyxiexzfUjhhgtg.close();
                    synchronized (this) {
                        this.publicSuffixListBytes = bArrM3863feyxiexzfUjhhgtg;
                        this.publicSuffixExceptionListBytes = bArrM3863feyxiexzfUjhhgtg2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg, th);
                        throw th2;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th3) {
            this.readCompleteLatch.countDown();
            throw th3;
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> splitDomain(String str) {
        List<String> listM2637Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(str, new char[]{'.'});
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4244feyxiexzfUjhhgtg(listM2637Ujhhgtgfeyxiexzf), "")) {
            return listM2637Ujhhgtgfeyxiexzf;
        }
        int size = listM2637Ujhhgtgfeyxiexzf.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(size, "Requested element count ", " is less than zero.").toString());
        }
        C3312feyxiexzfUjhhgtg c3312feyxiexzfUjhhgtg = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        if (size == 0) {
            return c3312feyxiexzfUjhhgtg;
        }
        if (size >= listM2637Ujhhgtgfeyxiexzf.size()) {
            return AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(listM2637Ujhhgtgfeyxiexzf);
        }
        if (size == 1) {
            return Collections.singletonList(AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(listM2637Ujhhgtgfeyxiexzf));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<T> it = listM2637Ujhhgtgfeyxiexzf.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayList : Collections.singletonList(arrayList.get(0));
        }
        return c3312feyxiexzfUjhhgtg;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        List<String> listSplitDomain = splitDomain(IDN.toUnicode(str));
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        int i = 0;
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i2 = size - size2;
        InterfaceC1117feyxiexzfUjhhgtg c2399Ujhhgtgfeyxiexzf = new C2399Ujhhgtgfeyxiexzf(1, splitDomain(str));
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i2, "Requested element count ", " is less than zero.").toString());
        }
        if (i2 != 0) {
            c2399Ujhhgtgfeyxiexzf = c2399Ujhhgtgfeyxiexzf instanceof InterfaceC3236feyxiexzfUjhhgtg ? ((InterfaceC3236feyxiexzfUjhhgtg) c2399Ujhhgtgfeyxiexzf).mo4740Ujhhgtgfeyxiexzf(i2) : new C3240feyxiexzfUjhhgtg(c2399Ujhhgtgfeyxiexzf, i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c2399Ujhhgtgfeyxiexzf) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC3590Ujhhgtgfeyxiexzf.m5118Ujhhgtgfeyxiexzf(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
