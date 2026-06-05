package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import p000.AbstractC2856feyxiexzfUjhhgtg;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C0789feyxiexzfUjhhgtg;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.InterfaceC1227feyxiexzfUjhhgtg;
import p000.InterfaceC2595feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<C2633Ujhhgtgfeyxiexzf, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    /* JADX INFO: compiled from: obf */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final InterfaceC2595feyxiexzfUjhhgtg source;

        public Reader(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, int i) {
            this(interfaceC1227feyxiexzfUjhhgtg, i, 0, 4, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            Arrays.fill(headerArr, 0, headerArr.length, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.dynamicTable[length].hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final C2633Ujhhgtgfeyxiexzf getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    return headerArr[iDynamicTableIndex].name;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                i2 -= this.dynamicTable[dynamicTableIndex(i)].hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i) + iEvictToRecoverBytes + i] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[iDynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listM4253feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(this.headerList);
            this.headerList.clear();
            return listM4253feyxiexzfUjhhgtg;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final C2633Ujhhgtgfeyxiexzf readByteString() {
            int i = readByte();
            boolean z = (i & 128) == 128;
            long j = readInt(i, 127);
            if (!z) {
                return this.source.mo2106Ujhhgtgfeyxiexzf(j);
            }
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
            Huffman.INSTANCE.decode(this.source, j, c2598feyxiexzfUjhhgtg);
            return c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.mo2109Ujhhgtgfeyxiexzf()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, Hpack.PREFIX_6_BITS) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = readByte();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public Reader(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, int i, int i2) {
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = new C0789feyxiexzfUjhhgtg(interfaceC1227feyxiexzfUjhhgtg);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Reader(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, int i, int i2, int i3, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this(interfaceC1227feyxiexzfUjhhgtg, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C2598feyxiexzfUjhhgtg out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) {
            this(i, false, c2598feyxiexzfUjhhgtg, 2, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            Arrays.fill(headerArr, 0, headerArr.length, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.dynamicTable[length].hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws EOFException {
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(c2633Ujhhgtgfeyxiexzf) < c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf()) {
                    C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
                    huffman.encode(c2633Ujhhgtgfeyxiexzf, c2598feyxiexzfUjhhgtg);
                    C2633Ujhhgtgfeyxiexzf c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
                    writeInt(c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), 127, 128);
                    C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.out;
                    c2598feyxiexzfUjhhgtg2.getClass();
                    c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2598feyxiexzfUjhhgtg2);
                    return;
                }
            }
            writeInt(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), 127, 0);
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg3 = this.out;
            c2598feyxiexzfUjhhgtg3.getClass();
            c2633Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2598feyxiexzfUjhhgtg3);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0072  */
        public final void writeHeaders(List<Header> list) throws EOFException {
            int length;
            int length2;
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, Hpack.PREFIX_5_BITS, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, Hpack.PREFIX_5_BITS, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = list.get(i2);
                C2633Ujhhgtgfeyxiexzf c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf = header.name.mo2584Ujhhgtgfeyxiexzf();
                C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, c2633Ujhhgtgfeyxiexzf)) {
                        length = length2;
                    } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(hpack.getSTATIC_HEADER_TABLE()[length2].value, c2633Ujhhgtgfeyxiexzf)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i3 = this.nextHeaderIndex + 1; i3 < length3; i3++) {
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.dynamicTable[i3].name, c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf)) {
                            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.dynamicTable[i3].value, c2633Ujhhgtgfeyxiexzf)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i3 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.m3869feyxiexzfUjhhgtg(64);
                    writeByteString(c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf);
                    writeByteString(c2633Ujhhgtgfeyxiexzf);
                    insertIntoDynamicTable(header);
                } else {
                    C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = Header.PSEUDO_PREFIX;
                    c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf.getClass();
                    if (!c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf.mo2582Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf2, c2633Ujhhgtgfeyxiexzf2.mo2578Ujhhgtgfeyxiexzf()) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(Header.TARGET_AUTHORITY, c2633UjhhgtgfeyxiexzfMo2584Ujhhgtgfeyxiexzf)) {
                        writeInt(length, Hpack.PREFIX_6_BITS, 64);
                        writeByteString(c2633Ujhhgtgfeyxiexzf);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(c2633Ujhhgtgfeyxiexzf);
                    }
                }
            }
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.m3869feyxiexzfUjhhgtg(i | i3);
                return;
            }
            this.out.m3869feyxiexzfUjhhgtg(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.m3869feyxiexzfUjhhgtg(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.m3869feyxiexzfUjhhgtg(i4);
        }

        public Writer(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) {
            this(0, false, c2598feyxiexzfUjhhgtg, 3, null);
        }

        public Writer(int i, boolean z, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) {
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = c2598feyxiexzfUjhhgtg;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, int i2, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this((i2 & 1) != 0 ? Hpack.SETTINGS_HEADER_TABLE_SIZE : i, (i2 & 2) != 0 ? true : z, c2598feyxiexzfUjhhgtg);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = Header.TARGET_METHOD;
        Header header2 = new Header(c2633Ujhhgtgfeyxiexzf, "GET");
        Header header3 = new Header(c2633Ujhhgtgfeyxiexzf, "POST");
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = Header.TARGET_PATH;
        Header header4 = new Header(c2633Ujhhgtgfeyxiexzf2, "/");
        Header header5 = new Header(c2633Ujhhgtgfeyxiexzf2, "/index.html");
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf3 = Header.TARGET_SCHEME;
        Header header6 = new Header(c2633Ujhhgtgfeyxiexzf3, "http");
        Header header7 = new Header(c2633Ujhhgtgfeyxiexzf3, "https");
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(c2633Ujhhgtgfeyxiexzf4, "200"), new Header(c2633Ujhhgtgfeyxiexzf4, "204"), new Header(c2633Ujhhgtgfeyxiexzf4, "206"), new Header(c2633Ujhhgtgfeyxiexzf4, "304"), new Header(c2633Ujhhgtgfeyxiexzf4, "400"), new Header(c2633Ujhhgtgfeyxiexzf4, "404"), new Header(c2633Ujhhgtgfeyxiexzf4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<C2633Ujhhgtgfeyxiexzf, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public final C2633Ujhhgtgfeyxiexzf checkLowercase(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws IOException {
        int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iMo2578Ujhhgtgfeyxiexzf; i++) {
            byte bMo2581Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i);
            if (65 <= bMo2581Ujhhgtgfeyxiexzf && bMo2581Ujhhgtgfeyxiexzf < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c2633Ujhhgtgfeyxiexzf.m3968Ujhhgtgfeyxiexzf()));
            }
        }
        return c2633Ujhhgtgfeyxiexzf;
    }

    public final Map<C2633Ujhhgtgfeyxiexzf, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
