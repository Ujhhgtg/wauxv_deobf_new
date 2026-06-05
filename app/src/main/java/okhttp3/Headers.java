package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.AbstractC1152feyxiexzfUjhhgtg;
import p000.AbstractC1192feyxiexzfUjhhgtg;
import p000.AbstractC2862feyxiexzfUjhhgtg;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C1381feyxiexzfUjhhgtg;
import p000.C2930Ujhhgtgfeyxiexzf;
import p000.C3312feyxiexzfUjhhgtg;
import p000.InterfaceC0140Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Headers implements Iterable<C1381feyxiexzfUjhhgtg>, InterfaceC0140Ujhhgtgfeyxiexzf {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* JADX INFO: compiled from: obf */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            int iM2628feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2628feyxiexzfUjhhgtg(':', 0, 6, str);
            if (iM2628feyxiexzfUjhhgtg == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(str).toString());
            }
            add(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(str.substring(0, iM2628feyxiexzfUjhhgtg)).toString(), str.substring(iM2628feyxiexzfUjhhgtg + 1));
            return this;
        }

        public final Builder addAll(Headers headers) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            int iM2628feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2628feyxiexzfUjhhgtg(':', 1, 4, str);
            if (iM2628feyxiexzfUjhhgtg != -1) {
                addLenient$okhttp(str.substring(0, iM2628feyxiexzfUjhhgtg), str.substring(iM2628feyxiexzfUjhhgtg + 1));
                return this;
            }
            if (str.charAt(0) == ':') {
                addLenient$okhttp("", str.substring(1));
                return this;
            }
            addLenient$okhttp("", str);
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String str) {
            int size = this.namesAndValues.size() - 2;
            int iM1882Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1882Ujhhgtgfeyxiexzf(size, 0, -2);
            if (iM1882Ujhhgtgfeyxiexzf > size) {
                return null;
            }
            while (!str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iM1882Ujhhgtgfeyxiexzf) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            this.namesAndValues.add(str);
            this.namesAndValues.add(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iM1882Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1882Ujhhgtgfeyxiexzf(length, 0, -2);
            if (iM1882Ujhhgtgfeyxiexzf > length) {
                return null;
            }
            while (!AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(str, strArr[length])) {
                if (length == iM1882Ujhhgtgfeyxiexzf) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m961deprecated_of(String... strArr) {
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i2] = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(str).toString();
            }
            int iM1882Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1882Ujhhgtgfeyxiexzf(0, strArr2.length - 1, 2);
            if (iM1882Ujhhgtgfeyxiexzf >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i == iM1882Ujhhgtgfeyxiexzf) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr2, null);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m960deprecated_of(Map<String, String> map) {
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(key).toString();
                String string2 = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m959deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<C1381feyxiexzfUjhhgtg> iterator() {
        int size = size();
        C1381feyxiexzfUjhhgtg[] c1381feyxiexzfUjhhgtgArr = new C1381feyxiexzfUjhhgtg[size];
        for (int i = 0; i < size; i++) {
            c1381feyxiexzfUjhhgtgArr[i] = new C1381feyxiexzfUjhhgtg(name(i), value(i));
        }
        return new C2930Ujhhgtgfeyxiexzf(1, c1381feyxiexzfUjhhgtgArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = name(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            String strValue = value(i);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
