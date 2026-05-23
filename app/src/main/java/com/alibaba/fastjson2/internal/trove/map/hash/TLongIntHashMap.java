package com.alibaba.fastjson2.internal.trove.map.hash;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.ccg.c;
import java.util.Arrays;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class TLongIntHashMap {
    static final int largestPrime;
    static final int[] primeCapacities;
    private boolean consumeFreeSlot;
    private int free;
    private int maxSize;
    private long[] set;
    private int size;
    private int[] values;

    static {
        int[] iArr = {5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 433, 877, 1759, 3527, 7057, 14143, 28289, 56591, 113189, 226379, 452759, 905551, 1811107, 3622219, 7244441, 14488931, 28977863, 57955739, 115911563, 231823147, 463646329, 927292699, 1854585413, 953, 1907, 3821, 7643, 15287, 30577, 61169, 122347, 244703, 489407, 978821, 1957651, 3915341, 7830701, 15661423, 31322867, 62645741, 125291483, 250582987, 501165979, 1002331963, 2004663929, 1039, 2081, 4177, 8363, 16729, 33461, 66923, 133853, 267713, 535481, 1070981, 2141977, 4283963, 8567929, 17135863, 34271747, 68543509, 137087021, 274174111, 548348231, 1096696463, 31, 67, 137, 277, 557, 1117, 2237, 4481, 8963, 17929, 35863, 71741, 143483, 286973, 573953, 1147921, 2295859, 4591721, 9183457, 18366923, 36733847, 73467739, 146935499, 293871013, 587742049, 1175484103, 599, 1201, 2411, 4831, 9677, 19373, 38747, 77509, 155027, 310081, 620171, 1240361, 2480729, 4961459, 9922933, 19845871, 39691759, 79383533, 158767069, 317534141, 635068283, 1270136683, 311, 631, 1277, 2557, 5119, 10243, 20507, 41017, 82037, 164089, 328213, 656429, 1312867, 2625761, 5251529, 10503061, 21006137, 42012281, 84024581, 168049163, 336098327, 672196673, 1344393353, 3, 7, 17, 37, 79, 163, 331, 673, 1361, 2729, 5471, 10949, 21911, 43853, 87719, 175447, 350899, 701819, 1403641, 2807303, 5614657, 11229331, 22458671, 44917381, 89834777, 179669557, 359339171, 718678369, 1437356741, 43, 89, 179, 359, 719, 1439, 2879, 5779, 11579, 23159, 46327, 92657, 185323, 370661, 741337, 1482707, 2965421, 5930887, 11861791, 23723597, 47447201, 94894427, 189788857, 379577741, 759155483, 1518310967, 379, 761, 1523, 3049, 6101, 12203, 24407, 48817, 97649, 195311, 390647, 781301, 1562611, 3125257, 6250537, 12501169, 25002389, 50004791, 100009607, 200019221, 400038451, 800076929, 1600153859};
        primeCapacities = iArr;
        Arrays.sort(iArr);
        largestPrime = iArr[243];
    }

    public TLongIntHashMap() {
        this.maxSize = 18;
        this.free = 37;
        this.set = new long[37];
        this.values = new int[37];
    }

    private int insertKey(long j) {
        int i;
        int i2 = ((int) ((j >>> 32) ^ j)) & 2147483647;
        long[] jArr = this.set;
        int length = i2 % jArr.length;
        long j2 = jArr[length];
        boolean z = j2 != 0;
        this.consumeFreeSlot = false;
        if (!z) {
            this.consumeFreeSlot = true;
            jArr[length] = j;
            return length;
        }
        if (j2 != j) {
            int length2 = jArr.length;
            int i3 = (i2 % (length2 - 2)) + 1;
            int i4 = length;
            do {
                i4 -= i3;
                if (i4 < 0) {
                    i4 += length2;
                }
                long[] jArr2 = this.set;
                long j3 = jArr2[i4];
                if (j3 == 0) {
                    this.consumeFreeSlot = true;
                    jArr2[i4] = j;
                    return i4;
                }
                if (j3 == j) {
                    i = -i4;
                }
            } while (i4 != length);
            throw new IllegalStateException("No free or removed slots available. Key set full?!!");
        }
        i = -length;
        return i - 1;
    }

    public static int nextPrime(int i) {
        int i2 = largestPrime;
        if (i >= i2) {
            return i2;
        }
        int[] iArr = primeCapacities;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        return iArr[iBinarySearch];
    }

    private void rehash(int i) {
        if (this.size > this.maxSize) {
            i = nextPrime(i << 1);
        }
        long[] jArr = this.set;
        int length = jArr.length;
        int[] iArr = this.values;
        this.set = new long[i];
        this.values = new int[i];
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            long j = jArr[i2];
            if (j != 0) {
                this.values[insertKey(j)] = iArr[i2];
            }
            length = i2;
        }
    }

    public boolean forEachEntry(BiFunction<Long, Integer, Boolean> biFunction) {
        long[] jArr = this.set;
        int[] iArr = this.values;
        int length = jArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (this.set[i] != 0 && !biFunction.apply(Long.valueOf(jArr[i]), Integer.valueOf(iArr[i])).booleanValue()) {
                return false;
            }
            length = i;
        }
    }

    public int get(long j) {
        long[] jArr = this.set;
        int i = ((int) ((j >>> 32) ^ j)) & 2147483647;
        int length = i % jArr.length;
        long j2 = jArr[length];
        if (j2 == 0) {
            return -1;
        }
        if (j2 == j) {
            return this.values[length];
        }
        int length2 = jArr.length;
        int i2 = (i % (length2 - 2)) + 1;
        int i3 = length;
        do {
            i3 -= i2;
            if (i3 < 0) {
                i3 += length2;
            }
            long j3 = this.set[i3];
            if (j3 == 0) {
                return -1;
            }
            if (j == j3) {
                return this.values[i3];
            }
        } while (i3 != length);
        return -1;
    }

    public void put(long j, int i) {
        int i2;
        int i3 = ((int) ((j >>> 32) ^ j)) & 2147483647;
        long[] jArr = this.set;
        int length = i3 % jArr.length;
        long j2 = jArr[length];
        boolean z = false;
        this.consumeFreeSlot = false;
        if (j2 == 0) {
            this.consumeFreeSlot = true;
            jArr[length] = j;
        } else {
            if (j2 == j) {
                i2 = -length;
            } else {
                int length2 = jArr.length;
                int i4 = (i3 % (length2 - 2)) + 1;
                int i5 = length;
                while (true) {
                    i5 -= i4;
                    if (i5 < 0) {
                        i5 += length2;
                    }
                    long[] jArr2 = this.set;
                    long j3 = jArr2[i5];
                    if (j3 == 0) {
                        this.consumeFreeSlot = true;
                        jArr2[i5] = j;
                    } else if (j3 == j) {
                        i2 = -i5;
                    } else if (i5 == length) {
                    }
                    length = i5;
                }
            }
            length = i2 - 1;
        }
        if (length < 0) {
            length = (-length) - 1;
        } else {
            z = true;
        }
        this.values[length] = i;
        if (!z) {
            return;
        }
        if (true) {
            this.free--;
        }
        int i6 = this.size + 1;
        this.size = i6;
        int i7 = this.maxSize;
        if (i6 <= i7 && this.free != 0) {
            return;
        }
        int length3 = this.set.length;
        if (i6 > i7) {
            length3 = nextPrime(length3 << 1);
        }
        long[] jArr3 = this.set;
        int length4 = jArr3.length;
        int[] iArr = this.values;
        this.set = new long[length3];
        this.values = new int[length3];
        while (true) {
            int i8 = length4 - 1;
            if (length4 <= 0) {
                int length5 = this.set.length;
                this.maxSize = Math.min(length5 - 1, (int) (length5 * 0.5f));
                this.free = length5 - this.size;
                return;
            } else {
                long j4 = jArr3[i8];
                if (j4 != 0) {
                    this.values[insertKey(j4)] = iArr[i8];
                }
                length4 = i8;
            }
        }
    }

    public int putIfAbsent(long j, int i) {
        int i2;
        int i3 = ((int) ((j >>> 32) ^ j)) & 2147483647;
        long[] jArr = this.set;
        int length = i3 % jArr.length;
        long j2 = jArr[length];
        this.consumeFreeSlot = false;
        if (j2 == 0) {
            this.consumeFreeSlot = true;
            jArr[length] = j;
        } else {
            if (j2 == j) {
                i2 = -length;
            } else {
                int length2 = length;
                while (true) {
                    long[] jArr2 = this.set;
                    length2 -= (i3 % (jArr2.length - 2)) + 1;
                    if (length2 < 0) {
                        length2 += jArr2.length;
                    }
                    long j3 = jArr2[length2];
                    if (j3 == 0) {
                        this.consumeFreeSlot = true;
                        jArr2[length2] = j;
                    } else if (j3 == j) {
                        i2 = -length2;
                    } else if (length2 == length) {
                    }
                    length = length2;
                }
            }
            length = i2 - 1;
        }
        if (length < 0) {
            return this.values[(-length) - 1];
        }
        this.values[length] = i;
        if (true) {
            this.free--;
        }
        int i4 = this.size + 1;
        this.size = i4;
        if (i4 <= this.maxSize && this.free != 0) {
            return i;
        }
        rehash(this.set.length);
        int length3 = this.set.length;
        this.maxSize = Math.min(length3 - 1, (int) (length3 * 0.5f));
        this.free = length3 - this.size;
        return i;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        forEachEntry(new BiFunction<Long, Integer, Boolean>(this) { // from class: com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap.1
            private boolean first = true;
            final /* synthetic */ TLongIntHashMap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.function.BiFunction
            public Boolean apply(Long l, Integer num) {
                if (this.first) {
                    this.first = false;
                } else {
                    sb.append(", ");
                }
                sb.append(l);
                sb.append("=");
                sb.append(num);
                return Boolean.TRUE;
            }
        });
        sb.append("}");
        return sb.toString();
    }

    public TLongIntHashMap(long j, int i) {
        this.maxSize = 18;
        long[] jArr = new long[37];
        this.set = jArr;
        int[] iArr = new int[37];
        this.values = iArr;
        this.consumeFreeSlot = true;
        int length = (((int) ((j >>> 32) ^ j)) & 2147483647) % 37;
        jArr[length] = j;
        iArr[length] = i;
        this.free = 36;
        this.size = 1;
    }
}
