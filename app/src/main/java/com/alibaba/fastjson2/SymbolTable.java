package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.Fnv;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SymbolTable {
    private final long hashCode64;
    private final long[] hashCodes;
    private final long[] hashCodesOrigin;
    private final short[] mapping;
    private final String[] names;

    public SymbolTable(Class<?>... clsArr) {
        this(classNames(clsArr));
    }

    private static String[] classNames(Class<?>... clsArr) {
        String[] strArr = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            strArr[i] = clsArr[i].getName();
        }
        return strArr;
    }

    public long getHashCode(int i) {
        return this.hashCodesOrigin[i - 1];
    }

    public String getName(int i) {
        return this.names[i - 1];
    }

    public String getNameByHashCode(long j) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.names[this.mapping[iBinarySearch]];
    }

    public int getOrdinal(String str) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, Fnv.hashCode64(str));
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch] + 1;
    }

    public int getOrdinalByHashCode(long j) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j);
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch] + 1;
    }

    public long hashCode64() {
        return this.hashCode64;
    }

    public int size() {
        return this.names.length;
    }

    public SymbolTable(String... strArr) {
        String[] strArr2;
        TreeSet treeSet = new TreeSet(Arrays.asList(strArr));
        this.names = new String[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (true) {
            strArr2 = this.names;
            if (i >= strArr2.length) {
                break;
            }
            if (it.hasNext()) {
                this.names[i] = (String) it.next();
            }
            i++;
        }
        int length = strArr2.length;
        long[] jArr = new long[length];
        int i2 = 0;
        while (true) {
            String[] strArr3 = this.names;
            if (i2 >= strArr3.length) {
                break;
            }
            jArr[i2] = Fnv.hashCode64(strArr3[i2]);
            i2++;
        }
        this.hashCodesOrigin = jArr;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i3 = 0; i3 < length; i3++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i3])] = (short) i3;
        }
        long j = -3750763034362895579L;
        for (int i4 = 0; i4 < length; i4++) {
            j = (j ^ jArr[i4]) * 1099511628211L;
        }
        this.hashCode64 = j;
    }
}
