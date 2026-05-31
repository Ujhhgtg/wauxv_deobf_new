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
import p000.AbstractC0739;
import p000.AbstractC0985;
import p000.AbstractC1095;
import p000.AbstractC1469;
import p000.AbstractC2305;
import p000.AbstractC2901;
import p000.AbstractC2902;
import p000.AbstractC3528;
import p000.C0281;
import p000.C0289;
import p000.C1119;
import p000.C1191;
import p000.C1520;
import p000.C2531;
import p000.C3459;
import p000.InterfaceC1120;
import p000.InterfaceC2711;

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
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
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
            return AbstractC2901.m4875("!".concat(str), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listM4875 = C1191.f4326;
        List<String> listM4876 = strBinarySearch != null ? AbstractC2901.m4875(strBinarySearch, new char[]{'.'}) : listM4875;
        if (strBinarySearch2 != null) {
            listM4875 = AbstractC2901.m4875(strBinarySearch2, new char[]{'.'});
        }
        return listM4876.size() > listM4875.size() ? listM4876 : listM4875;
    }

    private final void readTheList() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                Logger logger = AbstractC2305.f7492;
                C2531 c2531 = new C2531(new C1520(new C0289(resourceAsStream, 1, new C3459())));
                try {
                    long j = c2531.readInt();
                    c2531.mo1884(j);
                    byte[] bArrM1878 = c2531.f8065.m1878(j);
                    long j2 = c2531.readInt();
                    c2531.mo1884(j2);
                    byte[] bArrM1879 = c2531.f8065.m1878(j2);
                    c2531.close();
                    synchronized (this) {
                        this.publicSuffixListBytes = bArrM1878;
                        this.publicSuffixExceptionListBytes = bArrM1879;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3528.m5090(c2531, th);
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
        List<String> listM4875 = AbstractC2901.m4875(str, new char[]{'.'});
        if (!AbstractC1469.m3322(AbstractC0739.m2296(listM4875), "")) {
            return listM4875;
        }
        int size = listM4875.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2795(size, "Requested element count ", " is less than zero.").toString());
        }
        C1191 c1191 = C1191.f4326;
        if (size == 0) {
            return c1191;
        }
        if (size >= listM4875.size()) {
            return AbstractC0739.m2305(listM4875);
        }
        if (size == 1) {
            return Collections.singletonList(AbstractC0739.m2290(listM4875));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<T> it = listM4875.iterator();
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
        return c1191;
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
        InterfaceC2711 c0281 = new C0281(splitDomain(str), 1);
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2795(i2, "Requested element count ", " is less than zero.").toString());
        }
        if (i2 != 0) {
            c0281 = c0281 instanceof InterfaceC1120 ? ((InterfaceC1120) c0281).mo2835(i2) : new C1119(c0281, i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c0281) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC2902.m4883(sb, obj, null);
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
