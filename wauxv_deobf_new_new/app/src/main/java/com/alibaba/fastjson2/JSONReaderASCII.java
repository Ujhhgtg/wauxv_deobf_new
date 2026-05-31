package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BiFunction;
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderASCII extends JSONReaderUTF8 {
    final String str;

    public JSONReaderASCII(JSONReader.Context context, String str, byte[] bArr, int i, int i2) {
        super(context, bArr, i, i2);
        this.str = str;
        this.nameAscii = true;
    }

    public static JSONReaderASCII of(JSONReader.Context context, String str, byte[] bArr, int i, int i2) {
        return new JSONReaderASCII(context, str, bArr, i, i2);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x010d -> B:58:0x00f3). Please report as a decompilation issue!!! */
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
    private final long readValueHashCode0() {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readValueHashCode0():long");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6 A[FALL_THROUGH] */
    /* JADX WARN: Switch 'out' block B:42:0x0090 for B:32:0x0062 already processed. Defaulting to fallback option. */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final String getFieldName() {
        int iHexDigit4;
        byte[] bArr = this.bytes;
        int i = ((JSONReaderUTF8) this).nameBegin;
        int i2 = this.nameEnd;
        int i3 = i2 - i;
        if (!this.nameEscape) {
            String str = this.str;
            if (str != null) {
                return str.substring(i, i2);
            }
            return JDKUtils.ANDROID ? getLatin1String(i, i3) : new String(bArr, i, i3, StandardCharsets.ISO_8859_1);
        }
        byte b = 34;
        if (JDKUtils.STRING_CREATOR_JDK11 != null) {
            byte[] bArr2 = new byte[this.nameLength];
            int i4 = this.end;
            int i5 = 0;
            while (i < this.nameEnd) {
                byte bChar1 = bArr[i];
                if (bChar1 == 92) {
                    int i6 = i + 1;
                    byte b2 = bArr[i6];
                    if (b2 == b || b2 == 58 || b2 == 64 || b2 == 92) {
                        i = i6;
                        bChar1 = b2;
                    } else if (b2 == 117) {
                        iHexDigit4 = IOUtils.hexDigit4(bArr, i + 2, i4);
                        i += 5;
                        if (iHexDigit4 > 255) {
                            bArr2 = null;
                            if (bArr2 != null) {
                                return JDKUtils.STRING_CREATOR_JDK11.apply(bArr2, JDKUtils.LATIN1);
                            }
                        }
                        bChar1 = (byte) iHexDigit4;
                    } else if (b2 == 120) {
                        byte b3 = bArr[i + 2];
                        i += 3;
                        iHexDigit4 = JSONReader.char2(b3, bArr[i]);
                        if (iHexDigit4 > 255) {
                            bArr2 = null;
                            if (bArr2 != null) {
                                return JDKUtils.STRING_CREATOR_JDK11.apply(bArr2, JDKUtils.LATIN1);
                            }
                        }
                        bChar1 = (byte) iHexDigit4;
                    } else if (b2 != 42 && b2 != 43) {
                        switch (b2) {
                            default:
                                switch (b2) {
                                    case 60:
                                    case 61:
                                    case 62:
                                        break;
                                    default:
                                        bChar1 = (byte) char1(b2);
                                        i = i6;
                                        continue;
                                }
                            case 45:
                            case Opcodes.IALOAD /* 46 */:
                            case 47:
                                i = i6;
                                bChar1 = b2;
                                break;
                        }
                    } else {
                        i = i6;
                        bChar1 = b2;
                    }
                    bArr2[i5] = bChar1;
                    i++;
                    i5++;
                    b = 34;
                } else if (bChar1 != b) {
                    bArr2[i5] = bChar1;
                    i++;
                    i5++;
                    b = 34;
                } else if (bArr2 != null) {
                    return JDKUtils.STRING_CREATOR_JDK11.apply(bArr2, JDKUtils.LATIN1);
                }
            }
            if (bArr2 != null) {
                return JDKUtils.STRING_CREATOR_JDK11.apply(bArr2, JDKUtils.LATIN1);
            }
        }
        int i7 = ((JSONReaderUTF8) this).nameBegin;
        char[] cArr = new char[this.nameLength];
        int i8 = 0;
        while (i7 < this.nameEnd) {
            char cHexDigit4 = (char) (bArr[i7] & 255);
            if (cHexDigit4 == '\\') {
                int i9 = i7 + 1;
                char c = (char) bArr[i9];
                if (c == '*' || c == '+' || c == '@') {
                    i7 = i9;
                    cHexDigit4 = c;
                } else if (c == 'u') {
                    cHexDigit4 = (char) IOUtils.hexDigit4(bArr, i7 + 2, this.end);
                    i7 += 5;
                } else if (c != 'x') {
                    switch (c) {
                        default:
                            switch (c) {
                                case '<':
                                case '=':
                                case '>':
                                    break;
                                default:
                                    cHexDigit4 = char1(c);
                                    i7 = i9;
                                    break;
                            }
                        case '-':
                        case Opcodes.IALOAD /* 46 */:
                        case '/':
                            i7 = i9;
                            cHexDigit4 = c;
                            break;
                    }
                } else {
                    byte b4 = bArr[i7 + 2];
                    i7 += 3;
                    cHexDigit4 = JSONReader.char2(b4, bArr[i7]);
                }
            } else if (cHexDigit4 == '\"') {
                return new String(cArr);
            }
            cArr[i8] = cHexDigit4;
            i7++;
            i8++;
        }
        return new String(cArr);
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final long getNameHashCodeLCase() {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = ((JSONReaderUTF8) this).nameBegin;
        int i4 = this.end;
        char c = '\"';
        int i5 = (i3 <= 0 || bArr[i3 + (-1)] != '\'') ? '\"' : '\'';
        int i6 = 0;
        long j = 0;
        while (i3 < i4) {
            int iHexDigit4 = bArr[i3];
            if (iHexDigit4 != 92) {
                if (iHexDigit4 != i5) {
                    break;
                }
                break;
            }
            int i7 = i3 + 1;
            int i8 = bArr[i7];
            if (i8 == 117) {
                iHexDigit4 = IOUtils.hexDigit4(bArr, i3 + 2, i4);
                i3 += 5;
            } else if (i8 != 120) {
                iHexDigit4 = char1(i8);
                i3 = i7;
            } else {
                int i9 = bArr[i3 + 2];
                i3 += 3;
                iHexDigit4 = JSONReader.char2(i9, bArr[i3]);
            }
            if (iHexDigit4 > 255 || iHexDigit4 < 0 || i6 >= 8 || (i6 == 0 && iHexDigit4 == 0)) {
                i3 = ((JSONReaderUTF8) this).nameBegin;
                j = 0;
                break;
            }
            if ((iHexDigit4 != 95 && iHexDigit4 != 45 && iHexDigit4 != 32) || (i2 = bArr[i3 + 1]) == 34 || i2 == 39 || i2 == iHexDigit4) {
                if (iHexDigit4 >= 65 && iHexDigit4 <= 90) {
                    iHexDigit4 = (char) (iHexDigit4 + 32);
                }
                j |= ((long) iHexDigit4) << (i6 << 3);
                i6++;
            }
            i3++;
        }
        if (j != 0) {
            return j;
        }
        long j2 = Fnv.MAGIC_HASH_CODE;
        while (i3 < i4) {
            int iHexDigit5 = bArr[i3];
            if (iHexDigit5 != 92) {
                if (iHexDigit5 == i5) {
                    break;
                }
            } else {
                int i10 = i3 + 1;
                int i11 = bArr[i10];
                if (i11 == 117) {
                    iHexDigit5 = IOUtils.hexDigit4(bArr, i3 + 2, i4);
                    i3 += 5;
                } else if (i11 != 120) {
                    iHexDigit5 = char1(i11);
                    i3 = i10;
                } else {
                    int i12 = bArr[i3 + 2];
                    i3 += 3;
                    iHexDigit5 = JSONReader.char2(i12, bArr[i3]);
                }
            }
            i3++;
            if ((iHexDigit5 == 95 || iHexDigit5 == 45 || iHexDigit5 == 32) && (i = bArr[i3]) != c) {
                if (i == 39 || i == iHexDigit5) {
                }
                c = '\"';
            }
            if (iHexDigit5 >= 65 && iHexDigit5 <= 90) {
                iHexDigit5 = (char) (iHexDigit5 + 32);
            }
            if (iHexDigit5 < 0) {
                iHexDigit5 = (iHexDigit5 == true ? 1 : 0) & 255;
            }
            j2 = Fnv.MAGIC_PRIME * (j2 ^ ((long) iHexDigit5));
            i5 = i5;
            c = '\"';
        }
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d A[LOOP:0: B:7:0x0011->B:21:0x003d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x000b A[EDGE_INSN: B:22:0x000b->B:5:0x000b BREAK  A[LOOP:0: B:7:0x0011->B:21:0x003d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0013 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003a -> B:5:0x000b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:8:0x0013
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final void next() {
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
            if (r1 == 0) goto L38
            if (r1 <= 0) goto L29
            r4 = 32
            if (r1 > r4) goto L29
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L29
            goto L38
        L29:
            r9.offset = r2
            r0 = r1 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r9.ch = r0
            r0 = 47
            if (r1 != r0) goto L37
            r9.skipComment()
        L37:
            return
        L38:
            int r1 = r9.end
            if (r2 != r1) goto L3d
            goto Lb
        L3d:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.next():void");
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final boolean nextIfNullOrEmptyString() {
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
            if (r5 >= r2) goto Laa
            boolean r8 = com.alibaba.fastjson2.util.IOUtils.isNULL(r4, r3)
            if (r8 == 0) goto Laa
            r5 = r4[r5]
            if (r5 != r1) goto Laa
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
            r0.offset = r5
            r1 = r3 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.ch = r1
            return r7
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.nextIfNullOrEmptyString():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[LOOP:0: B:11:0x0019->B:25:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0013 A[EDGE_INSN: B:26:0x0013->B:9:0x0013 BREAK  A[LOOP:0: B:11:0x0019->B:25:0x0044], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0041 -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:0x0013
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final boolean nextIfObjectStart() {
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
            if (r1 == 0) goto L3f
            r4 = 32
            if (r1 > r4) goto L2f
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2f
            goto L3f
        L2f:
            r0 = r1 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r9.ch = r0
            r9.offset = r2
            r0 = 47
            if (r1 != r0) goto L3d
            r9.skipComment()
        L3d:
            r0 = 1
            return r0
        L3f:
            int r1 = r9.end
            if (r2 != r1) goto L44
            goto L13
        L44:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.nextIfObjectStart():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0067 -> B:20:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:23:0x005e
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
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final java.lang.String readEscaped(byte[] r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            r3 = r23
            r4 = r19
            r5 = r22
        Lc:
            if (r4 >= r2) goto Laf
            r6 = r1[r4]
            r7 = 92
            r8 = 2
            if (r6 != r7) goto L28
            int r5 = r5 + 1
            int r6 = r4 + 1
            r6 = r1[r6]
            r7 = 117(0x75, float:1.64E-43)
            if (r6 != r7) goto L21
            r8 = 6
            goto L26
        L21:
            r7 = 120(0x78, float:1.68E-43)
            if (r6 != r7) goto L26
            r8 = 4
        L26:
            int r4 = r4 + r8
            goto Lc
        L28:
            if (r6 != r3) goto La7
            char[] r4 = new char[r5]
            r6 = r20
            int r3 = r0.readEscaped(r1, r6, r3, r4)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            com.alibaba.fastjson2.JSONReader$Context r4 = r0.context
            long r6 = r4.features
            r9 = 134234112(0x8004000, double:6.6320463E-316)
            long r9 = r9 & r6
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L49
            java.lang.String r5 = com.alibaba.fastjson2.JSONReader.stringValue(r5, r6)
        L49:
            int r4 = r3 + 1
            r6 = 26
            if (r4 != r2) goto L52
            r3 = r4
        L50:
            r4 = r6
            goto L55
        L52:
            int r3 = r3 + r8
            r4 = r1[r4]
        L55:
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r13 = 32
            if (r4 > r13) goto L74
            long r14 = r9 << r4
            long r14 = r14 & r7
            int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r14 == 0) goto L74
            if (r3 != r2) goto L6a
            goto L50
        L6a:
            int r4 = r3 + 1
            r3 = r1[r3]
            r16 = r4
            r4 = r3
            r3 = r16
            goto L55
        L74:
            r14 = 44
            if (r4 != r14) goto L7a
            r14 = 1
            goto L7b
        L7a:
            r14 = 0
        L7b:
            r0.comma = r14
            if (r14 == 0) goto L9f
            if (r3 != r2) goto L84
            r4 = r3
            r3 = r6
            goto L88
        L84:
            int r4 = r3 + 1
            r3 = r1[r3]
        L88:
            r16 = r4
            r4 = r3
            r3 = r16
        L8d:
            if (r4 > r13) goto L9f
            long r14 = r9 << r4
            long r14 = r14 & r7
            int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r14 == 0) goto L9f
            if (r3 != r2) goto L9a
            r4 = r6
            goto L8d
        L9a:
            int r4 = r3 + 1
            r3 = r1[r3]
            goto L88
        L9f:
            r1 = r4 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.ch = r1
            r0.offset = r3
            return r5
        La7:
            r6 = r20
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto Lc
        Laf:
            java.lang.String r1 = "invalid escape character EOI"
            com.alibaba.fastjson2.JSONException r1 = r0.error(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readEscaped(byte[], int, int, int, int, int):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0590  */
    /* JADX WARN: Code duplicated, block: B:102:0x0596  */
    /* JADX WARN: Code duplicated, block: B:106:0x059f  */
    /* JADX WARN: Code duplicated, block: B:108:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x05b1 A[LOOP:4: B:109:0x05af->B:110:0x05b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:119:0x05df  */
    /* JADX WARN: Code duplicated, block: B:86:0x054e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0552  */
    /* JADX WARN: Code duplicated, block: B:90:0x0561  */
    /* JADX WARN: Code duplicated, block: B:92:0x0566 A[LOOP:3: B:91:0x0564->B:92:0x0566, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0576  */
    /* JADX WARN: Code duplicated, block: B:97:0x0580  */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final String readFieldName() {
        char c;
        long j;
        int i;
        byte b;
        long j2;
        long j3;
        byte b2;
        long j4;
        long j5;
        long j6;
        long j7;
        byte b3;
        int length;
        JSONFactory.NameCacheEntry nameCacheEntry;
        char[] cArr;
        int i2;
        BiFunction<char[], Boolean, String> biFunction;
        String str;
        int length2;
        JSONFactory.NameCacheEntry2 nameCacheEntry2;
        char[] cArr2;
        int i3;
        BiFunction<char[], Boolean, String> biFunction2;
        String str2;
        byte b4 = this.ch;
        if (b4 == 39 && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if (b4 != 34 && b4 != 39) {
            if ((this.context.features & JSONReader.Feature.AllowUnQuotedFieldNames.mask) == 0 || !JSONReader.isFirstIdentifier(b4)) {
                return null;
            }
            return readFieldNameUnquote();
        }
        byte[] bArr = this.bytes;
        this.nameEscape = false;
        int i4 = this.offset;
        ((JSONReaderUTF8) this).nameBegin = i4;
        int i5 = 0;
        int i6 = i4;
        while (true) {
            int i7 = this.end;
            c = ' ';
            if (i6 >= i7) {
                break;
            }
            byte b5 = bArr[i6];
            if (b5 == 92) {
                this.nameEscape = true;
                byte b6 = bArr[i6 + 1];
                i6 += b6 == 117 ? 6 : b6 == 120 ? 4 : 2;
            } else {
                if (b5 == b4) {
                    this.nameLength = i5;
                    this.nameEnd = i6;
                    int i8 = i6 + 1;
                    byte b7 = i8 < i7 ? bArr[i8] : (byte) 26;
                    while (b7 <= 32 && ((1 << b7) & 4294981377L) != 0) {
                        i8++;
                        b7 = bArr[i8];
                    }
                    if (b7 != 58) {
                        throw JSONReader.syntaxError(i8, this.ch);
                    }
                    i6 = i8 + 1;
                    if (i6 >= this.end) {
                        this.ch = (char) 26;
                        throw JSONReader.syntaxError(i6, 26);
                    }
                    byte b8 = bArr[i6];
                    while (b8 <= 32 && ((1 << b8) & 4294981377L) != 0) {
                        i6++;
                        b8 = bArr[i6];
                    }
                    this.offset = i6 + 1;
                    this.ch = (char) b8;
                    break;
                }
                i6++;
            }
            i5++;
        }
        int i9 = this.nameEnd;
        if (i9 < i4) {
            throw new JSONException(AbstractC1095.m2794(i6, "syntax error : "));
        }
        if (!this.nameEscape) {
            int i10 = i9 - i4;
            switch (i10) {
                case 1:
                    return TypeUtils.toString(bArr[i4]);
                case 2:
                    return TypeUtils.toString(bArr[i4], bArr[i4 + 1]);
                case 3:
                    j = -1;
                    i = (bArr[i4 + 2] << 16) + ((bArr[i4 + 1] & 255) << 8);
                    b = bArr[i4];
                    j2 = i + (b & 255);
                    j4 = j2;
                    j5 = j;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j8 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j8 ^ (j8 >>> c))) & (nameCacheEntry2Arr.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                for (i3 = 0; i3 < i10; i3++) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str3 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str3, j4, j5);
                                return str3;
                            }
                            if (nameCacheEntry2.value0 == j4 && nameCacheEntry2.value1 == j5) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr.length - 1);
                            nameCacheEntry = nameCacheEntryArr[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                for (i2 = 0; i2 < i10; i2++) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 4:
                    j = -1;
                    i = (bArr[i4 + 3] << 24) + ((bArr[i4 + 2] & 255) << 16) + ((bArr[i4 + 1] & 255) << 8);
                    b = bArr[i4];
                    j2 = i + (b & 255);
                    j4 = j2;
                    j5 = j;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j9 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr2 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j9 ^ (j9 >>> c))) & (nameCacheEntry2Arr2.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr2[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str4 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str4, j4, j5);
                                return str4;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr2 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr2.length - 1);
                            nameCacheEntry = nameCacheEntryArr2[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 5:
                    c = ' ';
                    j = -1;
                    j3 = (((long) bArr[i4 + 4]) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8);
                    b2 = bArr[i4];
                    j2 = j3 + (((long) b2) & 255);
                    j4 = j2;
                    j5 = j;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j10 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr3 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j10 ^ (j10 >>> c))) & (nameCacheEntry2Arr3.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr3[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str5 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str5, j4, j5);
                                return str5;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr3 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr3.length - 1);
                            nameCacheEntry = nameCacheEntryArr3[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 6:
                    c = ' ';
                    j = -1;
                    j3 = (((long) bArr[i4 + 5]) << 40) + ((((long) bArr[i4 + 4]) & 255) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8);
                    b2 = bArr[i4];
                    j2 = j3 + (((long) b2) & 255);
                    j4 = j2;
                    j5 = j;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j11 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr4 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j11 ^ (j11 >>> c))) & (nameCacheEntry2Arr4.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr4[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str6 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str6, j4, j5);
                                return str6;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr4 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr4.length - 1);
                            nameCacheEntry = nameCacheEntryArr4[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 7:
                    c = ' ';
                    j = -1;
                    j3 = (((long) bArr[i4 + 6]) << 48) + ((((long) bArr[i4 + 5]) & 255) << 40) + ((((long) bArr[i4 + 4]) & 255) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8);
                    b2 = bArr[i4];
                    j2 = j3 + (((long) b2) & 255);
                    j4 = j2;
                    j5 = j;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j12 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr5 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j12 ^ (j12 >>> c))) & (nameCacheEntry2Arr5.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr5[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str7 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str7, j4, j5);
                                return str7;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr5 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr5.length - 1);
                            nameCacheEntry = nameCacheEntryArr5[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 8:
                    c = ' ';
                    j = -1;
                    j3 = (((long) bArr[i4 + 7]) << 56) + ((((long) bArr[i4 + 6]) & 255) << 48) + ((((long) bArr[i4 + 5]) & 255) << 40) + ((((long) bArr[i4 + 4]) & 255) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8);
                    b2 = bArr[i4];
                    j2 = j3 + (((long) b2) & 255);
                    j4 = j2;
                    j5 = j;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j13 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr6 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j13 ^ (j13 >>> c))) & (nameCacheEntry2Arr6.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr6[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str8 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str8, j4, j5);
                                return str8;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr6 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr6.length - 1);
                            nameCacheEntry = nameCacheEntryArr6[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 9:
                    c = ' ';
                    j = -1;
                    j6 = bArr[i4];
                    j7 = (((long) bArr[i4 + 8]) << 56) + ((((long) bArr[i4 + 7]) & 255) << 48) + ((((long) bArr[i4 + 6]) & 255) << 40) + ((((long) bArr[i4 + 5]) & 255) << 32) + ((((long) bArr[i4 + 4]) & 255) << 24) + ((((long) bArr[i4 + 3]) & 255) << 16) + ((((long) bArr[i4 + 2]) & 255) << 8);
                    b3 = bArr[i4 + 1];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j14 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr7 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j14 ^ (j14 >>> c))) & (nameCacheEntry2Arr7.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr7[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str9 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str9, j4, j5);
                                return str9;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr7 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr7.length - 1);
                            nameCacheEntry = nameCacheEntryArr7[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 10:
                    c = ' ';
                    j = -1;
                    j6 = (bArr[i4 + 1] << 8) + bArr[i4];
                    j7 = (((long) bArr[i4 + 9]) << 56) + ((((long) bArr[i4 + 8]) & 255) << 48) + ((((long) bArr[i4 + 7]) & 255) << 40) + ((((long) bArr[i4 + 6]) & 255) << 32) + ((((long) bArr[i4 + 5]) & 255) << 24) + ((((long) bArr[i4 + 4]) & 255) << 16) + ((((long) bArr[i4 + 3]) & 255) << 8);
                    b3 = bArr[i4 + 2];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j15 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr8 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j15 ^ (j15 >>> c))) & (nameCacheEntry2Arr8.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr8[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str10 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str10, j4, j5);
                                return str10;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr8 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr8.length - 1);
                            nameCacheEntry = nameCacheEntryArr8[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 11:
                    c = ' ';
                    j = -1;
                    j6 = (bArr[i4 + 2] << 16) + (bArr[i4 + 1] << 8) + bArr[i4];
                    j7 = (((long) bArr[i4 + 10]) << 56) + ((((long) bArr[i4 + 9]) & 255) << 48) + ((((long) bArr[i4 + 8]) & 255) << 40) + ((((long) bArr[i4 + 7]) & 255) << 32) + ((((long) bArr[i4 + 6]) & 255) << 24) + ((((long) bArr[i4 + 5]) & 255) << 16) + ((((long) bArr[i4 + 4]) & 255) << 8);
                    b3 = bArr[i4 + 3];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j16 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr9 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j16 ^ (j16 >>> c))) & (nameCacheEntry2Arr9.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr9[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str11 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str11, j4, j5);
                                return str11;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr9 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr9.length - 1);
                            nameCacheEntry = nameCacheEntryArr9[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c = ' ';
                    j = -1;
                    j6 = (bArr[i4 + 3] << 24) + (bArr[i4 + 2] << 16) + (bArr[i4 + 1] << 8) + bArr[i4];
                    j7 = (((long) bArr[i4 + 11]) << 56) + ((((long) bArr[i4 + 10]) & 255) << 48) + ((((long) bArr[i4 + 9]) & 255) << 40) + ((((long) bArr[i4 + 8]) & 255) << 32) + ((((long) bArr[i4 + 7]) & 255) << 24) + ((((long) bArr[i4 + 6]) & 255) << 16) + ((((long) bArr[i4 + 5]) & 255) << 8);
                    b3 = bArr[i4 + 4];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j17 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr10 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j17 ^ (j17 >>> c))) & (nameCacheEntry2Arr10.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr10[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str12 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str12, j4, j5);
                                return str12;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr10 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr10.length - 1);
                            nameCacheEntry = nameCacheEntryArr10[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 13:
                    c = ' ';
                    j = -1;
                    j6 = (((long) bArr[i4 + 4]) << 32) + (((long) bArr[i4 + 3]) << 24) + (((long) bArr[i4 + 2]) << 16) + (((long) bArr[i4 + 1]) << 8) + ((long) bArr[i4]);
                    j7 = (((long) bArr[i4 + 12]) << 56) + ((((long) bArr[i4 + 11]) & 255) << 48) + ((((long) bArr[i4 + 10]) & 255) << 40) + ((((long) bArr[i4 + 9]) & 255) << 32) + ((((long) bArr[i4 + 8]) & 255) << 24) + ((((long) bArr[i4 + 7]) & 255) << 16) + ((((long) bArr[i4 + 6]) & 255) << 8);
                    b3 = bArr[i4 + 5];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j18 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr11 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j18 ^ (j18 >>> c))) & (nameCacheEntry2Arr11.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr11[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str13 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str13, j4, j5);
                                return str13;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr11 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr11.length - 1);
                            nameCacheEntry = nameCacheEntryArr11[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c = ' ';
                    j = -1;
                    j6 = (((long) bArr[i4 + 5]) << 40) + ((((long) bArr[i4 + 4]) & 255) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8) + (((long) bArr[i4]) & 255);
                    j7 = (((long) bArr[i4 + 13]) << 56) + ((((long) bArr[i4 + 12]) & 255) << 48) + ((((long) bArr[i4 + 11]) & 255) << 40) + ((((long) bArr[i4 + 10]) & 255) << 32) + ((((long) bArr[i4 + 9]) & 255) << 24) + ((((long) bArr[i4 + 8]) & 255) << 16) + ((((long) bArr[i4 + 7]) & 255) << 8);
                    b3 = bArr[i4 + 6];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j19 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr12 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j19 ^ (j19 >>> c))) & (nameCacheEntry2Arr12.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr12[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str14 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str14, j4, j5);
                                return str14;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr12 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr12.length - 1);
                            nameCacheEntry = nameCacheEntryArr12[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 15:
                    c = ' ';
                    j = -1;
                    j6 = (((long) bArr[i4 + 6]) << 48) + ((((long) bArr[i4 + 5]) & 255) << 40) + ((((long) bArr[i4 + 4]) & 255) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8) + (((long) bArr[i4]) & 255);
                    j7 = (((long) bArr[i4 + 14]) << 56) + ((((long) bArr[i4 + 13]) & 255) << 48) + ((((long) bArr[i4 + 12]) & 255) << 40) + ((((long) bArr[i4 + 11]) & 255) << 32) + ((((long) bArr[i4 + 10]) & 255) << 24) + ((((long) bArr[i4 + 9]) & 255) << 16) + ((((long) bArr[i4 + 8]) & 255) << 8);
                    b3 = bArr[i4 + 7];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j110 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr13 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j110 ^ (j110 >>> c))) & (nameCacheEntry2Arr13.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr13[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str15 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str15, j4, j5);
                                return str15;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr13 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr13.length - 1);
                            nameCacheEntry = nameCacheEntryArr13[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                case 16:
                    j = -1;
                    j6 = (((long) bArr[i4 + 7]) << 56) + ((((long) bArr[i4 + 6]) & 255) << 48) + ((((long) bArr[i4 + 5]) & 255) << 40) + ((((long) bArr[i4 + 4]) & 255) << 32) + ((((long) bArr[i4 + 3]) & 255) << 24) + ((((long) bArr[i4 + 2]) & 255) << 16) + ((((long) bArr[i4 + 1]) & 255) << 8) + (((long) bArr[i4]) & 255);
                    c = ' ';
                    j7 = (((long) bArr[i4 + 15]) << 56) + ((((long) bArr[i4 + 14]) & 255) << 48) + ((((long) bArr[i4 + 13]) & 255) << 40) + ((((long) bArr[i4 + 12]) & 255) << 32) + ((((long) bArr[i4 + 11]) & 255) << 24) + ((((long) bArr[i4 + 10]) & 255) << 16) + ((((long) bArr[i4 + 9]) & 255) << 8);
                    b3 = bArr[i4 + 8];
                    j4 = j6;
                    j5 = j7 + (((long) b3) & 255);
                    if (j4 != j) {
                        if (j5 != j) {
                            long j111 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr14 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j111 ^ (j111 >>> c))) & (nameCacheEntry2Arr14.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr14[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str16 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str16, j4, j5);
                                return str16;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr14 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr14.length - 1);
                            nameCacheEntry = nameCacheEntryArr14[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
                default:
                    c = ' ';
                    j4 = -1;
                    j5 = -1;
                    j = -1;
                    if (j4 != j) {
                        if (j5 != j) {
                            long j112 = j4 ^ j5;
                            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr15 = JSONFactory.NAME_CACHE2;
                            length2 = ((int) (j112 ^ (j112 >>> c))) & (nameCacheEntry2Arr15.length - 1);
                            nameCacheEntry2 = nameCacheEntry2Arr15[length2];
                            if (nameCacheEntry2 == null) {
                                cArr2 = new char[i10];
                                while (i3 < i10) {
                                    cArr2[i3] = (char) (bArr[i4 + i3] & 255);
                                }
                                biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction2 != null) {
                                    str2 = biFunction2.apply(cArr2, Boolean.TRUE);
                                } else {
                                    str2 = new String(cArr2);
                                }
                                String str17 = str2;
                                JSONFactory.NAME_CACHE2[length2] = new JSONFactory.NameCacheEntry2(str17, j4, j5);
                                return str17;
                            }
                            if (nameCacheEntry2.value0 == j4) {
                                return nameCacheEntry2.name;
                            }
                        } else {
                            JSONFactory.NameCacheEntry[] nameCacheEntryArr15 = JSONFactory.NAME_CACHE;
                            length = ((int) ((j4 >>> c) ^ j4)) & (nameCacheEntryArr15.length - 1);
                            nameCacheEntry = nameCacheEntryArr15[length];
                            if (nameCacheEntry == null) {
                                cArr = new char[i10];
                                while (i2 < i10) {
                                    cArr[i2] = (char) (bArr[i4 + i2] & 255);
                                }
                                biFunction = JDKUtils.STRING_CREATOR_JDK8;
                                if (biFunction != null) {
                                    str = biFunction.apply(cArr, Boolean.TRUE);
                                } else {
                                    str = new String(cArr);
                                }
                                JSONFactory.NAME_CACHE[length] = new JSONFactory.NameCacheEntry(str, j4);
                                return str;
                            }
                            if (nameCacheEntry.value == j4) {
                                return nameCacheEntry.name;
                            }
                        }
                    }
                    break;
            }
        }
        return getFieldName();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0082 -> B:32:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00a6 -> B:45:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:47:0x009c
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readFieldNameHashCode():long");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0095 -> B:40:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00ba -> B:53:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x00b0
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeE(int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readFieldNameHashCodeE(int, int, int):long");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:191:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0100  */
    /* JADX WARN: Code duplicated, block: B:98:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0164  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:147:0x0203
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final long readFieldNameHashCodeUnquote() {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readFieldNameHashCodeUnquote():long");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x009f -> B:41:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:44:0x0096
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final java.lang.String readString() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readString():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8
    public final void readString0() {
        String strApply;
        int i;
        byte[] bArr = this.bytes;
        byte b = this.ch;
        int i2 = this.offset;
        this.valueEscape = false;
        int i3 = i2;
        int i4 = 0;
        while (true) {
            byte b2 = bArr[i3];
            if (b2 == 92) {
                this.valueEscape = true;
                byte b3 = bArr[i3 + 1];
                if (b3 == 117) {
                    i = 6;
                } else {
                    i = b3 == 120 ? 4 : 2;
                }
                i3 += i;
            } else if (b2 == b) {
                break;
            } else {
                i3++;
            }
            i4++;
        }
        if (this.valueEscape) {
            char[] cArr = new char[i4];
            int i5 = 0;
            while (true) {
                char cHexDigit4 = (char) (bArr[i2] & 255);
                if (cHexDigit4 == '\\') {
                    int i6 = i2 + 1;
                    char c = (char) bArr[i6];
                    if (c == '\"' || c == '\\') {
                        i2 = i6;
                        cHexDigit4 = c;
                    } else if (c == 'u') {
                        cHexDigit4 = (char) IOUtils.hexDigit4(bArr, i2 + 2, this.end);
                        i2 += 5;
                    } else if (c != 'x') {
                        cHexDigit4 = char1(c);
                        i2 = i6;
                    } else {
                        byte b4 = bArr[i2 + 2];
                        i2 += 3;
                        cHexDigit4 = JSONReader.char2(b4, bArr[i2]);
                    }
                } else if (cHexDigit4 == '\"') {
                    break;
                }
                cArr[i5] = cHexDigit4;
                i2++;
                i5++;
            }
            strApply = new String(cArr);
            i3 = i2;
        } else {
            BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
            strApply = biFunction != null ? biFunction.apply(Arrays.copyOfRange(bArr, i2, i3), JDKUtils.LATIN1) : new String(bArr, i2, i3 - i2, StandardCharsets.ISO_8859_1);
        }
        int i7 = i3 + 1;
        byte b5 = bArr[i7];
        while (b5 > 0 && b5 <= 32 && ((1 << b5) & 4294981377L) != 0) {
            i7++;
            b5 = bArr[i7];
        }
        this.offset = i7 + 1;
        boolean z = b5 == 44;
        this.comma = z;
        if (z) {
            next();
        } else {
            this.ch = (char) b5;
        }
        this.stringValue = strApply;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0069 -> B:26:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:29:0x005f
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final long readValueHashCode() {
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
            int r2 = (int) r5.invokeExact(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lb7
        L2e:
            r5 = -1
            if (r2 == r5) goto Lb0
            int r6 = com.alibaba.fastjson2.JSONReaderUTF8.indexOfSlash(r1, r0, r3, r4)
            if (r6 == r5) goto L3f
            if (r6 <= r2) goto L3a
            goto L3f
        L3a:
            long r2 = r1.readValueHashCode0()
            return r2
        L3f:
            int r5 = r2 + 1
            int r6 = r2 - r3
            r7 = 1
            long r8 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0, r3, r6, r7)
            r1.nameEnd = r2
            if (r5 != r4) goto L50
            r2 = r5
        L4d:
            r5 = 26
            goto L54
        L50:
            int r2 = r2 + 2
            r5 = r0[r5]
        L54:
            r10 = 0
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            r14 = 1
            r3 = 32
            if (r5 > r3) goto L73
            long r16 = r14 << r5
            long r16 = r16 & r12
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r16 == 0) goto L73
            if (r2 != r4) goto L6c
            goto L4d
        L6c:
            int r3 = r2 + 1
            r2 = r0[r2]
            r5 = r2
            r2 = r3
            goto L54
        L73:
            r16 = r10
            r10 = 44
            r11 = 0
            if (r5 != r10) goto L7c
            r10 = r7
            goto L7d
        L7c:
            r10 = r11
        L7d:
            r1.comma = r10
            if (r10 == 0) goto La4
            if (r2 != r4) goto L87
            r5 = r2
            r2 = 26
            goto L8b
        L87:
            int r5 = r2 + 1
            r2 = r0[r2]
        L8b:
            r20 = r5
            r5 = r2
            r2 = r20
        L90:
            if (r5 > r3) goto La4
            long r18 = r14 << r5
            long r18 = r18 & r12
            int r10 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r10 == 0) goto La4
            if (r2 != r4) goto L9f
            r5 = 26
            goto L90
        L9f:
            int r5 = r2 + 1
            r2 = r0[r2]
            goto L8b
        La4:
            r1.offset = r2
            char r0 = (char) r5
            r1.ch = r0
            r1.nameAscii = r7
            r1.nameEscape = r11
            r1.nameLength = r6
            return r8
        Lb0:
            java.lang.String r0 = "invalid escape character EOI"
            com.alibaba.fastjson2.JSONException r0 = r1.error(r0)
            throw r0
        Lb7:
            r0 = move-exception
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readValueHashCode():long");
    }

    public static JSONReaderASCII of(JSONReader.Context context, InputStream inputStream) {
        return new JSONReaderASCII(context, inputStream);
    }

    public JSONReaderASCII(JSONReader.Context context, InputStream inputStream) {
        super(context, inputStream);
        this.nameAscii = true;
        this.str = null;
    }

    public final int readEscaped(byte[] bArr, int i, int i2, char[] cArr) {
        char cChar1;
        int i3 = 0;
        while (true) {
            char cChar2 = (char) (bArr[i] & 255);
            if (cChar2 == '\\') {
                int i4 = i + 1;
                char c = (char) bArr[i4];
                if (c == '\"' || c == '\\') {
                    i = i4;
                    cChar2 = c;
                } else {
                    if (c == 'b') {
                        cChar1 = '\b';
                    } else if (c == 'f') {
                        cChar1 = '\f';
                    } else if (c == 'n') {
                        cChar1 = '\n';
                    } else if (c == 'r') {
                        cChar1 = '\r';
                    } else if (c == 'x') {
                        byte b = bArr[i + 2];
                        i += 3;
                        cChar2 = JSONReader.char2(b, bArr[i]);
                    } else if (c == 't') {
                        cChar1 = '\t';
                    } else if (c != 'u') {
                        cChar1 = char1(c);
                    } else {
                        cChar2 = (char) IOUtils.hexDigit4(bArr, i + 2, this.end);
                        i += 5;
                    }
                    cChar2 = cChar1;
                    i = i4;
                }
            } else if (cChar2 == i2) {
                return i;
            }
            cArr[i3] = cChar2;
            i++;
            i3++;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0095 -> B:40:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00ba -> B:53:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x00b0
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode(int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readFieldNameHashCode(int, int, int):long");
    }
}
