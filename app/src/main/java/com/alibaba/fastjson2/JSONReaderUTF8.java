package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.ek;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;
import java.util.function.BiFunction;
import okhttp3.internal.http2.Settings;
import p000.AbstractC1194;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONReaderUTF8 extends JSONReader {
    static final int ESCAPE_INDEX_NOT_SET = -2;
    protected static final byte[] INPUT_CODES;
    protected static final byte[] INPUT_CODES_SINGLE_QUOTE;
    static final byte INPUT_CODE_ASCII_ESCAPE = 1;
    static final byte INPUT_CODE_ASCII_NORMAL = 0;
    static final byte INPUT_CODE_ERROR = -1;
    static final byte INPUT_CODE_UTF8_2 = 2;
    static final byte INPUT_CODE_UTF8_3 = 3;
    static final byte INPUT_CODE_UTF8_4 = 4;
    static final int REF;
    protected final byte[] bytes;
    protected JSONFactory.CacheItem cacheItem;
    protected final int end;
    protected final InputStream in;
    protected final int length;
    protected boolean nameAscii;
    protected int nameBegin;
    protected int nameEnd;
    protected int nameLength;
    protected int nextEscapeIndex;
    protected int referenceBegin;
    protected final int start;

    static {
        byte b;
        REF = JDKUtils.BIG_ENDIAN ? 611476838 : 1717924388;
        byte[] bArr = new byte[256];
        Arrays.fill(bArr, 0, 128, (byte) 0);
        bArr[34] = 1;
        bArr[92] = 1;
        for (int i = 128; i < 256; i++) {
            if ((i & 224) == 192) {
                b = 2;
            } else if ((i & 240) == 224) {
                b = 3;
            } else {
                b = (i & 248) == 240 ? (byte) 4 : -1;
            }
            bArr[i] = b;
        }
        INPUT_CODES = bArr;
        byte[] bArr2 = (byte[]) bArr.clone();
        bArr2[39] = 1;
        INPUT_CODES_SINGLE_QUOTE = bArr2;
    }

    public JSONReaderUTF8(JSONReader.Context context, InputStream inputStream) {
        super(context, false, true);
        this.nextEscapeIndex = -2;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int i = context.bufferSize;
        andSet = andSet == null ? new byte[i] : andSet;
        int i2 = 0;
        while (true) {
            try {
                int i3 = inputStream.read(andSet, i2, andSet.length - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
                if (i2 == andSet.length) {
                    andSet = Arrays.copyOf(andSet, andSet.length + i);
                }
            } catch (IOException e) {
                throw new JSONException("read error", e);
            }
        }
        this.bytes = andSet;
        this.offset = 0;
        this.length = i2;
        this.in = inputStream;
        this.start = 0;
        this.end = i2;
        next();
        if (this.ch == '/') {
            skipComment();
        }
    }

    public static int char2_utf8(int i, int i2, int i3) {
        if ((i2 & 192) == 128) {
            return ((i & 31) << 6) | (i2 & 63);
        }
        throw new JSONException(AbstractC1194.m2779(i3, "malformed input around byte "));
    }

    private void char_utf8(int i, int i2) {
        int i3;
        int iChar2_utf8;
        byte[] bArr = this.bytes;
        int i4 = i & 255;
        switch (i4 >> 4) {
            case 12 /* 12 */:
            case 13:
                int i5 = i2 + 1;
                int iChar2_utf9 = char2_utf8(i4, bArr[i2], i5);
                i3 = i5;
                iChar2_utf8 = iChar2_utf9;
                break;
            case 14 /* 14 */:
                iChar2_utf8 = char2_utf8(i4, bArr[i2], bArr[i2 + 1], i2);
                i3 = i2 + 2;
                break;
            default:
                if ((i >> 3) != -2) {
                    throw new JSONException(AbstractC1194.m2779(i2, "malformed input around byte "));
                }
                iChar2_utf8 = (((i << 18) ^ (bArr[i2] << 12)) ^ (bArr[i2 + 1] << 6)) ^ (bArr[i2 + 2] ^ 3678080);
                i3 = i2 + 3;
                break;
                break;
        }
        this.ch = (char) iChar2_utf8;
        this.offset = i3;
    }

    public static boolean containsSlashOrQuote(long j, long j2) {
        long j3 = j2 ^ j;
        long j4 = j ^ 6655295901103053916L;
        return ((((~j4) & (j4 - 72340172838076673L)) | ((~j3) & (j3 - 72340172838076673L))) & (-9187201950435737472L)) != 0;
    }

    private static char[] ensureCapacity(char[] cArr, int i) {
        return Arrays.copyOf(cArr, JSONReader.newCapacity(i, cArr.length));
    }

    private static int indexOf(long j, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if (((byte) j) == i) {
                return i2;
            }
            j >>>= 8;
        }
        return -1;
    }

    public static int indexOfSlash(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i, int i2) {
        int i3 = jSONReaderUTF8.nextEscapeIndex;
        if (i3 != -2 && (i3 == -1 || i3 >= i)) {
            return i3;
        }
        int iIndexOfSlash = IOUtils.indexOfSlash(bArr, i, i2);
        jSONReaderUTF8.nextEscapeIndex = iIndexOfSlash;
        return iIndexOfSlash;
    }

    private static boolean isDateTImeSpace(byte b) {
        return b == 84 || b == 32;
    }

    private boolean isReference0(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5;
        byte b;
        int i6 = i + 6;
        byte b2 = bArr[i6];
        while (b2 >= 0 && b2 <= 32 && ((1 << b2) & 4294981377L) != 0) {
            i6++;
            if (i6 >= i2) {
                return false;
            }
            b2 = bArr[i6];
        }
        if (b2 == 58 && (i4 = i6 + 1) < i2) {
            int i7 = bArr[i4];
            while (i7 >= 0 && i7 <= 32 && ((1 << i7) & 4294981377L) != 0) {
                i4++;
                if (i4 >= i2) {
                    return false;
                }
                i7 = bArr[i4];
            }
            if (i7 == i3 && ((i5 = i4 + 1) >= i2 || (b = bArr[i5]) == 36 || b == 46 || b == 64)) {
                this.referenceBegin = i4;
                return true;
            }
        }
        return false;
    }

    public static JSONReaderUTF8 of(byte[] bArr, int i, int i2, JSONReader.Context context) {
        boolean zIsASCII;
        MethodHandle methodHandle = JDKUtils.METHOD_HANDLE_HAS_NEGATIVE;
        if (methodHandle != null) {
            try {
                zIsASCII = !(boolean) methodHandle.invoke(bArr, i, i2);
            } catch (Throwable unused) {
                zIsASCII = false;
            }
        } else {
            zIsASCII = IOUtils.isASCII(bArr, i, i2);
        }
        return zIsASCII ? new JSONReaderASCII(context, null, bArr, i, i2) : new JSONReaderUTF8(context, bArr, i, i2);
    }

    public static long parse4Nibbles(byte[] bArr, int i) {
        int iReverseBytes = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i));
        if (JDKUtils.BIG_ENDIAN) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        byte[] bArr2 = JSONFactory.NIBBLES;
        return bArr2[(iReverseBytes >> 24) & 255] | (bArr2[iReverseBytes & 255] << 12) | (bArr2[(iReverseBytes >> 8) & 255] << 8) | (bArr2[(iReverseBytes >> 16) & 255] << 4);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0141 -> B:94:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0115 -> B:77:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:97:0x0136
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private boolean readBoolValue0() {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBoolValue0():boolean");
    }

    private LocalDate readLocalDate0(int i, byte[] bArr, char c) {
        int i2;
        int iMin = Math.min(i + 17, this.end);
        int i3 = -1;
        for (int i4 = i; i4 < iMin; i4++) {
            if (bArr[i4] == c) {
                i3 = i4;
            }
        }
        LocalDate localDateOf = null;
        if (i3 != -1 && (i2 = i3 - i) > 10 && bArr[i3 - 6] == 45 && bArr[i3 - 3] == 45) {
            int i5 = TypeUtils.parseInt(bArr, i, i2 - 6);
            int iDigit2 = IOUtils.digit2(bArr, i3 - 5);
            int iDigit3 = IOUtils.digit2(bArr, i3 + -2);
            localDateOf = (i5 == 0 && iDigit2 == 0 && iDigit3 == 0) ? null : LocalDate.of(i5, iDigit2, iDigit3);
            this.offset = i3 + 1;
            next();
            boolean z = this.ch == ',';
            this.comma = z;
            if (z) {
                next();
            }
        }
        return localDateOf;
    }

    public static UUID readUUID32(byte[] bArr, int i) {
        long j = parse4Nibbles(bArr, i);
        long j2 = parse4Nibbles(bArr, i + 4);
        long j3 = parse4Nibbles(bArr, i + 8);
        long j4 = parse4Nibbles(bArr, i + 12);
        long j5 = parse4Nibbles(bArr, i + 16);
        long j6 = parse4Nibbles(bArr, i + 20);
        long j7 = parse4Nibbles(bArr, i + 24);
        long j8 = parse4Nibbles(bArr, i + 28);
        if ((j | j2 | j3 | j4 | j5 | j6 | j7 | j8) < 0) {
            throw new JSONException("Invalid UUID string:  ".concat(new String(bArr, i, 32, StandardCharsets.ISO_8859_1)));
        }
        return new UUID((j << 48) | (j2 << 32) | (j3 << 16) | j4, (j6 << 32) | (j5 << 48) | (j7 << 16) | j8);
    }

    public static UUID readUUID36(byte[] bArr, int i) {
        long j = parse4Nibbles(bArr, i);
        long j2 = parse4Nibbles(bArr, i + 4);
        long j3 = parse4Nibbles(bArr, i + 9);
        long j4 = parse4Nibbles(bArr, i + 14);
        long j5 = parse4Nibbles(bArr, i + 19);
        long j6 = parse4Nibbles(bArr, i + 24);
        long j7 = parse4Nibbles(bArr, i + 28);
        long j8 = parse4Nibbles(bArr, i + 32);
        if ((j | j2 | j3 | j4 | j5 | j6 | j7 | j8) >= 0) {
            return new UUID((j << 48) | (j2 << 32) | (j3 << 16) | j4, (j5 << 48) | (j6 << 32) | (j7 << 16) | j8);
        }
        throw new JSONException("Invalid UUID string:  ".concat(new String(bArr, i, 36, StandardCharsets.ISO_8859_1)));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x010c -> B:57:0x00f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x0102
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private long readValueHashCode0() {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readValueHashCode0():long");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0031 -> B:8:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:11:0x0028
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipArray(com.alibaba.fastjson2.JSONReaderUTF8 r18, byte[] r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            int r3 = next(r18, r19, r20, r21)
            r4 = 0
            r5 = r4
        Lc:
            char r6 = r0.ch
            r7 = 93
            if (r6 != r7) goto L84
            r5 = 26
            if (r3 != r2) goto L19
            r6 = r3
        L17:
            r3 = r5
            goto L1d
        L19:
            int r6 = r3 + 1
            r3 = r1[r3]
        L1d:
            r8 = 0
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r14 = 32
            if (r3 > r14) goto L3e
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L3e
            if (r6 != r2) goto L34
            goto L17
        L34:
            int r3 = r6 + 1
            r6 = r1[r6]
            r17 = r6
            r6 = r3
            r3 = r17
            goto L1d
        L3e:
            r15 = 44
            if (r3 != r15) goto L60
            if (r6 != r2) goto L46
            r4 = r5
            goto L4b
        L46:
            int r3 = r6 + 1
            r4 = r1[r6]
            goto L5d
        L4b:
            r3 = r4
        L4c:
            if (r3 > r14) goto L5f
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto L5f
            if (r6 != r2) goto L59
            r3 = r5
            goto L4c
        L59:
            int r3 = r6 + 1
            r4 = r1[r6]
        L5d:
            r6 = r3
            goto L4b
        L5f:
            r4 = 1
        L60:
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != 0) goto L70
            if (r3 == r1) goto L70
            if (r3 == r7) goto L70
            if (r3 != r5) goto L6b
            goto L70
        L6b:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r6, r3)
            throw r0
        L70:
            if (r4 == 0) goto L7e
            if (r3 == r1) goto L79
            if (r3 == r7) goto L79
            if (r3 == r5) goto L79
            goto L7e
        L79:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r6, r3)
            throw r0
        L7e:
            r0.comma = r4
            char r1 = (char) r3
            r0.ch = r1
            return r6
        L84:
            if (r5 == 0) goto L90
            boolean r6 = r0.comma
            if (r6 == 0) goto L8b
            goto L90
        L8b:
            com.alibaba.fastjson2.JSONException r0 = r0.valueError()
            throw r0
        L90:
            int r3 = skipValue(r0, r1, r3, r2)
            int r5 = r5 + 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipArray(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0024
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipFalse(com.alibaba.fastjson2.JSONReaderUTF8 r18, byte[] r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r21
            int r2 = r20 + 4
            if (r2 > r1) goto L82
            boolean r3 = com.alibaba.fastjson2.util.IOUtils.notALSE(r19, r20)
            if (r3 != 0) goto L82
            r3 = 26
            if (r2 != r1) goto L15
            r4 = r2
        L13:
            r2 = r3
            goto L19
        L15:
            int r4 = r20 + 5
            r2 = r19[r2]
        L19:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r2 > r11) goto L3a
            long r12 = r9 << r2
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3a
            if (r4 != r1) goto L30
            goto L13
        L30:
            int r2 = r4 + 1
            r4 = r19[r4]
            r17 = r4
            r4 = r2
            r2 = r17
            goto L19
        L3a:
            r12 = 44
            r13 = 93
            r14 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L6f
            if (r4 != r1) goto L47
            r2 = r4
            r4 = r3
            goto L4b
        L47:
            int r2 = r4 + 1
            r4 = r19[r4]
        L4b:
            r17 = r4
            r4 = r2
            r2 = r17
        L50:
            if (r2 > r11) goto L62
            long r15 = r9 << r2
            long r15 = r15 & r7
            int r12 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r12 == 0) goto L62
            if (r4 != r1) goto L5d
            r2 = r3
            goto L50
        L5d:
            int r2 = r4 + 1
            r4 = r19[r4]
            goto L4b
        L62:
            if (r2 == r14) goto L6a
            if (r2 == r13) goto L6a
            if (r2 == r3) goto L6a
            r1 = 1
            goto L7c
        L6a:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r4, r2)
            throw r0
        L6f:
            if (r2 == r14) goto L7b
            if (r2 == r13) goto L7b
            if (r2 != r3) goto L76
            goto L7b
        L76:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r4, r2)
            throw r0
        L7b:
            r1 = 0
        L7c:
            r0.comma = r1
            char r1 = (char) r2
            r0.ch = r1
            return r4
        L82:
            com.alibaba.fastjson2.JSONException r0 = r0.error()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipFalse(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:9:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0028
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipNull(com.alibaba.fastjson2.JSONReaderUTF8 r19, byte[] r20, int r21, int r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            int r3 = r21 + 3
            if (r3 > r2) goto L87
            int r4 = r21 + (-1)
            boolean r4 = com.alibaba.fastjson2.util.IOUtils.notNULL(r1, r4)
            if (r4 != 0) goto L87
            r4 = 26
            if (r3 != r2) goto L19
            r5 = r3
        L17:
            r3 = r4
            goto L1d
        L19:
            int r5 = r21 + 4
            r3 = r1[r3]
        L1d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L3e
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L3e
            if (r5 != r2) goto L34
            goto L17
        L34:
            int r3 = r5 + 1
            r5 = r1[r5]
            r18 = r5
            r5 = r3
            r3 = r18
            goto L1d
        L3e:
            r13 = 44
            r14 = 93
            r15 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L74
            if (r5 != r2) goto L4b
            r3 = r5
            r5 = r4
            goto L4f
        L4b:
            int r3 = r5 + 1
            r5 = r1[r5]
        L4f:
            r18 = r5
            r5 = r3
            r3 = r18
        L54:
            if (r3 > r12) goto L67
            long r16 = r10 << r3
            long r16 = r16 & r8
            int r13 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r13 == 0) goto L67
            if (r5 != r2) goto L62
            r3 = r4
            goto L54
        L62:
            int r3 = r5 + 1
            r5 = r1[r5]
            goto L4f
        L67:
            if (r3 == r15) goto L6f
            if (r3 == r14) goto L6f
            if (r3 == r4) goto L6f
            r1 = 1
            goto L81
        L6f:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L74:
            if (r3 == r15) goto L80
            if (r3 == r14) goto L80
            if (r3 != r4) goto L7b
            goto L80
        L7b:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L80:
            r1 = 0
        L81:
            r0.comma = r1
            char r1 = (char) r3
            r0.ch = r1
            return r5
        L87:
            com.alibaba.fastjson2.JSONException r0 = r0.error()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipNull(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0165  */
    /* JADX WARN: Code duplicated, block: B:138:0x016a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0084 A[ADDED_TO_REGION, LOOP:4: B:51:0x0084->B:56:0x008d, LOOP_START, PHI: r1
      0x0084: PHI (r1v20 int) = (r1v4 int), (r1v24 int) binds: [B:50:0x0082, B:56:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f1  */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00fa, code lost:
    
        r1 = 26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int skipNumber(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        int i3;
        byte b;
        boolean z4;
        byte b2;
        byte b3;
        boolean z5;
        int i4;
        byte b4;
        int i5 = i;
        byte b5 = jSONReaderUTF8.ch;
        if (b5 == 45 || b5 == 43) {
            if (i5 >= i2) {
                throw jSONReaderUTF8.error();
            }
            b5 = bArr[i5];
            i5++;
        }
        if ((b5 == 46) || b5 < 48 || b5 > 57) {
            z2 = false;
        } else {
            while (i5 < i2) {
                byte b6 = bArr[i5];
                if (b6 < 48 || b6 > 57) {
                    break;
                }
                i5++;
            }
            if (i5 == i2) {
                b5 = 26;
            } else {
                b5 = bArr[i5];
                i5++;
            }
            z2 = true;
        }
        if (z2) {
            if (((b5 == 66) | (b5 == 76) | (b5 == 70) | (b5 == 68)) || (b5 == 83)) {
                i3 = i5 + 1;
                b2 = bArr[i5];
            } else {
                if (b5 == 46) {
                    while (i5 < i2) {
                        b3 = bArr[i5];
                        if (b3 < 48) {
                            break;
                        }
                        break;
                        break;
                    }
                    if (i5 == i2) {
                        b5 = 26;
                    } else {
                        b5 = bArr[i5];
                        i5++;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (true) {
                }
                if (b5 != 101) {
                    i3 = i5 + 1;
                    b = bArr[i5];
                    if (b == 43) {
                        if (i3 >= i2) {
                            throw JSONReader.numberError(i3, 43);
                        }
                        b = bArr[i3];
                        i3 = i5 + 2;
                        z4 = true;
                    } else {
                        if (i3 >= i2) {
                            throw JSONReader.numberError(i3, b);
                        }
                        b = bArr[i3];
                        i3 = i5 + 2;
                        z4 = true;
                    }
                    if (b < 48) {
                    }
                    if (true) {
                        throw JSONReader.numberError(i3, b);
                    }
                    b2 = b;
                } else {
                    i3 = i5 + 1;
                    b = bArr[i5];
                    if (b == 43) {
                        if (i3 >= i2) {
                            throw JSONReader.numberError(i3, 43);
                        }
                        b = bArr[i3];
                        i3 = i5 + 2;
                        z4 = true;
                    } else {
                        if (i3 >= i2) {
                            throw JSONReader.numberError(i3, b);
                        }
                        b = bArr[i3];
                        i3 = i5 + 2;
                        z4 = true;
                    }
                    if (b < 48) {
                    }
                    if (true) {
                        throw JSONReader.numberError(i3, b);
                    }
                    b2 = b;
                }
                if (b2 != 70) {
                    if (i3 == i2) {
                        b2 = 26;
                    } else {
                        int i6 = i3 + 1;
                        byte b7 = bArr[i3];
                        i3 = i6;
                        b2 = b7;
                    }
                } else if (i3 == i2) {
                    b2 = 26;
                } else {
                    int i7 = i3 + 1;
                    byte b8 = bArr[i3];
                    i3 = i7;
                    b2 = b8;
                }
            }
        } else {
            if (b5 == 46) {
                while (i5 < i2) {
                    b3 = bArr[i5];
                    if (b3 < 48 || b3 > 57) {
                        break;
                    }
                    i5++;
                }
                if (i5 == i2) {
                    b5 = 26;
                } else {
                    b5 = bArr[i5];
                    i5++;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (false) {
                throw JSONReader.numberError(i5, b5);
            }
            if (b5 != 101 || false) {
                i3 = i5 + 1;
                b = bArr[i5];
                if (b == 43 && true) {
                    z4 = false;
                } else {
                    if (i3 >= i2) {
                        throw JSONReader.numberError(i3, b);
                    }
                    b = bArr[i3];
                    i3 = i5 + 2;
                    z4 = true;
                }
                if (b < 48 && true) {
                    while (i3 < i2) {
                        byte b9 = bArr[i3];
                        if (b9 < 48 || b9 > 57) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == i2) {
                        i5 = i3;
                        b5 = 26;
                    } else {
                        i5 = i3 + 1;
                        b5 = bArr[i3];
                    }
                    byte b10 = b5;
                    i3 = i5;
                    b2 = b10;
                } else {
                    if (true) {
                        throw JSONReader.numberError(i3, b);
                    }
                    b2 = b;
                }
            } else {
                byte b11 = 101;
                i3 = i5;
                b2 = 101;
            }
            if (b2 != 70 || false) {
                if (i3 == i2) {
                    b2 = 26;
                } else {
                    int i8 = i3 + 1;
                    byte b12 = bArr[i3];
                    i3 = i8;
                    b2 = b12;
                }
            }
        }
        while (b2 <= 32 && ((1 << b2) & 4294981377L) != 0) {
            if (i3 == i2) {
                b2 = 26;
            } else {
                int i9 = i3 + 1;
                byte b13 = bArr[i3];
                i3 = i9;
                b2 = b13;
            }
        }
        if (b2 == 44) {
            if (i3 == i2) {
                i4 = i3;
                b4 = 26;
            } else {
                i4 = i3 + 1;
                b4 = bArr[i3];
            }
            loop2: while (true) {
                byte b14 = b4;
                i3 = i4;
                b2 = b14;
                while (true) {
                    if (b2 > 32 || ((1 << b2) & 4294981377L) == 0) {
                        break loop2;
                    }
                    if (i3 == i2) {
                        b2 = 26;
                    }
                }
                i4 = i3 + 1;
                b4 = bArr[i3];
            }
            if (b2 == 125 || b2 == 93 || b2 == 26) {
                throw jSONReaderUTF8.error(i3, b2);
            }
            z5 = true;
        } else {
            if (b2 != 125 && b2 != 93 && b2 != 26 && (!z || b2 != 58)) {
                throw jSONReaderUTF8.error(i3, b2);
            }
            z5 = false;
        }
        jSONReaderUTF8.comma = z5;
        jSONReaderUTF8.ch = (char) b2;
        return i3;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:7:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00c4 -> B:62:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:9:0x0029
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipObject(com.alibaba.fastjson2.JSONReaderUTF8 r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipObject(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    private static int skipSet(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i, int i2) {
        if (nextIfSet(jSONReaderUTF8, bArr, i, i2)) {
            return skipArray(jSONReaderUTF8, bArr, jSONReaderUTF8.offset, i2);
        }
        throw jSONReaderUTF8.error();
    }

    private static int skipString(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        byte b;
        byte b2;
        byte b3 = jSONReaderUTF8.ch;
        int i4 = i;
        int iIndexOfQuote = IOUtils.indexOfQuote(bArr, b3, i4, i2);
        if (iIndexOfQuote != -1) {
            while (true) {
                int iIndexOfSlash = indexOfSlash(jSONReaderUTF8, bArr, i4, i2);
                if (iIndexOfSlash != -1 && iIndexOfSlash <= iIndexOfQuote) {
                    byte b4 = bArr[iIndexOfSlash + 1];
                    if (b4 == 117) {
                        i4 = iIndexOfSlash + 6;
                    } else if (b4 == 120) {
                        i4 = iIndexOfSlash + 4;
                    } else {
                        if (b4 != 92 && b4 != 34 && b4 != 110) {
                            jSONReaderUTF8.char1(b4);
                        }
                        i4 = iIndexOfSlash + 2;
                    }
                    if (i4 > iIndexOfQuote && (iIndexOfQuote = IOUtils.indexOfQuote(bArr, b3, i4, i2)) == -1) {
                        b3 = b4;
                        break;
                    }
                } else {
                    int i5 = iIndexOfQuote + 1;
                    if (i5 == i2) {
                        b2 = 26;
                    } else {
                        b2 = bArr[i5];
                        i5 = iIndexOfQuote + 2;
                    }
                    byte b5 = b2;
                    i4 = i5;
                    b3 = b5;
                    break;
                }
            }
        }
        if (iIndexOfQuote == -1) {
            throw jSONReaderUTF8.error("invalid escape character EOI");
        }
        while (b3 <= 32 && ((1 << b3) & 4294981377L) != 0) {
            if (i4 == i2) {
                b3 = 26;
            } else {
                int i6 = i4 + 1;
                byte b6 = bArr[i4];
                i4 = i6;
                b3 = b6;
            }
        }
        if (b3 == 44) {
            if (i4 == i2) {
                i3 = i4;
                b = 26;
            } else {
                i3 = i4 + 1;
                b = bArr[i4];
            }
            loop2: while (true) {
                byte b7 = b;
                i4 = i3;
                b3 = b7;
                while (true) {
                    if (b3 > 32 || ((1 << b3) & 4294981377L) == 0) {
                        break loop2;
                    }
                    if (i4 == i2) {
                        b3 = 26;
                    }
                }
                i3 = i4 + 1;
                b = bArr[i4];
            }
            if (b3 == 125 || b3 == 93 || b3 == 26) {
                throw jSONReaderUTF8.error(i4, b3);
            }
            z = true;
        } else {
            if (b3 != 125 && b3 != 93 && b3 != 26) {
                throw jSONReaderUTF8.error(i4, b3);
            }
            z = false;
        }
        jSONReaderUTF8.comma = z;
        jSONReaderUTF8.ch = (char) b3;
        return i4;
    }

    private static int skipStringEscaped(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        int i4 = 92;
        while (true) {
            if (i4 == 92) {
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b == 117) {
                    i5 = i3 + 5;
                } else if (b == 120) {
                    i5 = i3 + 3;
                } else if (b != 92 && b != 34) {
                    jSONReaderUTF8.char1(b);
                }
                i3 = i5 + 1;
                i4 = bArr[i5];
            } else {
                if (i4 == i2) {
                    return i3;
                }
                i4 = bArr[i3];
                i3++;
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:9:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0028
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipTrue(com.alibaba.fastjson2.JSONReaderUTF8 r19, byte[] r20, int r21, int r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            int r3 = r21 + 3
            if (r3 > r2) goto L87
            int r4 = r21 + (-1)
            boolean r4 = com.alibaba.fastjson2.util.IOUtils.notTRUE(r1, r4)
            if (r4 != 0) goto L87
            r4 = 26
            if (r3 != r2) goto L19
            r5 = r3
        L17:
            r3 = r4
            goto L1d
        L19:
            int r5 = r21 + 4
            r3 = r1[r3]
        L1d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L3e
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L3e
            if (r5 != r2) goto L34
            goto L17
        L34:
            int r3 = r5 + 1
            r5 = r1[r5]
            r18 = r5
            r5 = r3
            r3 = r18
            goto L1d
        L3e:
            r13 = 44
            r14 = 93
            r15 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L74
            if (r5 != r2) goto L4b
            r3 = r5
            r5 = r4
            goto L4f
        L4b:
            int r3 = r5 + 1
            r5 = r1[r5]
        L4f:
            r18 = r5
            r5 = r3
            r3 = r18
        L54:
            if (r3 > r12) goto L67
            long r16 = r10 << r3
            long r16 = r16 & r8
            int r13 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r13 == 0) goto L67
            if (r5 != r2) goto L62
            r3 = r4
            goto L54
        L62:
            int r3 = r5 + 1
            r5 = r1[r5]
            goto L4f
        L67:
            if (r3 == r15) goto L6f
            if (r3 == r14) goto L6f
            if (r3 == r4) goto L6f
            r1 = 1
            goto L81
        L6f:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L74:
            if (r3 == r15) goto L80
            if (r3 == r14) goto L80
            if (r3 != r4) goto L7b
            goto L80
        L7b:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L80:
            r1 = 0
        L81:
            r0.comma = r1
            char r1 = (char) r3
            r0.ch = r1
            return r5
        L87:
            com.alibaba.fastjson2.JSONException r0 = r0.error()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipTrue(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    private static int skipValue(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i, int i2) {
        char c = jSONReaderUTF8.ch;
        if (c == '\"' || c == '\'') {
            return skipString(jSONReaderUTF8, bArr, i, i2);
        }
        if (c == 'S') {
            return skipSet(jSONReaderUTF8, bArr, i, i2);
        }
        if (c == '[') {
            return skipArray(jSONReaderUTF8, bArr, i, i2);
        }
        if (c == 'f') {
            return skipFalse(jSONReaderUTF8, bArr, i, i2);
        }
        if (c == 'n') {
            return skipNull(jSONReaderUTF8, bArr, i, i2);
        }
        if (c != 't') {
            return c != '{' ? skipNumber(jSONReaderUTF8, bArr, i, i2, false) : skipObject(jSONReaderUTF8, bArr, i, i2);
        }
        return skipTrue(jSONReaderUTF8, bArr, i, i2);
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        JSONFactory.CacheItem cacheItem = this.cacheItem;
        if (cacheItem != null) {
            byte[] bArr = this.bytes;
            if (bArr.length < 8388608) {
                JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArr);
            }
        }
        InputStream inputStream = this.in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x014a  */
    @Override // com.alibaba.fastjson2.JSONReader
    public String getFieldName() {
        int i;
        byte[] bArr = this.bytes;
        int i2 = this.nameBegin;
        int i3 = this.nameEnd;
        int i4 = i3 - i2;
        if (!this.nameEscape) {
            boolean z = this.nameAscii;
            if (z) {
                if (JDKUtils.STRING_CREATOR_JDK8 != null) {
                    return JDKUtils.asciiStringJDK8(bArr, i2, i4);
                }
                BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
                if (biFunction != null) {
                    return biFunction.apply(Arrays.copyOfRange(bArr, i2, i3), JDKUtils.LATIN1);
                }
                if (JDKUtils.ANDROID) {
                    return getLatin1String(i2, i4);
                }
            }
            return new String(bArr, i2, i4, z ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8);
        }
        char[] cArrCopyOf = new char[this.nameLength + 4];
        int i5 = this.end;
        int i6 = 0;
        while (i2 < this.nameEnd) {
            if (i6 + 2 >= cArrCopyOf.length) {
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length + 8);
            }
            int iHexDigit4 = bArr[i2];
            if (iHexDigit4 < 0) {
                int i7 = iHexDigit4 & 255;
                switch (i7 >> 4) {
                    case 12 /* 12 */:
                    case 13:
                        int iChar2_utf8 = char2_utf8(i7, bArr[i2 + 1], i2);
                        i2 += 2;
                        i = i6 + 1;
                        cArrCopyOf[i6] = (char) iChar2_utf8;
                        break;
                    case 14 /* 14 */:
                        int iChar2_utf9 = char2_utf8(i7, bArr[i2 + 1], bArr[i2 + 2], i2);
                        i2 += 3;
                        i = i6 + 1;
                        cArrCopyOf[i6] = (char) iChar2_utf9;
                        break;
                    case 15:
                        int i8 = i2 + 3;
                        if (i8 >= bArr.length) {
                            throw new JSONException(AbstractC1194.m2779(i2, "malformed input around byte "));
                        }
                        byte b = bArr[i2 + 1];
                        byte b2 = bArr[i2 + 2];
                        byte b3 = bArr[i8];
                        if (true) {
                            throw new JSONException(AbstractC1194.m2779(i2, "malformed input around byte "));
                        }
                        int i9 = ((iHexDigit4 & 7) << 18) | ((b & 63) << 12) | ((b2 & 63) << 6) | (b3 & 63);
                        if (i9 < 65536 || i9 > 1114111) {
                            throw new JSONException(AbstractC1194.m2779(i2, "malformed input around byte "));
                        }
                        i2 += 4;
                        int i10 = i6 + 1;
                        cArrCopyOf[i6] = Character.highSurrogate(i9);
                        i6 += 2;
                        cArrCopyOf[i10] = Character.lowSurrogate(i9);
                        continue;
                        break;
                    default:
                        throw new JSONException(AbstractC1194.m2779(i2, "malformed input around byte "));
                }
            } else {
                if (iHexDigit4 == 92) {
                    int i11 = i2 + 1;
                    char c = (char) bArr[i11];
                    if (c == '\"' || c == ':' || c == '@' || c == '\\') {
                        i2 = i11;
                        iHexDigit4 = c;
                    } else if (c == 'u') {
                        iHexDigit4 = IOUtils.hexDigit4(bArr, i2 + 2, i5);
                        i2 += 5;
                    } else if (c == 'x') {
                        byte b4 = bArr[i2 + 2];
                        i2 += 3;
                        iHexDigit4 = JSONReader.char2(b4, bArr[i2]);
                    } else if (c != '*' && c != '+') {
                        switch (c) {
                            default:
                                switch (c) {
                                    case '<':
                                    case '=':
                                    case '>':
                                        break;
                                    default:
                                        iHexDigit4 = char1(c);
                                        i2 = i11;
                                        break;
                                }
                            case '-':
                            case 46 /* 46 */:
                            case '/':
                                i2 = i11;
                                iHexDigit4 = c;
                                break;
                        }
                    } else {
                        i2 = i11;
                        iHexDigit4 = c;
                    }
                } else if (iHexDigit4 == 34) {
                    return new String(cArrCopyOf, 0, i6);
                }
                i = i6 + 1;
                cArrCopyOf[i6] = (char) iHexDigit4;
                i2++;
            }
            i6 = i;
        }
        return new String(cArrCopyOf, 0, i6);
    }

    public final String getLatin1String(int i, int i2) {
        if (JDKUtils.ANDROID_SDK_INT >= 34) {
            return new String(this.bytes, i, i2, StandardCharsets.ISO_8859_1);
        }
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        if (andSet == null || andSet.length < i2) {
            andSet = new char[i2];
        }
        for (int i3 = 0; i3 < i2; i3++) {
            andSet[i3] = (char) (this.bytes[i + i3] & -1);
        }
        String str = new String(andSet, 0, i2);
        JSONFactory.CHARS_UPDATER.lazySet(cacheItem, andSet);
        return str;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
        char c;
        char c2;
        int i;
        int i2;
        int iChar1;
        int iHexDigit4;
        int i3;
        int i4;
        int i5;
        int i6 = this.nameBegin;
        int i7 = this.end;
        byte[] bArr = this.bytes;
        int i8 = (i6 <= 0 || bArr[i6 + (-1)] != '\'') ? '\"' : '\'';
        int i9 = 0;
        long j = 0;
        while (true) {
            c = '-';
            c2 = ' ';
            if (i6 >= i7) {
                break;
            }
            int iHexDigit5 = bArr[i6];
            if (iHexDigit5 != 92) {
                if (iHexDigit5 != -61 && iHexDigit5 != -62) {
                    if (iHexDigit5 != i8) {
                        break;
                    }
                    break;
                }
                i6++;
                iHexDigit5 = ((iHexDigit5 & 31) << 6) | (bArr[i6] & '?');
            } else {
                int i10 = i6 + 1;
                int i11 = bArr[i10];
                if (i11 == 117) {
                    iHexDigit5 = IOUtils.hexDigit4(bArr, i6 + 2, i7);
                    i6 += 5;
                } else if (i11 != 120) {
                    iHexDigit5 = char1(i11);
                    i6 = i10;
                } else {
                    int i12 = bArr[i6 + 2];
                    i6 += 3;
                    iHexDigit5 = JSONReader.char2(i12, bArr[i6]);
                }
            }
            if (i9 >= 8 || iHexDigit5 > 255 || iHexDigit5 < 0 || (i9 == 0 && iHexDigit5 == 0)) {
                i6 = this.nameBegin;
                j = 0;
                break;
            }
            if ((iHexDigit5 != 95 && iHexDigit5 != 45 && iHexDigit5 != 32) || (i5 = bArr[i6 + 1]) == 34 || i5 == 39 || i5 == iHexDigit5) {
                if (iHexDigit5 >= 65 && iHexDigit5 <= 90) {
                    iHexDigit5 = (char) (iHexDigit5 + 32);
                }
                j |= ((long) iHexDigit5) << (i9 << 3);
                i9++;
            }
            i6++;
        }
        if (j != 0) {
            return j;
        }
        boolean z = this.nameAscii;
        long j2 = -3750763034362895579L;
        if (z && !this.nameEscape) {
            for (int i13 = this.nameBegin; i13 < this.nameEnd; i13++) {
                int i14 = bArr[i13];
                if (i14 >= 65 && i14 <= 90) {
                    i14 += 32;
                }
                if ((i14 == 95 || i14 == 45 || i14 == 32) && (i4 = bArr[i13 + 1]) != 34) {
                    if (i4 == 39 || i4 == i14) {
                    }
                }
                j2 = (j2 ^ ((long) i14)) * 1099511628211L;
            }
            return j2;
        }
        while (true) {
            int i15 = bArr[i6];
            if (i15 == 92) {
                int i16 = i6 + 1;
                int i17 = bArr[i16];
                if (i17 != 117) {
                    if (i17 != 120) {
                        iChar1 = char1(i17);
                    } else {
                        int i18 = bArr[i6 + 2];
                        i3 = i6 + 3;
                        iHexDigit4 = JSONReader.char2(i18, bArr[i3]);
                    }
                    i2 = i16 + 1;
                } else {
                    iHexDigit4 = IOUtils.hexDigit4(bArr, i6 + 2, i7);
                    i3 = i6 + 5;
                }
                int i19 = iHexDigit4;
                i16 = i3;
                iChar1 = i19;
                i2 = i16 + 1;
            } else {
                if (i15 == i8) {
                    return j2;
                }
                if (i15 >= 0) {
                    if (i15 >= 65 && i15 <= 90) {
                        i15 += 32;
                    }
                    i = i6 + 1;
                } else {
                    switch ((i15 & 255) >> 4) {
                        case 12 /* 12 */:
                        case 13:
                            i15 = ((i15 & 31) << 6) | (bArr[i6 + 1] & '?');
                            i = i6 + 2;
                            break;
                        case 14 /* 14 */:
                            i15 = ((i15 & 15) << 12) | ((bArr[i6 + 1] & '?') << 6) | (bArr[i6 + 2] & '?');
                            i = i6 + 3;
                            break;
                        default:
                            throw new JSONException(AbstractC1194.m2779(i6, "malformed input around byte "));
                    }
                }
                int i20 = i15;
                i2 = i;
                iChar1 = 0;
            }
            if (iChar1 != 95 && iChar1 != 45 && iChar1 != 32) {
                j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
            }
            i6 = i2;
            c2 = ' ';
            c = '-';
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getRawInt() {
        int i = this.offset;
        int i2 = i + 3;
        byte[] bArr = this.bytes;
        if (i2 < bArr.length) {
            return JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i)) - 1);
        }
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long getRawLong() {
        int i = this.offset;
        int i2 = i + 8;
        byte[] bArr = this.bytes;
        if (i2 < bArr.length) {
            return JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i)) - 1);
        }
        return 0L;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String getString() {
        String str = this.stringValue;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.bytes;
        int i = this.nameBegin;
        int i2 = this.end;
        int i3 = this.nameEnd - i;
        if (!this.nameEscape) {
            if (JDKUtils.ANDROID) {
                return getLatin1String(i, i3);
            }
            return new String(bArr, i, i3, this.nameAscii ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8);
        }
        char[] cArr = new char[this.nameLength];
        int i4 = 0;
        while (true) {
            int iHexDigit4 = bArr[i];
            if (iHexDigit4 < 0) {
                int i5 = iHexDigit4 & 255;
                switch (i5 >> 4) {
                    case 12 /* 12 */:
                    case 13:
                        byte b = bArr[i + 1];
                        if (true) {
                            throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
                        }
                        i5 = (b & 63) | ((iHexDigit4 & 31) << 6);
                        i += 2;
                        cArr[i4] = (char) i5;
                        break;
                        break;
                    case 14 /* 14 */:
                        byte b2 = bArr[i + 1];
                        int i6 = i + 2;
                        byte b3 = bArr[i6];
                        if (true) {
                            throw new JSONException(AbstractC1194.m2779(i6, "malformed input around byte "));
                        }
                        i5 = (b3 & 63) | ((iHexDigit4 & 15) << 12) | ((b2 & 63) << 6);
                        i += 3;
                        cArr[i4] = (char) i5;
                        break;
                        break;
                    default:
                        if ((iHexDigit4 >> 3) != -2) {
                            i++;
                            cArr[i4] = (char) i5;
                        } else {
                            byte b4 = bArr[i + 1];
                            byte b5 = bArr[i + 2];
                            byte b6 = bArr[i + 3];
                            i += 4;
                            int i7 = (((iHexDigit4 << 18) ^ (b4 << 12)) ^ (b5 << 6)) ^ (3678080 ^ b6);
                            if (true) {
                                throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
                            }
                            int i8 = i4 + 1;
                            cArr[i4] = (char) ((i7 >>> 10) + 55232);
                            cArr[i8] = (char) ((i7 & 1023) + 56320);
                            i4 = i8;
                        }
                        break;
                }
            } else {
                if (iHexDigit4 == 92) {
                    int i9 = i + 1;
                    char c = (char) bArr[i9];
                    if (c == '\"' || c == '\\') {
                        i = i9;
                        iHexDigit4 = c;
                    } else if (c == 'u') {
                        iHexDigit4 = IOUtils.hexDigit4(bArr, i + 2, i2);
                        i += 5;
                    } else if (c != 'x') {
                        iHexDigit4 = char1(c);
                        i = i9;
                    } else {
                        byte b7 = bArr[i + 2];
                        i += 3;
                        iHexDigit4 = JSONReader.char2(b7, bArr[i]);
                    }
                } else if (iHexDigit4 == 34) {
                    String str2 = new String(cArr);
                    this.stringValue = str2;
                    return str2;
                }
                cArr[i4] = (char) iHexDigit4;
                i++;
            }
            i4++;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getStringLength() {
        int i;
        byte b = this.ch;
        if (b != 34 && b != 39) {
            throw new JSONException("string length only support string input " + this.ch);
        }
        int i2 = this.offset;
        byte[] bArr = this.bytes;
        int i3 = i2 + 8;
        if (i3 >= this.end || i3 >= bArr.length || bArr[i2] == b || bArr[i2 + 1] == b || bArr[i2 + 2] == b || bArr[i2 + 3] == b || bArr[i2 + 4] == b || bArr[i2 + 5] == b || bArr[i2 + 6] == b || bArr[i2 + 7] == b) {
            i = 0;
        } else {
            i = 8;
            i2 = i3;
        }
        while (i2 < this.end && bArr[i2] != b) {
            i2++;
            i++;
        }
        return i;
    }

    public final String info(String str, int i) {
        return info(str).concat(Integer.toString(i));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isNull() {
        int i;
        return this.ch == 'n' && (i = this.offset) < this.end && this.bytes[i] == 117;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isReference() {
        int i;
        int i2;
        if ((this.context.features & 8589934592L) != 0) {
            return false;
        }
        byte[] bArr = this.bytes;
        if (this.ch != '{' || (i = this.offset) == (i2 = this.end)) {
            return false;
        }
        byte b = bArr[i];
        while (b <= 32 && ((1 << b) & 4294981377L) != 0) {
            i++;
            if (i >= i2) {
                return false;
            }
            b = bArr[i];
        }
        if (i + 6 < i2 && bArr[i + 5] == b && JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i) + 1) == REF) {
            return isReference0(bArr, i, i2, b);
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x000b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x0013
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
        /*
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 < r2) goto Ld
            r2 = r1
        Lb:
            r1 = r3
            goto L11
        Ld:
            int r2 = r1 + 1
            r1 = r0[r1]
        L11:
            r4 = 32
            if (r1 > r4) goto L31
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r1 = r9.end
            if (r2 != r1) goto L29
            goto Lb
        L29:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        L31:
            if (r1 >= 0) goto L37
            r9.char_utf8(r1, r2)
            return
        L37:
            r9.offset = r2
            char r0 = (char) r1
            r9.ch = r0
            r0 = 47
            if (r1 != r0) goto L43
            r9.skipComment()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.next():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0031 -> B:9:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0026
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfArrayEnd() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.ch
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            r4 = 93
            if (r1 == r4) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = r0.end
            r4 = 26
            if (r3 != r1) goto L17
            r1 = r3
        L15:
            r3 = r4
            goto L1b
        L17:
            int r1 = r3 + 1
            r3 = r2[r3]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r3 > r11) goto L3e
            long r12 = r9 << r3
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r3 = r0.end
            if (r1 != r3) goto L34
            goto L15
        L34:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r3 != r12) goto L69
            r0.comma = r13
            int r3 = r0.end
            if (r1 != r3) goto L4c
            r3 = r1
            r1 = r4
            goto L50
        L4c:
            int r3 = r1 + 1
            r1 = r2[r1]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r3 > r11) goto L69
            long r14 = r9 << r3
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r3 = r0.end
            if (r1 != r3) goto L64
            r3 = r4
            goto L55
        L64:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L50
        L69:
            if (r3 >= 0) goto L6f
            r0.char_utf8(r3, r1)
            return r13
        L6f:
            char r2 = (char) r3
            r0.ch = r2
            r0.offset = r1
            r1 = 47
            if (r3 != r1) goto L7b
            r0.skipComment()
        L7b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfArrayEnd():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002e -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfArrayStart() {
        /*
            r9 = this;
            char r0 = r9.ch
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 != r2) goto L15
            r2 = r1
        L13:
            r1 = r3
            goto L19
        L15:
            int r2 = r1 + 1
            r1 = r0[r1]
        L19:
            r4 = 32
            if (r1 > r4) goto L39
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L39
            int r1 = r9.end
            if (r2 != r1) goto L31
            goto L13
        L31:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r0 = 1
            if (r1 >= 0) goto L40
            r9.char_utf8(r1, r2)
            return r0
        L40:
            char r3 = (char) r1
            r9.ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfArrayStart():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004b -> B:18:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x0040
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfComma() {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            char r2 = r14.ch
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L2a
            int r2 = r14.end
            if (r1 != r2) goto L22
            r2 = r10
            goto L6
        L22:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            r11 = 44
            if (r2 == r11) goto L35
            r14.offset = r1
            char r0 = (char) r2
            r14.ch = r0
            r0 = 0
            return r0
        L35:
            int r2 = r14.end
            if (r1 != r2) goto L3c
            r2 = r1
        L3a:
            r1 = r10
            goto L40
        L3c:
            int r2 = r1 + 1
            r1 = r0[r1]
        L40:
            if (r1 > r9) goto L56
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L56
            int r1 = r14.end
            if (r2 != r1) goto L4e
            goto L3a
        L4e:
            int r1 = r2 + 1
            r2 = r0[r2]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L40
        L56:
            r0 = 1
            if (r1 >= 0) goto L5d
            r14.char_utf8(r1, r2)
            return r0
        L5d:
            r14.offset = r2
            char r2 = (char) r1
            r14.ch = r2
            r2 = 47
            if (r1 != r2) goto L69
            r14.skipComment()
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfComma():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0062 -> B:23:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:26:0x004f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfInfinity() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.ch
            r3 = 73
            if (r2 != r3) goto L74
            int r2 = r1 + 6
            int r3 = r10.end
            if (r2 >= r3) goto L74
            r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L74
            int r4 = r1 + 1
            r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 2
            r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 3
            r4 = r0[r4]
            if (r4 != r5) goto L74
            int r4 = r1 + 4
            r4 = r0[r4]
            if (r4 != r6) goto L74
            int r4 = r1 + 5
            r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L74
            r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L74
            int r2 = r1 + 7
            r4 = 26
            if (r2 != r3) goto L49
            r1 = r2
        L47:
            r2 = r4
            goto L4d
        L49:
            int r1 = r1 + 8
            r2 = r0[r2]
        L4d:
            r3 = 32
            if (r2 > r3) goto L6d
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L6d
            int r2 = r10.end
            if (r1 != r2) goto L65
            goto L47
        L65:
            int r2 = r1 + 1
            r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L4d
        L6d:
            r10.offset = r1
            char r0 = (char) r2
            r10.ch = r0
            r0 = 1
            return r0
        L74:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfInfinity():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0044 -> B:17:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x0039
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatch(char r15) {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            char r2 = r14.ch
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L2a
            int r2 = r14.end
            if (r1 != r2) goto L22
            r2 = r10
            goto L6
        L22:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            if (r2 == r15) goto L2e
            r15 = 0
            return r15
        L2e:
            int r15 = r14.end
            if (r1 != r15) goto L35
            r15 = r1
        L33:
            r1 = r10
            goto L39
        L35:
            int r15 = r1 + 1
            r1 = r0[r1]
        L39:
            if (r1 > r9) goto L4f
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L4f
            int r1 = r14.end
            if (r15 != r1) goto L47
            goto L33
        L47:
            int r1 = r15 + 1
            r15 = r0[r15]
            r13 = r1
            r1 = r15
            r15 = r13
            goto L39
        L4f:
            r0 = 1
            if (r1 >= 0) goto L56
            r14.char_utf8(r1, r15)
            return r0
        L56:
            r14.offset = r15
            char r15 = (char) r1
            r14.ch = r15
            r15 = 47
            if (r1 != r15) goto L62
            r14.skipComment()
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatch(char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0035 -> B:13:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x0022
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r9, char r10) {
        /*
            r8 = this;
            char r0 = r8.ch
            r1 = 0
            if (r0 == r9) goto L6
            return r1
        L6:
            byte[] r9 = r8.bytes
            int r0 = r8.offset
            int r2 = r0 + 1
            int r3 = r8.end
            if (r2 > r3) goto L68
            r4 = r9[r0]
            if (r4 == r10) goto L15
            goto L68
        L15:
            r10 = 26
            if (r2 != r3) goto L1c
            r0 = r2
        L1a:
            r2 = r10
            goto L20
        L1c:
            int r0 = r0 + 2
            r2 = r9[r2]
        L20:
            r3 = 32
            if (r2 > r3) goto L40
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L40
            int r2 = r8.end
            if (r0 != r2) goto L38
            goto L1a
        L38:
            int r2 = r0 + 1
            r0 = r9[r0]
            r7 = r2
            r2 = r0
            r0 = r7
            goto L20
        L40:
            int r9 = r8.offset
            int r9 = r9 + 2
            if (r0 != r9) goto L61
            if (r2 == r10) goto L61
            r9 = 40
            if (r2 == r9) goto L61
            r9 = 91
            if (r2 == r9) goto L61
            r9 = 93
            if (r2 == r9) goto L61
            r9 = 41
            if (r2 == r9) goto L61
            r9 = 58
            if (r2 == r9) goto L61
            r9 = 44
            if (r2 == r9) goto L61
            return r1
        L61:
            r8.offset = r0
            char r9 = (char) r2
            r8.ch = r9
            r9 = 1
            return r9
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match10(long j) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 12;
        if (i4 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i4)) - 9) != j || bArr[i3 + 11] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match11(long j) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 13;
        if (i4 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i4)) - 10) != j || bArr[i3 + 11] != 34 || bArr[i3 + 12] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match12(long j, byte b) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 14;
        if (i4 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i4)) - 11) != j || bArr[i3 + 11] != b || bArr[i3 + 12] != 34 || bArr[i3 + 13] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match13(long j, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset + 15;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j3 = i4;
        if (unsafe.getLong(bArr, (j2 + j3) - 12) != j || unsafe.getInt(bArr, (j2 + j3) - 4) != i) {
            return false;
        }
        while (true) {
            i2 = i4 + 1;
            i3 = bArr[i4] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i4 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match14(long j, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 16;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j3 = i5;
        if (unsafe.getLong(bArr, (j2 + j3) - 13) != j || unsafe.getInt(bArr, (j2 + j3) - 5) != i || bArr[i4 + 15] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match15(long j, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 17;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j3 = i5;
        if (unsafe.getLong(bArr, (j2 + j3) - 14) != j || unsafe.getInt(bArr, (j2 + j3) - 6) != i || bArr[i4 + 15] != 34 || bArr[i4 + 16] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match16(long j, int i, byte b) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 18;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j3 = i5;
        if (unsafe.getLong(bArr, (j2 + j3) - 15) != j || unsafe.getInt(bArr, (j2 + j3) - 7) != i || bArr[i4 + 15] != b || bArr[i4 + 16] != 34 || bArr[i4 + 17] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match17(long j, long j2) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset + 19;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i3;
        if (unsafe.getLong(bArr, (j3 + j4) - 16) != j || unsafe.getLong(bArr, (j3 + j4) - 8) != j2) {
            return false;
        }
        while (true) {
            i = i3 + 1;
            i2 = bArr[i3] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i3 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match18(long j, long j2) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 20;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i4;
        if (unsafe.getLong(bArr, (j3 + j4) - 17) != j || unsafe.getLong(bArr, (j3 + j4) - 9) != j2 || bArr[i3 + 19] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match19(long j, long j2) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 21;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i4;
        if (unsafe.getLong(bArr, (j3 + j4) - 18) != j || unsafe.getLong(bArr, (j3 + j4) - 10) != j2 || bArr[i3 + 19] != 34 || bArr[i3 + 20] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match2() {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 4;
        if (i4 >= this.end || bArr[i3 + 3] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match20(long j, long j2, byte b) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 22;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i4;
        if (unsafe.getLong(bArr, (j3 + j4) - 19) != j || unsafe.getLong(bArr, (j3 + j4) - 11) != j2 || bArr[i3 + 19] != b || bArr[i3 + 20] != 34 || bArr[i3 + 21] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match21(long j, long j2, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset + 23;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i4;
        if (unsafe.getLong(bArr, (j3 + j4) - 20) != j || unsafe.getLong(bArr, (j3 + j4) - 12) != j2 || unsafe.getInt(bArr, (j3 + j4) - 4) != i) {
            return false;
        }
        while (true) {
            i2 = i4 + 1;
            i3 = bArr[i4] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i4 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match22(long j, long j2, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 24;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i5;
        if (unsafe.getLong(bArr, (j3 + j4) - 21) != j || unsafe.getLong(bArr, (j3 + j4) - 13) != j2 || unsafe.getInt(bArr, (j3 + j4) - 5) != i || bArr[i4 + 23] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match23(long j, long j2, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 25;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i5;
        if (unsafe.getLong(bArr, (j3 + j4) - 22) != j || unsafe.getLong(bArr, (j3 + j4) - 14) != j2 || unsafe.getInt(bArr, (j3 + j4) - 6) != i || bArr[i4 + 23] != 34 || bArr[i4 + 24] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match24(long j, long j2, int i, byte b) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 26;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i5;
        if (unsafe.getLong(bArr, (j3 + j4) - 23) != j || unsafe.getLong(bArr, (j3 + j4) - 15) != j2 || unsafe.getInt(bArr, (j3 + j4) - 7) != i || bArr[i4 + 23] != b || bArr[i4 + 24] != 34 || bArr[i4 + 25] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match25(long j, long j2, long j3) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset + 27;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i3;
        if (unsafe.getLong(bArr, (j4 + j5) - 24) != j || unsafe.getLong(bArr, (j4 + j5) - 16) != j2 || unsafe.getLong(bArr, (j4 + j5) - 8) != j3) {
            return false;
        }
        while (true) {
            i = i3 + 1;
            i2 = bArr[i3] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i3 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match26(long j, long j2, long j3) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 28;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i4;
        if (unsafe.getLong(bArr, (j4 + j5) - 25) != j || unsafe.getLong(bArr, (j4 + j5) - 17) != j2 || unsafe.getLong(bArr, (j4 + j5) - 9) != j3 || bArr[i3 + 27] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match27(long j, long j2, long j3) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 29;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i4;
        if (unsafe.getLong(bArr, (j4 + j5) - 26) != j || unsafe.getLong(bArr, (j4 + j5) - 18) != j2 || unsafe.getLong(bArr, (j4 + j5) - 10) != j3 || bArr[i3 + 27] != 34 || bArr[i3 + 28] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match28(long j, long j2, long j3, byte b) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 30;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i4;
        if (unsafe.getLong(bArr, (j4 + j5) - 27) != j || unsafe.getLong(bArr, (j4 + j5) - 19) != j2 || unsafe.getLong(bArr, (j4 + j5) - 11) != j3 || bArr[i3 + 27] != b || bArr[i3 + 28] != 34 || bArr[i3 + 29] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match29(long j, long j2, long j3, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset + 31;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i4;
        if (unsafe.getLong(bArr, (j4 + j5) - 28) != j || unsafe.getLong(bArr, (j4 + j5) - 20) != j2 || unsafe.getLong(bArr, (j4 + j5) - 12) != j3 || unsafe.getInt(bArr, (j4 + j5) - 4) != i) {
            return false;
        }
        while (true) {
            i2 = i4 + 1;
            i3 = bArr[i4] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i4 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match3() {
        int i;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 5;
        if (i3 >= this.end || bArr[i2 + 3] != 34 || bArr[i2 + 4] != 58) {
            return false;
        }
        while (true) {
            i = bArr[i3] & -1;
            if (i > 32 || ((1 << i) & 4294981377L) == 0) {
                break;
            }
            i3++;
        }
        this.offset = i3 + 1;
        this.ch = (char) i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match30(long j, long j2, long j3, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 32;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i5;
        if (unsafe.getLong(bArr, (j4 + j5) - 29) != j || unsafe.getLong(bArr, (j4 + j5) - 21) != j2 || unsafe.getLong(bArr, (j4 + j5) - 13) != j3 || unsafe.getInt(bArr, (j4 + j5) - 5) != i || bArr[i4 + 31] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match31(long j, long j2, long j3, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 33;
        if (i5 >= this.end || bArr[i4 + 31] != 34 || bArr[i4 + 32] != 58) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i5;
        if (unsafe.getLong(bArr, (j4 + j5) - 30) != j || unsafe.getLong(bArr, (j4 + j5) - 22) != j2 || unsafe.getLong(bArr, (j4 + j5) - 14) != j3 || unsafe.getInt(bArr, (j4 + j5) - 6) != i) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match32(long j, long j2, long j3, int i, byte b) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 34;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i5;
        if (unsafe.getLong(bArr, (j4 + j5) - 31) != j || unsafe.getLong(bArr, (j4 + j5) - 23) != j2 || unsafe.getLong(bArr, (j4 + j5) - 15) != j3 || unsafe.getInt(bArr, (j4 + j5) - 7) != i || bArr[i4 + 31] != b || bArr[i4 + 32] != 34 || bArr[i4 + 33] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match33(long j, long j2, long j3, long j4) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset + 35;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i3;
        if (unsafe.getLong(bArr, (j5 + j6) - 32) != j || unsafe.getLong(bArr, (j5 + j6) - 24) != j2 || unsafe.getLong(bArr, (j5 + j6) - 16) != j3 || unsafe.getLong(bArr, (j5 + j6) - 8) != j4) {
            return false;
        }
        while (true) {
            i = i3 + 1;
            i2 = bArr[i3] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i3 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match34(long j, long j2, long j3, long j4) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 36;
        if (i4 >= this.end || bArr[i3 + 35] != 58) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i4;
        if (unsafe.getLong(bArr, (j5 + j6) - 33) != j || unsafe.getLong(bArr, (j5 + j6) - 25) != j2 || unsafe.getLong(bArr, (j5 + j6) - 17) != j3 || unsafe.getLong(bArr, (j5 + j6) - 9) != j4) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match35(long j, long j2, long j3, long j4) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 37;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i4;
        if (unsafe.getLong(bArr, (j5 + j6) - 34) != j || unsafe.getLong(bArr, (j5 + j6) - 26) != j2 || unsafe.getLong(bArr, (j5 + j6) - 18) != j3 || unsafe.getLong(bArr, (j5 + j6) - 10) != j4 || bArr[i3 + 35] != 34 || bArr[i3 + 36] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match36(long j, long j2, long j3, long j4, byte b) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 38;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i4;
        if (unsafe.getLong(bArr, (j5 + j6) - 35) != j || unsafe.getLong(bArr, (j5 + j6) - 27) != j2 || unsafe.getLong(bArr, (j5 + j6) - 19) != j3 || unsafe.getLong(bArr, (j5 + j6) - 11) != j4 || bArr[i3 + 35] != b || bArr[i3 + 36] != 34 || bArr[i3 + 37] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match37(long j, long j2, long j3, long j4, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset + 39;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i4;
        if (unsafe.getLong(bArr, (j5 + j6) - 36) != j || unsafe.getLong(bArr, (j5 + j6) - 28) != j2 || unsafe.getLong(bArr, (j5 + j6) - 20) != j3 || unsafe.getLong(bArr, (j5 + j6) - 12) != j4 || unsafe.getInt(bArr, (j5 + j6) - 4) != i) {
            return false;
        }
        while (true) {
            i2 = i4 + 1;
            i3 = bArr[i4] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i4 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match38(long j, long j2, long j3, long j4, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 40;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i5;
        if (unsafe.getLong(bArr, (j5 + j6) - 37) != j || unsafe.getLong(bArr, (j5 + j6) - 29) != j2 || unsafe.getLong(bArr, (j5 + j6) - 21) != j3 || unsafe.getLong(bArr, (j5 + j6) - 13) != j4 || unsafe.getInt(bArr, (j5 + j6) - 5) != i || bArr[i4 + 39] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match39(long j, long j2, long j3, long j4, int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 41;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i5;
        if (unsafe.getLong(bArr, (j5 + j6) - 38) != j || unsafe.getLong(bArr, (j5 + j6) - 30) != j2 || unsafe.getLong(bArr, (j5 + j6) - 22) != j3 || unsafe.getLong(bArr, (j5 + j6) - 14) != j4 || unsafe.getInt(bArr, (j5 + j6) - 6) != i || bArr[i4 + 39] != 34 || bArr[i4 + 40] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match4(byte b) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 6;
        if (i4 >= this.end || bArr[i3 + 3] != b || bArr[i3 + 4] != 34 || bArr[i3 + 5] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match40(long j, long j2, long j3, long j4, int i, byte b) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 42;
        if (i5 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j6 = i5;
        if (unsafe.getLong(bArr, (j5 + j6) - 39) != j || unsafe.getLong(bArr, (j5 + j6) - 31) != j2 || unsafe.getLong(bArr, (j5 + j6) - 23) != j3 || unsafe.getLong(bArr, (j5 + j6) - 15) != j4 || unsafe.getInt(bArr, (j5 + j6) - 7) != i || bArr[i4 + 39] != b || bArr[i4 + 40] != 34 || bArr[i4 + 41] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match41(long j, long j2, long j3, long j4, long j5) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset + 43;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j6 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j7 = i3;
        if (unsafe.getLong(bArr, (j6 + j7) - 40) != j || unsafe.getLong(bArr, (j6 + j7) - 32) != j2 || unsafe.getLong(bArr, (j6 + j7) - 24) != j3 || unsafe.getLong(bArr, (j6 + j7) - 16) != j4 || unsafe.getLong(bArr, (j6 + j7) - 8) != j5) {
            return false;
        }
        while (true) {
            i = i3 + 1;
            i2 = bArr[i3] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i3 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match42(long j, long j2, long j3, long j4, long j5) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 44;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j6 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j7 = i4;
        if (unsafe.getLong(bArr, (j6 + j7) - 41) != j || unsafe.getLong(bArr, (j6 + j7) - 33) != j2 || unsafe.getLong(bArr, (j6 + j7) - 25) != j3 || unsafe.getLong(bArr, (j6 + j7) - 17) != j4 || unsafe.getLong(bArr, (j6 + j7) - 9) != j5 || bArr[i3 + 43] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match43(long j, long j2, long j3, long j4, long j5) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 45;
        if (i4 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j6 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j7 = i4;
        if (unsafe.getLong(bArr, (j6 + j7) - 42) != j || unsafe.getLong(bArr, (j6 + j7) - 34) != j2 || unsafe.getLong(bArr, (j6 + j7) - 26) != j3 || unsafe.getLong(bArr, (j6 + j7) - 18) != j4 || unsafe.getLong(bArr, (j6 + j7) - 10) != j5 || bArr[i3 + 43] != 34 || bArr[i3 + 44] != 58) {
            return false;
        }
        while (true) {
            i = i4 + 1;
            i2 = bArr[i4] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i4 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match5(int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset + 7;
        if (i4 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i4)) - 4) != i) {
            return false;
        }
        while (true) {
            i2 = i4 + 1;
            i3 = bArr[i4] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i4 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match6(int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 8;
        if (i5 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i5)) - 5) != i || bArr[i4 + 7] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match7(int i) {
        int i2;
        int i3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 9;
        if (i5 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i5)) - 6) != i || bArr[i4 + 7] != 34 || bArr[i4 + 8] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match8(int i, byte b) {
        int i2;
        int i3;
        int i4 = this.offset;
        int i5 = i4 + 10;
        byte[] bArr = this.bytes;
        if (i5 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i5)) - 7) != i || bArr[i4 + 7] != b || bArr[i4 + 8] != 34 || bArr[i4 + 9] != 58) {
            return false;
        }
        while (true) {
            i2 = i5 + 1;
            i3 = bArr[i5] & -1;
            if (i3 > 32 || ((1 << i3) & 4294981377L) == 0) {
                break;
            }
            i5 = i2;
        }
        this.offset = i2;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match9(long j) {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset + 11;
        if (i3 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i3)) - 8) != j) {
            return false;
        }
        while (true) {
            i = i3 + 1;
            i2 = bArr[i3] & -1;
            if (i2 > 32 || ((1 << i2) & 4294981377L) == 0) {
                break;
            }
            i3 = i;
        }
        this.offset = i;
        this.ch = (char) i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match0() {
        int i;
        byte[] bArr = this.bytes;
        int i2 = this.offset + 7;
        if (i2 == this.end) {
            this.ch = (char) 26;
            return false;
        }
        while (true) {
            i = bArr[i2] & -1;
            if (i > 32 || ((1 << i) & 4294981377L) == 0) {
                break;
            }
            i2++;
        }
        this.offset = i2 + 1;
        this.ch = (char) i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match1() {
        int i;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 8;
        if (i3 >= this.end || bArr[i2 + 7] != 58) {
            return false;
        }
        while (true) {
            i = bArr[i3] & -1;
            if (i > 32 || ((1 << i) & 4294981377L) == 0) {
                break;
            }
            i3++;
        }
        this.offset = i3 + 1;
        this.ch = (char) i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match2() {
        int i;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 9;
        if (i3 >= this.end || bArr[i2 + 7] != 34 || bArr[i2 + 8] != 58) {
            return false;
        }
        while (true) {
            i = bArr[i3] & -1;
            if (i > 32 || ((1 << i) & 4294981377L) == 0) {
                break;
            }
            i3++;
        }
        this.offset = i3 + 1;
        this.ch = (char) i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfNull() {
        int i = this.offset;
        if (this.ch != 'n' || i + 2 >= this.end || this.bytes[i] != 117) {
            return false;
        }
        readNull();
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x006c -> B:33:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0061
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.ch
            int r2 = r0.end
            int r3 = r0.offset
            byte[] r4 = r0.bytes
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 0
            r7 = 1
            if (r1 != r5) goto L29
            int r5 = r3 + 2
            if (r5 >= r2) goto L29
            r8 = r4[r3]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L29
            int r8 = r3 + 1
            r8 = r4[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L29
            r5 = r4[r5]
            if (r5 != r9) goto L29
            int r3 = r3 + 3
            goto L4b
        L29:
            r5 = 34
            if (r1 == r5) goto L33
            r5 = 39
            if (r1 != r5) goto L32
            goto L33
        L32:
            return r6
        L33:
            if (r3 >= r2) goto L3b
            r5 = r4[r3]
            if (r5 != r1) goto L3b
            int r3 = r3 + r7
            goto L4b
        L3b:
            int r5 = r3 + 4
            if (r5 >= r2) goto Lae
            boolean r8 = com.alibaba.fastjson2.util.IOUtils.isNULL(r4, r3)
            if (r8 == 0) goto Lae
            r5 = r4[r5]
            if (r5 != r1) goto Lae
            int r3 = r3 + 5
        L4b:
            r1 = 26
            if (r3 != r2) goto L52
            r5 = r3
        L50:
            r3 = r1
            goto L56
        L52:
            int r5 = r3 + 1
            r3 = r4[r3]
        L56:
            r8 = 0
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r14 = 32
            if (r3 < 0) goto L79
            if (r3 > r14) goto L79
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L79
            if (r5 != r2) goto L6f
            goto L50
        L6f:
            int r3 = r5 + 1
            r5 = r4[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L56
        L79:
            r15 = 44
            if (r3 != r15) goto L7e
            r6 = r7
        L7e:
            r0.comma = r6
            if (r6 == 0) goto L8f
            if (r5 != r2) goto L86
        L84:
            r3 = r1
            goto L8f
        L86:
            int r3 = r5 + 1
            r5 = r4[r5]
        L8a:
            r17 = r5
            r5 = r3
            r3 = r17
        L8f:
            if (r3 < 0) goto La2
            if (r3 > r14) goto La2
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r6 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r6 == 0) goto La2
            if (r5 != r2) goto L9d
            goto L84
        L9d:
            int r3 = r5 + 1
            r5 = r4[r5]
            goto L8a
        La2:
            if (r3 >= 0) goto La8
            r0.char_utf8(r3, r5)
            return r7
        La8:
            r0.offset = r5
            char r1 = (char) r3
            r0.ch = r1
            return r7
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfNullOrEmptyString():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002f -> B:9:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0026
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfObjectEnd() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.ch
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            int r4 = r0.end
            r5 = 125(0x7d, float:1.75E-43)
            if (r1 == r5) goto L10
            r1 = 0
            return r1
        L10:
            r1 = 26
            if (r3 != r4) goto L17
            r5 = r3
        L15:
            r3 = r1
            goto L1b
        L17:
            int r5 = r3 + 1
            r3 = r2[r3]
        L1b:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L3c
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L3c
            if (r5 != r4) goto L32
            goto L15
        L32:
            int r3 = r5 + 1
            r5 = r2[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L1b
        L3c:
            r13 = 44
            r14 = 1
            if (r3 != r13) goto L63
            r0.comma = r14
            if (r5 != r4) goto L48
            r3 = r5
            r5 = r1
            goto L4c
        L48:
            int r3 = r5 + 1
            r5 = r2[r5]
        L4c:
            r17 = r5
            r5 = r3
            r3 = r17
        L51:
            if (r3 > r12) goto L63
            long r15 = r10 << r3
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L63
            if (r5 != r4) goto L5e
            r3 = r1
            goto L51
        L5e:
            int r3 = r5 + 1
            r5 = r2[r5]
            goto L4c
        L63:
            if (r3 >= 0) goto L69
            r0.char_utf8(r3, r5)
            return r14
        L69:
            char r1 = (char) r3
            r0.ch = r1
            r0.offset = r5
            r1 = 47
            if (r3 != r1) goto L75
            r0.skipComment()
        L75:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfObjectEnd():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002e -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
        /*
            r9 = this;
            char r0 = r9.ch
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 != r2) goto L15
            r2 = r1
        L13:
            r1 = r3
            goto L19
        L15:
            int r2 = r1 + 1
            r1 = r0[r1]
        L19:
            r4 = 32
            if (r1 > r4) goto L39
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L39
            int r1 = r9.end
            if (r2 != r1) goto L31
            goto L13
        L31:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r0 = 1
            if (r1 >= 0) goto L40
            r9.char_utf8(r1, r2)
            return r0
        L40:
            char r3 = (char) r1
            r9.ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfObjectStart():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003e -> B:13:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x002b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfSet() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.ch
            r3 = 83
            if (r2 != r3) goto L50
            int r2 = r1 + 1
            int r3 = r10.end
            if (r2 >= r3) goto L50
            r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L50
            r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L50
            int r2 = r1 + 2
            r4 = 26
            if (r2 != r3) goto L25
            r1 = r2
        L23:
            r2 = r4
            goto L29
        L25:
            int r1 = r1 + 3
            r2 = r0[r2]
        L29:
            r3 = 32
            if (r2 > r3) goto L49
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L49
            int r2 = r10.end
            if (r1 != r2) goto L41
            goto L23
        L41:
            int r2 = r1 + 1
            r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L29
        L49:
            r10.offset = r1
            char r0 = (char) r2
            r10.ch = r0
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfSet():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match10(long j) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 11;
        if (i2 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i2)) - 8) != j) {
            return false;
        }
        int i3 = bArr[i2] & -1;
        if (i3 != 44 && i3 != 125 && i3 != 93) {
            return false;
        }
        if (i3 == 44) {
            this.comma = true;
            i2 = i + 12;
            i3 = i2 == this.end ? 26 : bArr[i2] & -1;
        }
        while (i3 <= 32 && ((1 << i3) & 4294981377L) != 0) {
            i2++;
            i3 = bArr[i2] & -1;
        }
        this.offset = i2 + 1;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match11(long j) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 12;
        if (i2 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i2)) - 9) != j || bArr[i + 11] != 34) {
            return false;
        }
        int i3 = bArr[i2] & -1;
        if (i3 != 44 && i3 != 125 && i3 != 93) {
            return false;
        }
        if (i3 == 44) {
            this.comma = true;
            i2 = i + 13;
            i3 = i2 == this.end ? 26 : bArr[i2] & -1;
        }
        while (i3 <= 32 && ((1 << i3) & 4294981377L) != 0) {
            i2++;
            i3 = bArr[i2] & -1;
        }
        this.offset = i2 + 1;
        this.ch = (char) i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match2() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 3;
        int i3 = this.end;
        if (i2 >= i3) {
            return false;
        }
        int i4 = i + 4;
        int i5 = bArr[i2] & -1;
        if (i5 != 44 && i5 != 125 && i5 != 93) {
            return false;
        }
        if (i5 == 44) {
            this.comma = true;
            if (i4 == i3) {
                i5 = 26;
            } else {
                int i6 = i + 5;
                i5 = bArr[i4] & -1;
                i4 = i6;
            }
        }
        while (i5 <= 32 && ((1 << i5) & 4294981377L) != 0) {
            int i7 = i4 + 1;
            i5 = bArr[i4] & -1;
            i4 = i7;
        }
        this.offset = i4;
        this.ch = (char) i5;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match3() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 4;
        int i3 = this.end;
        if (i2 >= i3 || bArr[i + 3] != 34) {
            return false;
        }
        int i4 = bArr[i2] & -1;
        if (i4 != 44 && i4 != 125 && i4 != 93) {
            return false;
        }
        if (i4 == 44) {
            this.comma = true;
            i2 = i + 5;
            i4 = i2 == i3 ? 26 : bArr[i2] & -1;
        }
        while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
            i2++;
            i4 = bArr[i2] & -1;
        }
        this.offset = i2 + 1;
        this.ch = (char) i4;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match4(byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 5;
        int i3 = this.end;
        boolean z = false;
        if (i2 >= i3) {
            return false;
        }
        if (bArr[i + 3] == b && bArr[i + 4] == 34) {
            int i4 = bArr[i2] & -1;
            if (i4 != 44 && i4 != 125 && i4 != 93) {
                return false;
            }
            z = true;
            if (i4 == 44) {
                this.comma = true;
                i2 = i + 6;
                i4 = i2 == i3 ? 26 : bArr[i2] & -1;
            }
            while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
                i2++;
                i4 = bArr[i2] & -1;
            }
            this.offset = i2 + 1;
            this.ch = (char) i4;
        }
        return z;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match5(byte b, byte b2) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 6;
        int i3 = this.end;
        boolean z = false;
        if (i2 >= i3) {
            return false;
        }
        if (bArr[i + 3] == b && bArr[i + 4] == b2 && bArr[i + 5] == 34) {
            int i4 = bArr[i2] & -1;
            if (i4 != 44 && i4 != 125 && i4 != 93) {
                return false;
            }
            z = true;
            if (i4 == 44) {
                this.comma = true;
                i2 = i + 7;
                i4 = i2 == i3 ? 26 : bArr[i2] & -1;
            }
            while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
                i2++;
                i4 = bArr[i2] & -1;
            }
            this.offset = i2 + 1;
            this.ch = (char) i4;
        }
        return z;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match6(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 7;
        if (i3 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i3)) - 4) != i) {
            return false;
        }
        int i4 = bArr[i3] & -1;
        if (i4 != 44 && i4 != 125 && i4 != 93) {
            return false;
        }
        if (i4 == 44) {
            this.comma = true;
            i3 = i2 + 8;
            i4 = i3 == this.end ? 26 : bArr[i3] & -1;
        }
        while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
            i3++;
            i4 = bArr[i3] & -1;
        }
        this.offset = i3 + 1;
        this.ch = (char) i4;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match7(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 8;
        boolean z = false;
        if (i3 >= this.end) {
            return false;
        }
        if (JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i3)) - 5) == i && bArr[i2 + 7] == 34) {
            int i4 = bArr[i3] & -1;
            if (i4 != 44 && i4 != 125 && i4 != 93) {
                return false;
            }
            z = true;
            if (i4 == 44) {
                this.comma = true;
                i3 = i2 + 9;
                i4 = i3 == this.end ? 26 : bArr[i3] & -1;
            }
            while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
                i3++;
                i4 = bArr[i3] & -1;
            }
            this.offset = i3 + 1;
            this.ch = (char) i4;
        }
        return z;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match8(int i, byte b) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 9;
        if (i3 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i3)) - 6) != i || bArr[i2 + 7] != b || bArr[i2 + 8] != 34) {
            return false;
        }
        int i4 = bArr[i3] & -1;
        if (i4 != 44 && i4 != 125 && i4 != 93) {
            return false;
        }
        if (i4 == 44) {
            this.comma = true;
            i3 = i2 + 10;
            i4 = i3 == this.end ? 26 : bArr[i3] & -1;
        }
        while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
            i3++;
            i4 = bArr[i3] & -1;
        }
        this.offset = i3 + 1;
        this.ch = (char) i4;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match9(int i, byte b, byte b2) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 10;
        if (i3 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i3)) - 7) != i || bArr[i2 + 7] != b || bArr[i2 + 8] != b2 || bArr[i2 + 9] != 34) {
            return false;
        }
        int i4 = bArr[i3] & -1;
        if (i4 != 44 && i4 != 125 && i4 != 93) {
            return false;
        }
        if (i4 == 44) {
            this.comma = true;
            i3 = i2 + 11;
            i4 = i3 == this.end ? 26 : bArr[i3] & -1;
        }
        while (i4 <= 32 && ((1 << i4) & 4294981377L) != 0) {
            i3++;
            i4 = bArr[i3] & -1;
        }
        this.offset = i3 + 1;
        this.ch = (char) i4;
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x000b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x0013
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final void nextWithoutComment() {
        /*
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 < r2) goto Ld
            r2 = r1
        Lb:
            r1 = r3
            goto L11
        Ld:
            int r2 = r1 + 1
            r1 = r0[r1]
        L11:
            r4 = 32
            if (r1 > r4) goto L31
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r1 = r9.end
            if (r2 != r1) goto L29
            goto Lb
        L29:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        L31:
            if (r1 >= 0) goto L37
            r9.char_utf8(r1, r2)
            return
        L37:
            r9.offset = r2
            char r0 = (char) r1
            r9.ch = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextWithoutComment():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final byte[] readBase64() {
        byte[] bArrDecode;
        int i;
        byte b;
        int i2;
        byte b2;
        int iIndexOfChar;
        int i3;
        int iIndexOfChar2;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = this.end;
        int iIndexOfQuote = IOUtils.indexOfQuote(bArr, this.ch, i4, i5);
        if (iIndexOfQuote == -1) {
            throw error("invalid escape character EOI");
        }
        if (indexOfSlash(this, bArr, i4, i5) != -1) {
            throw error("invalid base64 string");
        }
        if (iIndexOfQuote != i4) {
            if (IOUtils.regionMatches(bArr, i4, "data:image/") && (iIndexOfChar = IOUtils.indexOfChar(bArr, 59, 12, iIndexOfQuote)) != -1 && (iIndexOfChar2 = IOUtils.indexOfChar(bArr, 44, (i3 = iIndexOfChar + 1), iIndexOfQuote)) != -1 && IOUtils.regionMatches(bArr, i3, "base64")) {
                i4 = iIndexOfChar2 + 1;
            }
            bArrDecode = Base64.getDecoder().decode(Arrays.copyOfRange(bArr, i4, iIndexOfQuote));
        } else {
            bArrDecode = new byte[0];
        }
        int i6 = iIndexOfQuote + 1;
        if (i6 == i5) {
            i = i6;
            b = 26;
        } else {
            i = iIndexOfQuote + 2;
            b = (char) bArr[i6];
        }
        boolean z = b == 44;
        this.comma = z;
        if (z) {
            if (i == i5) {
                i2 = i;
                b2 = 26;
            } else {
                i2 = i + 1;
                b2 = bArr[i];
            }
            loop0: while (true) {
                int i7 = i2;
                b = b2;
                i = i7;
                while (true) {
                    if (b > 32 || ((1 << b) & 4294981377L) == 0) {
                        break loop0;
                    }
                    if (i == i5) {
                        b = 26;
                    }
                }
                i2 = i + 1;
                b2 = bArr[i];
            }
        }
        this.ch = (char) b;
        this.offset = i;
        return bArrDecode;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x019c A[PHI: r9
      0x019c: PHI (r9v25 int) = (r9v24 int), (r9v27 int) binds: [B:95:0x015e, B:99:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x02a2 -> B:191:0x0283). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:196:0x0297
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.math.BigDecimal readBigDecimal() {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBigDecimal():java.math.BigDecimal");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0072 -> B:33:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0068
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readBoolValue() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.end
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            char r4 = r0.ch
            r5 = 116(0x74, float:1.63E-43)
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L2d
            int r5 = r3 + 2
            int r8 = r2.length
            if (r5 >= r8) goto L2d
            r8 = r2[r3]
            r9 = 114(0x72, float:1.6E-43)
            if (r8 != r9) goto L2d
            int r8 = r3 + 1
            r8 = r2[r8]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L2d
            r5 = r2[r5]
            r8 = 101(0x65, float:1.42E-43)
            if (r5 != r8) goto L2d
            int r3 = r3 + 3
        L2b:
            r4 = r6
            goto L52
        L2d:
            r5 = 102(0x66, float:1.43E-43)
            if (r4 != r5) goto L3f
            int r5 = r3 + 3
            if (r5 >= r1) goto L3f
            boolean r5 = com.alibaba.fastjson2.util.IOUtils.isALSE(r2, r3)
            if (r5 == 0) goto L3f
            int r3 = r3 + 4
        L3d:
            r4 = r7
            goto L52
        L3f:
            r5 = 49
            if (r4 == r5) goto L47
            r8 = 48
            if (r4 != r8) goto Lae
        L47:
            if (r3 >= r1) goto Lae
            boolean r8 = com.alibaba.fastjson2.util.IOUtils.isDigit(r4)
            if (r8 != 0) goto Lae
            if (r4 != r5) goto L3d
            goto L2b
        L52:
            if (r3 != r1) goto L58
            r8 = r3
        L55:
            r3 = 26
            goto L5d
        L58:
            int r8 = r3 + 1
            r3 = r2[r3]
            char r3 = (char) r3
        L5d:
            r9 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r15 = 32
            if (r3 > r15) goto L7f
            long r16 = r13 << r3
            long r16 = r16 & r11
            int r16 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r16 == 0) goto L7f
            if (r8 < r1) goto L75
            goto L55
        L75:
            int r3 = r8 + 1
            r8 = r2[r8]
            r18 = r8
            r8 = r3
            r3 = r18
            goto L5d
        L7f:
            r5 = 44
            if (r3 != r5) goto L84
            goto L85
        L84:
            r6 = r7
        L85:
            r0.comma = r6
            if (r6 == 0) goto La8
            if (r8 < r1) goto L8e
            r5 = 26
            goto L93
        L8e:
            int r3 = r8 + 1
            r5 = r2[r8]
            goto La6
        L93:
            r3 = r5
        L94:
            if (r3 > r15) goto La8
            long r5 = r13 << r3
            long r5 = r5 & r11
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto La8
            if (r8 < r1) goto La2
            r3 = 26
            goto L94
        La2:
            int r3 = r8 + 1
            r5 = r2[r8]
        La6:
            r8 = r3
            goto L93
        La8:
            r0.offset = r8
            char r1 = (char) r3
            r0.ch = r1
            return r4
        Lae:
            boolean r1 = r0.readBoolValue0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBoolValue():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:168:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0204  */
    /* JADX WARN: Code duplicated, block: B:173:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0208, code lost:
    
        r14 = -r14;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double readDoubleValue() {
        int i;
        byte b;
        long j;
        long j2;
        long j3;
        double d;
        byte b2;
        int i2;
        byte b3;
        double dDoubleValue;
        boolean z;
        byte b4;
        boolean z2;
        double[] dArr;
        int i3;
        byte b5;
        int i4;
        byte b6;
        byte b7;
        int iDigit2;
        int iDigit3;
        int i5;
        byte b8;
        byte[] bArr = this.bytes;
        byte b9 = this.ch;
        int i6 = this.offset;
        int i7 = this.end;
        if (b9 != 34 && b9 != 39) {
            i = i6;
            b = b9;
            b9 = 0;
        } else if (i6 == i7) {
            i = i6;
            b = 26;
        } else {
            i = i6 + 1;
            b = bArr[i6];
        }
        long j4 = 0;
        if (b9 == 0 || b != b9) {
            j = 1;
            if (b < 48 || b > 57) {
                j2 = (b == 45 || b == 43) ? 0L : 1L;
            } else {
                j2 = 48 - b;
            }
            while (true) {
                j3 = 0L;
                if (j2 > 0L || i + 1 >= i7 || (iDigit3 = IOUtils.digit2(bArr, i)) == -1) {
                    break;
                }
                if (-92233720368547758L <= j2) {
                    j2 = (j2 * 100) - ((long) iDigit3);
                    i += 2;
                } else {
                    j2 = 1;
                }
                j4 = 0L;
            }
            if (j2 > 0L || i >= i7) {
                d = 0.0d;
                b2 = b;
            } else {
                b2 = bArr[i];
                if (!IOUtils.isDigit(b2)) {
                    d = 0.0d;
                } else if (-922337203685477580L <= j2) {
                    d = 0.0d;
                    j2 = ((j2 * 10) + 48) - ((long) b2);
                    i++;
                } else {
                    d = 0.0d;
                    j2 = 1;
                }
            }
            if (j2 > 0L || i >= i7 || bArr[i] != 46) {
                i2 = 0;
            } else {
                i++;
                i2 = 0;
                while (j2 <= 0L && i + 1 < i7 && (iDigit2 = IOUtils.digit2(bArr, i)) != -1) {
                    if (-92233720368547758L <= j2) {
                        j2 = (j2 * 100) - ((long) iDigit2);
                        i += 2;
                        i2 += 2;
                    } else {
                        j2 = 1;
                    }
                }
                if (j2 <= 0L && i < i7) {
                    b2 = bArr[i];
                    if (IOUtils.isDigit(b2)) {
                        if (-922337203685477580L <= j2) {
                            j2 = ((j2 * 10) + 48) - ((long) b2);
                            i++;
                            i2++;
                        } else {
                            j2 = 1;
                        }
                    }
                }
            }
            if (j2 <= 0L) {
                if (i == i7) {
                    b2 = 26;
                } else {
                    b2 = bArr[i];
                    i++;
                }
            }
            if (j2 <= 0L) {
                if (b2 == 101 || b2 == 69) {
                    if (i == i7) {
                        i4 = i;
                        b6 = 26;
                    } else {
                        i4 = i + 1;
                        b6 = bArr[i];
                    }
                    boolean z3 = b6 == 45;
                    if (z3 || b6 == 43) {
                        if (i4 == i7) {
                            b7 = 26;
                        } else {
                            b7 = bArr[i4];
                            i4++;
                        }
                        i = i4;
                        b2 = b7;
                    } else {
                        if (b6 == 44) {
                            throw numberError();
                        }
                        int i8 = i4;
                        b2 = b6;
                        i = i8;
                    }
                    if (IOUtils.isDigit(b2)) {
                        int i9 = b2 + -48;
                        while (i < i7) {
                            byte b10 = bArr[i];
                            if (!IOUtils.isDigit(b10)) {
                                break;
                            }
                            i9 = (i9 * 10) + b10 + -48;
                            if (i9 > 2047) {
                                throw new JSONException(AbstractC1194.m2779(i9, "too large exp value : "));
                            }
                            i++;
                        }
                        if (z3) {
                            i9 = -i9;
                        }
                        i2 -= i9;
                        if (i == i7) {
                            b2 = 26;
                        } else {
                            b2 = bArr[i];
                            i++;
                        }
                    } else {
                        j2 = 1;
                    }
                }
                if (b2 == 76 || b2 == 70 || b2 == 68 || b2 == 66 || b2 == 83) {
                    if (i == i7) {
                        b2 = 26;
                    } else {
                        b2 = bArr[i];
                        i++;
                    }
                }
            }
            if (j2 <= 0L && b9 != 0) {
                if (b2 == b9) {
                    if (i == i7) {
                        i3 = i;
                        b5 = 26;
                    } else {
                        i3 = i + 1;
                        b5 = bArr[i];
                    }
                    b2 = b5;
                    i = i3;
                } else {
                    j2 = 1;
                }
            }
            if (j2 <= 0L) {
                if (i2 == 0) {
                    dDoubleValue = j2;
                    b4 = b2;
                } else {
                    double d2 = j2;
                    b4 = b2;
                    if (((long) d2) == j2) {
                        if (i2 > 0) {
                            double[] dArr2 = JSONFactory.DOUBLE_10_POW;
                            if (i2 < dArr2.length) {
                                dDoubleValue = d2 / dArr2[i2];
                            } else if (false) {
                                dArr = JSONFactory.DOUBLE_10_POW;
                                if (i2 > (-dArr.length)) {
                                    dDoubleValue = d2 * dArr[-i2];
                                }
                                if (z2) {
                                    if (b != 45) {
                                    }
                                } else if (i2 > 0 || i2 >= 64) {
                                    j2 = 1;
                                } else {
                                    dDoubleValue = TypeUtils.doubleValue(b == 45 ? -1 : 1, Math.abs(j2), i2);
                                }
                                b3 = b4;
                            }
                        } else if (true) {
                            dArr = JSONFactory.DOUBLE_10_POW;
                            if (i2 > (-dArr.length)) {
                                dDoubleValue = d2 * dArr[-i2];
                            }
                            if (z2) {
                                if (false) {
                                    j2 = 1;
                                } else {
                                    j2 = 1;
                                }
                            } else if (b != 45) {
                            }
                            b3 = b4;
                        }
                    }
                    dDoubleValue = 0.0;
                    z2 = false;
                    if (false) {
                        if (i2 > 0) {
                            j2 = 1;
                        } else {
                            j2 = 1;
                        }
                    } else if (b != 45) {
                    }
                    b3 = b4;
                }
                z2 = true;
                if (true) {
                    if (i2 > 0) {
                        j2 = 1;
                    } else {
                        j2 = 1;
                    }
                } else if (b != 45) {
                }
                b3 = b4;
            } else {
                b3 = b2;
                dDoubleValue = 0.0;
            }
            z = false;
        } else {
            if (i == i7) {
                b3 = 26;
            } else {
                b3 = bArr[i];
                i++;
            }
            j2 = 0;
            j3 = 0;
            z = true;
            dDoubleValue = 0.0d;
            j = 1;
        }
        if (j2 > 0L) {
            readNumber0();
            return getDoubleValue();
        }
        while (b3 <= 32 && ((1L << b3) & 4294981377L) != 0L) {
            if (i == i7) {
                b3 = 26;
            } else {
                b3 = bArr[i];
                i++;
            }
        }
        boolean z4 = b3 == 44;
        this.comma = z4;
        if (z4) {
            if (i == i7) {
                i5 = i;
                b8 = 26;
            } else {
                i5 = i + 1;
                b8 = bArr[i];
            }
            loop1: while (true) {
                byte b11 = b8;
                i = i5;
                b3 = b11;
                while (true) {
                    if (b3 > 32 || ((1L << b3) & 4294981377L) == 0L) {
                        break loop1;
                    }
                    if (i == i7) {
                        b3 = 26;
                    }
                }
                i5 = i + 1;
                b8 = bArr[i];
            }
        }
        this.wasNull = true;
        this.ch = (char) b3;
        this.offset = i;
        return 0.0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0091 -> B:38:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:51:0x00a6
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readFieldName() {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldName():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0085 -> B:32:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00a9 -> B:45:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:47:0x009f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCode():long");
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d5 A[EDGE_INSN: B:116:0x01d5->B:143:0x024f BREAK  A[LOOP:0: B:112:0x01cd->B:141:0x023f]] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d9 A[EDGE_INSN: B:117:0x01d9->B:143:0x024f BREAK  A[LOOP:0: B:112:0x01cd->B:141:0x023f]] */
    /* JADX WARN: Code duplicated, block: B:118:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:125:0x0209  */
    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:129:0x0219  */
    /* JADX WARN: Code duplicated, block: B:131:0x021d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0254  */
    /* JADX WARN: Code duplicated, block: B:149:0x0266  */
    /* JADX WARN: Code duplicated, block: B:151:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0271  */
    /* JADX WARN: Code duplicated, block: B:154:0x0278  */
    /* JADX WARN: Code duplicated, block: B:156:0x028a  */
    /* JADX WARN: Code duplicated, block: B:158:0x029d  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x02da  */
    /* JADX WARN: Code duplicated, block: B:177:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:187:0x0305  */
    /* JADX WARN: Code duplicated, block: B:189:0x0315  */
    /* JADX WARN: Code duplicated, block: B:191:0x0319  */
    /* JADX WARN: Code duplicated, block: B:192:0x031c  */
    /* JADX WARN: Code duplicated, block: B:196:0x032f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0341  */
    /* JADX WARN: Code duplicated, block: B:200:0x024b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02f3 A[SYNTHETIC] */
    public long readFieldNameHashCode0() {
        long j;
        char c;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iChar2_utf8;
        int i8;
        int i9;
        int iHexDigit4;
        int i10;
        int iChar1;
        int i11;
        int iHexDigit5;
        int i12;
        int i13;
        char c2;
        byte[] bArr = this.bytes;
        char c3 = this.ch;
        int i14 = this.offset;
        int i15 = this.end;
        this.nameAscii = true;
        this.nameEscape = false;
        int i16 = i14 + 9;
        if (i16 < i15) {
            char c4 = bArr[i14];
            if (c4 == c3) {
                j2 = 0;
                j = 0;
            } else {
                int i17 = i14 + 1;
                j = 0;
                char c5 = bArr[i17];
                if (c5 != c3 || c4 == '\\' || c4 <= 0) {
                    int i18 = i14 + 2;
                    char c6 = bArr[i18];
                    if (c6 != c3 || c4 == '\\' || c5 == '\\' || false || c5 <= 0) {
                        int i19 = i14 + 3;
                        c = ' ';
                        char c7 = bArr[i19];
                        if (c7 != c3 || c4 == '\\' || c5 == '\\' || c6 == '\\' || false || false || c6 <= 0) {
                            int i20 = i14 + 4;
                            char c8 = bArr[i20];
                            if (c8 != c3 || c4 == '\\' || c5 == '\\' || c6 == '\\' || c7 == '\\' || false || false || false || c7 <= 0) {
                                int i21 = i14 + 5;
                                char c9 = bArr[i21];
                                if (c9 != c3 || c4 == '\\' || c5 == '\\' || c6 == '\\' || c7 == '\\' || c8 == '\\' || false || false || false || false || c8 <= 0) {
                                    int i22 = i14 + 6;
                                    char c10 = bArr[i22];
                                    if (c10 != c3 || c4 == '\\' || c5 == '\\' || c6 == '\\' || c7 == '\\' || c8 == '\\' || c9 == '\\' || false || false || false || false || false || c9 <= 0) {
                                        int i23 = i14 + 7;
                                        char c11 = bArr[i23];
                                        if (c11 == c3) {
                                            c2 = '0';
                                            if (c4 != '\\' && c5 != '\\' && c6 != '\\' && c7 != '\\' && c8 != '\\' && c9 != '\\' && c10 != '\\' && true && true && true && true && true && true && c10 > 0) {
                                                j2 = (((long) c10) << 48) + (((long) c9) << 40) + (((long) c8) << 32) + ((long) (c7 << 24)) + ((long) (c6 << 16)) + ((long) (c5 << '\b')) + ((long) c4);
                                                this.nameLength = 7;
                                                this.nameEnd = i23;
                                                i14 += 8;
                                            }
                                        } else {
                                            c2 = '0';
                                        }
                                        int i24 = i14 + 8;
                                        if (bArr[i24] == c3 && c4 != '\\' && c5 != '\\' && c6 != '\\' && c7 != '\\' && c8 != '\\' && c9 != '\\' && c10 != '\\' && c11 != '\\' && true && true && true && true && true && true && true && c11 > 0) {
                                            j2 = (((long) c11) << 56) + (((long) c10) << 48) + (((long) c9) << 40) + (((long) c8) << 32) + ((long) (c7 << 24)) + ((long) (c6 << 16)) + ((long) (c5 << '\b')) + ((long) c4);
                                            this.nameLength = 8;
                                            this.nameEnd = i24;
                                            i14 = i16;
                                        }
                                    } else {
                                        j2 = (((long) c9) << 40) + (((long) c8) << 32) + ((long) (c7 << 24)) + ((long) (c6 << 16)) + ((long) (c5 << '\b')) + ((long) c4);
                                        this.nameLength = 6;
                                        this.nameEnd = i22;
                                        i14 += 7;
                                    }
                                } else {
                                    this.nameLength = 5;
                                    this.nameEnd = i21;
                                    i14 += 6;
                                    j2 = (((long) c8) << 32) + ((long) (c7 << 24)) + ((long) (c6 << 16)) + ((long) (c5 << '\b')) + ((long) c4);
                                }
                            } else {
                                this.nameLength = 4;
                                this.nameEnd = i20;
                                i14 += 5;
                                j2 = (c7 << 24) + (c6 << 16) + (c5 << '\b') + c4;
                            }
                        } else {
                            this.nameLength = 3;
                            this.nameEnd = i19;
                            i14 += 4;
                            j2 = (c6 << 16) + (c5 << '\b') + c4;
                        }
                    } else {
                        this.nameLength = 2;
                        this.nameEnd = i18;
                        i14 += 3;
                        j2 = (c5 << '\b') + c4;
                    }
                    i = 120;
                    i2 = 117;
                    if (j2 == 0L) {
                        i11 = 0;
                        while (i14 < i15) {
                            iHexDigit5 = bArr[i14];
                            if (iHexDigit5 != c3) {
                                if (iHexDigit5 == 92) {
                                    this.nameEscape = true;
                                    i12 = i14 + 1;
                                    i13 = bArr[i12];
                                    if (i13 == 117) {
                                        iHexDigit5 = IOUtils.hexDigit4(bArr, i14 + 2, i15);
                                        i14 += 5;
                                    } else if (i13 != 120) {
                                        iHexDigit5 = char1(i13);
                                        i14 = i12;
                                    } else {
                                        int i25 = bArr[i14 + 2];
                                        i14 += 3;
                                        iHexDigit5 = JSONReader.char2(i25, bArr[i14]);
                                    }
                                    if (iHexDigit5 > 255) {
                                        this.nameAscii = false;
                                    }
                                } else {
                                    if (iHexDigit5 != -61 || false) {
                                        i14++;
                                        iHexDigit5 = (char) (((iHexDigit5 & 31) << 6) | (bArr[i14] & '?'));
                                        this.nameAscii = false;
                                    }
                                    if (iHexDigit5 <= 255 || false || false || (false)) {
                                        i14 = this.nameBegin;
                                        j2 = 0L;
                                        break;
                                    }
                                    0L |= ((long) iHexDigit5) << (0);
                                    i14++;
                                    0++;
                                }
                                if (iHexDigit5 <= 255) {
                                }
                                i14 = this.nameBegin;
                                j2 = 0L;
                                break;
                            }
                            if (false) {
                                this.nameLength = i11;
                                this.nameEnd = i14;
                                i14++;
                                break;
                            }
                            i14 = this.nameBegin;
                            break;
                        }
                    }
                    if (j2 == 0L) {
                        j2 = -3750763034362895579L;
                        i7 = 0;
                        while (true) {
                            iChar2_utf8 = bArr[i14];
                            if (iChar2_utf8 == 92) {
                                this.nameEscape = true;
                                int i26 = i14 + 1;
                                i9 = bArr[i26];
                                if (i9 != 117) {
                                    if (i9 != 120) {
                                        iChar1 = char1(i9);
                                    } else {
                                        int i27 = bArr[i14 + 2];
                                        i10 = i14 + 3;
                                        iHexDigit4 = JSONReader.char2(i27, bArr[i10]);
                                    }
                                    j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
                                    i14 = i26 + 1;
                                } else {
                                    iHexDigit4 = IOUtils.hexDigit4(bArr, i14 + 2, i15);
                                    i10 = i14 + 5;
                                }
                                int i28 = iHexDigit4;
                                i26 = i10;
                                iChar1 = i28;
                                j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
                                i14 = i26 + 1;
                            } else if (iChar2_utf8 == c3) {
                                this.nameLength = i7;
                                this.nameEnd = i14;
                                i14++;
                            } else {
                                if (iChar2_utf8 >= 0) {
                                    i14++;
                                } else {
                                    i8 = iChar2_utf8 & 255;
                                    switch (i8 >> 4) {
                                        case 12 /* 12 */:
                                        case 13:
                                            iChar2_utf8 = char2_utf8(i8, bArr[i14 + 1], i14);
                                            i14 += 2;
                                            this.nameAscii = false;
                                            break;
                                        case 14 /* 14 */:
                                            iChar2_utf8 = char2_utf8(i8, bArr[i14 + 1], bArr[i14 + 2], i14);
                                            i14 += 3;
                                            this.nameAscii = false;
                                            break;
                                        default:
                                            throw new JSONException(AbstractC1194.m2779(i14, "malformed input around byte "));
                                    }
                                }
                                j2 = (j2 ^ ((long) iChar2_utf8)) * 1099511628211L;
                            }
                            i7++;
                            c = 32;
                            i = 120;
                            i2 = 117;
                        }
                    }
                    if (i14 == i15) {
                        i3 = i14;
                        i4 = 26;
                    } else {
                        i3 = i14 + 1;
                        i4 = bArr[i14];
                    }
                    while (i4 <= c && ((1 << i4) & 4294981377L) != 0L) {
                        if (i3 == i15) {
                            i4 = 26;
                        } else {
                            int i29 = i3 + 1;
                            int i30 = bArr[i3];
                            i3 = i29;
                            i4 = i30;
                        }
                        c = ' ';
                    }
                    if (i4 != 58) {
                        throw new JSONException(info(AbstractC1194.m2779(i4, "expect ':', but ")));
                    }
                    if (i3 == i15) {
                        i5 = i3;
                        i6 = 26;
                    } else {
                        i5 = i3 + 1;
                        i6 = bArr[i3];
                    }
                    while (i6 <= 32 && ((1 << i6) & 4294981377L) != 0L) {
                        if (i5 == i15) {
                            i6 = 26;
                        } else {
                            i6 = bArr[i5];
                            i5++;
                        }
                    }
                    this.offset = i5;
                    this.ch = (char) i6;
                    return j2;
                }
                j2 = c4;
                this.nameLength = 1;
                this.nameEnd = i17;
                i14 += 2;
            }
            c = ' ';
            i = 120;
            i2 = 117;
            if (j2 == 0L) {
                i11 = 0;
                while (i14 < i15) {
                    iHexDigit5 = bArr[i14];
                    if (iHexDigit5 != c3) {
                        if (iHexDigit5 == 92) {
                            if (true) {
                            }
                            i14++;
                            iHexDigit5 = (char) ((1792) | (bArr[i14] & '?'));
                            this.nameAscii = false;
                            if (false) {
                            }
                            i14 = this.nameBegin;
                            j2 = 0L;
                            break;
                        }
                        this.nameEscape = true;
                        i12 = i14 + 1;
                        i13 = bArr[i12];
                        if (i13 == 117) {
                            iHexDigit5 = IOUtils.hexDigit4(bArr, i14 + 2, i15);
                            i14 += 5;
                        } else if (i13 != 120) {
                            iHexDigit5 = char1(i13);
                            i14 = i12;
                        } else {
                            int i210 = bArr[i14 + 2];
                            i14 += 3;
                            iHexDigit5 = JSONReader.char2(i210, bArr[i14]);
                        }
                        if (iHexDigit5 > 255) {
                            this.nameAscii = false;
                        }
                        if (iHexDigit5 <= 255) {
                        }
                        i14 = this.nameBegin;
                        j2 = 0L;
                        break;
                    }
                    if (false) {
                        this.nameLength = i11;
                        this.nameEnd = i14;
                        i14++;
                        break;
                    }
                    i14 = this.nameBegin;
                    break;
                }
            }
            if (j2 == 0L) {
                j2 = -3750763034362895579L;
                i7 = 0;
                while (true) {
                    iChar2_utf8 = bArr[i14];
                    if (iChar2_utf8 == 92) {
                        this.nameEscape = true;
                        int i211 = i14 + 1;
                        i9 = bArr[i211];
                        if (i9 != 117) {
                            if (i9 != 120) {
                                iChar1 = char1(i9);
                            } else {
                                int i212 = bArr[i14 + 2];
                                i10 = i14 + 3;
                                iHexDigit4 = JSONReader.char2(i212, bArr[i10]);
                            }
                            j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
                            i14 = i211 + 1;
                        } else {
                            iHexDigit4 = IOUtils.hexDigit4(bArr, i14 + 2, i15);
                            i10 = i14 + 5;
                        }
                        int i213 = iHexDigit4;
                        i211 = i10;
                        iChar1 = i213;
                        j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
                        i14 = i211 + 1;
                    } else if (iChar2_utf8 == c3) {
                        this.nameLength = i7;
                        this.nameEnd = i14;
                        i14++;
                    } else {
                        if (iChar2_utf8 >= 0) {
                            i14++;
                        } else {
                            i8 = iChar2_utf8 & 255;
                            switch (i8 >> 4) {
                                case 12 /* 12 */:
                                case 13:
                                    iChar2_utf8 = char2_utf8(i8, bArr[i14 + 1], i14);
                                    i14 += 2;
                                    this.nameAscii = false;
                                    break;
                                case 14 /* 14 */:
                                    iChar2_utf8 = char2_utf8(i8, bArr[i14 + 1], bArr[i14 + 2], i14);
                                    i14 += 3;
                                    this.nameAscii = false;
                                    break;
                                default:
                                    throw new JSONException(AbstractC1194.m2779(i14, "malformed input around byte "));
                            }
                        }
                        j2 = (j2 ^ ((long) iChar2_utf8)) * 1099511628211L;
                    }
                    i7++;
                    c = 32;
                    i = 120;
                    i2 = 117;
                }
            }
            if (i14 == i15) {
                i3 = i14;
                i4 = 26;
            } else {
                i3 = i14 + 1;
                i4 = bArr[i14];
            }
            while (i4 <= 32) {
                if (i3 == i15) {
                    i4 = 26;
                } else {
                    int i214 = i3 + 1;
                    int i31 = bArr[i3];
                    i3 = i214;
                    i4 = i31;
                }
                c = ' ';
            }
            if (i4 != 58) {
                throw new JSONException(info(AbstractC1194.m2779(i4, "expect ':', but ")));
            }
            if (i3 == i15) {
                i5 = i3;
                i6 = 26;
            } else {
                i5 = i3 + 1;
                i6 = bArr[i3];
            }
            while (i6 <= 32) {
                if (i5 == i15) {
                    i6 = 26;
                } else {
                    i6 = bArr[i5];
                    i5++;
                }
            }
            this.offset = i5;
            this.ch = (char) i6;
            return j2;
        }
        j = 0;
        c = ' ';
        j2 = 0L;
        i = 120;
        i2 = 117;
        if (true) {
            i11 = 0;
            while (i14 < i15) {
                iHexDigit5 = bArr[i14];
                if (iHexDigit5 != c3) {
                    if (iHexDigit5 == 92) {
                        if (true) {
                        }
                        i14++;
                        iHexDigit5 = (char) ((1792) | (bArr[i14] & '?'));
                        this.nameAscii = false;
                        if (false) {
                        }
                        i14 = this.nameBegin;
                        j2 = 0L;
                        break;
                    }
                    this.nameEscape = true;
                    i12 = i14 + 1;
                    i13 = bArr[i12];
                    if (i13 == 117) {
                        iHexDigit5 = IOUtils.hexDigit4(bArr, i14 + 2, i15);
                        i14 += 5;
                    } else if (i13 != 120) {
                        iHexDigit5 = char1(i13);
                        i14 = i12;
                    } else {
                        int i215 = bArr[i14 + 2];
                        i14 += 3;
                        iHexDigit5 = JSONReader.char2(i215, bArr[i14]);
                    }
                    if (iHexDigit5 > 255) {
                        this.nameAscii = false;
                    }
                    if (iHexDigit5 <= 255) {
                    }
                    i14 = this.nameBegin;
                    j2 = 0L;
                    break;
                }
                if (false) {
                    this.nameLength = i11;
                    this.nameEnd = i14;
                    i14++;
                    break;
                }
                i14 = this.nameBegin;
                break;
            }
        }
        if (true) {
            j2 = -3750763034362895579L;
            i7 = 0;
            while (true) {
                iChar2_utf8 = bArr[i14];
                if (iChar2_utf8 == 92) {
                    this.nameEscape = true;
                    int i216 = i14 + 1;
                    i9 = bArr[i216];
                    if (i9 != 117) {
                        if (i9 != 120) {
                            iChar1 = char1(i9);
                        } else {
                            int i217 = bArr[i14 + 2];
                            i10 = i14 + 3;
                            iHexDigit4 = JSONReader.char2(i217, bArr[i10]);
                        }
                        j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
                        i14 = i216 + 1;
                    } else {
                        iHexDigit4 = IOUtils.hexDigit4(bArr, i14 + 2, i15);
                        i10 = i14 + 5;
                    }
                    int i218 = iHexDigit4;
                    i216 = i10;
                    iChar1 = i218;
                    j2 = (j2 ^ ((long) iChar1)) * 1099511628211L;
                    i14 = i216 + 1;
                } else if (iChar2_utf8 == c3) {
                    this.nameLength = i7;
                    this.nameEnd = i14;
                    i14++;
                } else {
                    if (iChar2_utf8 >= 0) {
                        i14++;
                    } else {
                        i8 = iChar2_utf8 & 255;
                        switch (i8 >> 4) {
                            case 12 /* 12 */:
                            case 13:
                                iChar2_utf8 = char2_utf8(i8, bArr[i14 + 1], i14);
                                i14 += 2;
                                this.nameAscii = false;
                                break;
                            case 14 /* 14 */:
                                iChar2_utf8 = char2_utf8(i8, bArr[i14 + 1], bArr[i14 + 2], i14);
                                i14 += 3;
                                this.nameAscii = false;
                                break;
                            default:
                                throw new JSONException(AbstractC1194.m2779(i14, "malformed input around byte "));
                        }
                    }
                    j2 = (j2 ^ ((long) iChar2_utf8)) * 1099511628211L;
                }
                i7++;
                c = 32;
                i = 120;
                i2 = 117;
            }
        }
        if (i14 == i15) {
            i3 = i14;
            i4 = 26;
        } else {
            i3 = i14 + 1;
            i4 = bArr[i14];
        }
        while (i4 <= c) {
            if (i3 == i15) {
                i4 = 26;
            } else {
                int i219 = i3 + 1;
                int i32 = bArr[i3];
                i3 = i219;
                i4 = i32;
            }
            c = ' ';
        }
        if (i4 != 58) {
            throw new JSONException(info(AbstractC1194.m2779(i4, "expect ':', but ")));
        }
        if (i3 == i15) {
            i5 = i3;
            i6 = 26;
        } else {
            i5 = i3 + 1;
            i6 = bArr[i3];
        }
        while (i6 <= 32) {
            if (i5 == i15) {
                i6 = 26;
            } else {
                i6 = bArr[i5];
                i5++;
            }
        }
        this.offset = i5;
        this.ch = (char) i6;
        return j2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x009a -> B:40:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00be -> B:53:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x00b4
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeE(int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCodeE(int, int, int):long");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:108:0x0197  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:154:0x025c  */
    /* JADX WARN: Code duplicated, block: B:155:0x025e  */
    /* JADX WARN: Code duplicated, block: B:165:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x027d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0280  */
    /* JADX WARN: Code duplicated, block: B:213:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Code duplicated, block: B:84:0x013f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:170:0x0289
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeUnquote() {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCodeUnquote():long");
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01de  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:169:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0205  */
    /* JADX WARN: Code duplicated, block: B:173:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0209, code lost:
    
        r14 = -r11;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float readFloatValue() {
        int i;
        byte b;
        long j;
        long j2;
        long j3;
        int i2;
        float f;
        byte b2;
        int i3;
        float fFloatValue;
        boolean z;
        float f2;
        boolean z2;
        float[] fArr;
        int i4;
        byte b3;
        int i5;
        byte b4;
        int iDigit2;
        int iDigit3;
        int i6;
        byte b5;
        byte[] bArr = this.bytes;
        byte b6 = this.ch;
        int i7 = this.offset;
        int i8 = this.end;
        if (b6 != 34 && b6 != 39) {
            i = i7;
            b = b6;
            b6 = 0;
        } else if (i7 == i8) {
            i = i7;
            b = 26;
        } else {
            i = i7 + 1;
            b = bArr[i7];
        }
        long j4 = 0;
        if (b6 == 0 || b != b6) {
            if (b < 48 || b > 57) {
                j = 1;
                j2 = (b == 45 || b == 43) ? 0L : 1L;
            } else {
                j = 1;
                j2 = 48 - b;
            }
            while (true) {
                j3 = 0L;
                i2 = -1;
                if (j2 > 0L || i + 1 >= i8 || (iDigit3 = IOUtils.digit2(bArr, i)) == -1) {
                    break;
                }
                if (-92233720368547758L <= j2) {
                    j2 = (j2 * 100) - ((long) iDigit3);
                    i += 2;
                } else {
                    j2 = 1L;
                }
                j4 = 0L;
            }
            if (j2 > 0L || i >= i8) {
                f = 0.0f;
                b2 = b;
            } else {
                b2 = bArr[i];
                if (!IOUtils.isDigit(b2)) {
                    f = 0.0f;
                } else if (-922337203685477580L <= j2) {
                    f = 0.0f;
                    j2 = ((j2 * 10) + 48) - ((long) b2);
                    i++;
                } else {
                    f = 0.0f;
                    j2 = 1L;
                }
            }
            if (j2 > 0L || i >= i8 || bArr[i] != 46) {
                i3 = 0;
            } else {
                i++;
                i3 = 0;
                while (j2 <= 0L && i + 1 < i8 && (iDigit2 = IOUtils.digit2(bArr, i)) != -1) {
                    if (-92233720368547758L <= j2) {
                        j2 = (j2 * 100) - ((long) iDigit2);
                        i += 2;
                        i3 += 2;
                        i2 = -1;
                    } else {
                        j2 = 1L;
                    }
                }
                if (j2 <= 0L && i < i8) {
                    b2 = bArr[i];
                    if (IOUtils.isDigit(b2)) {
                        if (-922337203685477580L <= j2) {
                            j2 = ((j2 * 10) + 48) - ((long) b2);
                            i++;
                            i3++;
                        } else {
                            j2 = 1L;
                        }
                    }
                }
            }
            if (j2 <= 0L) {
                if (i == i8) {
                    b2 = 26;
                } else {
                    b2 = bArr[i];
                    i++;
                }
            }
            if (j2 <= 0L) {
                if (b2 == 101 || b2 == 69) {
                    if (i == i8) {
                        i5 = i;
                        b4 = 26;
                    } else {
                        i5 = i + 1;
                        b4 = bArr[i];
                    }
                    boolean z3 = b4 == 45;
                    if (z3 || b4 == 43) {
                        if (i5 == i8) {
                            i = i5;
                            b2 = 26;
                        } else {
                            i = i5 + 1;
                            b2 = bArr[i5];
                        }
                    } else {
                        if (b4 == 44) {
                            throw numberError();
                        }
                        int i9 = i5;
                        b2 = b4;
                        i = i9;
                    }
                    if (IOUtils.isDigit(b2)) {
                        int i10 = b2 + -48;
                        while (i < i8) {
                            byte b7 = bArr[i];
                            if (!IOUtils.isDigit(b7)) {
                                break;
                            }
                            i10 = (i10 * 10) + b7 + -48;
                            if (i10 > 2047) {
                                throw new JSONException(AbstractC1194.m2779(i10, "too large exp value : "));
                            }
                            i++;
                        }
                        if (z3) {
                            i10 = -i10;
                        }
                        i3 -= i10;
                        if (i == i8) {
                            b2 = 26;
                        } else {
                            b2 = bArr[i];
                            i++;
                        }
                    } else {
                        j2 = 1L;
                    }
                }
                if (b2 == 76 || b2 == 70 || b2 == 68 || b2 == 66 || b2 == 83) {
                    if (i == i8) {
                        b2 = 26;
                    } else {
                        b2 = bArr[i];
                        i++;
                    }
                }
            }
            if (j2 <= 0L && b6 != 0) {
                if (b2 == b6) {
                    if (i == i8) {
                        i4 = i;
                        b3 = 26;
                    } else {
                        i4 = i + 1;
                        b3 = bArr[i];
                    }
                    b2 = b3;
                    i = i4;
                } else {
                    j2 = 1L;
                }
            }
            if (j2 <= 0L) {
                if (i3 == 0) {
                    f2 = j2;
                } else {
                    float f3 = j2;
                    if (((long) f3) == j2) {
                        if (i3 > 0) {
                            float[] fArr2 = JSONFactory.FLOAT_10_POW;
                            if (i3 < fArr2.length) {
                                f2 = f3 / fArr2[i3];
                            } else if (false) {
                                fArr = JSONFactory.FLOAT_10_POW;
                                if (i3 > (-fArr.length)) {
                                    f2 = f3 * fArr[-i3];
                                }
                                if (z2) {
                                    fFloatValue = b != 45 ? f2 : f2;
                                } else if (i3 > 0 || i3 >= 128) {
                                    fFloatValue = f2;
                                    j2 = j;
                                } else {
                                    fFloatValue = TypeUtils.floatValue(b == 45 ? -1 : 1, Math.abs(j2), i3);
                                }
                            }
                        } else if (true) {
                            fArr = JSONFactory.FLOAT_10_POW;
                            if (i3 > (-fArr.length)) {
                                f2 = f3 * fArr[-i3];
                            }
                            if (z2) {
                                if (false) {
                                }
                                fFloatValue = f2;
                                j2 = 1L;
                            } else if (b != 45) {
                            }
                        }
                    }
                    f2 = 0.0f;
                    z2 = false;
                    if (false) {
                        if (i3 > 0) {
                        }
                        fFloatValue = f2;
                        j2 = j;
                    } else if (b != 45) {
                    }
                }
                z2 = true;
                if (true) {
                    if (i3 > 0) {
                    }
                    fFloatValue = f2;
                    j2 = 1L;
                } else if (b != 45) {
                }
            } else {
                fFloatValue = 0.0f;
            }
            z = false;
        } else {
            if (i == i8) {
                b2 = 26;
            } else {
                b2 = bArr[i];
                i++;
            }
            j2 = 0;
            j3 = 0;
            z = true;
            fFloatValue = 0.0f;
            j = 1;
        }
        if (j2 > 0L) {
            readNumber0();
            return getFloatValue();
        }
        while (b2 <= 32 && ((1L << b2) & 4294981377L) != 0L) {
            if (i == i8) {
                b2 = 26;
            } else {
                b2 = bArr[i];
                i++;
            }
        }
        boolean z4 = b2 == 44;
        this.comma = z4;
        if (z4) {
            if (i == i8) {
                i6 = i;
                b5 = 26;
            } else {
                i6 = i + 1;
                b5 = bArr[i];
            }
            loop1: while (true) {
                byte b8 = b5;
                i = i6;
                b2 = b8;
                while (true) {
                    if (b2 > 32 || ((1L << b2) & 4294981377L) == 0L) {
                        break loop1;
                    }
                    if (i == i8) {
                        b2 = 26;
                    }
                }
                i6 = i + 1;
                b5 = bArr[i];
            }
        }
        this.wasNull = true;
        this.ch = (char) b2;
        this.offset = i;
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b A[LOOP:0: B:20:0x0036->B:30:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0030 A[EDGE_INSN: B:88:0x0030->B:18:0x0030 BREAK  A[LOOP:0: B:20:0x0036->B:30:0x004b], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0048 -> B:18:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00d3 -> B:67:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x003e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final byte[] readHex() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readHex():byte[]");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readIfNull() {
        int i;
        byte b;
        byte[] bArr = this.bytes;
        char c = this.ch;
        int i2 = this.offset;
        if (c != 'n' || bArr[i2] != 117 || bArr[i2 + 1] != 108 || bArr[i2 + 2] != 108) {
            return false;
        }
        int i3 = i2 + 3;
        byte b2 = i3 == this.end ? (byte) 26 : (char) bArr[i3];
        int i4 = i2 + 4;
        while (b2 <= 32 && ((1 << b2) & 4294981377L) != 0) {
            if (i4 == this.end) {
                b2 = 26;
            } else {
                int i5 = i4 + 1;
                byte b3 = bArr[i4];
                i4 = i5;
                b2 = b3;
            }
        }
        boolean z = b2 == 44;
        this.comma = z;
        if (z) {
            if (i4 == this.end) {
                i = i4;
                b = 26;
            } else {
                i = i4 + 1;
                b = (char) bArr[i4];
            }
            loop1: while (true) {
                byte b4 = b;
                i4 = i;
                b2 = b4;
                while (true) {
                    if (b2 > 32 || ((1 << b2) & 4294981377L) == 0) {
                        break loop1;
                    }
                    if (i4 == this.end) {
                        b2 = 26;
                    }
                }
                i = i4 + 1;
                b = bArr[i4];
            }
        }
        this.offset = i4;
        this.ch = (char) b2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final Integer readInt32() {
        char c = this.ch;
        if ((c == '\"' || c == '\'' || c == 'n') && nextIfNullOrEmptyString()) {
            return null;
        }
        return Integer.valueOf(readInt32Value());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00d3 -> B:74:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x00c9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final int readInt32Value() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readInt32Value():int");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final Long readInt64() {
        char c = this.ch;
        if ((c == '\"' || c == '\'' || c == 'n') && nextIfNullOrEmptyString()) {
            return null;
        }
        return Long.valueOf(readInt64Value());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00ee -> B:77:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:81:0x00e4
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final long readInt64Value() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readInt64Value():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate() {
        LocalDate localDateLocalDateYMD;
        int i;
        byte b;
        int i2;
        byte b2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = this.end;
        char c = this.ch;
        if ((c == '\"' || c == '\'') && !this.context.formatComplex) {
            int i5 = i3 + 10;
            if (i5 < bArr.length && i5 < i4 && (localDateLocalDateYMD = DateUtils.localDateYMD(bArr, i3)) != null && bArr[i5] == c) {
                int i6 = i3 + 11;
                if (i6 >= i4) {
                    i = i6;
                    b = 26;
                } else {
                    i = i3 + 12;
                    b = bArr[i6];
                }
                boolean z = b == 44;
                this.comma = z;
                if (z) {
                    if (i == i4) {
                        i2 = i;
                        b2 = 26;
                    } else {
                        i2 = i + 1;
                        b2 = (char) bArr[i];
                    }
                    loop0: while (true) {
                        int i7 = i2;
                        b = b2;
                        i = i7;
                        while (true) {
                            if (b > 32 || ((1 << b) & 4294981377L) == 0) {
                                break loop0;
                            }
                            if (i == i4) {
                                b = 26;
                            }
                        }
                        i2 = i + 1;
                        b2 = bArr[i];
                    }
                }
                if (b < 0) {
                    char_utf8(b, i);
                    return localDateLocalDateYMD;
                }
                this.offset = i;
                this.ch = (char) b;
                return localDateLocalDateYMD;
            }
            LocalDate localDate0 = readLocalDate0(i3, bArr, c);
            if (localDate0 != null) {
                return localDate0;
            }
        }
        return super.readLocalDate();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate10() {
        if (!isString()) {
            throw new JSONException("localDate only support string input");
        }
        try {
            LocalDate localDate10 = DateUtils.parseLocalDate10(this.bytes, this.offset);
            if (localDate10 == null) {
                return null;
            }
            this.offset += 11;
            next();
            boolean z = this.ch == ',';
            this.comma = z;
            if (z) {
                next();
            }
            return localDate10;
        } catch (DateTimeException e) {
            throw new JSONException(info("read date error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate11() {
        if (!isString()) {
            throw new JSONException("localDate only support string input");
        }
        LocalDate localDate11 = DateUtils.parseLocalDate11(this.bytes, this.offset);
        if (localDate11 == null) {
            return null;
        }
        this.offset += 11;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDate11;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate8() {
        if (!isString()) {
            throw new JSONException("localDate only support string input");
        }
        try {
            LocalDate localDate8 = DateUtils.parseLocalDate8(this.bytes, this.offset);
            this.offset += 9;
            next();
            boolean z = this.ch == ',';
            this.comma = z;
            if (z) {
                next();
            }
            return localDate8;
        } catch (DateTimeException e) {
            throw new JSONException(info("read date error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate9() {
        if (!isString()) {
            throw new JSONException("localDate only support string input");
        }
        try {
            LocalDate localDate9 = DateUtils.parseLocalDate9(this.bytes, this.offset);
            this.offset += 10;
            next();
            boolean z = this.ch == ',';
            this.comma = z;
            if (z) {
                next();
            }
            return localDate9;
        } catch (DateTimeException e) {
            throw new JSONException(info("read date error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime12() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime12 = DateUtils.parseLocalDateTime12(this.bytes, this.offset);
        if (localDateTime12 == null) {
            return null;
        }
        this.offset += 13;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime12;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime14() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime14 = DateUtils.parseLocalDateTime14(this.bytes, this.offset);
        if (localDateTime14 == null) {
            return null;
        }
        this.offset += 15;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime14;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime16() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime16 = DateUtils.parseLocalDateTime16(this.bytes, this.offset);
        if (localDateTime16 == null) {
            return null;
        }
        this.offset += 17;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime16;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime17() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime17 = DateUtils.parseLocalDateTime17(this.bytes, this.offset);
        if (localDateTime17 == null) {
            return null;
        }
        this.offset += 18;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime17;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime18() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime18 = DateUtils.parseLocalDateTime18(this.bytes, this.offset);
        this.offset += 19;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime18;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime19() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime19 = DateUtils.parseLocalDateTime19(this.bytes, this.offset);
        if (localDateTime19 == null) {
            return null;
        }
        this.offset += 20;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime19;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime20() {
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime20 = DateUtils.parseLocalDateTime20(this.bytes, this.offset);
        if (localDateTime20 == null) {
            return null;
        }
        this.offset += 21;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTimeX(int i) {
        LocalDateTime localDateTimeX;
        LocalDateTime localDateTime;
        ChronoLocalDateTime<LocalDate> localDateTime2;
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        boolean z = true;
        if (bArr[(i2 + i) - 1] == 90) {
            localDateTime2 = DateUtils.parseZonedDateTime(bArr, i2, i).toInstant().atZone(this.context.getZoneId()).toLocalDateTime();
        } else {
            localDateTimeX = DateUtils.parseLocalDateTimeX(bArr, i2, i);
        }
        if (false) {
            localDateTime = localDateTimeX;
            localDateTime = localDateTime2;
            return null;
        }
        localDateTime = localDateTimeX;
        this.offset = i + 1 + this.offset;
        next();
        if (this.ch != ',') {
            localDateTime = localDateTime2;
            z = false;
        }
        localDateTime = localDateTime2;
        this.comma = z;
        if (z) {
            next();
        }
        return localDateTime;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime10() {
        if (!isString()) {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime10 = DateUtils.parseLocalTime10(this.bytes, this.offset);
        if (localTime10 == null) {
            return null;
        }
        this.offset += 11;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime11() {
        if (!isString()) {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime11 = DateUtils.parseLocalTime11(this.bytes, this.offset);
        if (localTime11 == null) {
            return null;
        }
        this.offset += 12;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime11;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime12() {
        if (!isString()) {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime12 = DateUtils.parseLocalTime12(this.bytes, this.offset);
        if (localTime12 == null) {
            return null;
        }
        this.offset += 13;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime12;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime15() {
        if (!isString()) {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime15 = DateUtils.parseLocalTime15(this.bytes, this.offset);
        if (localTime15 == null) {
            return null;
        }
        this.offset += 16;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime15;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime18() {
        if (!isString()) {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime18 = DateUtils.parseLocalTime18(this.bytes, this.offset);
        if (localTime18 == null) {
            return null;
        }
        this.offset += 19;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime18;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime5() {
        char c = this.ch;
        if (c != '\"' && c != '\'') {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime5 = DateUtils.parseLocalTime5(this.bytes, this.offset);
        if (localTime5 == null) {
            return null;
        }
        this.offset += 6;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime5;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime6() {
        char c = this.ch;
        if (c != '\"' && c != '\'') {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime6 = DateUtils.parseLocalTime6(this.bytes, this.offset);
        if (localTime6 == null) {
            return null;
        }
        this.offset += 7;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime6;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime7() {
        char c = this.ch;
        if (c != '\"' && c != '\'') {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime7 = DateUtils.parseLocalTime7(this.bytes, this.offset);
        if (localTime7 == null) {
            return null;
        }
        this.offset += 8;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime7;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime8() {
        char c = this.ch;
        if (c != '\"' && c != '\'') {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.bytes, this.offset);
        if (localTime8 == null) {
            return null;
        }
        this.offset += 9;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime9() {
        char c = this.ch;
        if (c != '\"' && c != '\'') {
            throw new JSONException("localTime only support string input");
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.bytes, this.offset);
        if (localTime8 == null) {
            return null;
        }
        this.offset += 10;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return localTime8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long readMillis19() {
        byte b = this.ch;
        if (b != 34 && b != 39) {
            throw new JSONException("date only support string input");
        }
        int i = this.offset;
        if (i + 18 >= this.end) {
            this.wasNull = true;
            return 0L;
        }
        long millis19 = DateUtils.parseMillis19(this.bytes, i, this.context.zoneId);
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        if (bArr[i2 + 19] != b) {
            throw new JSONException(info("illegal date input"));
        }
        this.offset = i2 + 20;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return millis19;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0037 -> B:9:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x002c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final double readNaN() {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r3 = 97
            if (r2 != r3) goto L77
            int r2 = r1 + 1
            r2 = r0[r2]
            r3 = 78
            if (r2 != r3) goto L77
            int r2 = r1 + 2
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L1d
            r1 = r2
        L1b:
            r2 = r4
            goto L21
        L1d:
            int r1 = r1 + 3
            r2 = r0[r2]
        L21:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r3 = 32
            if (r2 > r3) goto L42
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L42
            int r2 = r14.end
            if (r1 < r2) goto L3a
            goto L1b
        L3a:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L21
        L42:
            r11 = 44
            if (r2 != r11) goto L48
            r11 = 1
            goto L49
        L48:
            r11 = 0
        L49:
            r14.comma = r11
            if (r11 == 0) goto L6f
            int r2 = r14.end
            if (r1 < r2) goto L54
            r2 = r1
            r1 = r4
            goto L58
        L54:
            int r2 = r1 + 1
            r1 = r0[r1]
        L58:
            r13 = r2
            r2 = r1
            r1 = r13
        L5b:
            if (r2 > r3) goto L6f
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r2 = r14.end
            if (r1 < r2) goto L6a
            r2 = r4
            goto L5b
        L6a:
            int r2 = r1 + 1
            r1 = r0[r1]
            goto L58
        L6f:
            char r0 = (char) r2
            r14.ch = r0
            r14.offset = r1
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L77:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "json syntax error, not NaN "
            java.lang.String r1 = p000.AbstractC1194.m2779(r1, r2)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNaN():double");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003d -> B:11:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0032
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final void readNull() {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L7b
            int r2 = r1 + 1
            r2 = r0[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L7b
            int r2 = r1 + 2
            r2 = r0[r2]
            if (r2 != r3) goto L7b
            int r2 = r1 + 3
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L23
            r1 = r2
        L21:
            r2 = r4
            goto L27
        L23:
            int r1 = r1 + 4
            r2 = r0[r2]
        L27:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r3 = 32
            if (r2 > r3) goto L48
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L48
            int r2 = r14.end
            if (r1 < r2) goto L40
            goto L21
        L40:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L27
        L48:
            r11 = 44
            if (r2 != r11) goto L4e
            r11 = 1
            goto L4f
        L4e:
            r11 = 0
        L4f:
            r14.comma = r11
            if (r11 == 0) goto L75
            int r2 = r14.end
            if (r1 < r2) goto L5a
            r2 = r1
            r1 = r4
            goto L5e
        L5a:
            int r2 = r1 + 1
            r1 = r0[r1]
        L5e:
            r13 = r2
            r2 = r1
            r1 = r13
        L61:
            if (r2 > r3) goto L75
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L75
            int r2 = r14.end
            if (r1 < r2) goto L70
            r2 = r4
            goto L61
        L70:
            int r2 = r1 + 1
            r1 = r0[r1]
            goto L5e
        L75:
            char r0 = (char) r2
            r14.ch = r0
            r14.offset = r1
            return
        L7b:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "json syntax error, not match null"
            java.lang.String r1 = p000.AbstractC1194.m2779(r1, r2)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNull():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005d -> B:23:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x009f -> B:44:0x0090). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    public final Date readNullOrNewDate() {
        long j;
        int i;
        byte b;
        int i2;
        byte b2;
        Date date;
        int i3;
        byte b3;
        byte[] bArr = this.bytes;
        int i4 = this.offset;
        int i5 = i4 + 2;
        int i6 = this.end;
        if (i5 >= i6 || bArr[i4] != 117 || bArr[i4 + 1] != 108 || bArr[i5] != 108) {
            int i7 = i4 + 1;
            if (i7 >= i6 || bArr[i4] != 101 || bArr[i7] != 119) {
                throw new JSONException(AbstractC1194.m2779(i4, "json syntax error, not match null or new Date"));
            }
            int i8 = i4 + 3;
            byte b4 = i8 == i6 ? (byte) 26 : bArr[i5];
            while (true) {
                if (b4 > 32 && ((1 << b4) & 4294981377L) != 0) {
                    if (true) {
                        b4 = bArr[i8];
                        i8++;
                    }
                    if (b4 > 32) {
                    }
                }
                int i9 = i8 + 4;
                int i10 = this.end;
                if (i9 < i10) {
                    j = 0;
                    if (b4 == 68 && bArr[i8] == 97 && bArr[i8 + 1] == 116 && bArr[i8 + 2] == 101) {
                        int i11 = i8 + 3;
                        byte b5 = i11 == i10 ? (byte) 26 : bArr[i11];
                        while (true) {
                            if (b5 > 32 && ((1 << b5) & 4294981377L) != 0) {
                                if (true) {
                                    byte b6 = bArr[i9];
                                    i9++;
                                    b5 = b6;
                                }
                                if (b5 > 32) {
                                }
                            }
                            if (b5 != 40 || i9 >= this.end) {
                                throw new JSONException(AbstractC1194.m2779(i9, "json syntax error, not match new Date"));
                            }
                            int i12 = i9 + 1;
                            byte b7 = bArr[i9];
                            while (b7 <= 32 && ((1 << b7) & 4294981377L) != 0) {
                                if (i12 == this.end) {
                                    b7 = 26;
                                } else {
                                    b7 = bArr[i12];
                                    i12++;
                                }
                            }
                            this.ch = (char) b7;
                            this.offset = i12;
                            long int64Value = readInt64Value();
                            char c = this.ch;
                            int i13 = this.offset;
                            if (c != ')') {
                                throw new JSONException(AbstractC1194.m2779(i13, "json syntax error, not match new Date"));
                            }
                            if (i13 >= this.end) {
                                i = i13;
                                b = 26;
                            } else {
                                i = i13 + 1;
                                b = bArr[i13];
                            }
                            Date date2 = new Date(int64Value);
                            i2 = i;
                            b2 = b;
                            date = date2;
                        }
                    }
                }
                throw new JSONException(AbstractC1194.m2779(i8, "json syntax error, not match new Date"));
            }
        }
        int i14 = i4 + 3;
        b2 = i14 == i6 ? (byte) 26 : bArr[i14];
        i2 = i4 + 4;
        date = null;
        j = 0;
        while (b2 <= 32 && ((1 << b2) & 4294981377L) != 0L) {
            if (i2 == this.end) {
                b2 = 26;
            } else {
                b2 = bArr[i2];
                i2++;
            }
        }
        boolean z = b2 == 44;
        this.comma = z;
        if (z) {
            if (i2 == this.end) {
                i3 = i2;
                b3 = 26;
            } else {
                i3 = i2 + 1;
                b3 = bArr[i2];
            }
            loop1: while (true) {
                int i15 = i3;
                b2 = b3;
                i2 = i15;
                while (true) {
                    if (b2 > 32 || ((1 << b2) & 4294981377L) == 0L) {
                        break loop1;
                    }
                    if (i2 == this.end) {
                        b2 = 26;
                    }
                }
                i3 = i2 + 1;
                b3 = bArr[i2];
            }
        }
        this.offset = i2;
        this.ch = (char) b2;
        return date;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void readNumber(ValueConsumer valueConsumer, boolean z) {
        char c;
        boolean z2;
        char c2;
        int i;
        byte b;
        this.wasNull = false;
        this.boolValue = false;
        this.mag0 = 0;
        this.mag1 = 0;
        this.mag2 = 0;
        this.mag3 = 0;
        this.negative = false;
        this.exponent = (short) 0;
        this.scale = (short) 0;
        int i2 = this.end;
        byte[] bArr = this.bytes;
        char c3 = this.ch;
        if (c3 == '\"' || c3 == '\'') {
            int i3 = this.offset;
            this.offset = i3 + 1;
            this.ch = (char) bArr[i3];
        } else {
            c3 = 0;
        }
        int i4 = this.offset;
        if (this.ch == '-') {
            this.negative = true;
            this.offset = i4 + 1;
            this.ch = (char) bArr[i4];
        }
        this.valueType = (byte) 1;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            c = this.ch;
            if (c < '0' || c > '9') {
                break;
            }
            if (!z3) {
                int i5 = this.mag3;
                int i6 = (c - '0') + (i5 * 10);
                if (i6 < i5) {
                    z3 = true;
                } else {
                    this.mag3 = i6;
                }
            }
            int i7 = this.offset;
            this.offset = i7 + 1;
            this.ch = (char) bArr[i7];
            z4 = true;
        }
        if (c == '.') {
            this.valueType = (byte) 2;
            int i8 = this.offset;
            this.offset = i8 + 1;
            this.ch = (char) bArr[i8];
            while (true) {
                char c4 = this.ch;
                if (c4 < '0' || c4 > '9') {
                    break;
                }
                if (!z3) {
                    int i9 = this.mag3;
                    int i10 = (c4 - '0') + (i9 * 10);
                    if (i10 < i9) {
                        z3 = true;
                    } else {
                        this.mag3 = i10;
                    }
                }
                this.scale = (short) (this.scale + 1);
                int i11 = this.offset;
                this.offset = i11 + 1;
                this.ch = (char) bArr[i11];
                z4 = true;
            }
        }
        if (z3) {
            bigInt(bArr, this.negative ? i4 : i4 - 1, this.offset - 1);
        }
        char c5 = this.ch;
        if (c5 == 'e' || c5 == 'E') {
            int i12 = this.offset;
            int i13 = i12 + 1;
            this.offset = i13;
            char c6 = (char) bArr[i12];
            this.ch = c6;
            if (c6 == '-') {
                this.offset = i12 + 2;
                this.ch = (char) bArr[i13];
                z2 = true;
            } else {
                if (c6 == '+') {
                    this.offset = i12 + 2;
                    this.ch = (char) bArr[i13];
                }
                z2 = false;
            }
            int i14 = 0;
            while (true) {
                char c7 = this.ch;
                if (c7 < '0' || c7 > '9') {
                    break;
                }
                i14 = (i14 * 10) + (c7 - '0');
                if (i14 > 2047) {
                    throw new JSONException(AbstractC1194.m2779(i14, "too large exp value : "));
                }
                int i15 = this.offset;
                this.offset = i15 + 1;
                this.ch = (char) bArr[i15];
                z4 = true;
            }
            if (z2) {
                i14 = -i14;
            }
            this.exponent = (short) i14;
            this.valueType = (byte) 2;
        }
        int i16 = this.offset;
        int i17 = i16 - i4;
        if (i16 == i4) {
            char c8 = this.ch;
            if (c8 == 'n') {
                int i18 = i16 + 1;
                this.offset = i18;
                if (bArr[i16] == 117) {
                    int i19 = i16 + 2;
                    this.offset = i19;
                    if (bArr[i18] == 108) {
                        int i20 = i16 + 3;
                        this.offset = i20;
                        if (bArr[i19] == 108) {
                            this.wasNull = true;
                            this.valueType = (byte) 5;
                            this.offset = i16 + 4;
                            this.ch = (char) bArr[i20];
                            z4 = true;
                        }
                    }
                }
            } else if (c8 == 't') {
                int i21 = i16 + 1;
                this.offset = i21;
                if (bArr[i16] == 114) {
                    int i22 = i16 + 2;
                    this.offset = i22;
                    if (bArr[i21] == 117) {
                        int i23 = i16 + 3;
                        this.offset = i23;
                        if (bArr[i22] == 101) {
                            this.boolValue = true;
                            this.valueType = (byte) 4;
                            this.offset = i16 + 4;
                            this.ch = (char) bArr[i23];
                            z4 = true;
                        }
                    }
                }
            } else if (c8 == 'f' && i16 + 3 < i2 && IOUtils.isALSE(bArr, i16)) {
                int i24 = this.offset;
                this.boolValue = false;
                this.valueType = (byte) 4;
                this.offset = i24 + 5;
                this.ch = (char) bArr[i24 + 4];
                z4 = true;
            } else {
                char c9 = this.ch;
                if (c9 == '{' && c3 == 0) {
                    this.complex = readObject();
                    this.valueType = (byte) 6;
                    return;
                } else if (c9 == '[' && c3 == 0) {
                    this.complex = readArray();
                    this.valueType = (byte) 7;
                    return;
                }
            }
        }
        if (c3 != 0) {
            if (this.ch != c3) {
                this.offset--;
                this.ch = c3;
                readString0();
                this.valueType = (byte) 3;
                return;
            }
            int i25 = this.offset;
            this.offset = i25 + 1;
            this.ch = (char) bArr[i25];
        }
        while (true) {
            c2 = this.ch;
            if (c2 > ' ' || ((1 << c2) & 4294981377L) == 0) {
                break;
            }
            int i26 = this.offset;
            if (i26 >= i2) {
                this.ch = (char) 26;
            } else {
                this.offset = i26 + 1;
                this.ch = (char) bArr[i26];
            }
        }
        boolean z5 = c2 == ',';
        this.comma = z5;
        if (z5) {
            int i27 = this.offset;
            int i28 = i27 + 1;
            this.offset = i28;
            this.ch = (char) bArr[i27];
            if (i28 >= i2) {
                this.ch = (char) 26;
            } else {
                while (true) {
                    char c10 = this.ch;
                    if (c10 > ' ' || ((1 << c10) & 4294981377L) == 0) {
                        break;
                    }
                    int i29 = this.offset;
                    if (i29 >= i2) {
                        this.ch = (char) 26;
                    } else {
                        this.offset = i29 + 1;
                        this.ch = (char) bArr[i29];
                    }
                }
            }
        }
        if (!z && ((b = this.valueType) == 1 || b == 2)) {
            valueConsumer.accept(bArr, i4 - 1, i17);
            return;
        }
        if (this.valueType == 1) {
            int i30 = this.mag0;
            if (i30 == 0 && this.mag1 == 0 && this.mag2 == 0 && (i = this.mag3) != -2147483648) {
                if (this.negative) {
                    i = -i;
                }
                valueConsumer.accept(i);
                return;
            } else if (i30 == 0 && this.mag1 == 0) {
                long j = ((long) this.mag3) & 4294967295L;
                long j2 = 4294967295L & ((long) this.mag2);
                if (j2 <= 2147483647L) {
                    long j3 = (j2 << 32) + j;
                    if (this.negative) {
                        j3 = -j3;
                    }
                    valueConsumer.accept(j3);
                    return;
                }
            }
        }
        valueConsumer.accept(getNumber());
        if (!z4) {
            throw new JSONException(info("illegal input error"));
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0049
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final void readNumber0() {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNumber0():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00b0 -> B:40:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:44:0x00a6
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetDateTime readOffsetDateTime() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readOffsetDateTime():java.time.OffsetDateTime");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final OffsetTime readOffsetTime() {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        JSONReader.Context context = this.context;
        byte b = this.ch;
        if ((b != 34 && b != 39) || context.dateFormat != null || (i = i3 + 8) >= bArr.length || i >= this.end || bArr[i3 + 2] != 58 || bArr[i3 + 5] != 58) {
            throw new JSONException(info("illegal offsetTime"));
        }
        byte b2 = bArr[i3];
        byte b3 = bArr[i3 + 1];
        byte b4 = bArr[i3 + 3];
        byte b5 = bArr[i3 + 4];
        byte b6 = bArr[i3 + 6];
        byte b7 = bArr[i3 + 7];
        if (b2 < 48 || b2 > 57 || b3 < 48 || b3 > 57) {
            throw new JSONException(info("illegal offsetTime"));
        }
        int i4 = (b3 - 48) + ((b2 - 48) * 10);
        if (b4 < 48 || b4 > 57 || b5 < 48 || b5 > 57) {
            throw new JSONException(info("illegal offsetTime"));
        }
        int i5 = (b5 - 48) + ((b4 - 48) * 10);
        if (b6 < 48 || b6 > 57 || b7 < 48 || b7 > 57) {
            throw new JSONException(info("illegal offsetTime"));
        }
        int i6 = (b7 - 48) + ((b6 - 48) * 10);
        int i7 = i3 + 25;
        int i8 = i;
        int i9 = -1;
        while (true) {
            if (i8 >= i7 || i8 >= this.end || i8 >= bArr.length) {
                i2 = 0;
                break;
            }
            byte b8 = bArr[i8];
            if (i9 == -1 && (b8 == 90 || b8 == 43 || b8 == 45)) {
                i9 = (i8 - i) - 1;
            }
            if (b8 == b) {
                i2 = i8 - i3;
                break;
            }
            i8++;
        }
        int i10 = (i2 - 9) - i9;
        OffsetTime offsetTimeOf = OffsetTime.of(LocalTime.of(i4, i5, i6, i9 <= 0 ? 0 : DateUtils.readNanos(bArr, i9, i3 + 9)), i10 <= 1 ? ZoneOffset.UTC : ZoneOffset.of(new String(bArr, i3 + 9 + i9, i10)));
        this.offset = i2 + 1 + this.offset;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return offsetTimeOf;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0045 -> B:14:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x003a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.lang.String readPattern() {
        /*
            r15 = this;
            char r0 = r15.ch
            r1 = 47
            if (r0 != r1) goto L83
            byte[] r0 = r15.bytes
            int r2 = r15.offset
            r3 = r2
        Lb:
            int r4 = r15.end
            if (r3 >= r4) goto L17
            r4 = r0[r3]
            if (r4 != r1) goto L14
            goto L17
        L14:
            int r3 = r3 + 1
            goto Lb
        L17:
            java.lang.String r1 = new java.lang.String
            int r4 = r3 - r2
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r2, r4, r5)
            int r2 = r3 + 1
            int r4 = r15.end
            r5 = 26
            if (r2 != r4) goto L2b
            r3 = r2
        L29:
            r2 = r5
            goto L2f
        L2b:
            int r3 = r3 + 2
            r2 = r0[r2]
        L2f:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r4 = 32
            if (r2 > r4) goto L50
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L50
            int r2 = r15.end
            if (r3 != r2) goto L48
            goto L29
        L48:
            int r2 = r3 + 1
            r3 = r0[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L2f
        L50:
            r12 = 44
            if (r2 != r12) goto L56
            r12 = 1
            goto L57
        L56:
            r12 = 0
        L57:
            r15.comma = r12
            if (r12 == 0) goto L7d
            int r2 = r15.end
            if (r3 != r2) goto L62
            r2 = r3
            r3 = r5
            goto L66
        L62:
            int r2 = r3 + 1
            r3 = r0[r3]
        L66:
            r14 = r3
            r3 = r2
            r2 = r14
        L69:
            if (r2 > r4) goto L7d
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L7d
            int r2 = r15.end
            if (r3 != r2) goto L78
            r2 = r5
            goto L69
        L78:
            int r2 = r3 + 1
            r3 = r0[r3]
            goto L66
        L7d:
            r15.offset = r3
            char r0 = (char) r2
            r15.ch = r0
            return r1
        L83:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "illegal pattern"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readPattern():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:20:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x004e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.lang.String readReference() {
        /*
            r15 = this;
            int r0 = r15.referenceBegin
            int r1 = r15.end
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r1 = r15.bytes
            int r2 = r0 + 1
            r15.offset = r2
            r0 = r1[r0]
            char r0 = (char) r0
            r15.ch = r0
            java.lang.String r0 = r15.readString()
            char r2 = r15.ch
            int r3 = r15.offset
        L1b:
            r4 = 0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r8 = 1
            r10 = 32
            r11 = 26
            if (r2 > r10) goto L3f
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L3f
            int r2 = r15.end
            if (r3 != r2) goto L37
            r2 = r11
            goto L1b
        L37:
            int r2 = r3 + 1
            r3 = r1[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L1b
        L3f:
            r12 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L97
            int r2 = r15.end
            if (r3 != r2) goto L4a
            r2 = r3
        L48:
            r3 = r11
            goto L4e
        L4a:
            int r2 = r3 + 1
            r3 = r1[r3]
        L4e:
            if (r3 > r10) goto L64
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L64
            int r3 = r15.end
            if (r2 != r3) goto L5c
            goto L48
        L5c:
            int r3 = r2 + 1
            r2 = r1[r2]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L4e
        L64:
            r12 = 44
            if (r3 != r12) goto L6a
            r12 = 1
            goto L6b
        L6a:
            r12 = 0
        L6b:
            r15.comma = r12
            if (r12 == 0) goto L91
            int r3 = r15.end
            if (r2 != r3) goto L76
            r3 = r2
            r2 = r11
            goto L7a
        L76:
            int r3 = r2 + 1
            r2 = r1[r2]
        L7a:
            r14 = r3
            r3 = r2
            r2 = r14
        L7d:
            if (r3 > r10) goto L91
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L91
            int r3 = r15.end
            if (r2 != r3) goto L8c
            r3 = r11
            goto L7d
        L8c:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L7a
        L91:
            char r1 = (char) r3
            r15.ch = r1
            r15.offset = r2
            return r0
        L97:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "illegal reference : "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readReference():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void readString(ValueConsumer valueConsumer, boolean z) {
        boolean z2;
        byte b = this.ch;
        int i = this.offset;
        this.valueEscape = false;
        byte[] bArr = this.bytes;
        int i2 = i;
        int i3 = 0;
        while (true) {
            byte b2 = bArr[i2];
            byte b3 = 120;
            byte b4 = 117;
            byte b5 = 92;
            if (b2 != 92) {
                if (b2 < 0) {
                    switch ((b2 & -1) >> 4) {
                        case 12 /* 12 */:
                        case 13:
                            i2 += 2;
                            break;
                        case 14 /* 14 */:
                            i2 += 3;
                            break;
                        default:
                            if ((b2 >> 3) != -2) {
                                throw new JSONException(AbstractC1194.m2779(i2, "malformed input around byte "));
                            }
                            i2 += 4;
                            i3++;
                            break;
                            break;
                    }
                } else {
                    if (b2 == b) {
                        if (this.valueEscape) {
                            int i4 = i2 - this.offset;
                            char[] cArr = new char[i3];
                            int i5 = this.end;
                            int i6 = 0;
                            z2 = true;
                            while (true) {
                                int iHexDigit4 = bArr[i];
                                if (iHexDigit4 == 92) {
                                    int i7 = i + 1;
                                    byte b6 = bArr[i7];
                                    if (b6 == 34 || b6 == 92) {
                                        i = i7;
                                        iHexDigit4 = b6;
                                    } else if (b6 == 117) {
                                        iHexDigit4 = IOUtils.hexDigit4(bArr, i + 2, i5);
                                        i += 5;
                                    } else if (b6 != 120) {
                                        iHexDigit4 = char1(b6);
                                        i = i7;
                                    } else {
                                        byte b7 = bArr[i + 2];
                                        i += 3;
                                        iHexDigit4 = JSONReader.char2(b7, bArr[i]);
                                    }
                                } else if (iHexDigit4 == 34) {
                                    if (z) {
                                        JSONWriter jSONWriterOf = JSONWriter.of();
                                        jSONWriterOf.writeString(cArr, 0, i3);
                                        byte[] bytes = jSONWriterOf.getBytes();
                                        valueConsumer.accept(bytes, 0, bytes.length);
                                    } else {
                                        byte[] bArr2 = new byte[i4];
                                        valueConsumer.accept(bArr2, 0, IOUtils.encodeUTF8(cArr, 0, i3, bArr2, 0));
                                    }
                                    i2 = i;
                                }
                                if (iHexDigit4 < 0) {
                                    switch ((iHexDigit4 & 255) >> 4) {
                                        case 12 /* 12 */:
                                        case 13:
                                            cArr[i6] = (char) (((iHexDigit4 & 31) << 6) | (bArr[i + 1] & 63));
                                            i += 2;
                                            break;
                                        case 14 /* 14 */:
                                            cArr[i6] = (char) (((iHexDigit4 & 15) << 12) | ((bArr[i + 1] & 63) << 6) | (bArr[i + 2] & 63));
                                            i += 3;
                                            break;
                                        default:
                                            if ((iHexDigit4 >> 3) != -2) {
                                                throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
                                            }
                                            byte b8 = bArr[i + 1];
                                            byte b9 = bArr[i + 2];
                                            byte b10 = bArr[i + 3];
                                            i += 4;
                                            int i8 = (((iHexDigit4 << 18) ^ (b8 << 12)) ^ (b9 << 6)) ^ (b10 ^ 3678080);
                                            if (true) {
                                                throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
                                            }
                                            int i9 = i6 + 1;
                                            cArr[i6] = (char) ((i8 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i8 & 1023) + 56320);
                                            i6 = i9;
                                            break;
                                            break;
                                    }
                                } else {
                                    cArr[i6] = (char) iHexDigit4;
                                    i++;
                                }
                                i6++;
                                b3 = 120;
                                b4 = 117;
                                b5 = 92;
                            }
                        } else {
                            z2 = true;
                            int i10 = this.offset;
                            if (z) {
                                i10--;
                            }
                            int i11 = i2 - this.offset;
                            if (z) {
                                i11 += 2;
                            }
                            if (z && b == 39) {
                                byte[] bArr3 = new byte[i11];
                                System.arraycopy(bArr, this.offset - 1, bArr3, 0, i11);
                                bArr3[0] = 34;
                                bArr3[i11 - 1] = 34;
                                valueConsumer.accept(bArr3, 0, i11);
                            } else {
                                valueConsumer.accept(bArr, i10, i11);
                            }
                        }
                        int i12 = i2 + 1;
                        byte b11 = bArr[i12];
                        while (b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
                            i12++;
                            b11 = bArr[i12];
                        }
                        boolean z3 = b11 == 44 ? true : false;
                        this.comma = z3;
                        if (z3) {
                            this.offset = i12 + 1;
                            next();
                            return;
                        } else {
                            this.offset = i12 + 1;
                            this.ch = (char) b11;
                            return;
                        }
                    }
                    i2++;
                }
            } else {
                this.valueEscape = true;
                int i13 = i2 + 1;
                byte b12 = bArr[i13];
                if (b12 == 117) {
                    i13 = i2 + 5;
                } else if (b12 == 120) {
                    i13 = i2 + 3;
                }
                i2 = i13 + 1;
            }
            i3++;
        }
    }

    public void readString0() {
        boolean z;
        String str;
        byte b = this.ch;
        int i = this.offset;
        int i2 = this.end;
        this.valueEscape = false;
        byte[] bArr = this.bytes;
        boolean z2 = true;
        int i3 = i;
        int i4 = 0;
        boolean z3 = true;
        while (true) {
            byte b2 = bArr[i3];
            int i5 = 120;
            int i6 = 117;
            int i7 = 6;
            if (b2 == 92) {
                this.valueEscape = true;
                byte b3 = bArr[i3 + 1];
                if (b3 != 117) {
                    i7 = b3 == 120 ? 4 : 2;
                }
                i3 += i7;
                z = true;
            } else {
                z = true;
                if (b2 < 0) {
                    switch ((b2 & -1) >> 4) {
                        case 12 /* 12 */:
                        case 13:
                            i3 += 2;
                            break;
                        case 14 /* 14 */:
                            i3 += 3;
                            break;
                        default:
                            if ((b2 >> 3) != -2) {
                                throw new JSONException(AbstractC1194.m2779(i3, "malformed input around byte "));
                            }
                            i3 += 4;
                            i4++;
                            break;
                            break;
                    }
                    z3 = false;
                } else {
                    if (b2 == b) {
                        if (this.valueEscape) {
                            char[] cArr = new char[i4];
                            int i8 = 0;
                            while (true) {
                                byte b4 = bArr[i];
                                if (b4 != 92) {
                                    if (b4 != 34) {
                                        if (b4 < 0) {
                                            switch ((b4 & -1) >> 4) {
                                                case 12 /* 12 */:
                                                case 13:
                                                    int i9 = i + 1;
                                                    i += 2;
                                                    cArr[i8] = (char) (((b4 & 31) << 6) | (bArr[i9] & 63));
                                                    break;
                                                case 14 /* 14 */:
                                                    int i10 = i + 2;
                                                    byte b5 = bArr[i + 1];
                                                    i += 3;
                                                    cArr[i8] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (bArr[i10] & 63));
                                                    break;
                                                default:
                                                    if ((b4 >> 3) != -2) {
                                                        throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
                                                    }
                                                    byte b6 = bArr[i + 1];
                                                    int i11 = i + 3;
                                                    byte b7 = bArr[i + 2];
                                                    i += 4;
                                                    byte b8 = bArr[i11];
                                                    int i12 = (((b4 << 18) ^ (b6 << 12)) ^ (b7 << 6)) ^ (b8 ^ 3678080);
                                                    if (true) {
                                                        throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
                                                    }
                                                    int i13 = i8 + 1;
                                                    cArr[i8] = (char) ((i12 >>> 10) + 55232);
                                                    cArr[i13] = (char) ((i12 & 1023) + 56320);
                                                    i8 = i13;
                                                    break;
                                                    break;
                                            }
                                        } else {
                                            cArr[i8] = (char) b4;
                                            i++;
                                        }
                                    } else {
                                        str = new String(cArr);
                                        i3 = i;
                                    }
                                } else {
                                    int i14 = i + 1;
                                    int iHexDigit4 = bArr[i14];
                                    if (iHexDigit4 != 34 && iHexDigit4 != 92) {
                                        if (iHexDigit4 == 117) {
                                            iHexDigit4 = IOUtils.hexDigit4(bArr, i + 2, i2);
                                            i14 = i + 5;
                                        } else if (iHexDigit4 != 120) {
                                            iHexDigit4 = char1(iHexDigit4);
                                        } else {
                                            byte b9 = bArr[i + 2];
                                            int i15 = i + 3;
                                            iHexDigit4 = JSONReader.char2(b9, bArr[i15]);
                                            i14 = i15;
                                        }
                                    }
                                    cArr[i8] = (char) iHexDigit4;
                                    i = i14 + 1;
                                }
                                i8++;
                                i5 = 120;
                                i6 = 117;
                            }
                        } else if (z3) {
                            int i16 = this.offset;
                            int i17 = i3 - i16;
                            str = JDKUtils.ANDROID ? getLatin1String(i16, i17) : new String(bArr, i16, i17, StandardCharsets.ISO_8859_1);
                        } else {
                            int i18 = this.offset;
                            str = new String(bArr, i18, i3 - i18, StandardCharsets.UTF_8);
                        }
                        int i19 = i3 + 1;
                        byte b10 = bArr[i19];
                        while (b10 <= 32 && ((1 << b10) & 4294981377L) != 0) {
                            i19++;
                            b10 = bArr[i19];
                        }
                        this.comma = b10 == 44 ? true : false;
                        this.offset = i19 + 1;
                        if (b10 == 44) {
                            next();
                        } else {
                            this.ch = (char) b10;
                        }
                        this.stringValue = str;
                        return;
                    }
                    i3++;
                }
            }
            i4++;
            z2 = true;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0076 -> B:34:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:37:0x0065
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.util.UUID readUUID() {
        /*
            r11 = this;
            char r0 = r11.ch
            int r1 = r11.end
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 0
            if (r0 != r2) goto Ld
            r11.readNull()
            return r3
        Ld:
            r2 = 34
            if (r0 == r2) goto L1d
            r2 = 39
            if (r0 != r2) goto L16
            goto L1d
        L16:
            java.lang.String r0 = "syntax error, can not read uuid"
            com.alibaba.fastjson2.JSONException r0 = r11.error(r0)
            throw r0
        L1d:
            byte[] r2 = r11.bytes
            int r4 = r11.offset
            int r5 = r4 + 36
            if (r5 >= r1) goto L4a
            r5 = r2[r5]
            if (r5 != r0) goto L4a
            int r5 = r4 + 8
            r5 = r2[r5]
            r6 = 45
            if (r5 != r6) goto L4a
            int r5 = r4 + 13
            r5 = r2[r5]
            if (r5 != r6) goto L4a
            int r5 = r4 + 18
            r5 = r2[r5]
            if (r5 != r6) goto L4a
            int r5 = r4 + 23
            r5 = r2[r5]
            if (r5 != r6) goto L4a
            java.util.UUID r0 = readUUID36(r2, r4)
            int r4 = r4 + 37
            goto L58
        L4a:
            int r5 = r4 + 32
            if (r5 >= r1) goto L96
            r5 = r2[r5]
            if (r5 != r0) goto L96
            java.util.UUID r0 = readUUID32(r2, r4)
            int r4 = r4 + 33
        L58:
            r3 = 26
            if (r4 != r1) goto L5f
            r5 = r4
        L5d:
            r4 = r3
            goto L63
        L5f:
            int r5 = r4 + 1
            r4 = r2[r4]
        L63:
            r6 = 32
            if (r4 > r6) goto L81
            r6 = 1
            long r6 = r6 << r4
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L81
            if (r5 != r1) goto L79
            goto L5d
        L79:
            int r4 = r5 + 1
            r5 = r2[r5]
            r10 = r5
            r5 = r4
            r4 = r10
            goto L63
        L81:
            r11.offset = r5
            r1 = 44
            if (r4 != r1) goto L89
            r1 = 1
            goto L8a
        L89:
            r1 = 0
        L8a:
            r11.comma = r1
            if (r1 == 0) goto L92
            r11.next()
            return r0
        L92:
            char r1 = (char) r4
            r11.ch = r1
            return r0
        L96:
            java.lang.String r0 = r11.readString()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La1
            return r3
        La1:
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readUUID():java.util.UUID");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006c -> B:26:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:29:0x0062
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
        /*
            r21 = this;
            r1 = r21
            byte[] r0 = r1.bytes
            char r2 = r1.ch
            r3 = 47
            if (r2 != r3) goto Lf
            r1.skipComment()
            char r2 = r1.ch
        Lf:
            r3 = 34
            if (r2 == r3) goto L1a
            r3 = 39
            if (r2 == r3) goto L1a
            r2 = -1
            return r2
        L1a:
            int r3 = r1.offset
            r1.nameBegin = r3
            int r4 = r1.end
            java.lang.invoke.MethodHandle r5 = com.alibaba.fastjson2.util.JDKUtils.INDEX_OF_CHAR_LATIN1
            if (r5 != 0) goto L29
            int r2 = com.alibaba.fastjson2.util.IOUtils.indexOfQuoteV(r0, r2, r3, r4)
            goto L2e
        L29:
            int r2 = (int) r5.invokeExact(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lba
        L2e:
            r5 = -1
            if (r2 == r5) goto Lb3
            int r6 = indexOfSlash(r1, r0, r3, r4)
            if (r6 == r5) goto L3f
            if (r6 <= r2) goto L3a
            goto L3f
        L3a:
            long r2 = r1.readValueHashCode0()
            return r2
        L3f:
            int r5 = r2 + 1
            int r6 = r2 - r3
            boolean r7 = com.alibaba.fastjson2.util.IOUtils.isASCII(r0, r3, r6)
            long r8 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0, r3, r6, r7)
            r1.nameEnd = r2
            if (r5 != r4) goto L53
            r2 = r5
        L50:
            r5 = 26
            goto L57
        L53:
            int r2 = r2 + 2
            r5 = r0[r5]
        L57:
            r10 = 0
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            r14 = 1
            r3 = 32
            if (r5 > r3) goto L76
            long r16 = r14 << r5
            long r16 = r16 & r12
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r16 == 0) goto L76
            if (r2 != r4) goto L6f
            goto L50
        L6f:
            int r3 = r2 + 1
            r2 = r0[r2]
            r5 = r2
            r2 = r3
            goto L57
        L76:
            r16 = r10
            r10 = 44
            r11 = 0
            if (r5 != r10) goto L7f
            r10 = 1
            goto L80
        L7f:
            r10 = r11
        L80:
            r1.comma = r10
            if (r10 == 0) goto La7
            if (r2 != r4) goto L8a
            r5 = r2
            r2 = 26
            goto L8e
        L8a:
            int r5 = r2 + 1
            r2 = r0[r2]
        L8e:
            r20 = r5
            r5 = r2
            r2 = r20
        L93:
            if (r5 > r3) goto La7
            long r18 = r14 << r5
            long r18 = r18 & r12
            int r10 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r10 == 0) goto La7
            if (r2 != r4) goto La2
            r5 = 26
            goto L93
        La2:
            int r5 = r2 + 1
            r2 = r0[r2]
            goto L8e
        La7:
            r1.offset = r2
            char r0 = (char) r5
            r1.ch = r0
            r1.nameAscii = r7
            r1.nameEscape = r11
            r1.nameLength = r6
            return r8
        Lb3:
            java.lang.String r0 = "invalid escape character EOI"
            com.alibaba.fastjson2.JSONException r0 = r1.error(r0)
            throw r0
        Lba:
            r0 = move-exception
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readValueHashCode():long");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    @Override // com.alibaba.fastjson2.JSONReader
    public final ZonedDateTime readZonedDateTimeX(int i) {
        ZonedDateTime zonedDateTime;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        int i4;
        if (!isString()) {
            throw new JSONException("date only support string input");
        }
        if (i < 19) {
            return null;
        }
        if (i == 30) {
            byte[] bArr4 = this.bytes;
            int i5 = this.offset;
            if (bArr4[i5 + 29] == 90) {
                zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime29(bArr4, i5), ZoneOffset.UTC);
            } else if (false) {
                bArr3 = this.bytes;
                i4 = this.offset;
                if (bArr3[i4 + 28] == 90) {
                    zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime28(bArr3, i4), ZoneOffset.UTC);
                } else if (i == 28) {
                    bArr2 = this.bytes;
                    i3 = this.offset;
                    if (bArr2[i3 + 27] == 90) {
                        zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime27(bArr2, i3), ZoneOffset.UTC);
                    } else if (i == 27) {
                        bArr = this.bytes;
                        i2 = this.offset;
                        if (bArr[i2 + 26] == 90) {
                            zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                        } else {
                            zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                        }
                    } else {
                        zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                    }
                } else if (i == 27) {
                    bArr = this.bytes;
                    i2 = this.offset;
                    if (bArr[i2 + 26] == 90) {
                        zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                    } else {
                        zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                    }
                } else {
                    zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                }
            } else if (false) {
                bArr2 = this.bytes;
                i3 = this.offset;
                if (bArr2[i3 + 27] == 90) {
                    zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime27(bArr2, i3), ZoneOffset.UTC);
                } else if (i == 27) {
                    bArr = this.bytes;
                    i2 = this.offset;
                    if (bArr[i2 + 26] == 90) {
                        zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                    } else {
                        zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                    }
                } else {
                    zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                }
            } else if (false) {
                bArr = this.bytes;
                i2 = this.offset;
                if (bArr[i2 + 26] == 90) {
                    zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                } else {
                    zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                }
            } else {
                zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, 30, this.context.zoneId);
            }
        } else if (i == 29) {
            bArr3 = this.bytes;
            i4 = this.offset;
            if (bArr3[i4 + 28] == 90) {
                zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime28(bArr3, i4), ZoneOffset.UTC);
            } else if (false) {
                bArr2 = this.bytes;
                i3 = this.offset;
                if (bArr2[i3 + 27] == 90) {
                    zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime27(bArr2, i3), ZoneOffset.UTC);
                } else if (i == 27) {
                    bArr = this.bytes;
                    i2 = this.offset;
                    if (bArr[i2 + 26] == 90) {
                        zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                    } else {
                        zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                    }
                } else {
                    zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                }
            } else if (false) {
                bArr = this.bytes;
                i2 = this.offset;
                if (bArr[i2 + 26] == 90) {
                    zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                } else {
                    zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                }
            } else {
                zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, 29, this.context.zoneId);
            }
        } else if (i == 28) {
            bArr2 = this.bytes;
            i3 = this.offset;
            if (bArr2[i3 + 27] == 90) {
                zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime27(bArr2, i3), ZoneOffset.UTC);
            } else if (false) {
                bArr = this.bytes;
                i2 = this.offset;
                if (bArr[i2 + 26] == 90) {
                    zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
                } else {
                    zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
                }
            } else {
                zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, 28, this.context.zoneId);
            }
        } else if (i == 27) {
            bArr = this.bytes;
            i2 = this.offset;
            if (bArr[i2 + 26] == 90) {
                zonedDateTime = ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr, i2), ZoneOffset.UTC);
            } else {
                zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, 27, this.context.zoneId);
            }
        } else {
            zonedDateTime = DateUtils.parseZonedDateTime(this.bytes, this.offset, i, this.context.zoneId);
        }
        if (zonedDateTime == null) {
            return null;
        }
        this.offset = i + 1 + this.offset;
        next();
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return zonedDateTime;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    @Override // com.alibaba.fastjson2.JSONReader
    public final void skipComment() {
        boolean z;
        boolean z2;
        byte b;
        int i = this.offset;
        int i2 = i + 1;
        if (i2 >= this.end) {
            throw new JSONException(info());
        }
        byte[] bArr = this.bytes;
        byte b2 = bArr[i];
        if (b2 == 42) {
            z = true;
        } else {
            if (b2 != 47) {
                throw new JSONException(info("parse comment error"));
            }
            z = false;
        }
        int i3 = i + 2;
        byte b3 = bArr[i2];
        while (true) {
            if (z) {
                if (b3 == 42 && i3 <= this.end && bArr[i3] == 47) {
                    i3++;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (b3 == 10) {
                z2 = true;
            } else {
                z2 = false;
            }
            b = 26;
            if (z2) {
                if (i3 >= this.end) {
                    break;
                }
                byte b4 = bArr[i3];
                while (true) {
                    if (b4 > 32 || ((1 << b4) & 4294981377L) == 0) {
                        b = b4;
                        break;
                    }
                    i3++;
                    if (i3 >= this.end) {
                        break;
                    } else {
                        b4 = bArr[i3];
                    }
                }
                i3++;
                break;
            }
            if (i3 >= this.end) {
                break;
            }
            b3 = bArr[i3];
            i3++;
        }
        this.ch = (char) b;
        this.offset = i3;
        if (b == 47) {
            skipComment();
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean skipName() {
        this.offset = skipName(this, this.bytes, this.offset, this.end);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[PHI: r14
      0x0023: PHI (r14v16 int) = (r14v2 int), (r14v17 int) binds: [B:18:0x002d, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0049 -> B:15:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x006a -> B:32:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:34:0x0061
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipName(com.alibaba.fastjson2.JSONReaderUTF8 r12, byte[] r13, int r14, int r15) {
        /*
            char r0 = r12.ch
            boolean r1 = r12.checkNameBegin(r0)
            if (r1 == 0) goto Lb
            int r12 = r12.offset
            return r12
        Lb:
            int r1 = com.alibaba.fastjson2.util.IOUtils.indexOfQuote(r13, r0, r14, r15)
            r2 = -1
            if (r1 == r2) goto L7e
            int r14 = indexOfSlash(r12, r13, r14, r15)
            r3 = 26
            if (r14 == r2) goto L2b
            if (r14 <= r1) goto L1d
            goto L2b
        L1d:
            int r14 = skipStringEscaped(r12, r13, r14, r0)
            if (r14 != r15) goto L26
        L23:
            r0 = r14
        L24:
            r14 = r3
            goto L35
        L26:
            int r0 = r14 + 1
            r14 = r13[r14]
            goto L35
        L2b:
            int r14 = r1 + 1
            if (r14 != r15) goto L30
            goto L23
        L30:
            int r1 = r1 + 2
            r14 = r13[r14]
            r0 = r1
        L35:
            r1 = 0
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            r6 = 1
            r8 = 32
            if (r14 > r8) goto L54
            long r9 = r6 << r14
            long r9 = r9 & r4
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 == 0) goto L54
            if (r0 != r15) goto L4c
            goto L24
        L4c:
            int r14 = r0 + 1
            r0 = r13[r0]
            r11 = r0
            r0 = r14
            r14 = r11
            goto L35
        L54:
            r9 = 58
            if (r14 != r9) goto L79
            if (r0 != r15) goto L5d
            r14 = r0
        L5b:
            r0 = r3
            goto L61
        L5d:
            int r14 = r0 + 1
            r0 = r13[r0]
        L61:
            if (r0 > r8) goto L75
            long r9 = r6 << r0
            long r9 = r9 & r4
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 == 0) goto L75
            if (r14 != r15) goto L6d
            goto L5b
        L6d:
            int r0 = r14 + 1
            r14 = r13[r14]
            r11 = r0
            r0 = r14
            r14 = r11
            goto L61
        L75:
            char r13 = (char) r0
            r12.ch = r13
            return r14
        L79:
            com.alibaba.fastjson2.JSONException r12 = com.alibaba.fastjson2.JSONReader.syntaxError(r14)
            throw r12
        L7e:
            java.lang.String r13 = "invalid escape character EOI"
            com.alibaba.fastjson2.JSONException r12 = r12.error(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipName(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String info(String str) {
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.offset || i2 >= this.end) {
                break;
            }
            if (this.bytes[i2] == 10) {
                i++;
                i3 = 0;
            }
            i2++;
            i3++;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append(", ");
        }
        sb.append("offset ");
        sb.append(this.offset);
        sb.append(", character ");
        sb.append(this.ch);
        sb.append(", line ");
        sb.append(i);
        sb.append(", column ");
        sb.append(i3);
        sb.append(", fastjson-version 2.0.61");
        sb.append(i <= 1 ? ' ' : '\n');
        sb.append(new String(this.bytes, this.start, Math.min(this.length, 65535)));
        return sb.toString();
    }

    public static int char2_utf8(int i, int i2, int i3, int i4) {
        if ((i2 & 192) == 128 && (i3 & 192) == 128) {
            return ((i & 15) << 12) | ((i2 & 63) << 6) | (i3 & 63);
        }
        throw new JSONException(AbstractC1194.m2779(i4, "malformed input around byte "));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x001e -> B:5:0x0005). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x000d
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static int next(com.alibaba.fastjson2.JSONReaderUTF8 r7, byte[] r8, int r9, int r10) {
        /*
            r0 = 26
            if (r9 != r10) goto L7
            r1 = r9
        L5:
            r9 = r0
            goto Lb
        L7:
            int r1 = r9 + 1
            r9 = r8[r9]
        Lb:
            r2 = 32
            if (r9 > r2) goto L29
            r2 = 1
            long r2 = r2 << r9
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L29
            if (r1 != r10) goto L21
            goto L5
        L21:
            int r9 = r1 + 1
            r1 = r8[r1]
            r6 = r1
            r1 = r9
            r9 = r6
            goto Lb
        L29:
            if (r9 >= 0) goto L31
            r7.char_utf8(r9, r1)
            int r7 = r7.offset
            return r7
        L31:
            char r8 = (char) r9
            r7.ch = r8
            r8 = 47
            if (r9 != r8) goto L40
            r7.offset = r1
            r7.skipComment()
            int r7 = r7.offset
            return r7
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.next(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x001f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static boolean nextIfSet(com.alibaba.fastjson2.JSONReaderUTF8 r7, byte[] r8, int r9, int r10) {
        /*
            int r0 = r9 + 1
            if (r0 >= r10) goto L42
            r1 = r8[r9]
            r2 = 101(0x65, float:1.42E-43)
            if (r1 != r2) goto L42
            r0 = r8[r0]
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L42
            int r0 = r9 + 2
            r1 = 26
            if (r0 != r10) goto L19
            r9 = r0
        L17:
            r0 = r1
            goto L1d
        L19:
            int r9 = r9 + 3
            r0 = r8[r0]
        L1d:
            r2 = 32
            if (r0 > r2) goto L3b
            r2 = 1
            long r2 = r2 << r0
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3b
            if (r9 != r10) goto L33
            goto L17
        L33:
            int r0 = r9 + 1
            r9 = r8[r9]
            r6 = r0
            r0 = r9
            r9 = r6
            goto L1d
        L3b:
            r7.offset = r9
            char r8 = (char) r0
            r7.ch = r8
            r7 = 1
            return r7
        L42:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfSet(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003b -> B:14:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x0028
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r8, char r9, char r10) {
        /*
            r7 = this;
            char r0 = r7.ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.bytes
            int r0 = r7.offset
            int r2 = r0 + 2
            int r3 = r7.end
            if (r2 > r3) goto L6d
            r4 = r8[r0]
            if (r4 != r9) goto L6d
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 == r10) goto L1b
            goto L6d
        L1b:
            r9 = 26
            if (r2 != r3) goto L21
        L1f:
            r10 = r9
            goto L26
        L21:
            int r0 = r0 + 3
            r10 = r8[r2]
            r2 = r0
        L26:
            r0 = 32
            if (r10 > r0) goto L45
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L45
            int r10 = r7.end
            if (r2 != r10) goto L3e
            goto L1f
        L3e:
            int r10 = r2 + 1
            r0 = r8[r2]
            r2 = r10
            r10 = r0
            goto L26
        L45:
            int r8 = r7.offset
            int r8 = r8 + 3
            if (r2 != r8) goto L66
            if (r10 == r9) goto L66
            r8 = 40
            if (r10 == r8) goto L66
            r8 = 91
            if (r10 == r8) goto L66
            r8 = 93
            if (r10 == r8) goto L66
            r8 = 41
            if (r10 == r8) goto L66
            r8 = 58
            if (r10 == r8) goto L66
            r8 = 44
            if (r10 == r8) goto L66
            return r1
        L66:
            r7.offset = r2
            char r8 = (char) r10
            r7.ch = r8
            r8 = 1
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void skipValue() {
        int iSkipString;
        int i = this.offset;
        int i2 = this.end;
        byte[] bArr = this.bytes;
        char c = this.ch;
        if (c == '\"' || c == '\'') {
            iSkipString = skipString(this, bArr, i, i2);
        } else if (c == 'S') {
            iSkipString = skipSet(this, bArr, i, i2);
        } else if (c == '[') {
            iSkipString = skipArray(this, bArr, i, i2);
        } else if (c == 'f') {
            iSkipString = skipFalse(this, bArr, i, i2);
        } else if (c == 'n') {
            iSkipString = skipNull(this, bArr, i, i2);
        } else if (c == 't') {
            iSkipString = skipTrue(this, bArr, i, i2);
        } else if (c != '{') {
            iSkipString = skipNumber(this, bArr, i, i2, false);
        } else {
            iSkipString = skipObject(this, bArr, i, i2);
        }
        this.offset = iSkipString;
    }

    public static void char2_utf8(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if ((i2 >> 3) == -2) {
            int i4 = bArr[i + 1];
            int i5 = bArr[i + 2];
            int i6 = bArr[i + 3];
            int i7 = (((i2 << 18) ^ (i4 << 12)) ^ (i5 << 6)) ^ (3678080 ^ i6);
            if ((i4 & 192) == 128 && (i5 & 192) == 128 && (i6 & 192) == 128 && i7 >= 65536 && i7 < 1114112) {
                cArr[i3] = (char) ((i7 >>> 10) + 55232);
                cArr[i3 + 1] = (char) ((i7 & 1023) + 56320);
                return;
            }
            throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
        }
        throw new JSONException(AbstractC1194.m2779(i, "malformed input around byte "));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0041 -> B:16:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x002e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r8, char r9, char r10, char r11) {
        /*
            r7 = this;
            char r0 = r7.ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.bytes
            int r0 = r7.offset
            int r2 = r0 + 3
            int r3 = r7.end
            if (r2 > r3) goto L73
            r4 = r8[r0]
            if (r4 != r9) goto L73
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 != r10) goto L73
            int r9 = r0 + 2
            r9 = r8[r9]
            if (r9 == r11) goto L21
            goto L73
        L21:
            r9 = 26
            if (r2 != r3) goto L27
        L25:
            r10 = r9
            goto L2c
        L27:
            int r0 = r0 + 4
            r10 = r8[r2]
            r2 = r0
        L2c:
            r11 = 32
            if (r10 > r11) goto L4b
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L4b
            int r10 = r7.end
            if (r2 != r10) goto L44
            goto L25
        L44:
            int r10 = r2 + 1
            r11 = r8[r2]
            r2 = r10
            r10 = r11
            goto L2c
        L4b:
            int r8 = r7.offset
            int r8 = r8 + 4
            if (r2 != r8) goto L6c
            if (r10 == r9) goto L6c
            r8 = 40
            if (r10 == r8) goto L6c
            r8 = 91
            if (r10 == r8) goto L6c
            r8 = 93
            if (r10 == r8) goto L6c
            r8 = 41
            if (r10 == r8) goto L6c
            r8 = 58
            if (r10 == r8) goto L6c
            r8 = 44
            if (r10 == r8) goto L6c
            return r1
        L6c:
            r7.offset = r2
            char r8 = (char) r10
            r7.ch = r8
            r8 = 1
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char):boolean");
    }

    public JSONReaderUTF8(JSONReader.Context context, ByteBuffer byteBuffer) {
        super(context, false, true);
        this.nextEscapeIndex = -2;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int iRemaining = byteBuffer.remaining();
        andSet = (andSet == null || andSet.length < iRemaining) ? new byte[iRemaining] : andSet;
        byteBuffer.get(andSet, 0, iRemaining);
        this.bytes = andSet;
        this.offset = 0;
        this.length = iRemaining;
        this.in = null;
        this.start = 0;
        this.end = iRemaining;
        next();
        if (this.ch == '/') {
            skipComment();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0047 -> B:18:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:21:0x0034
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10) {
        /*
            r5 = this;
            char r0 = r5.ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r2 = r0 + 4
            int r3 = r5.end
            if (r2 > r3) goto L79
            r4 = r6[r0]
            if (r4 != r7) goto L79
            int r7 = r0 + 1
            r7 = r6[r7]
            if (r7 != r8) goto L79
            int r7 = r0 + 2
            r7 = r6[r7]
            if (r7 != r9) goto L79
            int r7 = r0 + 3
            r7 = r6[r7]
            if (r7 == r10) goto L27
            goto L79
        L27:
            r7 = 26
            if (r2 != r3) goto L2d
        L2b:
            r8 = r7
            goto L32
        L2d:
            int r0 = r0 + 5
            r8 = r6[r2]
            r2 = r0
        L32:
            r9 = 32
            if (r8 > r9) goto L51
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r3
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L51
            int r8 = r5.end
            if (r2 != r8) goto L4a
            goto L2b
        L4a:
            int r8 = r2 + 1
            r9 = r6[r2]
            r2 = r8
            r8 = r9
            goto L32
        L51:
            int r6 = r5.offset
            int r6 = r6 + 5
            if (r2 != r6) goto L72
            if (r8 == r7) goto L72
            r6 = 40
            if (r8 == r6) goto L72
            r6 = 91
            if (r8 == r6) goto L72
            r6 = 93
            if (r8 == r6) goto L72
            r6 = 41
            if (r8 == r6) goto L72
            r6 = 58
            if (r8 == r6) goto L72
            r6 = 44
            if (r8 == r6) goto L72
            return r1
        L72:
            r5.offset = r2
            char r6 = (char) r8
            r5.ch = r6
            r6 = 1
            return r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x009a -> B:40:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00be -> B:53:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x00b4
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode(int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCode(int, int, int):long");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004d -> B:20:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:23:0x003a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10, char r11) {
        /*
            r5 = this;
            char r0 = r5.ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r2 = r0 + 5
            int r3 = r5.end
            if (r2 > r3) goto L7f
            r4 = r6[r0]
            if (r4 != r7) goto L7f
            int r7 = r0 + 1
            r7 = r6[r7]
            if (r7 != r8) goto L7f
            int r7 = r0 + 2
            r7 = r6[r7]
            if (r7 != r9) goto L7f
            int r7 = r0 + 3
            r7 = r6[r7]
            if (r7 != r10) goto L7f
            int r7 = r0 + 4
            r7 = r6[r7]
            if (r7 == r11) goto L2d
            goto L7f
        L2d:
            r7 = 26
            if (r2 != r3) goto L33
        L31:
            r8 = r7
            goto L38
        L33:
            int r0 = r0 + 6
            r8 = r6[r2]
            r2 = r0
        L38:
            r9 = 32
            if (r8 > r9) goto L57
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r3
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L57
            int r8 = r5.end
            if (r2 != r8) goto L50
            goto L31
        L50:
            int r8 = r2 + 1
            r9 = r6[r2]
            r2 = r8
            r8 = r9
            goto L38
        L57:
            int r6 = r5.offset
            int r6 = r6 + 6
            if (r2 != r6) goto L78
            if (r8 == r7) goto L78
            r6 = 40
            if (r8 == r6) goto L78
            r6 = 91
            if (r8 == r6) goto L78
            r6 = 93
            if (r8 == r6) goto L78
            r6 = 41
            if (r8 == r6) goto L78
            r6 = 58
            if (r8 == r6) goto L78
            r6 = 44
            if (r8 == r6) goto L78
            return r1
        L78:
            r5.offset = r2
            char r6 = (char) r8
            r5.ch = r6
            r6 = 1
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char, char, char):boolean");
    }

    public JSONReaderUTF8(JSONReader.Context context, byte[] bArr, int i, int i2) {
        super(context, false, true);
        this.nextEscapeIndex = -2;
        this.bytes = bArr;
        this.offset = i;
        this.length = i2;
        this.in = null;
        this.start = i;
        this.end = i + i2;
        this.cacheItem = null;
        next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01e3 -> B:106:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0207 -> B:122:0x01f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:125:0x01fe
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readString() {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readString():java.lang.String");
    }
}
